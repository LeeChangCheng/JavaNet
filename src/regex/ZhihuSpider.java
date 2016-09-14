package regex;

import java.util.ArrayList;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  

public class ZhihuSpider {

	
	 public String question;// 问题  
	 public String questionDescription;// 问题描述  
	 public String zhihuUrl;// 网页链接  
	 public ArrayList<String> answers;// 存储所有回答的数组  
	 // 构造方法初始化数据  
	 public ZhihuSpider(String url) {  
	  // 初始化属性  
	  question = "";  
	  questionDescription = "";  
	  zhihuUrl = "";  
	  answers = new ArrayList<String>();  
	  // 判断url是否合法  
	  if (getRealUrl(url)) {  
	   System.out.println("正在抓取" + zhihuUrl);  
	   // 根据url获取该问答的细节  
	   String content = Spider.SendGet(zhihuUrl);  
	   Pattern pattern;  
	   Matcher matcher;  
	   // 匹配标题  
	//   pattern = Pattern.compile("zh-question-title.+?<h2.+?>(.+?)</h2>");  
	   pattern = Pattern.compile("class=\"title\">?</span></a>");  
	   matcher = pattern.matcher(content);  
	   if (matcher.find()) {  
	    question = matcher.group(1);  
	   }  
	   // 匹配描述  
	 //  pattern = Pattern  
	   //  .compile("zh-question-detail.+?<div.+?>(.*?)</div>");  
	  // matcher = pattern.matcher(content);  
	   //if (matcher.find()) {  
	  //  questionDescription = matcher.group(1);  
	 //  }  
	   // 匹配答案  
	 //  pattern = Pattern.compile("/answer/content.+?<div.+?>(.*?)</div>");  
	  // matcher = pattern.matcher(content);  
	   boolean isFind = matcher.find();  
	   while (isFind) {  
	    answers.add(matcher.group(1));  
	    isFind = matcher.find();  
	   }  
	  }  
	 }  
	 // 根据自己的url抓取自己的问题和描述和答案  
	 public boolean getAll() {  
	  return true;  
	 }  
	 // 处理url  
	 boolean getRealUrl(String url) {  
	  // 将<a target=_blank href="http://www.zhihu.com/question/22355264/answer/21102139" style="text-decoration: none; color: rgb(0, 102, 153);">http://www.zhihu.com/question/22355264/answer/21102139</a>  
	  // 转化成<a target=_blank href="http://www.zhihu.com/question/22355264" style="text-decoration: none; color: rgb(0, 102, 153);">http://www.zhihu.com/question/22355264</a>  
	  // 否则不变  
	  Pattern pattern = Pattern.compile("class=\"title\">?</span></a>");  
	  Matcher matcher = pattern.matcher(url);  
	  if (matcher.find()) {  
	   zhihuUrl ="http://daily.zhihu.com/";
	  } else {  
	   return false;  
	  }  
	  return true;  
	 }  
	 @Override  
	 public String toString() {  
	  return "问题：" + question + "\n" + "描述：" + questionDescription + "\n"  
	    + "链接：" + zhihuUrl + "\n回答：" + answers.size() + "\n";  
	 }  
	public static void main(String[] args) {
		
			  // 定义即将访问的链接  
			  String url = "http://daily.zhihu.com/";
			  // 访问链接并获取页面内容  
			  String content = Spider.SendGet(url);
			  // 获取编辑推荐  
			  ArrayList<ZhihuSpider> myZhihu = Spider.GetRecommendations(content);  
			  // 打印结果  
			  System.out.println(myZhihu);  
			 }  
	
	}  


	
	


package cn.edu.jxnu.designpattern.adapter.objectadapter;

import cn.edu.jxnu.designpattern.adapter.Adaptee;

public class DemoTest {
	/**
	 * 当前client 可以通过TargetInterface使用Adaptee (Adapter实现了TargetInterface
	 * ，并在自己内部使用了特殊方法)
	 */
	public static void main(String[] args) {
		TargetInterface adapter = new Adapter(new Adaptee());
		adapter.standardApiForCurrentSystem();// 使用标准api
	}

}

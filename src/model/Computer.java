package model;

public class Computer {
	
	private Computer next;
	private Computer previous;
	
	private int hd;
	private int ram;
	private String ip;
	
	public Computer(int hd, int ram, String ip) {
		this.hd = hd;
		this.ram = ram;
		this.ip = ip;
	}
}

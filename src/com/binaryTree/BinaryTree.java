package com.binaryTree;
public class BinaryTree {
	private TreeNode root=null;
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root=new TreeNode(1,"rootNode(A)");
		
	}
	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.createBinTree(binaryTree.root);
		System.out.println("the size of the tree is"+binaryTree.size());
		System.out.println("the height of the tree is"+binaryTree.height());
		System.out.println("****************前序遍历**************************");
		binaryTree.preOrder(binaryTree.root);
		System.out.println("****************中序遍历**************************");
		binaryTree.inOrde(binaryTree.root);
		System.out.println("****************后序遍历**************************");
		binaryTree.postOrde(binaryTree.root);
		
	}
	public void createBinTree(TreeNode root) {
		TreeNode newNodeB=new TreeNode(2, "B");
		TreeNode newNodeC=new TreeNode(3, "C");
		TreeNode newNodeD=new TreeNode(4, "D");
		TreeNode newNodeE=new TreeNode(5, "E");
		TreeNode newNodeF=new TreeNode(6, "F");
		root.leftChild=newNodeB;
		root.rightChild=newNodeC;
		root.leftChild.leftChild=newNodeD;
		root.leftChild.rightChild=newNodeE;
		root.rightChild.rightChild=newNodeF;
	}
	public boolean isEmpty() {
		return root==null;
	}
	public int height() {
		return height(root);
	}
	public int size() {
		return size(root);
	}
	public void preOrder(TreeNode subTree) {
		if(subTree!=null) {
			visted(subTree);
			preOrder(subTree.leftChild);
			preOrder(subTree.rightChild);
		}
	}
	public void inOrde(TreeNode subTree) {
		if(subTree!=null) {
			inOrde(subTree.leftChild);
			visted(subTree);
			inOrde(subTree.rightChild);
		}
	}
	public void postOrde(TreeNode subTree) {
		if(subTree!=null) {
			postOrde(subTree.leftChild);
			postOrde(subTree.rightChild);
			visted(subTree);
		}
	}
	public void visted(TreeNode subTree) {
		subTree.isVisted=true;
		System.out.println("key："+subTree.key+"--name:"+subTree.data);
	}
	public void traverse(TreeNode subTree){  
	    System.out.println("key:"+subTree.key+"--name:"+subTree.data);;  
	    traverse(subTree.leftChild);  
	    traverse(subTree.rightChild);  
	}  
	private int height(TreeNode subTree) {
		if(subTree==null) return 0;
		else {
			int i=height(subTree.leftChild);
			int j=height(subTree.rightChild);
			return (i<j)?(j+1):(i+1);
		}
	}
	private int size(TreeNode subTree) {
		if (subTree==null) {
			return 0;
		}else {
			return 1+size(subTree.leftChild)+size(subTree.rightChild);
		}
	}
	private class TreeNode{
		private int key=0;
		private String data=null;
		
		private boolean isVisted=false;
		private TreeNode leftChild=null;
		private TreeNode rightChild=null;
		public TreeNode() {
		}
		public TreeNode(int key,String data) {
			this.key=key;
			this.data=data;
			this.leftChild=null;
			this.rightChild=null;
		}
	}
	
}

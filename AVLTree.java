class AVLNode{
	int key;
	int height;
	AVLNode left,right;
	AVLNode(int key){
		this.key = key;
		left = right = null;
		height = 0;
	}
}
class AVLTree{
	public static int height(AVLNode node){
		return (node == null ? -1: node.height );
	}
	public static AVLNode Rotatewithleftchild(AVLNode k2){
		AVLNode k1 = k2.left;
		k2.left = k1.right;
		k1.right = k2;
		k2.height = Math.max(height(k2.left),height(k2.right))+1;
		k1.height = math.max(height(k1.left),height(k1.right))+1;
		return k1;
	}
	public static AVLNode Rotatewithrightchild(AVLNode k1){
		AVLNode k2 = k1.right;
		k1.right = k2.left;
		k2.left = k1;
		k1.height = Math.max(height(k1.left),height(k1.right))+1;
		k2.height = Math.max(height(k2.left),height(k2.right))+1;
		return k2;
	}
	public static Doublewithleftchild(AVLNode k3){
		k3.left = Rotatewithrightchild(k3.left);
		return Rotatewithleftchild(k3);
		}
	public static Doublewithrightchild(AVLNode k1){
		k1.right = Rotatewithleftchild(k1.right);
		return Rotatewithrightchild(k1);
	}
	public static AVLNode insert(int key, AVLNode node){
		if(node == null){
			return new AVLNode(key);
			}
		if(key < node.key){
			node.left = insert(key,node.left);
			if(height(node.left) - height(node.right) == 2)
				if(key < node.left.key)
					node = Rotatewithleftchild(node);
				else
					node = Doublewithleftchild(node);
		}
		else if(key > node.key){
			node.right = insert(int key,node.right);
			if(height(node.right) - height(node.left) == 2)
				if(key > node.right.key)
					node = Rotatewithrightchild(node);
				else
					node = Doublewithrightchild(node);
		}
		node.height = math.max(height(node.left),height(node.right))+1;
		return node;
	}
	public static AVLNode findMin(int key, AVLNode node){
		if(node == null || node.left == null)
			return node;
		return findMin(node.left);
	}
	public static AVLNode delete(int key , AVLNode node){
		if(node == null)
			return null;
		if(key < node.key)
			node.left = delete(int key,node.left);
		else if(key > node.key)
			node.right = delete(int key,node.right);
		else
			if(node.left != null && node.right != null){
				 AVLNode minNode = findMin(int key,node.right)
				 node.key = minNode.key;
				 node.right = delete(minNode.key,node.right);
			}else
				node = (node.left !=null) ? node.left : node.right;
		if(node != null){
			node.height = Math.max(height(node.left),height(node.right))+1;
			
			if(height(node.left) - height(node.right) == 2)
				if(key < node.left.key)
					node = Rotatewithleftchild(node);
				else
					node = Doublewithleftchild(node);
			if(height(node.right) - height(node.left) == 2)
				if(key > node.right.key)
					node = Rotatewithrightchild(node);
				else
					node = Doublewithrightchild(node);
		}
		return node;
	}
	public static void inOrder(AVLNode node){
		if(node != null){
			inOrder(node.left);
			System.out.print(node.key

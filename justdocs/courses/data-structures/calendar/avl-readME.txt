BST
--
binary serach tree is good at searching a node, but it can unbalanced (skew)
ex
1 2 3 4

that is way we introduce balanced BST
--

highly balanced binary tree
 Adelson-Velskii and Landis ie AVL-tree
 |hL-hR| <= 1 #diff of level of left and right tree is less than 1

advantage: fast
 AVL 搜尋像普通二元搜尋樹一樣的進行，耗費O(log n)時間，因為AVL樹總是保持平衡的。不需要特殊的準備，樹的結構不會由於尋找而改變。

https://www.codingeek.com/data-structure/avl-tree-introduction-to-rotations-and-its-implementation/

1. Right rotation (RR)
2. Left rotation (LL)
3. Left right double rotation (LR)
4. Right left double rotation (RL)

3 points ABC in 3 stroy building, there are 4 possibilities as followings:
and most balanced situation is 1st level A, 2nd level B (left) and C (right)

有3個點ABC在不平衡狀態,那在三層樓的結構中，可能有以下四種可能,
case A: 因為原已達 BST 所以一定是 C<B<A 如果要 balance 它則應把 B 變成 root , C 在左而 A 在右
case B: 同上
case C: 先讓它往一方向完全傾斜，然後再 RR 

last 2 cases (CD), 1st change to first 2 (AB)
------------------------------------------------
case A	ex a=3 b=2 c=1
  A
 B         -->     B    RR
C                 C A
------------------------------------------------
case B ex a=1 b=2 c=3
A                  B
 B         -->    A C	LL  
  C 
------------------------------------------------
case C ex a=1 b=3 c=2
 A                 A                       
  B        -->      C   RR   --> then LL   C
C                    B                    A B
------------------------------------------------
case D ex a=3 b=1 c=2
 A                A
B          -->   C  (LL) --> then RR to    C
 C              B                         B A

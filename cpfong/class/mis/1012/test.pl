while (<>){
	chomp;
	my @a=split;
	print "$a[0] $a[1] $a[2] $a[4] $a[6] $a[7] $a[8] ",  (($a[4]+$a[6]+$a[7]+$a[8])/4), "\n";
}
#22 971444122 周翰杰  0 99 v  0  5  0

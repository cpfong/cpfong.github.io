/*
	把某一字串中出現另一字串的地方以 index 方式傳回
	s = "abcd" t="c" 則傳回 2
	未出現則傳回 -1
*/
int strindex(char s[], char t[]){
	int i,j,k;
	
	for (i=0; s[i]!='\0'; i++){
		for (j=i, k=0; t[k] != '\0' && s[j] == t[k]; j++, k++);
		if (k>0 && t[k]=='\0')
			return i;
	}
	return -1;
}	

main(){
	int in;
	in = getchar();
	switch (in) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			printf("digital %c\n", in);
//			printf("digital %d\n", in - '0');
			break;
		default:
			printf("others\n");
			break;
	}
}
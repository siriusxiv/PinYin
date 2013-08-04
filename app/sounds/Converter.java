package sounds;

public class Converter {

	private String syllable;
	private Integer tone;

	private Converter(String sound){
		syllable=removeTone(sound);
		tone=getTone(sound);
	}

	public static String toAccent(String sound){
		Converter c = new Converter(sound);
		return c.convert();
	}

	/**
	 * Ne fait qu'enlever le dernier caractère.
	 * @param sound
	 * @return
	 */
	private static String removeTone(String sound){
		return sound.substring(0, sound.length()-1);
	}

	private static Integer getTone(String sound){
		return Integer.parseInt(sound.substring(sound.length()-1,sound.length()));
	}

	private String convert(){
		if(tone==5){
			return syllable;
		}
		switch(syllable){
		case "a":
			switch(tone){
			case 1:
				return "ā";
			case 2:
				return "á";
			case 3:
				return "ǎ";
			case 4:
				return "à";
			default:
				return errorToneReport();
			}
		case "ai":
			switch(tone){
			case 1:
				return "āi";
			case 2:
				return "ái";
			case 3:
				return "ǎi";
			case 4:
				return "ài";
			default:
				return errorToneReport();
			}
		case "ao":
			switch(tone){
			case 1:
				return "āo";
			case 2:
				return "áo";
			case 3:
				return "ǎo";
			case 4:
				return "ào";
			default:
				return errorToneReport();
			}
		case "an":
			switch(tone){
			case 1:
				return "ān";
			case 2:
				return "án";
			case 3:
				return "ǎn";
			case 4:
				return "àn";
			default:
				return errorToneReport();
			}
		case "ang":
			switch(tone){
			case 1:
				return "āng";
			case 2:
				return "áng";
			case 3:
				return "ǎng";
			case 4:
				return "àng";
			default:
				return errorToneReport();
			}

		case "ba":
			switch(tone){
			case 1:
				return "bā";
			case 2:
				return "bá";
			case 3:
				return "bǎ";
			case 4:
				return "bà";
			default:
				return errorToneReport();
			}
		case "bai":
			switch(tone){
			case 1:
				return "bāi";
			case 2:
				return "bái";
			case 3:
				return "bǎi";
			case 4:
				return "bài";
			default:
				return errorToneReport();
			}
		case "bao":
			switch(tone){
			case 1:
				return "bāo";
			case 2:
				return "báo";
			case 3:
				return "bǎo";
			case 4:
				return "bào";
			default:
				return errorToneReport();
			}
		case "ban":
			switch(tone){
			case 1:
				return "bān";
			case 2:
				return "bán";
			case 3:
				return "bǎn";
			case 4:
				return "bàn";
			default:
				return errorToneReport();
			}
		case "bang":
			switch(tone){
			case 1:
				return "bāng";
			case 2:
				return "báng";
			case 3:
				return "ǎng";
			case 4:
				return "bàng";
			default:
				return errorToneReport();
			}
		case "pa":
			switch(tone){
			case 1:
				return "pā";
			case 2:
				return "pá";
			case 3:
				return "pǎ";
			case 4:
				return "pà";
			default:
				return errorToneReport();
			}
		case "pai":
			switch(tone){
			case 1:
				return "pāi";
			case 2:
				return "pái";
			case 3:
				return "pǎi";
			case 4:
				return "pài";
			default:
				return errorToneReport();
			}
		case "pao":
			switch(tone){
			case 1:
				return "pāo";
			case 2:
				return "páo";
			case 3:
				return "pǎo";
			case 4:
				return "pào";
			default:
				return errorToneReport();
			}
		case "pan":
			switch(tone){
			case 1:
				return "pān";
			case 2:
				return "pán";
			case 3:
				return "pǎn";
			case 4:
				return "pàn";
			default:
				return errorToneReport();
			}
		case "pang":
			switch(tone){
			case 1:
				return "pāng";
			case 2:
				return "páng";
			case 3:
				return "pǎng";
			case 4:
				return "pàng";
			default:
				return errorToneReport();
			}
		case "ma":
			switch(tone){
			case 1:
				return "mā";
			case 2:
				return "má";
			case 3:
				return "mǎ";
			case 4:
				return "mà";
			default:
				return errorToneReport();
			}
		case "mai":
			switch(tone){
			case 1:
				return "māi";
			case 2:
				return "mái";
			case 3:
				return "mǎi";
			case 4:
				return "mài";
			default:
				return errorToneReport();
			}
		case "mao":
			switch(tone){
			case 1:
				return "māo";
			case 2:
				return "máo";
			case 3:
				return "mǎo";
			case 4:
				return "mào";
			default:
				return errorToneReport();
			}
		case "man":
			switch(tone){
			case 1:
				return "mān";
			case 2:
				return "mán";
			case 3:
				return "mǎn";
			case 4:
				return "màn";
			default:
				return errorToneReport();
			}
		case "mang":
			switch(tone){
			case 1:
				return "māng";
			case 2:
				return "máng";
			case 3:
				return "mǎng";
			case 4:
				return "màng";
			default:
				return errorToneReport();
			}
		case "fa":
			switch(tone){
			case 1:
				return "fā";
			case 2:
				return "fá";
			case 3:
				return "fǎ";
			case 4:
				return "fà";
			default:
				return errorToneReport();
			}
		case "fan":
			switch(tone){
			case 1:
				return "fān";
			case 2:
				return "fán";
			case 3:
				return "fǎn";
			case 4:
				return "fàn";
			default:
				return errorToneReport();
			}
		case "fang":
			switch(tone){
			case 1:
				return "fāng";
			case 2:
				return "fáng";
			case 3:
				return "fǎng";
			case 4:
				return "fàng";
			default:
				return errorToneReport();
			}
		case "da":
			switch(tone){
			case 1:
				return "dā";
			case 2:
				return "dá";
			case 3:
				return "dǎ";
			case 4:
				return "dà";
			default:
				return errorToneReport();
			}
		case "dai":
			switch(tone){
			case 1:
				return "dāi";
			case 2:
				return "dái";
			case 3:
				return "dǎi";
			case 4:
				return "dài";
			default:
				return errorToneReport();
			}
		case "dao":
			switch(tone){
			case 1:
				return "dāo";
			case 2:
				return "dáo";
			case 3:
				return "dǎo";
			case 4:
				return "dào";
			default:
				return errorToneReport();
			}
		case "dan":
			switch(tone){
			case 1:
				return "dān";
			case 2:
				return "dán";
			case 3:
				return "dǎn";
			case 4:
				return "dàn";
			default:
				return errorToneReport();
			}
		case "dang":
			switch(tone){
			case 1:
				return "dāng";
			case 2:
				return "dáng";
			case 3:
				return "dǎng";
			case 4:
				return "dàng";
			default:
				return errorToneReport();
			}
		case "ta":
			switch(tone){
			case 1:
				return "tā";
			case 2:
				return "tá";
			case 3:
				return "tǎ";
			case 4:
				return "tà";
			default:
				return errorToneReport();
			}
		case "tai":
			switch(tone){
			case 1:
				return "tāi";
			case 2:
				return "tái";
			case 3:
				return "tǎi";
			case 4:
				return "tài";
			default:
				return errorToneReport();
			}
		case "tao":
			switch(tone){
			case 1:
				return "tāo";
			case 2:
				return "táo";
			case 3:
				return "tǎo";
			case 4:
				return "tào";
			default:
				return errorToneReport();
			}
		case "tan":
			switch(tone){
			case 1:
				return "tān";
			case 2:
				return "tán";
			case 3:
				return "tǎn";
			case 4:
				return "tàn";
			default:
				return errorToneReport();
			}
		case "tang":
			switch(tone){
			case 1:
				return "tāng";
			case 2:
				return "táng";
			case 3:
				return "tǎng";
			case 4:
				return "tàng";
			default:
				return errorToneReport();
			}
		case "na":
			switch(tone){
			case 1:
				return "nā";
			case 2:
				return "ná";
			case 3:
				return "nǎ";
			case 4:
				return "nà";
			default:
				return errorToneReport();
			}
		case "nai":
			switch(tone){
			case 1:
				return "nāi";
			case 2:
				return "nái";
			case 3:
				return "nǎi";
			case 4:
				return "nài";
			default:
				return errorToneReport();
			}
		case "nao":
			switch(tone){
			case 1:
				return "nāo";
			case 2:
				return "náo";
			case 3:
				return "nǎo";
			case 4:
				return "nào";
			default:
				return errorToneReport();
			}
		case "nan":
			switch(tone){
			case 1:
				return "nān";
			case 2:
				return "nán";
			case 3:
				return "nǎn";
			case 4:
				return "nàn";
			default:
				return errorToneReport();
			}
		case "nang":
			switch(tone){
			case 1:
				return "nāng";
			case 2:
				return "náng";
			case 3:
				return "nǎng";
			case 4:
				return "nàng";
			default:
				return errorToneReport();
			}
		case "la":
			switch(tone){
			case 1:
				return "lā";
			case 2:
				return "lá";
			case 3:
				return "lǎ";
			case 4:
				return "là";
			default:
				return errorToneReport();
			}
		case "lai":
			switch(tone){
			case 1:
				return "lāi";
			case 2:
				return "lái";
			case 3:
				return "lǎi";
			case 4:
				return "lài";
			default:
				return errorToneReport();
			}
		case "lao":
			switch(tone){
			case 1:
				return "lāo";
			case 2:
				return "láo";
			case 3:
				return "lǎo";
			case 4:
				return "lào";
			default:
				return errorToneReport();
			}
		case "lan":
			switch(tone){
			case 1:
				return "lān";
			case 2:
				return "lán";
			case 3:
				return "lǎn";
			case 4:
				return "làn";
			default:
				return errorToneReport();
			}
		case "lang":
			switch(tone){
			case 1:
				return "lāng";
			case 2:
				return "láng";
			case 3:
				return "lǎng";
			case 4:
				return "làng";
			default:
				return errorToneReport();
			}
		case "za":
			switch(tone){
			case 1:
				return "zā";
			case 2:
				return "zá";
			case 3:
				return "zǎ";
			case 4:
				return "zà";
			default:
				return errorToneReport();
			}
		case "zai":
			switch(tone){
			case 1:
				return "zāi";
			case 2:
				return "zái";
			case 3:
				return "zǎi";
			case 4:
				return "zài";
			default:
				return errorToneReport();
			}
		case "zao":
			switch(tone){
			case 1:
				return "zāo";
			case 2:
				return "záo";
			case 3:
				return "zǎo";
			case 4:
				return "zào";
			default:
				return errorToneReport();
			}
		case "zan":
			switch(tone){
			case 1:
				return "zān";
			case 2:
				return "zán";
			case 3:
				return "zǎn";
			case 4:
				return "zàn";
			default:
				return errorToneReport();
			}
		case "zang":
			switch(tone){
			case 1:
				return "zāng";
			case 2:
				return "záng";
			case 3:
				return "zǎng";
			case 4:
				return "zàng";
			default:
				return errorToneReport();
			}
		case "ca":
			switch(tone){
			case 1:
				return "cā";
			case 2:
				return "cá";
			case 3:
				return "cǎ";
			case 4:
				return "cà";
			default:
				return errorToneReport();
			}
		case "cai":
			switch(tone){
			case 1:
				return "cāi";
			case 2:
				return "cái";
			case 3:
				return "cǎi";
			case 4:
				return "cài";
			default:
				return errorToneReport();
			}
		case "cao":
			switch(tone){
			case 1:
				return "cāo";
			case 2:
				return "cáo";
			case 3:
				return "cǎo";
			case 4:
				return "cào";
			default:
				return errorToneReport();
			}
		case "can":
			switch(tone){
			case 1:
				return "cān";
			case 2:
				return "cán";
			case 3:
				return "cǎn";
			case 4:
				return "càn";
			default:
				return errorToneReport();
			}
		case "cang":
			switch(tone){
			case 1:
				return "cāng";
			case 2:
				return "cáng";
			case 3:
				return "cǎng";
			case 4:
				return "càng";
			default:
				return errorToneReport();
			}
		case "sa":
			switch(tone){
			case 1:
				return "sā";
			case 2:
				return "sá";
			case 3:
				return "sǎ";
			case 4:
				return "sà";
			default:
				return errorToneReport();
			}
		case "sai":
			switch(tone){
			case 1:
				return "sāi";
			case 2:
				return "sái";
			case 3:
				return "sǎi";
			case 4:
				return "sài";
			default:
				return errorToneReport();
			}
		case "sao":
			switch(tone){
			case 1:
				return "sāo";
			case 2:
				return "sáo";
			case 3:
				return "sǎo";
			case 4:
				return "sào";
			default:
				return errorToneReport();
			}
		case "san":
			switch(tone){
			case 1:
				return "sān";
			case 2:
				return "sán";
			case 3:
				return "sǎn";
			case 4:
				return "sàn";
			default:
				return errorToneReport();
			}
		case "sang":
			switch(tone){
			case 1:
				return "sāng";
			case 2:
				return "sáng";
			case 3:
				return "sǎng";
			case 4:
				return "sàng";
			default:
				return errorToneReport();
			}
		case "zha":
			switch(tone){
			case 1:
				return "zhā";
			case 2:
				return "zhá";
			case 3:
				return "zhǎ";
			case 4:
				return "zhà";
			default:
				return errorToneReport();
			}
		case "zhai":
			switch(tone){
			case 1:
				return "zhāi";
			case 2:
				return "zhái";
			case 3:
				return "zhǎi";
			case 4:
				return "zhài";
			default:
				return errorToneReport();
			}
		case "zhao":
			switch(tone){
			case 1:
				return "zhāo";
			case 2:
				return "zháo";
			case 3:
				return "zhǎo";
			case 4:
				return "zhào";
			default:
				return errorToneReport();
			}
		case "zhan":
			switch(tone){
			case 1:
				return "zhān";
			case 2:
				return "zhán";
			case 3:
				return "zhǎn";
			case 4:
				return "zhàn";
			default:
				return errorToneReport();
			}
		case "zhang":
			switch(tone){
			case 1:
				return "zhāng";
			case 2:
				return "zháng";
			case 3:
				return "zhǎng";
			case 4:
				return "zhàng";
			default:
				return errorToneReport();
			}
		case "cha":
			switch(tone){
			case 1:
				return "chā";
			case 2:
				return "chá";
			case 3:
				return "chǎ";
			case 4:
				return "chà";
			default:
				return errorToneReport();
			}
		case "chai":
			switch(tone){
			case 1:
				return "chāi";
			case 2:
				return "chái";
			case 3:
				return "chǎi";
			case 4:
				return "chài";
			default:
				return errorToneReport();
			}
		case "chao":
			switch(tone){
			case 1:
				return "chāo";
			case 2:
				return "cháo";
			case 3:
				return "chǎo";
			case 4:
				return "chào";
			default:
				return errorToneReport();
			}
		case "chan":
			switch(tone){
			case 1:
				return "chān";
			case 2:
				return "chán";
			case 3:
				return "chǎn";
			case 4:
				return "chàn";
			default:
				return errorToneReport();
			}
		case "chang":
			switch(tone){
			case 1:
				return "chāng";
			case 2:
				return "cháng";
			case 3:
				return "chǎng";
			case 4:
				return "chàng";
			default:
				return errorToneReport();
			}
		case "sha":
			switch(tone){
			case 1:
				return "shā";
			case 2:
				return "shá";
			case 3:
				return "shǎ";
			case 4:
				return "shà";
			default:
				return errorToneReport();
			}
		case "shai":
			switch(tone){
			case 1:
				return "shāi";
			case 2:
				return "shái";
			case 3:
				return "shǎi";
			case 4:
				return "shài";
			default:
				return errorToneReport();
			}
		case "shao":
			switch(tone){
			case 1:
				return "shāo";
			case 2:
				return "sháo";
			case 3:
				return "shǎo";
			case 4:
				return "shào";
			default:
				return errorToneReport();
			}
		case "shan":
			switch(tone){
			case 1:
				return "shān";
			case 2:
				return "shán";
			case 3:
				return "shǎn";
			case 4:
				return "shàn";
			default:
				return errorToneReport();
			}
		case "shang":
			switch(tone){
			case 1:
				return "shāng";
			case 2:
				return "sháng";
			case 3:
				return "shǎng";
			case 4:
				return "shàng";
			default:
				return errorToneReport();
			}
		case "rao":
			switch(tone){
			case 1:
				return "rāo";
			case 2:
				return "ráo";
			case 3:
				return "rǎo";
			case 4:
				return "rào";
			default:
				return errorToneReport();
			}
		case "ran":
			switch(tone){
			case 1:
				return "rān";
			case 2:
				return "rán";
			case 3:
				return "rǎn";
			case 4:
				return "ràn";
			default:
				return errorToneReport();
			}
		case "rang":
			switch(tone){
			case 1:
				return "rāng";
			case 2:
				return "ráng";
			case 3:
				return "rǎng";
			case 4:
				return "ràng";
			default:
				return errorToneReport();
			}
		case "ga":
			switch(tone){
			case 1:
				return "gā";
			case 2:
				return "gá";
			case 3:
				return "gǎ";
			case 4:
				return "gà";
			default:
				return errorToneReport();
			}
		case "gai":
			switch(tone){
			case 1:
				return "gāi";
			case 2:
				return "gái";
			case 3:
				return "gǎi";
			case 4:
				return "gài";
			default:
				return errorToneReport();
			}
		case "gao":
			switch(tone){
			case 1:
				return "gāo";
			case 2:
				return "gáo";
			case 3:
				return "gǎo";
			case 4:
				return "gào";
			default:
				return errorToneReport();
			}
		case "gan":
			switch(tone){
			case 1:
				return "gān";
			case 2:
				return "gán";
			case 3:
				return "gǎn";
			case 4:
				return "gàn";
			default:
				return errorToneReport();
			}
		case "gang":
			switch(tone){
			case 1:
				return "gāng";
			case 2:
				return "gáng";
			case 3:
				return "gǎng";
			case 4:
				return "gàng";
			default:
				return errorToneReport();
			}
		case "ka":
			switch(tone){
			case 1:
				return "kā";
			case 2:
				return "ká";
			case 3:
				return "kǎ";
			case 4:
				return "kà";
			default:
				return errorToneReport();
			}
		case "kai":
			switch(tone){
			case 1:
				return "kāi";
			case 2:
				return "kái";
			case 3:
				return "kǎi";
			case 4:
				return "kài";
			default:
				return errorToneReport();
			}
		case "kao":
			switch(tone){
			case 1:
				return "kāo";
			case 2:
				return "káo";
			case 3:
				return "kǎo";
			case 4:
				return "kào";
			default:
				return errorToneReport();
			}
		case "kan":
			switch(tone){
			case 1:
				return "kān";
			case 2:
				return "kán";
			case 3:
				return "kǎn";
			case 4:
				return "kàn";
			default:
				return errorToneReport();
			}
		case "kang":
			switch(tone){
			case 1:
				return "kāng";
			case 2:
				return "káng";
			case 3:
				return "kǎng";
			case 4:
				return "kàng";
			default:
				return errorToneReport();
			}
		case "ha":
			switch(tone){
			case 1:
				return "hā";
			case 2:
				return "há";
			case 3:
				return "hǎ";
			case 4:
				return "hà";
			default:
				return errorToneReport();
			}
		case "hai":
			switch(tone){
			case 1:
				return "hāi";
			case 2:
				return "hái";
			case 3:
				return "hǎi";
			case 4:
				return "hài";
			default:
				return errorToneReport();
			}
		case "hao":
			switch(tone){
			case 1:
				return "hāo";
			case 2:
				return "háo";
			case 3:
				return "hǎo";
			case 4:
				return "hào";
			default:
				return errorToneReport();
			}
		case "han":
			switch(tone){
			case 1:
				return "hān";
			case 2:
				return "hán";
			case 3:
				return "hǎn";
			case 4:
				return "hàn";
			default:
				return errorToneReport();
			}
		case "hang":
			switch(tone){
			case 1:
				return "hāng";
			case 2:
				return "háng";
			case 3:
				return "hǎng";
			case 4:
				return "hàng";
			default:
				return errorToneReport();
			}

		case "o":
			switch(tone){
			case 1:
				return "ō";
			case 2:
				return "ó";
			case 3:
				return "ǒ";
			case 4:
				return "ò";
			default:
				return errorToneReport();
			}
		case "ou":
			switch(tone){
			case 1:
				return "ōu";
			case 2:
				return "óu";
			case 3:
				return "ǒu";
			case 4:
				return "òu";
			default:
				return errorToneReport();
			}
		case "bo":
			switch(tone){
			case 1:
				return "bō";
			case 2:
				return "bó";
			case 3:
				return "bǒ";
			case 4:
				return "bò";
			default:
			}
		case "po":
			switch(tone){
			case 1:
				return "pō";
			case 2:
				return "pó";
			case 3:
				return "pǒ";
			case 4:
				return "pò";
			default:
				return errorToneReport();
			}
		case "pou":
			switch(tone){
			case 1:
				return "pōu";
			case 2:
				return "póu";
			case 3:
				return "pǒu";
			case 4:
				return "pòu";
			default:
				return errorToneReport();
			}
		case "mo":
			switch(tone){
			case 1:
				return "mō";
			case 2:
				return "mó";
			case 3:
				return "mǒ";
			case 4:
				return "mò";
			default:
				return errorToneReport();
			}
		case "mou":
			switch(tone){
			case 1:
				return "mōu";
			case 2:
				return "móu";
			case 3:
				return "mǒu";
			case 4:
				return "mòu";
			default:
				return errorToneReport();
			}
		case "fo":
			switch(tone){
			case 1:
				return "fō";
			case 2:
				return "fó";
			case 3:
				return "fǒ";
			case 4:
				return "fò";
			default:
				return errorToneReport();
			}
		case "fou":
			switch(tone){
			case 1:
				return "fōu";
			case 2:
				return "fóu";
			case 3:
				return "fǒu";
			case 4:
				return "fòu";
			default:
				return errorToneReport();
			}
		case "dong":
			switch(tone){
			case 1:
				return "dōng";
			case 2:
				return "dóng";
			case 3:
				return "dǒng";
			case 4:
				return "dòng";
			default:
				return errorToneReport();
			}
		case "dou":
			switch(tone){
			case 1:
				return "dōu";
			case 2:
				return "dóu";
			case 3:
				return "dǒu";
			case 4:
				return "dòu";
			default:
				return errorToneReport();
			}
		case "tong":
			switch(tone){
			case 1:
				return "tōng";
			case 2:
				return "tóng";
			case 3:
				return "tǒng";
			case 4:
				return "tòng";
			default:
				return errorToneReport();
			}
		case "tou":
			switch(tone){
			case 1:
				return "tōu";
			case 2:
				return "tóu";
			case 3:
				return "tǒu";
			case 4:
				return "tòu";
			default:
				return errorToneReport();
			}
		case "nong":
			switch(tone){
			case 1:
				return "nōng";
			case 2:
				return "nóng";
			case 3:
				return "nǒng";
			case 4:
				return "nòng";
			default:
				return errorToneReport();
			}
		case "nou":
			switch(tone){
			case 1:
				return "nōu";
			case 2:
				return "nóu";
			case 3:
				return "nǒu";
			case 4:
				return "nòu";
			default:
				return errorToneReport();
			}
		case "long":
			switch(tone){
			case 1:
				return "lōng";
			case 2:
				return "lóng";
			case 3:
				return "lǒng";
			case 4:
				return "lòng";
			default:
				return errorToneReport();
			}
		case "lou":
			switch(tone){
			case 1:
				return "lōu";
			case 2:
				return "lóu";
			case 3:
				return "lǒu";
			case 4:
				return "lòu";
			default:
				return errorToneReport();
			}
		case "zong":
			switch(tone){
			case 1:
				return "zōng";
			case 2:
				return "zóng";
			case 3:
				return "zǒng";
			case 4:
				return "zòng";
			default:
				return errorToneReport();
			}
		case "zou":
			switch(tone){
			case 1:
				return "zōu";
			case 2:
				return "zóu";
			case 3:
				return "zǒu";
			case 4:
				return "zòu";
			default:
				return errorToneReport();
			}
		case "cong":
			switch(tone){
			case 1:
				return "cōng";
			case 2:
				return "cóng";
			case 3:
				return "cǒng";
			case 4:
				return "còng";
			default:
				return errorToneReport();
			}
		case "cou":
			switch(tone){
			case 1:
				return "cōu";
			case 2:
				return "cóu";
			case 3:
				return "cǒu";
			case 4:
				return "còu";
			default:
				return errorToneReport();
			}
		case "song":
			switch(tone){
			case 1:
				return "sōng";
			case 2:
				return "sóng";
			case 3:
				return "sǒng";
			case 4:
				return "sòng";
			default:
				return errorToneReport();
			}
		case "sou":
			switch(tone){
			case 1:
				return "sōu";
			case 2:
				return "sóu";
			case 3:
				return "sǒu";
			case 4:
				return "sòu";
			default:
				return errorToneReport();
			}
		case "zhong":
			switch(tone){
			case 1:
				return "zhōng";
			case 2:
				return "zhóng";
			case 3:
				return "zhǒng";
			case 4:
				return "zhòng";
			default:
				return errorToneReport();
			}
		case "zhou":
			switch(tone){
			case 1:
				return "zhōu";
			case 2:
				return "zhóu";
			case 3:
				return "zhǒu";
			case 4:
				return "zhòu";
			default:
				return errorToneReport();
			}
		case "chong":
			switch(tone){
			case 1:
				return "chōng";
			case 2:
				return "chóng";
			case 3:
				return "chǒng";
			case 4:
				return "chòng";
			default:
				return errorToneReport();
			}
		case "chou":
			switch(tone){
			case 1:
				return "chōu";
			case 2:
				return "chóu";
			case 3:
				return "chǒu";
			case 4:
				return "chòu";
			default:
				return errorToneReport();
			}
		case "shou":
			switch(tone){
			case 1:
				return "shōu";
			case 2:
				return "shóu";
			case 3:
				return "shǒu";
			case 4:
				return "shòu";
			default:
				return errorToneReport();
			}
		case "rong":
			switch(tone){
			case 1:
				return "rōng";
			case 2:
				return "róng";
			case 3:
				return "rǒng";
			case 4:
				return "ròng";
			default:
				return errorToneReport();
			}
		case "rou":
			switch(tone){
			case 1:
				return "rōu";
			case 2:
				return "róu";
			case 3:
				return "rǒu";
			case 4:
				return "ròu";
			default:
				return errorToneReport();
			}
		case "gong":
			switch(tone){
			case 1:
				return "gōng";
			case 2:
				return "góng";
			case 3:
				return "gǒng";
			case 4:
				return "gòng";
			default:
				return errorToneReport();
			}
		case "gou":
			switch(tone){
			case 1:
				return "gōu";
			case 2:
				return "góu";
			case 3:
				return "gǒu";
			case 4:
				return "gòu";
			default:
				return errorToneReport();
			}
		case "kong":
			switch(tone){
			case 1:
				return "kōng";
			case 2:
				return "kóng";
			case 3:
				return "kǒng";
			case 4:
				return "kòng";
			default:
				return errorToneReport();
			}
		case "kou":
			switch(tone){
			case 1:
				return "kōu";
			case 2:
				return "kóu";
			case 3:
				return "kǒu";
			case 4:
				return "kòu";
			default:
				return errorToneReport();
			}
		case "hong":
			switch(tone){
			case 1:
				return "hōng";
			case 2:
				return "hóng";
			case 3:
				return "hǒng";
			case 4:
				return "hòng";
			default:
				return errorToneReport();
			}
		case "hou":
			switch(tone){
			case 1:
				return "hōu";
			case 2:
				return "hóu";
			case 3:
				return "hǒu";
			case 4:
				return "hòu";
			default:
				return errorToneReport();
			}
		case "e":
			switch(tone){
			case 1:
				return "ē";
			case 2:
				return "é";
			case 3:
				return "ě";
			case 4:
				return "è";
			default:
				return errorToneReport();
			}
		case "ei":
			switch(tone){
			case 1:
				return "ēi";
			case 2:
				return "éi";
			case 3:
				return "ěi";
			case 4:
				return "èi";
			default:
				return errorToneReport();
			}
		case "en":
			switch(tone){
			case 1:
				return "ēn";
			case 2:
				return "én";
			case 3:
				return "ěn";
			case 4:
				return "èn";
			default:
				return errorToneReport();
			}
		case "eng":
			switch(tone){
			case 1:
				return "ēng";
			case 2:
				return "éng";
			case 3:
				return "ěng";
			case 4:
				return "èng";
			default:
				return errorToneReport();
			}
		case "er":
			switch(tone){
			case 1:
				return "ēr";
			case 2:
				return "ér";
			case 3:
				return "ěr";
			case 4:
				return "èr";
			default:
				return errorToneReport();
			}
		case "bei":
			switch(tone){
			case 1:
				return "bēi";
			case 2:
				return "béi";
			case 3:
				return "běi";
			case 4:
				return "bèi";
			default:
				return errorToneReport();
			}
		case "ben":
			switch(tone){
			case 1:
				return "bēn";
			case 2:
				return "bén";
			case 3:
				return "běn";
			case 4:
				return "bèn";
			default:
				return errorToneReport();
			}
		case "beng":
			switch(tone){
			case 1:
				return "bēng";
			case 2:
				return "béng";
			case 3:
				return "běng";
			case 4:
				return "bèng";
			default:
				return errorToneReport();
			}
		case "pei":
			switch(tone){
			case 1:
				return "pēi";
			case 2:
				return "péi";
			case 3:
				return "pěi";
			case 4:
				return "pèi";
			default:
				return errorToneReport();
			}
		case "pen":
			switch(tone){
			case 1:
				return "pēn";
			case 2:
				return "pén";
			case 3:
				return "pěn";
			case 4:
				return "pèn";
			default:
				return errorToneReport();
			}
		case "peng":
			switch(tone){
			case 1:
				return "pēng";
			case 2:
				return "péng";
			case 3:
				return "pěng";
			case 4:
				return "pèng";
			default:
				return errorToneReport();
			}
		case "me":
			switch(tone){
			case 1:
				return "mē";
			case 2:
				return "mé";
			case 3:
				return "mě";
			case 4:
				return "mè";
			default:
				return errorToneReport();
			}
		case "mei":
			switch(tone){
			case 1:
				return "mēi";
			case 2:
				return "méi";
			case 3:
				return "měi";
			case 4:
				return "mèi";
			default:
				return errorToneReport();
			}
		case "men":
			switch(tone){
			case 1:
				return "mēn";
			case 2:
				return "mén";
			case 3:
				return "měn";
			case 4:
				return "mèn";
			default:
				return errorToneReport();
			}
		case "meng":
			switch(tone){
			case 1:
				return "mēng";
			case 2:
				return "méng";
			case 3:
				return "měng";
			case 4:
				return "mèng";
			default:
				return errorToneReport();
			}
		case "fei":
			switch(tone){
			case 1:
				return "fēi";
			case 2:
				return "féi";
			case 3:
				return "fěi";
			case 4:
				return "fèi";
			default:
				return errorToneReport();
			}
		case "fen":
			switch(tone){
			case 1:
				return "fēn";
			case 2:
				return "fén";
			case 3:
				return "fěn";
			case 4:
				return "fèn";
			default:
				return errorToneReport();
			}
		case "feng":
			switch(tone){
			case 1:
				return "fēng";
			case 2:
				return "féng";
			case 3:
				return "fěng";
			case 4:
				return "fèng";
			default:
				return errorToneReport();
			}
		case "de":
			switch(tone){
			case 1:
				return "dē";
			case 2:
				return "dé";
			case 3:
				return "dě";
			case 4:
				return "dè";
			default:
				return errorToneReport();
			}
		case "dei":
			switch(tone){
			case 1:
				return "dēi";
			case 2:
				return "déi";
			case 3:
				return "děi";
			case 4:
				return "dèi";
			default:
				return errorToneReport();
			}
		case "deng":
			switch(tone){
			case 1:
				return "dēng";
			case 2:
				return "déng";
			case 3:
				return "děng";
			case 4:
				return "dèng";
			default:
				return errorToneReport();
			}
		case "te":
			switch(tone){
			case 1:
				return "tē";
			case 2:
				return "té";
			case 3:
				return "tě";
			case 4:
				return "tè";
			default:
				return errorToneReport();
			}
		case "teng":
			switch(tone){
			case 1:
				return "tēng";
			case 2:
				return "téng";
			case 3:
				return "těng";
			case 4:
				return "tèng";
			default:
				return errorToneReport();
			}
		case "ne":
			switch(tone){
			case 1:
				return "nē";
			case 2:
				return "né";
			case 3:
				return "ně";
			case 4:
				return "nè";
			default:
				return errorToneReport();
			}
		case "nei":
			switch(tone){
			case 1:
				return "nēi";
			case 2:
				return "néi";
			case 3:
				return "něi";
			case 4:
				return "nèi";
			default:
				return errorToneReport();
			}
		case "nen":
			switch(tone){
			case 1:
				return "nēn";
			case 2:
				return "nén";
			case 3:
				return "něn";
			case 4:
				return "nèn";
			default:
				return errorToneReport();
			}
		case "neng":
			switch(tone){
			case 1:
				return "nēng";
			case 2:
				return "néng";
			case 3:
				return "něng";
			case 4:
				return "nèng";
			default:
				return errorToneReport();
			}
		case "le":
			switch(tone){
			case 1:
				return "lē";
			case 2:
				return "lé";
			case 3:
				return "lě";
			case 4:
				return "lè";
			default:
				return errorToneReport();
			}
		case "lei":
			switch(tone){
			case 1:
				return "lēi";
			case 2:
				return "léi";
			case 3:
				return "lěi";
			case 4:
				return "lèi";
			default:
				return errorToneReport();
			}
		case "leng":
			switch(tone){
			case 1:
				return "lēng";
			case 2:
				return "léng";
			case 3:
				return "lěng";
			case 4:
				return "lèng";
			default:
				return errorToneReport();
			}
		case "ze":
			switch(tone){
			case 1:
				return "zē";
			case 2:
				return "zé";
			case 3:
				return "zě";
			case 4:
				return "zè";
			default:
				return errorToneReport();
			}
		case "zei":
			switch(tone){
			case 1:
				return "zēi";
			case 2:
				return "zéi";
			case 3:
				return "zěi";
			case 4:
				return "zèi";
			default:
				return errorToneReport();
			}
		case "zen":
			switch(tone){
			case 1:
				return "zēn";
			case 2:
				return "zén";
			case 3:
				return "zěn";
			case 4:
				return "zèn";
			default:
				return errorToneReport();
			}
		case "zeng":
			switch(tone){
			case 1:
				return "zēng";
			case 2:
				return "zéng";
			case 3:
				return "zěng";
			case 4:
				return "zèng";
			default:
				return errorToneReport();
			}
		case "ce":
			switch(tone){
			case 1:
				return "cē";
			case 2:
				return "cé";
			case 3:
				return "cě";
			case 4:
				return "cè";
			default:
				return errorToneReport();
			}
		case "cen":
			switch(tone){
			case 1:
				return "cēn";
			case 2:
				return "cén";
			case 3:
				return "cěn";
			case 4:
				return "cèn";
			default:
				return errorToneReport();
			}
		case "ceng":
			switch(tone){
			case 1:
				return "cēng";
			case 2:
				return "céng";
			case 3:
				return "cěng";
			case 4:
				return "cèng";
			default:
				return errorToneReport();
			}
		case "se":
			switch(tone){
			case 1:
				return "sē";
			case 2:
				return "sé";
			case 3:
				return "sě";
			case 4:
				return "sè";
			default:
				return errorToneReport();
			}
		case "sen":
			switch(tone){
			case 1:
				return "sēn";
			case 2:
				return "sén";
			case 3:
				return "sěn";
			case 4:
				return "sèn";
			default:
				return errorToneReport();
			}
		case "seng":
			switch(tone){
			case 1:
				return "sēng";
			case 2:
				return "séng";
			case 3:
				return "sěng";
			case 4:
				return "sèng";
			default:
				return errorToneReport();
			}
		case "zhe":
			switch(tone){
			case 1:
				return "zhē";
			case 2:
				return "zhé";
			case 3:
				return "zhě";
			case 4:
				return "zhè";
			default:
				return errorToneReport();
			}
		case "zhei":
			switch(tone){
			case 1:
				return "zhēi";
			case 2:
				return "zhéi";
			case 3:
				return "zhěi";
			case 4:
				return "zhèi";
			default:
				return errorToneReport();
			}
		case "zhen":
			switch(tone){
			case 1:
				return "zhēn";
			case 2:
				return "zhén";
			case 3:
				return "zhěn";
			case 4:
				return "zhèn";
			default:
				return errorToneReport();
			}
		case "zheng":
			switch(tone){
			case 1:
				return "zhēng";
			case 2:
				return "zhéng";
			case 3:
				return "zhěng";
			case 4:
				return "zhèng";
			default:
				return errorToneReport();
			}
		case "che":
			switch(tone){
			case 1:
				return "ē";
			case 2:
				return "é";
			case 3:
				return "ě";
			case 4:
				return "è";
			default:
				return errorToneReport();
			}
		case "chen":
			switch(tone){
			case 1:
				return "chēn";
			case 2:
				return "chén";
			case 3:
				return "chěn";
			case 4:
				return "chèn";
			default:
				return errorToneReport();
			}
		case "cheng":
			switch(tone){
			case 1:
				return "chēng";
			case 2:
				return "chéng";
			case 3:
				return "chěng";
			case 4:
				return "chèng";
			default:
				return errorToneReport();
			}
		case "she":
			switch(tone){
			case 1:
				return "shē";
			case 2:
				return "shé";
			case 3:
				return "shě";
			case 4:
				return "shè";
			default:
				return errorToneReport();
			}
		case "shei":
			switch(tone){
			case 1:
				return "shēi";
			case 2:
				return "shéi";
			case 3:
				return "shěi";
			case 4:
				return "shèi";
			default:
				return errorToneReport();
			}
		case "shen":
			switch(tone){
			case 1:
				return "shēn";
			case 2:
				return "shén";
			case 3:
				return "shěn";
			case 4:
				return "shèn";
			default:
				return errorToneReport();
			}
		case "sheng":
			switch(tone){
			case 1:
				return "shēng";
			case 2:
				return "shéng";
			case 3:
				return "shěng";
			case 4:
				return "shèng";
			default:
				return errorToneReport();
			}
		case "re":
			switch(tone){
			case 1:
				return "rē";
			case 2:
				return "ré";
			case 3:
				return "rě";
			case 4:
				return "rè";
			default:
				return errorToneReport();
			}
		case "ren":
			switch(tone){
			case 1:
				return "rēn";
			case 2:
				return "rén";
			case 3:
				return "rěn";
			case 4:
				return "rèn";
			default:
				return errorToneReport();
			}
		case "reng":
			switch(tone){
			case 1:
				return "rēng";
			case 2:
				return "réng";
			case 3:
				return "rěng";
			case 4:
				return "rèng";
			default:
				return errorToneReport();
			}
		case "ge":
			switch(tone){
			case 1:
				return "gē";
			case 2:
				return "gé";
			case 3:
				return "gě";
			case 4:
				return "gè";
			default:
				return errorToneReport();
			}
		case "gei":
			switch(tone){
			case 1:
				return "gēi";
			case 2:
				return "géi";
			case 3:
				return "gěi";
			case 4:
				return "gèi";
			default:
				return errorToneReport();
			}
		case "gen":
			switch(tone){
			case 1:
				return "gēn";
			case 2:
				return "gén";
			case 3:
				return "gěn";
			case 4:
				return "gèn";
			default:
				return errorToneReport();
			}
		case "geng":
			switch(tone){
			case 1:
				return "gēng";
			case 2:
				return "géng";
			case 3:
				return "gěng";
			case 4:
				return "gèng";
			default:
				return errorToneReport();
			}
		case "ke":
			switch(tone){
			case 1:
				return "kē";
			case 2:
				return "ké";
			case 3:
				return "kě";
			case 4:
				return "kè";
			default:
				return errorToneReport();
			}
		case "kei":
			switch(tone){
			case 1:
				return "kēi";
			case 2:
				return "kéi";
			case 3:
				return "kěi";
			case 4:
				return "kèi";
			default:
				return errorToneReport();
			}
		case "ken":
			switch(tone){
			case 1:
				return "kēn";
			case 2:
				return "kén";
			case 3:
				return "kěn";
			case 4:
				return "kèn";
			default:
				return errorToneReport();
			}
		case "keng":
			switch(tone){
			case 1:
				return "kēng";
			case 2:
				return "kéng";
			case 3:
				return "kěng";
			case 4:
				return "kèng";
			default:
				return errorToneReport();
			}
		case "he":
			switch(tone){
			case 1:
				return "hē";
			case 2:
				return "hé";
			case 3:
				return "hě";
			case 4:
				return "hè";
			default:
				return errorToneReport();
			}
		case "hei":
			switch(tone){
			case 1:
				return "hēi";
			case 2:
				return "héi";
			case 3:
				return "hěi";
			case 4:
				return "hèi";
			default:
				return errorToneReport();
			}
		case "hen":
			switch(tone){
			case 1:
				return "hēn";
			case 2:
				return "hén";
			case 3:
				return "hěn";
			case 4:
				return "hèn";
			default:
				return errorToneReport();
			}
		case "heng":
			switch(tone){
			case 1:
				return "hēng";
			case 2:
				return "héng";
			case 3:
				return "hěng";
			case 4:
				return "hèng";
			default:
				return errorToneReport();
			}

		case "yi":
			switch(tone){
			case 1:
				return "yī";
			case 2:
				return "yí";
			case 3:
				return "yǐ";
			case 4:
				return "yì";
			default:
				return errorToneReport();
			}
		case "ya":
			switch(tone){
			case 1:
				return "yā";
			case 2:
				return "yá";
			case 3:
				return "yǎ";
			case 4:
				return "yà";
			default:
				return errorToneReport();
			}
		case "yao":
			switch(tone){
			case 1:
				return "yāo";
			case 2:
				return "yáo";
			case 3:
				return "yǎo";
			case 4:
				return "yào";
			default:
				return errorToneReport();
			}
		case "ye":
			switch(tone){
			case 1:
				return "yē";
			case 2:
				return "yé";
			case 3:
				return "yě";
			case 4:
				return "yè";
			default:
				return errorToneReport();
			}
		case "you":
			switch(tone){
			case 1:
				return "yōu";
			case 2:
				return "yóu";
			case 3:
				return "yǒu";
			case 4:
				return "yòu";
			default:
				return errorToneReport();
			}
		case "yan":
			switch(tone){
			case 1:
				return "yān";
			case 2:
				return "yán";
			case 3:
				return "yǎn";
			case 4:
				return "yàn";
			default:
				return errorToneReport();
			}
		case "yang":
			switch(tone){
			case 1:
				return "yāng";
			case 2:
				return "yáng";
			case 3:
				return "yǎng";
			case 4:
				return "yàng";
			default:
				return errorToneReport();
			}
		case "yin":
			switch(tone){
			case 1:
				return "yīn";
			case 2:
				return "yín";
			case 3:
				return "yǐn";
			case 4:
				return "yìn";
			default:
				return errorToneReport();
			}
		case "ying":
			switch(tone){
			case 1:
				return "yīng";
			case 2:
				return "yíng";
			case 3:
				return "yǐng";
			case 4:
				return "yìng";
			default:
				return errorToneReport();
			}
		case "yong":
			switch(tone){
			case 1:
				return "yōng";
			case 2:
				return "yóng";
			case 3:
				return "yǒng";
			case 4:
				return "yòng";
			default:
				return errorToneReport();
			}
		case "bi":
			switch(tone){
			case 1:
				return "bī";
			case 2:
				return "bí";
			case 3:
				return "bǐ";
			case 4:
				return "bì";
			default:
				return errorToneReport();
			}
		case "biao":
			switch(tone){
			case 1:
				return "biāo";
			case 2:
				return "biáo";
			case 3:
				return "biǎo";
			case 4:
				return "biào";
			default:
				return errorToneReport();
			}
		case "bie":
			switch(tone){
			case 1:
				return "biē";
			case 2:
				return "bié";
			case 3:
				return "biě";
			case 4:
				return "biè";
			default:
				return errorToneReport();
			}
		case "bian":
			switch(tone){
			case 1:
				return "biān";
			case 2:
				return "bián";
			case 3:
				return "biǎn";
			case 4:
				return "biàn";
			default:
				return errorToneReport();
			}
		case "bin":
			switch(tone){
			case 1:
				return "bīn";
			case 2:
				return "bín";
			case 3:
				return "bǐn";
			case 4:
				return "bìn";
			default:
				return errorToneReport();
			}
		case "bing":
			switch(tone){
			case 1:
				return "bīng";
			case 2:
				return "bíng";
			case 3:
				return "bǐng";
			case 4:
				return "bìng";
			default:
				return errorToneReport();
			}
		case "pi":
			switch(tone){
			case 1:
				return "pī";
			case 2:
				return "pí";
			case 3:
				return "pǐ";
			case 4:
				return "pì";
			default:
				return errorToneReport();
			}
		case "piao":
			switch(tone){
			case 1:
				return "piāo";
			case 2:
				return "piáo";
			case 3:
				return "piǎo";
			case 4:
				return "piào";
			default:
				return errorToneReport();
			}
		case "pie":
			switch(tone){
			case 1:
				return "piē";
			case 2:
				return "pié";
			case 3:
				return "piě";
			case 4:
				return "piè";
			default:
				return errorToneReport();
			}
		case "pian":
			switch(tone){
			case 1:
				return "piān";
			case 2:
				return "pián";
			case 3:
				return "piǎn";
			case 4:
				return "piàn";
			default:
				return errorToneReport();
			}
		case "pin":
			switch(tone){
			case 1:
				return "pīn";
			case 2:
				return "pín";
			case 3:
				return "pǐn";
			case 4:
				return "pìn";
			default:
				return errorToneReport();
			}
		case "ping":
			switch(tone){
			case 1:
				return "pīng";
			case 2:
				return "píng";
			case 3:
				return "pǐng";
			case 4:
				return "pìng";
			default:
				return errorToneReport();
			}
		case "mi":
			switch(tone){
			case 1:
				return "mī";
			case 2:
				return "mí";
			case 3:
				return "mǐ";
			case 4:
				return "mì";
			default:
				return errorToneReport();
			}
		case "miao":
			switch(tone){
			case 1:
				return "miāo";
			case 2:
				return "miáo";
			case 3:
				return "miǎo";
			case 4:
				return "miào";
			default:
				return errorToneReport();
			}
		case "mie":
			switch(tone){
			case 1:
				return "miē";
			case 2:
				return "mié";
			case 3:
				return "miě";
			case 4:
				return "miè";
			default:
				return errorToneReport();
			}
		case "miu":
			switch(tone){
			case 1:
				return "miū";
			case 2:
				return "miú";
			case 3:
				return "miǔ";
			case 4:
				return "miù";
			default:
				return errorToneReport();
			}
		case "mian":
			switch(tone){
			case 1:
				return "miān";
			case 2:
				return "mián";
			case 3:
				return "miǎn";
			case 4:
				return "miàn";
			default:
				return errorToneReport();
			}
		case "min":
			switch(tone){
			case 1:
				return "mīn";
			case 2:
				return "mín";
			case 3:
				return "mǐn";
			case 4:
				return "mìn";
			default:
				return errorToneReport();
			}
		case "ming":
			switch(tone){
			case 1:
				return "mīng";
			case 2:
				return "míng";
			case 3:
				return "mǐng";
			case 4:
				return "mìng";
			default:
				return errorToneReport();
			}
		case "di":
			switch(tone){
			case 1:
				return "dī";
			case 2:
				return "dí";
			case 3:
				return "dǐ";
			case 4:
				return "dì";
			default:
				return errorToneReport();
			}
		case "diao":
			switch(tone){
			case 1:
				return "diāo";
			case 2:
				return "diáo";
			case 3:
				return "diǎo";
			case 4:
				return "diào";
			default:
				return errorToneReport();
			}
		case "die":
			switch(tone){
			case 1:
				return "diē";
			case 2:
				return "dié";
			case 3:
				return "diě";
			case 4:
				return "diè";
			default:
				return errorToneReport();
			}
		case "diu":
			switch(tone){
			case 1:
				return "diū";
			case 2:
				return "diú";
			case 3:
				return "diǔ";
			case 4:
				return "diù";
			default:
				return errorToneReport();
			}
		case "dian":
			switch(tone){
			case 1:
				return "diān";
			case 2:
				return "dián";
			case 3:
				return "diǎn";
			case 4:
				return "diàn";
			default:
				return errorToneReport();
			}
		case "ding":
			switch(tone){
			case 1:
				return "dīng";
			case 2:
				return "díng";
			case 3:
				return "dǐng";
			case 4:
				return "dìng";
			default:
				return errorToneReport();
			}
		case "ti":
			switch(tone){
			case 1:
				return "tī";
			case 2:
				return "tí";
			case 3:
				return "tǐ";
			case 4:
				return "tì";
			default:
				return errorToneReport();
			}
		case "tiao":
			switch(tone){
			case 1:
				return "tiāo";
			case 2:
				return "tiáo";
			case 3:
				return "tiǎo";
			case 4:
				return "tiào";
			default:
				return errorToneReport();
			}
		case "tie":
			switch(tone){
			case 1:
				return "tiē";
			case 2:
				return "tié";
			case 3:
				return "tiě";
			case 4:
				return "tiè";
			default:
				return errorToneReport();
			}
		case "tian":
			switch(tone){
			case 1:
				return "tiān";
			case 2:
				return "tián";
			case 3:
				return "tiǎn";
			case 4:
				return "tiàn";
			default:
				return errorToneReport();
			}
		case "ting":
			switch(tone){
			case 1:
				return "tīng";
			case 2:
				return "tíng";
			case 3:
				return "tǐng";
			case 4:
				return "tìng";
			default:
				return errorToneReport();
			}
		case "ni":
			switch(tone){
			case 1:
				return "nī";
			case 2:
				return "ní";
			case 3:
				return "nǐ";
			case 4:
				return "nì";
			default:
				return errorToneReport();
			}
		case "niao":
			switch(tone){
			case 1:
				return "niāo";
			case 2:
				return "niáo";
			case 3:
				return "niǎo";
			case 4:
				return "niào";
			default:
				return errorToneReport();
			}
		case "nie":
			switch(tone){
			case 1:
				return "niē";
			case 2:
				return "nié";
			case 3:
				return "niě";
			case 4:
				return "niè";
			default:
				return errorToneReport();
			}
		case "niu":
			switch(tone){
			case 1:
				return "niū";
			case 2:
				return "niú";
			case 3:
				return "niǔ";
			case 4:
				return "niù";
			default:
				return errorToneReport();
			}
		case "nian":
			switch(tone){
			case 1:
				return "niān";
			case 2:
				return "nián";
			case 3:
				return "niǎn";
			case 4:
				return "niàn";
			default:
				return errorToneReport();
			}
		case "niang":
			switch(tone){
			case 1:
				return "niāng";
			case 2:
				return "niáng";
			case 3:
				return "niǎng";
			case 4:
				return "niàng";
			default:
				return errorToneReport();
			}
		case "nin":
			switch(tone){
			case 1:
				return "nīn";
			case 2:
				return "nín";
			case 3:
				return "nǐn";
			case 4:
				return "nìn";
			default:
				return errorToneReport();
			}
		case "ning":
			switch(tone){
			case 1:
				return "nīng";
			case 2:
				return "níng";
			case 3:
				return "nǐng";
			case 4:
				return "nìng";
			default:
				return errorToneReport();
			}
		case "li":
			switch(tone){
			case 1:
				return "lī";
			case 2:
				return "lí";
			case 3:
				return "lǐ";
			case 4:
				return "lì";
			default:
				return errorToneReport();
			}
		case "lia":
			switch(tone){
			case 1:
				return "liā";
			case 2:
				return "liá";
			case 3:
				return "liǎ";
			case 4:
				return "lià";
			default:
				return errorToneReport();
			}
		case "liao":
			switch(tone){
			case 1:
				return "liāo";
			case 2:
				return "liáo";
			case 3:
				return "liǎo";
			case 4:
				return "liào";
			default:
				return errorToneReport();
			}
		case "lie":
			switch(tone){
			case 1:
				return "liē";
			case 2:
				return "lié";
			case 3:
				return "liě";
			case 4:
				return "liè";
			default:
				return errorToneReport();
			}
		case "liu":
			switch(tone){
			case 1:
				return "liū";
			case 2:
				return "liú";
			case 3:
				return "liǔ";
			case 4:
				return "liù";
			default:
				return errorToneReport();
			}
		case "lian":
			switch(tone){
			case 1:
				return "liān";
			case 2:
				return "lián";
			case 3:
				return "liǎn";
			case 4:
				return "liàn";
			default:
				return errorToneReport();
			}
		case "liang":
			switch(tone){
			case 1:
				return "liāng";
			case 2:
				return "liáng";
			case 3:
				return "liǎng";
			case 4:
				return "liàng";
			default:
				return errorToneReport();
			}
		case "lin":
			switch(tone){
			case 1:
				return "līn";
			case 2:
				return "lín";
			case 3:
				return "lǐn";
			case 4:
				return "lìn";
			default:
				return errorToneReport();
			}
		case "ling":
			switch(tone){
			case 1:
				return "līng";
			case 2:
				return "líng";
			case 3:
				return "lǐng";
			case 4:
				return "lìng";
			default:
				return errorToneReport();
			}
		case "zi":
			switch(tone){
			case 1:
				return "zī";
			case 2:
				return "zí";
			case 3:
				return "zǐ";
			case 4:
				return "zì";
			default:
				return errorToneReport();
			}
		case "ci":
			switch(tone){
			case 1:
				return "cī";
			case 2:
				return "cí";
			case 3:
				return "cǐ";
			case 4:
				return "cì";
			default:
				return errorToneReport();
			}
		case "si":
			switch(tone){
			case 1:
				return "sī";
			case 2:
				return "sí";
			case 3:
				return "sǐ";
			case 4:
				return "sì";
			default:
				return errorToneReport();
			}
		case "zhi":
			switch(tone){
			case 1:
				return "zhī";
			case 2:
				return "zhí";
			case 3:
				return "zhǐ";
			case 4:
				return "zhì";
			default:
				return errorToneReport();
			}
		case "chi":
			switch(tone){
			case 1:
				return "chī";
			case 2:
				return "chí";
			case 3:
				return "chǐ";
			case 4:
				return "chì";
			default:
				return errorToneReport();
			}
		case "shi":
			switch(tone){
			case 1:
				return "shī";
			case 2:
				return "shí";
			case 3:
				return "shǐ";
			case 4:
				return "shì";
			default:
				return errorToneReport();
			}
		case "ri":
			switch(tone){
			case 1:
				return "rī";
			case 2:
				return "rí";
			case 3:
				return "rǐ";
			case 4:
				return "rì";
			default:
				return errorToneReport();
			}
		case "ji":
			switch(tone){
			case 1:
				return "jī";
			case 2:
				return "jí";
			case 3:
				return "jǐ";
			case 4:
				return "jì";
			default:
				return errorToneReport();
			}
		case "jia":
			switch(tone){
			case 1:
				return "jiā";
			case 2:
				return "jiá";
			case 3:
				return "jiǎ";
			case 4:
				return "jià";
			default:
				return errorToneReport();
			}
		case "jiao":
			switch(tone){
			case 1:
				return "jiāo";
			case 2:
				return "jiáo";
			case 3:
				return "jiǎo";
			case 4:
				return "jiào";
			default:
				return errorToneReport();
			}
		case "jie":
			switch(tone){
			case 1:
				return "jiē";
			case 2:
				return "jié";
			case 3:
				return "jiě";
			case 4:
				return "jiè";
			default:
				return errorToneReport();
			}
		case "jiu":
			switch(tone){
			case 1:
				return "jiū";
			case 2:
				return "jiú";
			case 3:
				return "jiǔ";
			case 4:
				return "jiù";
			default:
				return errorToneReport();
			}
		case "jian":
			switch(tone){
			case 1:
				return "jiān";
			case 2:
				return "jián";
			case 3:
				return "jiǎn";
			case 4:
				return "jiàn";
			default:
				return errorToneReport();
			}
		case "jiang":
			switch(tone){
			case 1:
				return "jiāng";
			case 2:
				return "jiáng";
			case 3:
				return "jiǎng";
			case 4:
				return "jiàng";
			default:
				return errorToneReport();
			}
		case "jin":
			switch(tone){
			case 1:
				return "jīn";
			case 2:
				return "jín";
			case 3:
				return "jǐn";
			case 4:
				return "jìn";
			default:
				return errorToneReport();
			}
		case "jing":
			switch(tone){
			case 1:
				return "jīng";
			case 2:
				return "jíng";
			case 3:
				return "jǐng";
			case 4:
				return "jìng";
			default:
				return errorToneReport();
			}
		case "jiong":
			switch(tone){
			case 1:
				return "jiōng";
			case 2:
				return "jióng";
			case 3:
				return "jiǒng";
			case 4:
				return "jiòng";
			default:
				return errorToneReport();
			}
		case "qi":
			switch(tone){
			case 1:
				return "qī";
			case 2:
				return "qí";
			case 3:
				return "qǐ";
			case 4:
				return "qì";
			default:
				return errorToneReport();
			}
		case "qia":
			switch(tone){
			case 1:
				return "qiā";
			case 2:
				return "qiá";
			case 3:
				return "qiǎ";
			case 4:
				return "qià";
			default:
				return errorToneReport();
			}
		case "qiao":
			switch(tone){
			case 1:
				return "qiāo";
			case 2:
				return "qiáo";
			case 3:
				return "qiǎo";
			case 4:
				return "qiào";
			default:
				return errorToneReport();
			}
		case "qie":
			switch(tone){
			case 1:
				return "qiē";
			case 2:
				return "qié";
			case 3:
				return "qiě";
			case 4:
				return "qiè";
			default:
				return errorToneReport();
			}
		case "qiu":
			switch(tone){
			case 1:
				return "qiū";
			case 2:
				return "qiú";
			case 3:
				return "qiǔ";
			case 4:
				return "qiù";
			default:
				return errorToneReport();
			}
		case "qian":
			switch(tone){
			case 1:
				return "qiān";
			case 2:
				return "qián";
			case 3:
				return "qiǎn";
			case 4:
				return "qiàn";
			default:
				return errorToneReport();
			}
		case "qiang":
			switch(tone){
			case 1:
				return "qiāng";
			case 2:
				return "qiáng";
			case 3:
				return "qiǎng";
			case 4:
				return "qiàng";
			default:
				return errorToneReport();
			}
		case "qin":
			switch(tone){
			case 1:
				return "qīn";
			case 2:
				return "qín";
			case 3:
				return "qǐn";
			case 4:
				return "qìn";
			default:
				return errorToneReport();
			}
		case "qing":
			switch(tone){
			case 1:
				return "qīng";
			case 2:
				return "qíng";
			case 3:
				return "qǐng";
			case 4:
				return "qìng";
			default:
				return errorToneReport();
			}
		case "qiong":
			switch(tone){
			case 1:
				return "qiōng";
			case 2:
				return "qióng";
			case 3:
				return "qiǒng";
			case 4:
				return "qiòng";
			default:
				return errorToneReport();
			}
		case "xi":
			switch(tone){
			case 1:
				return "xī";
			case 2:
				return "xí";
			case 3:
				return "xǐ";
			case 4:
				return "xì";
			default:
				return errorToneReport();
			}
		case "xia":
			switch(tone){
			case 1:
				return "xiā";
			case 2:
				return "xiá";
			case 3:
				return "xiǎ";
			case 4:
				return "xià";
			default:
				return errorToneReport();
			}
		case "xiao":
			switch(tone){
			case 1:
				return "xiāo";
			case 2:
				return "xiáo";
			case 3:
				return "xiǎo";
			case 4:
				return "xiào";
			default:
				return errorToneReport();
			}
		case "xie":
			switch(tone){
			case 1:
				return "xiē";
			case 2:
				return "xié";
			case 3:
				return "xiě";
			case 4:
				return "xiè";
			default:
				return errorToneReport();
			}
		case "xiu":
			switch(tone){
			case 1:
				return "xiū";
			case 2:
				return "xiú";
			case 3:
				return "xiǔ";
			case 4:
				return "xiù";
			default:
				return errorToneReport();
			}
		case "xian":
			switch(tone){
			case 1:
				return "xiān";
			case 2:
				return "xián";
			case 3:
				return "xiǎn";
			case 4:
				return "xiàn";
			default:
				return errorToneReport();
			}
		case "xiang":
			switch(tone){
			case 1:
				return "xiāng";
			case 2:
				return "xiáng";
			case 3:
				return "xiǎng";
			case 4:
				return "xiàng";
			default:
				return errorToneReport();
			}
		case "xin":
			switch(tone){
			case 1:
				return "xīn";
			case 2:
				return "xín";
			case 3:
				return "xǐn";
			case 4:
				return "xìn";
			default:
				return errorToneReport();
			}
		case "xing":
			switch(tone){
			case 1:
				return "xīng";
			case 2:
				return "xíng";
			case 3:
				return "xǐng";
			case 4:
				return "xìng";
			default:
				return errorToneReport();
			}
		case "xiong":
			switch(tone){
			case 1:
				return "xiōng";
			case 2:
				return "xióng";
			case 3:
				return "xiǒng";
			case 4:
				return "xiòng";
			default:
				return errorToneReport();
			}

		case "wu":
			switch(tone){
			case 1:
				return "wū";
			case 2:
				return "wú";
			case 3:
				return "wǔ";
			case 4:
				return "wù";
			default:
				return errorToneReport();
			}
		case "wa":
			switch(tone){
			case 1:
				return "wā";
			case 2:
				return "wá";
			case 3:
				return "wǎ";
			case 4:
				return "wà";
			default:
				return errorToneReport();
			}
		case "wo":
			switch(tone){
			case 1:
				return "wō";
			case 2:
				return "wó";
			case 3:
				return "wǒ";
			case 4:
				return "wò";
			default:
				return errorToneReport();
			}
		case "wei":
			switch(tone){
			case 1:
				return "wēi";
			case 2:
				return "wéi";
			case 3:
				return "wěi";
			case 4:
				return "wèi";
			default:
				return errorToneReport();
			}
		case "wai":
			switch(tone){
			case 1:
				return "wāi";
			case 2:
				return "wái";
			case 3:
				return "wǎi";
			case 4:
				return "wài";
			default:
				return errorToneReport();
			}
		case "wan":
			switch(tone){
			case 1:
				return "wān";
			case 2:
				return "wán";
			case 3:
				return "wǎn";
			case 4:
				return "wàn";
			default:
				return errorToneReport();
			}
		case "wen":
			switch(tone){
			case 1:
				return "wēn";
			case 2:
				return "wén";
			case 3:
				return "wěn";
			case 4:
				return "wèn";
			default:
				return errorToneReport();
			}
		case "wang":
			switch(tone){
			case 1:
				return "wāng";
			case 2:
				return "wáng";
			case 3:
				return "wǎng";
			case 4:
				return "wàng";
			default:
				return errorToneReport();
			}
		case "weng":
			switch(tone){
			case 1:
				return "wēng";
			case 2:
				return "wéng";
			case 3:
				return "wěng";
			case 4:
				return "wèng";
			default:
				return errorToneReport();
			}
		case "bu":
			switch(tone){
			case 1:
				return "bū";
			case 2:
				return "bú";
			case 3:
				return "bǔ";
			case 4:
				return "bù";
			default:
				return errorToneReport();
			}
		case "pu":
			switch(tone){
			case 1:
				return "pū";
			case 2:
				return "pú";
			case 3:
				return "pǔ";
			case 4:
				return "pù";
			default:
				return errorToneReport();
			}
		case "mu":
			switch(tone){
			case 1:
				return "mū";
			case 2:
				return "mú";
			case 3:
				return "mǔ";
			case 4:
				return "mù";
			default:
				return errorToneReport();
			}
		case "fu":
			switch(tone){
			case 1:
				return "fū";
			case 2:
				return "fú";
			case 3:
				return "fǔ";
			case 4:
				return "fù";
			default:
				return errorToneReport();
			}
		case "du":
			switch(tone){
			case 1:
				return "dū";
			case 2:
				return "dú";
			case 3:
				return "dǔ";
			case 4:
				return "dù";
			default:
				return errorToneReport();
			}
		case "duo":
			switch(tone){
			case 1:
				return "duō";
			case 2:
				return "duó";
			case 3:
				return "duǒ";
			case 4:
				return "duò";
			default:
				return errorToneReport();
			}
		case "dui":
			switch(tone){
			case 1:
				return "duī";
			case 2:
				return "duí";
			case 3:
				return "duǐ";
			case 4:
				return "duì";
			default:
				return errorToneReport();
			}
		case "duan":
			switch(tone){
			case 1:
				return "duān";
			case 2:
				return "duán";
			case 3:
				return "duǎn";
			case 4:
				return "duàn";
			default:
				return errorToneReport();
			}
		case "dun":
			switch(tone){
			case 1:
				return "dūn";
			case 2:
				return "dún";
			case 3:
				return "dǔn";
			case 4:
				return "dùn";
			default:
				return errorToneReport();
			}
		case "tu":
			switch(tone){
			case 1:
				return "tū";
			case 2:
				return "tú";
			case 3:
				return "tǔ";
			case 4:
				return "tù";
			default:
				return errorToneReport();
			}
		case "tuo":
			switch(tone){
			case 1:
				return "tuō";
			case 2:
				return "tuó";
			case 3:
				return "tuǒ";
			case 4:
				return "tuò";
			default:
				return errorToneReport();
			}
		case "tui":
			switch(tone){
			case 1:
				return "tuī";
			case 2:
				return "tuí";
			case 3:
				return "tuǐ";
			case 4:
				return "tuì";
			default:
				return errorToneReport();
			}
		case "tuan":
			switch(tone){
			case 1:
				return "tuān";
			case 2:
				return "tuán";
			case 3:
				return "tuǎn";
			case 4:
				return "tuàn";
			default:
				return errorToneReport();
			}
		case "tun":
			switch(tone){
			case 1:
				return "tūn";
			case 2:
				return "tún";
			case 3:
				return "tǔn";
			case 4:
				return "tùn";
			default:
				return errorToneReport();
			}
		case "nu":
			switch(tone){
			case 1:
				return "nū";
			case 2:
				return "nú";
			case 3:
				return "nǔ";
			case 4:
				return "nù";
			default:
				return errorToneReport();
			}
		case "nuo":
			switch(tone){
			case 1:
				return "nuō";
			case 2:
				return "nuó";
			case 3:
				return "nuǒ";
			case 4:
				return "nuò";
			default:
				return errorToneReport();
			}
		case "nuan":
			switch(tone){
			case 1:
				return "nuān";
			case 2:
				return "nuán";
			case 3:
				return "nuǎn";
			case 4:
				return "nuàn";
			default:
				return errorToneReport();
			}
		case "lu":
			switch(tone){
			case 1:
				return "lū";
			case 2:
				return "lú";
			case 3:
				return "lǔ";
			case 4:
				return "lù";
			default:
				return errorToneReport();
			}
		case "luo":
			switch(tone){
			case 1:
				return "luō";
			case 2:
				return "luó";
			case 3:
				return "luǒ";
			case 4:
				return "luò";
			default:
				return errorToneReport();
			}
		case "luan":
			switch(tone){
			case 1:
				return "luān";
			case 2:
				return "luán";
			case 3:
				return "luǎn";
			case 4:
				return "luàn";
			default:
				return errorToneReport();
			}
		case "lun":
			switch(tone){
			case 1:
				return "lūn";
			case 2:
				return "lún";
			case 3:
				return "lǔn";
			case 4:
				return "lùn";
			default:
				return errorToneReport();
			}
		case "zu":
			switch(tone){
			case 1:
				return "zū";
			case 2:
				return "zú";
			case 3:
				return "zǔ";
			case 4:
				return "zù";
			default:
				return errorToneReport();
			}
		case "zuo":
			switch(tone){
			case 1:
				return "zuō";
			case 2:
				return "zuó";
			case 3:
				return "zuǒ";
			case 4:
				return "zuò";
			default:
				return errorToneReport();
			}
		case "zui":
			switch(tone){
			case 1:
				return "zuī";
			case 2:
				return "zuí";
			case 3:
				return "zuǐ";
			case 4:
				return "zuì";
			default:
				return errorToneReport();
			}
		case "zuan":
			switch(tone){
			case 1:
				return "zuān";
			case 2:
				return "zuán";
			case 3:
				return "zuǎn";
			case 4:
				return "zuàn";
			default:
				return errorToneReport();
			}
		case "zun":
			switch(tone){
			case 1:
				return "zūn";
			case 2:
				return "zún";
			case 3:
				return "zǔn";
			case 4:
				return "zùn";
			default:
				return errorToneReport();
			}
		case "cu":
			switch(tone){
			case 1:
				return "cū";
			case 2:
				return "cú";
			case 3:
				return "cǔ";
			case 4:
				return "cù";
			default:
				return errorToneReport();
			}
		case "cuo":
			switch(tone){
			case 1:
				return "cuō";
			case 2:
				return "cuó";
			case 3:
				return "cuǒ";
			case 4:
				return "cuò";
			default:
				return errorToneReport();
			}
		case "cui":
			switch(tone){
			case 1:
				return "cuī";
			case 2:
				return "cuí";
			case 3:
				return "cuǐ";
			case 4:
				return "cuì";
			default:
				return errorToneReport();
			}
		case "cuan":
			switch(tone){
			case 1:
				return "cuān";
			case 2:
				return "cuán";
			case 3:
				return "cuǎn";
			case 4:
				return "cuàn";
			default:
				return errorToneReport();
			}
		case "cun":
			switch(tone){
			case 1:
				return "cūn";
			case 2:
				return "cún";
			case 3:
				return "cǔn";
			case 4:
				return "cùn";
			default:
				return errorToneReport();
			}
		case "su":
			switch(tone){
			case 1:
				return "sū";
			case 2:
				return "sú";
			case 3:
				return "sǔ";
			case 4:
				return "sù";
			default:
				return errorToneReport();
			}
		case "suo":
			switch(tone){
			case 1:
				return "suō";
			case 2:
				return "suó";
			case 3:
				return "suǒ";
			case 4:
				return "suò";
			default:
				return errorToneReport();
			}
		case "sui":
			switch(tone){
			case 1:
				return "suī";
			case 2:
				return "suí";
			case 3:
				return "suǐ";
			case 4:
				return "suì";
			default:
				return errorToneReport();
			}
		case "suan":
			switch(tone){
			case 1:
				return "suān";
			case 2:
				return "suán";
			case 3:
				return "suǎn";
			case 4:
				return "suàn";
			default:
				return errorToneReport();
			}
		case "sun":
			switch(tone){
			case 1:
				return "sūn";
			case 2:
				return "sún";
			case 3:
				return "sǔn";
			case 4:
				return "sùn";
			default:
				return errorToneReport();
			}
		case "zhu":
			switch(tone){
			case 1:
				return "zhū";
			case 2:
				return "zhú";
			case 3:
				return "zhǔ";
			case 4:
				return "zhù";
			default:
				return errorToneReport();
			}
		case "zhua":
			switch(tone){
			case 1:
				return "zhuā";
			case 2:
				return "zhuá";
			case 3:
				return "zhuǎ";
			case 4:
				return "zhuà";
			default:
				return errorToneReport();
			}
		case "zhuo":
			switch(tone){
			case 1:
				return "zhuō";
			case 2:
				return "zhuó";
			case 3:
				return "zhuǒ";
			case 4:
				return "zhuò";
			default:
				return errorToneReport();
			}
		case "zhui":
			switch(tone){
			case 1:
				return "zhuī";
			case 2:
				return "zhuí";
			case 3:
				return "zhuǐ";
			case 4:
				return "zhuì";
			default:
				return errorToneReport();
			}
		case "zhuai":
			switch(tone){
			case 1:
				return "zhuāi";
			case 2:
				return "zhuái";
			case 3:
				return "zhuǎi";
			case 4:
				return "zhuài";
			default:
				return errorToneReport();
			}
		case "zhuan":
			switch(tone){
			case 1:
				return "zhuān";
			case 2:
				return "zhuán";
			case 3:
				return "zhuǎn";
			case 4:
				return "zhuàn";
			default:
				return errorToneReport();
			}
		case "zhun":
			switch(tone){
			case 1:
				return "zhūn";
			case 2:
				return "zhún";
			case 3:
				return "zhǔn";
			case 4:
				return "zhùn";
			default:
				return errorToneReport();
			}
		case "zhuang":
			switch(tone){
			case 1:
				return "zhuāng";
			case 2:
				return "zhuáng";
			case 3:
				return "zhuǎng";
			case 4:
				return "zhuàng";
			default:
				return errorToneReport();
			}
		case "chu":
			switch(tone){
			case 1:
				return "chū";
			case 2:
				return "chú";
			case 3:
				return "chǔ";
			case 4:
				return "chù";
			default:
				return errorToneReport();
			}
		case "chua":
			switch(tone){
			case 1:
				return "chuā";
			case 2:
				return "chuá";
			case 3:
				return "chuǎ";
			case 4:
				return "chuà";
			default:
				return errorToneReport();
			}
		case "chuo":
			switch(tone){
			case 1:
				return "chuō";
			case 2:
				return "chuó";
			case 3:
				return "chuǒ";
			case 4:
				return "chuò";
			default:
				return errorToneReport();
			}
		case "chui":
			switch(tone){
			case 1:
				return "chuī";
			case 2:
				return "chuí";
			case 3:
				return "chuǐ";
			case 4:
				return "chuì";
			default:
				return errorToneReport();
			}
		case "chuai":
			switch(tone){
			case 1:
				return "chuāi";
			case 2:
				return "chuái";
			case 3:
				return "chuǎi";
			case 4:
				return "chuài";
			default:
				return errorToneReport();
			}
		case "chuan":
			switch(tone){
			case 1:
				return "chuān";
			case 2:
				return "chuán";
			case 3:
				return "chuǎn";
			case 4:
				return "chuàn";
			default:
				return errorToneReport();
			}
		case "chun":
			switch(tone){
			case 1:
				return "chūn";
			case 2:
				return "chún";
			case 3:
				return "chǔn";
			case 4:
				return "chùn";
			default:
				return errorToneReport();
			}
		case "chuang":
			switch(tone){
			case 1:
				return "chuāng";
			case 2:
				return "chuáng";
			case 3:
				return "chuǎng";
			case 4:
				return "chuàng";
			default:
				return errorToneReport();
			}
		case "shu":
			switch(tone){
			case 1:
				return "shū";
			case 2:
				return "shú";
			case 3:
				return "shǔ";
			case 4:
				return "shù";
			default:
				return errorToneReport();
			}
		case "shua":
			switch(tone){
			case 1:
				return "shuā";
			case 2:
				return "shuá";
			case 3:
				return "shuǎ";
			case 4:
				return "shuà";
			default:
				return errorToneReport();
			}
		case "shuo":
			switch(tone){
			case 1:
				return "shuō";
			case 2:
				return "shuó";
			case 3:
				return "shuǒ";
			case 4:
				return "shuò";
			default:
				return errorToneReport();
			}
		case "shui":
			switch(tone){
			case 1:
				return "shuī";
			case 2:
				return "shuí";
			case 3:
				return "shuǐ";
			case 4:
				return "shuì";
			default:
				return errorToneReport();
			}
		case "shuai":
			switch(tone){
			case 1:
				return "shuāi";
			case 2:
				return "shuái";
			case 3:
				return "shuǎi";
			case 4:
				return "shuài";
			default:
				return errorToneReport();
			}
		case "shuan":
			switch(tone){
			case 1:
				return "shuān";
			case 2:
				return "shuán";
			case 3:
				return "shuǎn";
			case 4:
				return "shuàn";
			default:
				return errorToneReport();
			}
		case "shun":
			switch(tone){
			case 1:
				return "shūn";
			case 2:
				return "shún";
			case 3:
				return "shǔn";
			case 4:
				return "shùn";
			default:
				return errorToneReport();
			}
		case "shuang":
			switch(tone){
			case 1:
				return "shuāng";
			case 2:
				return "shuáng";
			case 3:
				return "shuǎng";
			case 4:
				return "shuàng";
			default:
				return errorToneReport();
			}
		case "ru":
			switch(tone){
			case 1:
				return "rū";
			case 2:
				return "rú";
			case 3:
				return "rǔ";
			case 4:
				return "rù";
			default:
				return errorToneReport();
			}
		case "rua":
			switch(tone){
			case 1:
				return "ruā";
			case 2:
				return "ruá";
			case 3:
				return "ruǎ";
			case 4:
				return "ruà";
			default:
				return errorToneReport();
			}
		case "ruo":
			switch(tone){
			case 1:
				return "ruō";
			case 2:
				return "ruó";
			case 3:
				return "ruǒ";
			case 4:
				return "ruò";
			default:
				return errorToneReport();
			}
		case "rui":
			switch(tone){
			case 1:
				return "ruī";
			case 2:
				return "ruí";
			case 3:
				return "ruǐ";
			case 4:
				return "ruì";
			default:
				return errorToneReport();
			}
		case "ruan":
			switch(tone){
			case 1:
				return "ruān";
			case 2:
				return "ruán";
			case 3:
				return "ruǎn";
			case 4:
				return "ruàn";
			default:
				return errorToneReport();
			}
		case "run":
			switch(tone){
			case 1:
				return "rūn";
			case 2:
				return "rún";
			case 3:
				return "rǔn";
			case 4:
				return "rùn";
			default:
				return errorToneReport();
			}
		case "gu":
			switch(tone){
			case 1:
				return "gū";
			case 2:
				return "gú";
			case 3:
				return "gǔ";
			case 4:
				return "gù";
			default:
				return errorToneReport();
			}
		case "gua":
			switch(tone){
			case 1:
				return "guā";
			case 2:
				return "guá";
			case 3:
				return "guǎ";
			case 4:
				return "guà";
			default:
				return errorToneReport();
			}
		case "guo":
			switch(tone){
			case 1:
				return "guō";
			case 2:
				return "guó";
			case 3:
				return "guǒ";
			case 4:
				return "guò";
			default:
				return errorToneReport();
			}
		case "gui":
			switch(tone){
			case 1:
				return "guī";
			case 2:
				return "guí";
			case 3:
				return "guǐ";
			case 4:
				return "guì";
			default:
				return errorToneReport();
			}
		case "guai":
			switch(tone){
			case 1:
				return "guāi";
			case 2:
				return "guái";
			case 3:
				return "guǎi";
			case 4:
				return "guài";
			default:
				return errorToneReport();
			}
		case "guan":
			switch(tone){
			case 1:
				return "guān";
			case 2:
				return "guán";
			case 3:
				return "guǎn";
			case 4:
				return "guàn";
			default:
				return errorToneReport();
			}
		case "gun":
			switch(tone){
			case 1:
				return "gūn";
			case 2:
				return "gún";
			case 3:
				return "gǔn";
			case 4:
				return "gùn";
			default:
				return errorToneReport();
			}
		case "guang":
			switch(tone){
			case 1:
				return "guāng";
			case 2:
				return "guáng";
			case 3:
				return "guǎng";
			case 4:
				return "guàng";
			default:
				return errorToneReport();
			}
		case "ku":
			switch(tone){
			case 1:
				return "kū";
			case 2:
				return "kú";
			case 3:
				return "kǔ";
			case 4:
				return "kù";
			default:
				return errorToneReport();
			}
		case "kua":
			switch(tone){
			case 1:
				return "kuā";
			case 2:
				return "kuá";
			case 3:
				return "kuǎ";
			case 4:
				return "kuà";
			default:
				return errorToneReport();
			}
		case "kuo":
			switch(tone){
			case 1:
				return "kuō";
			case 2:
				return "kuó";
			case 3:
				return "kuǒ";
			case 4:
				return "kuò";
			default:
				return errorToneReport();
			}
		case "kui":
			switch(tone){
			case 1:
				return "kuī";
			case 2:
				return "kuí";
			case 3:
				return "kuǐ";
			case 4:
				return "kuì";
			default:
				return errorToneReport();
			}
		case "kuai":
			switch(tone){
			case 1:
				return "kuāi";
			case 2:
				return "kuái";
			case 3:
				return "kuǎi";
			case 4:
				return "kuài";
			default:
				return errorToneReport();
			}
		case "kuan":
			switch(tone){
			case 1:
				return "kuān";
			case 2:
				return "kuán";
			case 3:
				return "kuǎn";
			case 4:
				return "kuàn";
			default:
				return errorToneReport();
			}
		case "kun":
			switch(tone){
			case 1:
				return "kūn";
			case 2:
				return "kún";
			case 3:
				return "kǔn";
			case 4:
				return "kùn";
			default:
				return errorToneReport();
			}
		case "kuang":
			switch(tone){
			case 1:
				return "kuāng";
			case 2:
				return "kuáng";
			case 3:
				return "kuǎng";
			case 4:
				return "kuàng";
			default:
				return errorToneReport();
			}
		case "hu":
			switch(tone){
			case 1:
				return "hū";
			case 2:
				return "hú";
			case 3:
				return "hǔ";
			case 4:
				return "hù";
			default:
				return errorToneReport();
			}
		case "hua":
			switch(tone){
			case 1:
				return "huā";
			case 2:
				return "huá";
			case 3:
				return "huǎ";
			case 4:
				return "huà";
			default:
				return errorToneReport();
			}
		case "huo":
			switch(tone){
			case 1:
				return "huō";
			case 2:
				return "huó";
			case 3:
				return "huǒ";
			case 4:
				return "huò";
			default:
				return errorToneReport();
			}
		case "hui":
			switch(tone){
			case 1:
				return "huī";
			case 2:
				return "huí";
			case 3:
				return "huǐ";
			case 4:
				return "huì";
			default:
				return errorToneReport();
			}
		case "huai":
			switch(tone){
			case 1:
				return "huāi";
			case 2:
				return "huái";
			case 3:
				return "huǎi";
			case 4:
				return "huài";
			default:
				return errorToneReport();
			}
		case "huan":
			switch(tone){
			case 1:
				return "huān";
			case 2:
				return "huán";
			case 3:
				return "huǎn";
			case 4:
				return "huàn";
			default:
				return errorToneReport();
			}
		case "hun":
			switch(tone){
			case 1:
				return "hūn";
			case 2:
				return "hún";
			case 3:
				return "hǔn";
			case 4:
				return "hùn";
			default:
				return errorToneReport();
			}
		case "huang":
			switch(tone){
			case 1:
				return "huāng";
			case 2:
				return "huáng";
			case 3:
				return "huǎng";
			case 4:
				return "huàng";
			default:
				return errorToneReport();
			}

		case "yu":
			switch(tone){
			case 1:
				return "yū";
			case 2:
				return "yú";
			case 3:
				return "yǔ";
			case 4:
				return "yù";
			default:
				return errorToneReport();
			}
		case "yue":
			switch(tone){
			case 1:
				return "yuē";
			case 2:
				return "yué";
			case 3:
				return "yuě";
			case 4:
				return "yuè";
			default:
				return errorToneReport();
			}
		case "yuan":
			switch(tone){
			case 1:
				return "yuān";
			case 2:
				return "yuán";
			case 3:
				return "yuǎn";
			case 4:
				return "yuàn";
			default:
				return errorToneReport();
			}
		case "yun":
			switch(tone){
			case 1:
				return "yūn";
			case 2:
				return "yún";
			case 3:
				return "yǔn";
			case 4:
				return "yùn";
			default:
				return errorToneReport();
			}
		case "nv":
			switch(tone){
			case 1:
				return "nǖ";
			case 2:
				return "nǘ";
			case 3:
				return "nǚ";
			case 4:
				return "nǜ";
			default:
				return errorToneReport();
			}
		case "nve":
			switch(tone){
			case 1:
				return "nüē";
			case 2:
				return "nüé";
			case 3:
				return "nüě";
			case 4:
				return "nüè";
			default:
				return errorToneReport();
			}
		case "lv":
			switch(tone){
			case 1:
				return "lǖ";
			case 2:
				return "lǘ";
			case 3:
				return "lǚ";
			case 4:
				return "lǜ";
			default:
				return errorToneReport();
			}
		case "lve":
			switch(tone){
			case 1:
				return "lüē";
			case 2:
				return "lüé";
			case 3:
				return "lüě";
			case 4:
				return "lüè";
			default:
				return errorToneReport();
			}
		case "ju":
			switch(tone){
			case 1:
				return "jū";
			case 2:
				return "jú";
			case 3:
				return "jǔ";
			case 4:
				return "jù";
			default:
				return errorToneReport();
			}
		case "jue":
			switch(tone){
			case 1:
				return "juē";
			case 2:
				return "jué";
			case 3:
				return "juě";
			case 4:
				return "juè";
			default:
				return errorToneReport();
			}
		case "juan":
			switch(tone){
			case 1:
				return "juān";
			case 2:
				return "juán";
			case 3:
				return "juǎn";
			case 4:
				return "juàn";
			default:
				return errorToneReport();
			}
		case "jun":
			switch(tone){
			case 1:
				return "jūn";
			case 2:
				return "jún";
			case 3:
				return "jǔn";
			case 4:
				return "jùn";
			default:
				return errorToneReport();
			}
		case "qu":
			switch(tone){
			case 1:
				return "qū";
			case 2:
				return "qú";
			case 3:
				return "qǔ";
			case 4:
				return "qù";
			default:
				return errorToneReport();
			}
		case "que":
			switch(tone){
			case 1:
				return "quē";
			case 2:
				return "qué";
			case 3:
				return "quě";
			case 4:
				return "què";
			default:
				return errorToneReport();
			}
		case "quan":
			switch(tone){
			case 1:
				return "quān";
			case 2:
				return "quán";
			case 3:
				return "quǎn";
			case 4:
				return "quàn";
			default:
				return errorToneReport();
			}
		case "qun":
			switch(tone){
			case 1:
				return "qūn";
			case 2:
				return "qún";
			case 3:
				return "qǔn";
			case 4:
				return "qùn";
			default:
				return errorToneReport();
			}
		case "xu":
			switch(tone){
			case 1:
				return "xū";
			case 2:
				return "xú";
			case 3:
				return "xǔ";
			case 4:
				return "xù";
			default:
				return errorToneReport();
			}
		case "xue":
			switch(tone){
			case 1:
				return "xuē";
			case 2:
				return "xué";
			case 3:
				return "xuě";
			case 4:
				return "xuè";
			default:
				return errorToneReport();
			}
		case "xuan":
			switch(tone){
			case 1:
				return "xuān";
			case 2:
				return "xuán";
			case 3:
				return "xuǎn";
			case 4:
				return "xuàn";
			default:
				return errorToneReport();
			}
		case "xun":
			switch(tone){
			case 1:
				return "xūn";
			case 2:
				return "xún";
			case 3:
				return "xǔn";
			case 4:
				return "xùn";
			default:
				return errorToneReport();
			}

		default:
			return errorSyllableReport();
		}
	}

	private String errorToneReport(){
		return "Converting error, no syllable match :  Sy : "+syllable+"   T :"+tone;
	}

	private String errorSyllableReport(){
		return "Converting error, no syllable match :  Sy : "+syllable+"   T :"+tone;
	}
}

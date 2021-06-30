	public static byte[] DES_Encrypt(String message, String key) throws Exception {

		SecretKey sk=SecretKeyFactory.getInstance("DESede").generateSecret(key);

	}

	public static String DES_decrypt(byte[] message,String key) throws Exception {
		SecretKey sk=SecretKeyFactory.getInstance("DESede").generateSecret(key);

	}

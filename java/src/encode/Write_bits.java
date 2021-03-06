// Generated by Haxe 3.4.0
package encode;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Write_bits extends haxe.lang.HxObject
{
	public Write_bits(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Write_bits()
	{
		//line 50 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		encode.Write_bits.__hx_ctor_encode_Write_bits(this);
	}
	
	
	public static void __hx_ctor_encode_Write_bits(encode.Write_bits __hx_this)
	{
	}
	
	
	public static void WriteBits(int n_bits, int bits, haxe.root.Array<java.lang.Object> pos, int[] array)
	{
		//line 33 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		int array_pos_off = ( ((int) (haxe.lang.Runtime.toInt(pos.__get(0))) ) >> 3 );
		//line 34 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		int bits_reserved_in_first_byte = ( ((int) (haxe.lang.Runtime.toInt(pos.__get(0))) ) & 7 );
		//line 35 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		bits = ((int) (( ((int) (bits) ) << bits_reserved_in_first_byte )) );
		//line 36 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		{
			//line 36 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
			int _g = array_pos_off++;
			//line 36 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
			((int[]) (array) )[_g] = ((int) (( ((int) (((int[]) (array) )[_g]) ) | ((int) (( ((int) (bits) ) & ((int) (255) ) )) ) )) );
		}
		
		//line 37 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		int bits_left_to_write = ( ( n_bits - 8 ) + bits_reserved_in_first_byte );
		//line 38 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		while (( bits_left_to_write >= 1 ))
		{
			//line 39 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
			bits = ((int) (( ((int) (bits) ) >>> 8 )) );
			//line 40 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
			((int[]) (array) )[array_pos_off++] = ((int) (( ((int) (bits) ) & ((int) (255) ) )) );
			//line 41 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
			bits_left_to_write -= 8;
		}
		
		//line 43 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		((int[]) (array) )[array_pos_off] = 0;
		//line 44 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		{
			//line 44 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
			int __temp_index1 = 0;
			//line 44 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
			pos.__set(__temp_index1, ( ((int) (haxe.lang.Runtime.toInt(pos.__get(__temp_index1))) ) + n_bits ));
		}
		
	}
	
	
	public static void WriteBitsPrepareStorage(int pos, int[] array)
	{
		//line 48 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Write_bits.hx"
		((int[]) (array) )[( pos >> 3 )] = 0;
	}
	
	
}



// Generated by Haxe 3.4.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace encode {
	public class Hash : global::haxe.lang.HxObject {
		
		static Hash() {
			unchecked {
				global::encode.Hash.kDistanceCacheIndex = new global::Array<int>(new int[]{0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1});
				global::encode.Hash.kDistanceCacheOffset = new global::Array<int>(new int[]{0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3});
				global::encode.Hash.kHashMul32 = 506832829;
				global::encode.Hash.kMaxZopfliLen = 325;
			}
		}
		
		
		public Hash(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Hash() {
			global::encode.Hash.__hx_ctor_encode_Hash(this);
		}
		
		
		public static void __hx_ctor_encode_Hash(global::encode.Hash __hx_this) {
		}
		
		
		public static global::Array<int> kDistanceCacheIndex;
		
		public static global::Array<int> kDistanceCacheOffset;
		
		public static int kHashMul32;
		
		public static uint Hash_(int kShiftBits, uint[] data, int data_off) {
			unchecked {
				return ((uint) (((uint) (( ((uint) ((((uint) (( ((uint) (( (((uint) (( ((uint) (( ((uint) (( ((uint) (( ((uint) (((uint[]) (data) )[( data_off + 3 )]) ) << 24 )) ) | ((uint) (( ((uint) (((uint[]) (data) )[( data_off + 2 )]) ) << 16 )) ) )) ) | ((uint) (( ((uint) (((uint[]) (data) )[( data_off + 1 )]) ) << 8 )) ) )) ) | ((uint) (((uint[]) (data) )[data_off]) ) )) )) * global::encode.Hash.kHashMul32 )) ) & -1 )) ))) ) >> ( 32 - kShiftBits ) )) )) );
			}
		}
		
		
		public static double BackwardReferenceScore(int copy_length, int backward_reference_offset) {
			return ( ( 5.4 * copy_length ) - ( 1.20 * global::encode.Fast_log.Log2Floor(((uint) (backward_reference_offset) )) ) );
		}
		
		
		public static double BackwardReferenceScoreUsingLastDistance(int copy_length, int distance_short_code) {
			return ( ( 5.4 * copy_length ) - new global::Array<double>(new double[]{-0.6, 0.95, 1.17, 1.27, 0.93, 0.93, 0.96, 0.96, 0.99, 0.99, 1.05, 1.05, 1.15, 1.15, 1.25, 1.25})[distance_short_code] );
		}
		
		
		public static int kMaxZopfliLen;
		
	}
}


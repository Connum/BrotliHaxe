// Generated by Haxe 3.4.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace encode.metablock {
	public class BlockSplit : global::haxe.lang.HxObject {
		
		public BlockSplit(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public BlockSplit() {
			global::encode.metablock.BlockSplit.__hx_ctor_encode_metablock_BlockSplit(this);
		}
		
		
		public static void __hx_ctor_encode_metablock_BlockSplit(global::encode.metablock.BlockSplit __hx_this) {
			__hx_this.lengths = new global::Array<int>();
			__hx_this.types = new global::Array<int>();
			__hx_this.num_types = 0;
		}
		
		
		public int num_types;
		
		public global::Array<int> types;
		
		public global::Array<int> lengths;
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 320835200:
					{
						this.num_types = ((int) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField_f(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 127579341:
					{
						this.lengths = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 449540217:
					{
						this.types = ((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 320835200:
					{
						this.num_types = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 127579341:
					{
						return this.lengths;
					}
					
					
					case 449540217:
					{
						return this.types;
					}
					
					
					case 320835200:
					{
						return this.num_types;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override double __hx_getField_f(string field, int hash, bool throwErrors, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 320835200:
					{
						return ((double) (this.num_types) );
					}
					
					
					default:
					{
						return base.__hx_getField_f(field, hash, throwErrors, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<object> baseArr) {
			baseArr.push("lengths");
			baseArr.push("types");
			baseArr.push("num_types");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}



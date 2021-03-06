// Generated by Haxe 3.4.0
package encode.hash;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Hashers extends haxe.lang.HxObject
{
	public Hashers(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Hashers()
	{
		//line 75 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		encode.hash.Hashers.__hx_ctor_encode_hash_Hashers(this);
	}
	
	
	public static void __hx_ctor_encode_hash_Hashers(encode.hash.Hashers __hx_this)
	{
	}
	
	
	public void Init(int type)
	{
		//line 25 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		switch (type)
		{
			case 1:
			{
				//line 26 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h1 = new encode.hash.HashLongestMatchQuickly(16, 1, true);
				//line 26 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 2:
			{
				//line 27 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h2 = new encode.hash.HashLongestMatchQuickly(16, 2, false);
				//line 27 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 3:
			{
				//line 28 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h3 = new encode.hash.HashLongestMatchQuickly(16, 4, false);
				//line 28 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 4:
			{
				//line 29 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h4 = new encode.hash.HashLongestMatchQuickly(17, 4, true);
				//line 29 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 5:
			{
				//line 30 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h5 = new encode.hash.HashLongestMatch(14, 4, 4);
				//line 30 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 6:
			{
				//line 31 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h6 = new encode.hash.HashLongestMatch(14, 5, 4);
				//line 31 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 7:
			{
				//line 32 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h7 = new encode.hash.HashLongestMatch(15, 6, 10);
				//line 32 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 8:
			{
				//line 33 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h8 = new encode.hash.HashLongestMatch(15, 7, 10);
				//line 33 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 9:
			{
				//line 34 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.hash_h9 = new encode.hash.HashLongestMatch(15, 8, 16);
				//line 34 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			default:
			{
				//line 35 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
		}
		
	}
	
	
	public void WarmupHashHashLongestMatchQuickly(int size, int[] dict, encode.hash.HashLongestMatchQuickly hasher)
	{
		//line 39 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		int _g1 = 0;
		//line 39 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		while (( _g1 < size ))
		{
			//line 39 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			int i = _g1++;
			//line 40 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			hasher.Store(dict, 0, i);
		}
		
	}
	
	
	public void WarmupHashHashLongestMatch(int size, int[] dict, encode.hash.HashLongestMatch hasher)
	{
		//line 44 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		int _g1 = 0;
		//line 44 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		while (( _g1 < size ))
		{
			//line 44 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			int i = _g1++;
			//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			hasher.Store(dict, 0, i);
		}
		
	}
	
	
	public void PrependCustomDictionary(int type, int size, int[] dict)
	{
		//line 52 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		switch (type)
		{
			case 1:
			{
				//line 53 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatchQuickly(size, dict, this.hash_h1);
				//line 53 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 2:
			{
				//line 54 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatchQuickly(size, dict, this.hash_h2);
				//line 54 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 3:
			{
				//line 55 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatchQuickly(size, dict, this.hash_h3);
				//line 55 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 4:
			{
				//line 56 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatchQuickly(size, dict, this.hash_h4);
				//line 56 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 5:
			{
				//line 57 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatch(size, dict, this.hash_h5);
				//line 57 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 6:
			{
				//line 58 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatch(size, dict, this.hash_h6);
				//line 58 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 7:
			{
				//line 59 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatch(size, dict, this.hash_h7);
				//line 59 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 8:
			{
				//line 60 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatch(size, dict, this.hash_h8);
				//line 60 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			case 9:
			{
				//line 61 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				this.WarmupHashHashLongestMatch(size, dict, this.hash_h9);
				//line 61 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
			
			default:
			{
				//line 62 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				break;
			}
			
		}
		
	}
	
	
	public encode.hash.HashLongestMatchQuickly hash_h1;
	
	public encode.hash.HashLongestMatchQuickly hash_h2;
	
	public encode.hash.HashLongestMatchQuickly hash_h3;
	
	public encode.hash.HashLongestMatchQuickly hash_h4;
	
	public encode.hash.HashLongestMatch hash_h5;
	
	public encode.hash.HashLongestMatch hash_h6;
	
	public encode.hash.HashLongestMatch hash_h7;
	
	public encode.hash.HashLongestMatch hash_h8;
	
	public encode.hash.HashLongestMatch hash_h9;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		{
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			switch (field.hashCode())
			{
				case 697527714:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h9")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h9 = ((encode.hash.HashLongestMatch) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527706:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h1")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h1 = ((encode.hash.HashLongestMatchQuickly) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527713:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h8")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h8 = ((encode.hash.HashLongestMatch) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527707:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h2")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h2 = ((encode.hash.HashLongestMatchQuickly) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527712:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h7")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h7 = ((encode.hash.HashLongestMatch) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527708:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h3")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h3 = ((encode.hash.HashLongestMatchQuickly) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527711:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h6")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h6 = ((encode.hash.HashLongestMatch) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527709:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h4")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h4 = ((encode.hash.HashLongestMatchQuickly) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527710:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h5")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.hash_h5 = ((encode.hash.HashLongestMatch) (value) );
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return value;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
			}
			
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		{
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			switch (field.hashCode())
			{
				case 697527714:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h9")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h9;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 2283824:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("Init")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Init")) );
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527713:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h8")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h8;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case -1792665501:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("WarmupHashHashLongestMatchQuickly")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "WarmupHashHashLongestMatchQuickly")) );
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527712:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h7")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h7;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case -2075903017:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("WarmupHashHashLongestMatch")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "WarmupHashHashLongestMatch")) );
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527711:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h6")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h6;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 1959352949:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("PrependCustomDictionary")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "PrependCustomDictionary")) );
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527710:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h5")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h5;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527706:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h1")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h1;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527709:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h4")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h4;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527707:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h2")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h2;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 697527708:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("hash_h3")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						return this.hash_h3;
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
			}
			
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		{
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			switch (field.hashCode())
			{
				case 1959352949:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("PrependCustomDictionary")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.PrependCustomDictionary(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int[]) (dynargs.__get(2)) ));
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case 2283824:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("Init")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.Init(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case -2075903017:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("WarmupHashHashLongestMatch")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.WarmupHashHashLongestMatch(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int[]) (dynargs.__get(1)) ), ((encode.hash.HashLongestMatch) (dynargs.__get(2)) ));
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
				case -1792665501:
				{
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					if (field.equals("WarmupHashHashLongestMatchQuickly")) 
					{
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						__temp_executeDef1 = false;
						//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
						this.WarmupHashHashLongestMatchQuickly(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int[]) (dynargs.__get(1)) ), ((encode.hash.HashLongestMatchQuickly) (dynargs.__get(2)) ));
					}
					
					//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
					break;
				}
				
				
			}
			
			//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h9");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h8");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h7");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h6");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h5");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h4");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h3");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h2");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		baseArr.push("hash_h1");
		//line 9 "C:\\Users\\Dominik\\Brotli\\src\\encode\\hash\\Hashers.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}



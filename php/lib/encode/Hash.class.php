<?php

// Generated by Haxe 3.4.0
class encode_Hash {
	public function __construct() {}
	static $kDistanceCacheIndex;
	static $kDistanceCacheOffset;
	static $kHashMul32 = 506832829;
	static function Hash_($kShiftBits, $data, $data_off) {
		return _hx_shift_right(_hx_shift_right(($data[$data_off + 3] << 24 | $data[$data_off + 2] << 16 | $data[$data_off + 1] << 8 | $data[$data_off]) * encode_Hash::$kHashMul32, 32), 32 - $kShiftBits);
	}
	static function BackwardReferenceScore($copy_length, $backward_reference_offset) {
		return 5.4 * $copy_length - 1.20 * encode_Fast_log::Log2Floor($backward_reference_offset);
	}
	static function BackwardReferenceScoreUsingLastDistance($copy_length, $distance_short_code) {
		return 5.4 * $copy_length - _hx_array_get((new _hx_array(array(-0.6, 0.95, 1.17, 1.27, 0.93, 0.93, 0.96, 0.96, 0.99, 0.99, 1.05, 1.05, 1.15, 1.15, 1.25, 1.25))), $distance_short_code);
	}
	static $kMaxZopfliLen = 325;
	function __toString() { return 'encode.Hash'; }
}
encode_Hash::$kDistanceCacheIndex = (new _hx_array(array(0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1)));
encode_Hash::$kDistanceCacheOffset = (new _hx_array(array(0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3)));
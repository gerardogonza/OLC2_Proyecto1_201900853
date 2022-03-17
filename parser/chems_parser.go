// Code generated from Chems.g4 by ANTLR 4.7.2. DO NOT EDIT.

package parser // Chems

import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

import "proyecto1/interfaces"
import "proyecto1/expresion"
import "proyecto1/instruction"
import arrayList "github.com/colegno/arraylist"

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 57, 285,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 3, 2,
	3, 2, 3, 2, 3, 3, 7, 3, 29, 10, 3, 12, 3, 14, 3, 32, 11, 3, 3, 3, 3, 3,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 5, 4, 118,
	10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 5, 5, 126, 10, 5, 3, 6, 3, 6,
	3, 6, 5, 6, 131, 10, 6, 3, 7, 3, 7, 3, 7, 3, 7, 5, 7, 137, 10, 7, 3, 8,
	3, 8, 3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 5, 9, 171, 10, 9, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 7, 9,
	222, 10, 9, 12, 9, 14, 9, 225, 11, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 7, 10, 236, 10, 10, 12, 10, 14, 10, 239, 11,
	10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3,
	11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 5, 11, 268, 10, 11, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 7, 12, 280,
	10, 12, 12, 12, 14, 12, 283, 11, 12, 3, 12, 2, 5, 16, 18, 22, 13, 2, 4,
	6, 8, 10, 12, 14, 16, 18, 20, 22, 2, 8, 3, 2, 12, 13, 3, 2, 10, 11, 3,
	2, 43, 44, 3, 2, 46, 47, 5, 2, 36, 36, 39, 42, 45, 45, 3, 2, 54, 55, 2,
	311, 2, 24, 3, 2, 2, 2, 4, 30, 3, 2, 2, 2, 6, 117, 3, 2, 2, 2, 8, 125,
	3, 2, 2, 2, 10, 130, 3, 2, 2, 2, 12, 136, 3, 2, 2, 2, 14, 138, 3, 2, 2,
	2, 16, 170, 3, 2, 2, 2, 18, 226, 3, 2, 2, 2, 20, 267, 3, 2, 2, 2, 22, 269,
	3, 2, 2, 2, 24, 25, 5, 4, 3, 2, 25, 26, 8, 2, 1, 2, 26, 3, 3, 2, 2, 2,
	27, 29, 5, 6, 4, 2, 28, 27, 3, 2, 2, 2, 29, 32, 3, 2, 2, 2, 30, 28, 3,
	2, 2, 2, 30, 31, 3, 2, 2, 2, 31, 33, 3, 2, 2, 2, 32, 30, 3, 2, 2, 2, 33,
	34, 8, 3, 1, 2, 34, 5, 3, 2, 2, 2, 35, 36, 7, 3, 2, 2, 36, 37, 7, 35, 2,
	2, 37, 38, 7, 48, 2, 2, 38, 39, 5, 14, 8, 2, 39, 40, 7, 49, 2, 2, 40, 41,
	7, 32, 2, 2, 41, 42, 8, 4, 1, 2, 42, 118, 3, 2, 2, 2, 43, 44, 7, 4, 2,
	2, 44, 45, 7, 35, 2, 2, 45, 46, 7, 48, 2, 2, 46, 47, 5, 14, 8, 2, 47, 48,
	7, 49, 2, 2, 48, 49, 7, 32, 2, 2, 49, 50, 8, 4, 1, 2, 50, 118, 3, 2, 2,
	2, 51, 52, 7, 14, 2, 2, 52, 53, 5, 10, 6, 2, 53, 54, 5, 12, 7, 2, 54, 55,
	7, 30, 2, 2, 55, 56, 7, 34, 2, 2, 56, 57, 5, 8, 5, 2, 57, 58, 7, 37, 2,
	2, 58, 59, 5, 14, 8, 2, 59, 60, 7, 32, 2, 2, 60, 61, 8, 4, 1, 2, 61, 118,
	3, 2, 2, 2, 62, 63, 7, 14, 2, 2, 63, 64, 5, 10, 6, 2, 64, 65, 5, 12, 7,
	2, 65, 66, 7, 30, 2, 2, 66, 67, 7, 37, 2, 2, 67, 68, 5, 14, 8, 2, 68, 69,
	7, 32, 2, 2, 69, 70, 8, 4, 1, 2, 70, 118, 3, 2, 2, 2, 71, 72, 7, 30, 2,
	2, 72, 73, 7, 37, 2, 2, 73, 74, 5, 14, 8, 2, 74, 75, 7, 32, 2, 2, 75, 76,
	8, 4, 1, 2, 76, 118, 3, 2, 2, 2, 77, 78, 7, 7, 2, 2, 78, 79, 5, 14, 8,
	2, 79, 80, 7, 50, 2, 2, 80, 81, 5, 4, 3, 2, 81, 82, 7, 51, 2, 2, 82, 83,
	8, 4, 1, 2, 83, 118, 3, 2, 2, 2, 84, 85, 7, 7, 2, 2, 85, 86, 5, 14, 8,
	2, 86, 87, 7, 50, 2, 2, 87, 88, 5, 4, 3, 2, 88, 89, 7, 51, 2, 2, 89, 90,
	7, 8, 2, 2, 90, 91, 7, 50, 2, 2, 91, 92, 5, 4, 3, 2, 92, 93, 7, 51, 2,
	2, 93, 94, 8, 4, 1, 2, 94, 118, 3, 2, 2, 2, 95, 96, 7, 9, 2, 2, 96, 97,
	5, 14, 8, 2, 97, 98, 7, 50, 2, 2, 98, 99, 5, 4, 3, 2, 99, 100, 7, 51, 2,
	2, 100, 101, 8, 4, 1, 2, 101, 118, 3, 2, 2, 2, 102, 103, 7, 20, 2, 2, 103,
	104, 7, 50, 2, 2, 104, 105, 5, 4, 3, 2, 105, 106, 7, 51, 2, 2, 106, 107,
	8, 4, 1, 2, 107, 118, 3, 2, 2, 2, 108, 109, 7, 25, 2, 2, 109, 110, 7, 30,
	2, 2, 110, 111, 7, 26, 2, 2, 111, 112, 5, 14, 8, 2, 112, 113, 7, 50, 2,
	2, 113, 114, 5, 4, 3, 2, 114, 115, 7, 51, 2, 2, 115, 116, 8, 4, 1, 2, 116,
	118, 3, 2, 2, 2, 117, 35, 3, 2, 2, 2, 117, 43, 3, 2, 2, 2, 117, 51, 3,
	2, 2, 2, 117, 62, 3, 2, 2, 2, 117, 71, 3, 2, 2, 2, 117, 77, 3, 2, 2, 2,
	117, 84, 3, 2, 2, 2, 117, 95, 3, 2, 2, 2, 117, 102, 3, 2, 2, 2, 117, 108,
	3, 2, 2, 2, 118, 7, 3, 2, 2, 2, 119, 120, 7, 13, 2, 2, 120, 126, 8, 5,
	1, 2, 121, 122, 7, 12, 2, 2, 122, 126, 8, 5, 1, 2, 123, 124, 7, 6, 2, 2,
	124, 126, 8, 5, 1, 2, 125, 119, 3, 2, 2, 2, 125, 121, 3, 2, 2, 2, 125,
	123, 3, 2, 2, 2, 126, 9, 3, 2, 2, 2, 127, 128, 7, 15, 2, 2, 128, 131, 8,
	6, 1, 2, 129, 131, 3, 2, 2, 2, 130, 127, 3, 2, 2, 2, 130, 129, 3, 2, 2,
	2, 131, 11, 3, 2, 2, 2, 132, 133, 7, 52, 2, 2, 133, 134, 7, 53, 2, 2, 134,
	137, 8, 7, 1, 2, 135, 137, 3, 2, 2, 2, 136, 132, 3, 2, 2, 2, 136, 135,
	3, 2, 2, 2, 137, 13, 3, 2, 2, 2, 138, 139, 5, 16, 9, 2, 139, 140, 8, 8,
	1, 2, 140, 15, 3, 2, 2, 2, 141, 142, 8, 9, 1, 2, 142, 143, 9, 2, 2, 2,
	143, 144, 7, 34, 2, 2, 144, 145, 7, 34, 2, 2, 145, 146, 9, 3, 2, 2, 146,
	147, 7, 48, 2, 2, 147, 148, 5, 16, 9, 2, 148, 149, 7, 33, 2, 2, 149, 150,
	5, 16, 9, 2, 150, 151, 7, 49, 2, 2, 151, 152, 8, 9, 1, 2, 152, 171, 3,
	2, 2, 2, 153, 154, 7, 35, 2, 2, 154, 155, 5, 16, 9, 10, 155, 156, 8, 9,
	1, 2, 156, 171, 3, 2, 2, 2, 157, 158, 7, 52, 2, 2, 158, 159, 5, 18, 10,
	2, 159, 160, 7, 53, 2, 2, 160, 161, 8, 9, 1, 2, 161, 171, 3, 2, 2, 2, 162,
	163, 5, 20, 11, 2, 163, 164, 8, 9, 1, 2, 164, 171, 3, 2, 2, 2, 165, 166,
	7, 48, 2, 2, 166, 167, 5, 14, 8, 2, 167, 168, 7, 49, 2, 2, 168, 169, 8,
	9, 1, 2, 169, 171, 3, 2, 2, 2, 170, 141, 3, 2, 2, 2, 170, 153, 3, 2, 2,
	2, 170, 157, 3, 2, 2, 2, 170, 162, 3, 2, 2, 2, 170, 165, 3, 2, 2, 2, 171,
	223, 3, 2, 2, 2, 172, 173, 12, 16, 2, 2, 173, 174, 9, 4, 2, 2, 174, 175,
	5, 16, 9, 17, 175, 176, 8, 9, 1, 2, 176, 222, 3, 2, 2, 2, 177, 178, 12,
	15, 2, 2, 178, 179, 9, 5, 2, 2, 179, 180, 5, 16, 9, 16, 180, 181, 8, 9,
	1, 2, 181, 222, 3, 2, 2, 2, 182, 183, 12, 13, 2, 2, 183, 184, 9, 6, 2,
	2, 184, 185, 5, 16, 9, 14, 185, 186, 8, 9, 1, 2, 186, 222, 3, 2, 2, 2,
	187, 188, 12, 12, 2, 2, 188, 189, 7, 38, 2, 2, 189, 190, 5, 16, 9, 13,
	190, 191, 8, 9, 1, 2, 191, 222, 3, 2, 2, 2, 192, 193, 12, 11, 2, 2, 193,
	194, 9, 7, 2, 2, 194, 195, 5, 16, 9, 12, 195, 196, 8, 9, 1, 2, 196, 222,
	3, 2, 2, 2, 197, 198, 12, 9, 2, 2, 198, 199, 7, 31, 2, 2, 199, 200, 7,
	21, 2, 2, 200, 201, 7, 48, 2, 2, 201, 202, 7, 49, 2, 2, 202, 222, 8, 9,
	1, 2, 203, 204, 12, 8, 2, 2, 204, 205, 7, 31, 2, 2, 205, 206, 7, 22, 2,
	2, 206, 207, 7, 48, 2, 2, 207, 208, 7, 49, 2, 2, 208, 222, 8, 9, 1, 2,
	209, 210, 12, 7, 2, 2, 210, 211, 7, 31, 2, 2, 211, 212, 7, 23, 2, 2, 212,
	213, 7, 48, 2, 2, 213, 214, 7, 49, 2, 2, 214, 222, 8, 9, 1, 2, 215, 216,
	12, 6, 2, 2, 216, 217, 7, 31, 2, 2, 217, 218, 7, 24, 2, 2, 218, 219, 7,
	48, 2, 2, 219, 220, 7, 49, 2, 2, 220, 222, 8, 9, 1, 2, 221, 172, 3, 2,
	2, 2, 221, 177, 3, 2, 2, 2, 221, 182, 3, 2, 2, 2, 221, 187, 3, 2, 2, 2,
	221, 192, 3, 2, 2, 2, 221, 197, 3, 2, 2, 2, 221, 203, 3, 2, 2, 2, 221,
	209, 3, 2, 2, 2, 221, 215, 3, 2, 2, 2, 222, 225, 3, 2, 2, 2, 223, 221,
	3, 2, 2, 2, 223, 224, 3, 2, 2, 2, 224, 17, 3, 2, 2, 2, 225, 223, 3, 2,
	2, 2, 226, 227, 8, 10, 1, 2, 227, 228, 5, 14, 8, 2, 228, 229, 8, 10, 1,
	2, 229, 237, 3, 2, 2, 2, 230, 231, 12, 4, 2, 2, 231, 232, 7, 33, 2, 2,
	232, 233, 5, 14, 8, 2, 233, 234, 8, 10, 1, 2, 234, 236, 3, 2, 2, 2, 235,
	230, 3, 2, 2, 2, 236, 239, 3, 2, 2, 2, 237, 235, 3, 2, 2, 2, 237, 238,
	3, 2, 2, 2, 238, 19, 3, 2, 2, 2, 239, 237, 3, 2, 2, 2, 240, 241, 7, 27,
	2, 2, 241, 268, 8, 11, 1, 2, 242, 243, 7, 47, 2, 2, 243, 244, 7, 27, 2,
	2, 244, 268, 8, 11, 1, 2, 245, 246, 7, 47, 2, 2, 246, 247, 7, 28, 2, 2,
	247, 268, 8, 11, 1, 2, 248, 249, 7, 29, 2, 2, 249, 268, 8, 11, 1, 2, 250,
	251, 7, 28, 2, 2, 251, 268, 8, 11, 1, 2, 252, 253, 7, 28, 2, 2, 253, 254,
	7, 16, 2, 2, 254, 255, 7, 12, 2, 2, 255, 268, 8, 11, 1, 2, 256, 257, 7,
	27, 2, 2, 257, 258, 7, 16, 2, 2, 258, 259, 7, 13, 2, 2, 259, 268, 8, 11,
	1, 2, 260, 261, 5, 22, 12, 2, 261, 262, 8, 11, 1, 2, 262, 268, 3, 2, 2,
	2, 263, 264, 7, 17, 2, 2, 264, 268, 8, 11, 1, 2, 265, 266, 7, 18, 2, 2,
	266, 268, 8, 11, 1, 2, 267, 240, 3, 2, 2, 2, 267, 242, 3, 2, 2, 2, 267,
	245, 3, 2, 2, 2, 267, 248, 3, 2, 2, 2, 267, 250, 3, 2, 2, 2, 267, 252,
	3, 2, 2, 2, 267, 256, 3, 2, 2, 2, 267, 260, 3, 2, 2, 2, 267, 263, 3, 2,
	2, 2, 267, 265, 3, 2, 2, 2, 268, 21, 3, 2, 2, 2, 269, 270, 8, 12, 1, 2,
	270, 271, 7, 30, 2, 2, 271, 272, 8, 12, 1, 2, 272, 281, 3, 2, 2, 2, 273,
	274, 12, 4, 2, 2, 274, 275, 7, 52, 2, 2, 275, 276, 5, 14, 8, 2, 276, 277,
	7, 53, 2, 2, 277, 278, 8, 12, 1, 2, 278, 280, 3, 2, 2, 2, 279, 273, 3,
	2, 2, 2, 280, 283, 3, 2, 2, 2, 281, 279, 3, 2, 2, 2, 281, 282, 3, 2, 2,
	2, 282, 23, 3, 2, 2, 2, 283, 281, 3, 2, 2, 2, 13, 30, 117, 125, 130, 136,
	170, 221, 223, 237, 267, 281,
}
var deserializer = antlr.NewATNDeserializer(nil)
var deserializedATN = deserializer.DeserializeFromUInt16(parserATN)

var literalNames = []string{
	"", "'println'", "'print'", "'number'", "'string'", "'if'", "'else'", "'while'",
	"'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'", "'true'",
	"'false'", "'match'", "'loop'", "'abs'", "'sqrt'", "'to_string'", "'clone'",
	"'for'", "'in'", "", "", "", "", "'.'", "';'", "','", "':'", "'!'", "'!='",
	"'='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'+'",
	"'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'||'", "'&&'",
}
var symbolicNames = []string{
	"", "PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE",
	"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE",
	"P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", "P_CLONE",
	"P_FOR", "P_IN", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA",
	"COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA",
	"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD",
	"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER",
	"OR", "AND", "MULTICOMENT", "WHITESPACE",
}

var ruleNames = []string{
	"start", "instrucciones", "instruccion", "tipo", "mut", "array_st", "expression",
	"expr_arit", "listValues", "primitivo", "listArray",
}
var decisionToDFA = make([]*antlr.DFA, len(deserializedATN.DecisionToState))

func init() {
	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}
}

type Chems struct {
	*antlr.BaseParser
}

func NewChems(input antlr.TokenStream) *Chems {
	this := new(Chems)

	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, antlr.NewPredictionContextCache())
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "Chems.g4"

	return this
}

// Chems tokens.
const (
	ChemsEOF         = antlr.TokenEOF
	ChemsPRINTLN     = 1
	ChemsPRINT       = 2
	ChemsP_NUMBER    = 3
	ChemsP_STRING    = 4
	ChemsP_IF        = 5
	ChemsP_ELSE      = 6
	ChemsP_WHILE     = 7
	ChemsP_POW       = 8
	ChemsP_POWF      = 9
	ChemsP_I64       = 10
	ChemsP_F64       = 11
	ChemsP_LET       = 12
	ChemsP_MUT       = 13
	ChemsP_AS        = 14
	ChemsP_TRUE      = 15
	ChemsP_FALSE     = 16
	ChemsP_MATCH     = 17
	ChemsP_LOOP      = 18
	ChemsP_ABS       = 19
	ChemsP_SQRT      = 20
	ChemsP_TOSTRING  = 21
	ChemsP_CLONE     = 22
	ChemsP_FOR       = 23
	ChemsP_IN        = 24
	ChemsNUMBER      = 25
	ChemsDECIMAL     = 26
	ChemsSTRING      = 27
	ChemsID          = 28
	ChemsPUNTO       = 29
	ChemsPTCOMA      = 30
	ChemsCOMA        = 31
	ChemsDOSPUNTOS   = 32
	ChemsDIFERENTE   = 33
	ChemsDIFERENTEDE = 34
	ChemsIGUAL       = 35
	ChemsIGUALIGUA   = 36
	ChemsMAYORIGUAL  = 37
	ChemsMENORIGUAL  = 38
	ChemsMAYOR       = 39
	ChemsMENOR       = 40
	ChemsMUL         = 41
	ChemsDIV         = 42
	ChemsMODULO      = 43
	ChemsADD         = 44
	ChemsSUB         = 45
	ChemsPARIZQ      = 46
	ChemsPARDER      = 47
	ChemsLLAVEIZQ    = 48
	ChemsLLAVEDER    = 49
	ChemsCORIZQ      = 50
	ChemsCORDER      = 51
	ChemsOR          = 52
	ChemsAND         = 53
	ChemsMULTICOMENT = 54
	ChemsWHITESPACE  = 55
)

// Chems rules.
const (
	ChemsRULE_start         = 0
	ChemsRULE_instrucciones = 1
	ChemsRULE_instruccion   = 2
	ChemsRULE_tipo          = 3
	ChemsRULE_mut           = 4
	ChemsRULE_array_st      = 5
	ChemsRULE_expression    = 6
	ChemsRULE_expr_arit     = 7
	ChemsRULE_listValues    = 8
	ChemsRULE_primitivo     = 9
	ChemsRULE_listArray     = 10
)

// IStartContext is an interface to support dynamic dispatch.
type IStartContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instrucciones returns the _instrucciones rule contexts.
	Get_instrucciones() IInstruccionesContext

	// Set_instrucciones sets the _instrucciones rule contexts.
	Set_instrucciones(IInstruccionesContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsStartContext differentiates from other interfaces.
	IsStartContext()
}

type StartContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	lista          *arrayList.List
	_instrucciones IInstruccionesContext
}

func NewEmptyStartContext() *StartContext {
	var p = new(StartContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_start
	return p
}

func (*StartContext) IsStartContext() {}

func NewStartContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StartContext {
	var p = new(StartContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_start

	return p
}

func (s *StartContext) GetParser() antlr.Parser { return s.parser }

func (s *StartContext) Get_instrucciones() IInstruccionesContext { return s._instrucciones }

func (s *StartContext) Set_instrucciones(v IInstruccionesContext) { s._instrucciones = v }

func (s *StartContext) GetLista() *arrayList.List { return s.lista }

func (s *StartContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *StartContext) Instrucciones() IInstruccionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccionesContext)
}

func (s *StartContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StartContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StartContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterStart(s)
	}
}

func (s *StartContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitStart(s)
	}
}

func (p *Chems) Start() (localctx IStartContext) {
	localctx = NewStartContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, ChemsRULE_start)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(22)

		var _x = p.Instrucciones()

		localctx.(*StartContext)._instrucciones = _x
	}
	localctx.(*StartContext).lista = localctx.(*StartContext).Get_instrucciones().GetL()

	return localctx
}

// IInstruccionesContext is an interface to support dynamic dispatch.
type IInstruccionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instruccion returns the _instruccion rule contexts.
	Get_instruccion() IInstruccionContext

	// Set_instruccion sets the _instruccion rule contexts.
	Set_instruccion(IInstruccionContext)

	// GetE returns the e rule context list.
	GetE() []IInstruccionContext

	// SetE sets the e rule context list.
	SetE([]IInstruccionContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsInstruccionesContext differentiates from other interfaces.
	IsInstruccionesContext()
}

type InstruccionesContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	l            *arrayList.List
	_instruccion IInstruccionContext
	e            []IInstruccionContext
}

func NewEmptyInstruccionesContext() *InstruccionesContext {
	var p = new(InstruccionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_instrucciones
	return p
}

func (*InstruccionesContext) IsInstruccionesContext() {}

func NewInstruccionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstruccionesContext {
	var p = new(InstruccionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_instrucciones

	return p
}

func (s *InstruccionesContext) GetParser() antlr.Parser { return s.parser }

func (s *InstruccionesContext) Get_instruccion() IInstruccionContext { return s._instruccion }

func (s *InstruccionesContext) Set_instruccion(v IInstruccionContext) { s._instruccion = v }

func (s *InstruccionesContext) GetE() []IInstruccionContext { return s.e }

func (s *InstruccionesContext) SetE(v []IInstruccionContext) { s.e = v }

func (s *InstruccionesContext) GetL() *arrayList.List { return s.l }

func (s *InstruccionesContext) SetL(v *arrayList.List) { s.l = v }

func (s *InstruccionesContext) AllInstruccion() []IInstruccionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstruccionContext)(nil)).Elem())
	var tst = make([]IInstruccionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstruccionContext)
		}
	}

	return tst
}

func (s *InstruccionesContext) Instruccion(i int) IInstruccionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstruccionContext)
}

func (s *InstruccionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstruccionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstruccionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterInstrucciones(s)
	}
}

func (s *InstruccionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitInstrucciones(s)
	}
}

func (p *Chems) Instrucciones() (localctx IInstruccionesContext) {
	localctx = NewInstruccionesContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, ChemsRULE_instrucciones)

	localctx.(*InstruccionesContext).l = arrayList.New()

	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(28)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for ((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<ChemsPRINTLN)|(1<<ChemsPRINT)|(1<<ChemsP_IF)|(1<<ChemsP_WHILE)|(1<<ChemsP_LET)|(1<<ChemsP_LOOP)|(1<<ChemsP_FOR)|(1<<ChemsID))) != 0 {
		{
			p.SetState(25)

			var _x = p.Instruccion()

			localctx.(*InstruccionesContext)._instruccion = _x
		}
		localctx.(*InstruccionesContext).e = append(localctx.(*InstruccionesContext).e, localctx.(*InstruccionesContext)._instruccion)

		p.SetState(30)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	listInt := localctx.(*InstruccionesContext).GetE()
	for _, e := range listInt {
		localctx.(*InstruccionesContext).l.Add(e.GetInstr())
	}

	return localctx
}

// IInstruccionContext is an interface to support dynamic dispatch.
type IInstruccionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetId returns the id token.
	GetId() antlr.Token

	// SetId sets the id token.
	SetId(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// GetMuteable returns the muteable rule contexts.
	GetMuteable() IMutContext

	// GetIsArray returns the isArray rule contexts.
	GetIsArray() IArray_stContext

	// GetIsTipo returns the isTipo rule contexts.
	GetIsTipo() ITipoContext

	// Get_instrucciones returns the _instrucciones rule contexts.
	Get_instrucciones() IInstruccionesContext

	// GetI1 returns the i1 rule contexts.
	GetI1() IInstruccionesContext

	// GetI2 returns the i2 rule contexts.
	GetI2() IInstruccionesContext

	// GetF2 returns the f2 rule contexts.
	GetF2() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// SetMuteable sets the muteable rule contexts.
	SetMuteable(IMutContext)

	// SetIsArray sets the isArray rule contexts.
	SetIsArray(IArray_stContext)

	// SetIsTipo sets the isTipo rule contexts.
	SetIsTipo(ITipoContext)

	// Set_instrucciones sets the _instrucciones rule contexts.
	Set_instrucciones(IInstruccionesContext)

	// SetI1 sets the i1 rule contexts.
	SetI1(IInstruccionesContext)

	// SetI2 sets the i2 rule contexts.
	SetI2(IInstruccionesContext)

	// SetF2 sets the f2 rule contexts.
	SetF2(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsInstruccionContext differentiates from other interfaces.
	IsInstruccionContext()
}

type InstruccionContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	instr          interfaces.Instruction
	_expression    IExpressionContext
	muteable       IMutContext
	isArray        IArray_stContext
	id             antlr.Token
	isTipo         ITipoContext
	_instrucciones IInstruccionesContext
	i1             IInstruccionesContext
	i2             IInstruccionesContext
	f2             IExpressionContext
}

func NewEmptyInstruccionContext() *InstruccionContext {
	var p = new(InstruccionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_instruccion
	return p
}

func (*InstruccionContext) IsInstruccionContext() {}

func NewInstruccionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstruccionContext {
	var p = new(InstruccionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_instruccion

	return p
}

func (s *InstruccionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstruccionContext) GetId() antlr.Token { return s.id }

func (s *InstruccionContext) SetId(v antlr.Token) { s.id = v }

func (s *InstruccionContext) Get_expression() IExpressionContext { return s._expression }

func (s *InstruccionContext) GetMuteable() IMutContext { return s.muteable }

func (s *InstruccionContext) GetIsArray() IArray_stContext { return s.isArray }

func (s *InstruccionContext) GetIsTipo() ITipoContext { return s.isTipo }

func (s *InstruccionContext) Get_instrucciones() IInstruccionesContext { return s._instrucciones }

func (s *InstruccionContext) GetI1() IInstruccionesContext { return s.i1 }

func (s *InstruccionContext) GetI2() IInstruccionesContext { return s.i2 }

func (s *InstruccionContext) GetF2() IExpressionContext { return s.f2 }

func (s *InstruccionContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *InstruccionContext) SetMuteable(v IMutContext) { s.muteable = v }

func (s *InstruccionContext) SetIsArray(v IArray_stContext) { s.isArray = v }

func (s *InstruccionContext) SetIsTipo(v ITipoContext) { s.isTipo = v }

func (s *InstruccionContext) Set_instrucciones(v IInstruccionesContext) { s._instrucciones = v }

func (s *InstruccionContext) SetI1(v IInstruccionesContext) { s.i1 = v }

func (s *InstruccionContext) SetI2(v IInstruccionesContext) { s.i2 = v }

func (s *InstruccionContext) SetF2(v IExpressionContext) { s.f2 = v }

func (s *InstruccionContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *InstruccionContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *InstruccionContext) PRINTLN() antlr.TerminalNode {
	return s.GetToken(ChemsPRINTLN, 0)
}

func (s *InstruccionContext) DIFERENTE() antlr.TerminalNode {
	return s.GetToken(ChemsDIFERENTE, 0)
}

func (s *InstruccionContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(ChemsPARIZQ, 0)
}

func (s *InstruccionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *InstruccionContext) PARDER() antlr.TerminalNode {
	return s.GetToken(ChemsPARDER, 0)
}

func (s *InstruccionContext) PTCOMA() antlr.TerminalNode {
	return s.GetToken(ChemsPTCOMA, 0)
}

func (s *InstruccionContext) PRINT() antlr.TerminalNode {
	return s.GetToken(ChemsPRINT, 0)
}

func (s *InstruccionContext) P_LET() antlr.TerminalNode {
	return s.GetToken(ChemsP_LET, 0)
}

func (s *InstruccionContext) DOSPUNTOS() antlr.TerminalNode {
	return s.GetToken(ChemsDOSPUNTOS, 0)
}

func (s *InstruccionContext) IGUAL() antlr.TerminalNode {
	return s.GetToken(ChemsIGUAL, 0)
}

func (s *InstruccionContext) Mut() IMutContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMutContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMutContext)
}

func (s *InstruccionContext) Array_st() IArray_stContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArray_stContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArray_stContext)
}

func (s *InstruccionContext) ID() antlr.TerminalNode {
	return s.GetToken(ChemsID, 0)
}

func (s *InstruccionContext) Tipo() ITipoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITipoContext)
}

func (s *InstruccionContext) P_IF() antlr.TerminalNode {
	return s.GetToken(ChemsP_IF, 0)
}

func (s *InstruccionContext) AllLLAVEIZQ() []antlr.TerminalNode {
	return s.GetTokens(ChemsLLAVEIZQ)
}

func (s *InstruccionContext) LLAVEIZQ(i int) antlr.TerminalNode {
	return s.GetToken(ChemsLLAVEIZQ, i)
}

func (s *InstruccionContext) AllInstrucciones() []IInstruccionesContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstruccionesContext)(nil)).Elem())
	var tst = make([]IInstruccionesContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstruccionesContext)
		}
	}

	return tst
}

func (s *InstruccionContext) Instrucciones(i int) IInstruccionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionesContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstruccionesContext)
}

func (s *InstruccionContext) AllLLAVEDER() []antlr.TerminalNode {
	return s.GetTokens(ChemsLLAVEDER)
}

func (s *InstruccionContext) LLAVEDER(i int) antlr.TerminalNode {
	return s.GetToken(ChemsLLAVEDER, i)
}

func (s *InstruccionContext) P_ELSE() antlr.TerminalNode {
	return s.GetToken(ChemsP_ELSE, 0)
}

func (s *InstruccionContext) P_WHILE() antlr.TerminalNode {
	return s.GetToken(ChemsP_WHILE, 0)
}

func (s *InstruccionContext) P_LOOP() antlr.TerminalNode {
	return s.GetToken(ChemsP_LOOP, 0)
}

func (s *InstruccionContext) P_FOR() antlr.TerminalNode {
	return s.GetToken(ChemsP_FOR, 0)
}

func (s *InstruccionContext) P_IN() antlr.TerminalNode {
	return s.GetToken(ChemsP_IN, 0)
}

func (s *InstruccionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstruccionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstruccionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterInstruccion(s)
	}
}

func (s *InstruccionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitInstruccion(s)
	}
}

func (p *Chems) Instruccion() (localctx IInstruccionContext) {
	localctx = NewInstruccionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, ChemsRULE_instruccion)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(115)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 1, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(33)
			p.Match(ChemsPRINTLN)
		}
		{
			p.SetState(34)
			p.Match(ChemsDIFERENTE)
		}
		{
			p.SetState(35)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(36)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(37)
			p.Match(ChemsPARDER)
		}
		{
			p.SetState(38)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewImprimir(localctx.(*InstruccionContext).Get_expression().GetP(), false)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(41)
			p.Match(ChemsPRINT)
		}
		{
			p.SetState(42)
			p.Match(ChemsDIFERENTE)
		}
		{
			p.SetState(43)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(44)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(45)
			p.Match(ChemsPARDER)
		}
		{
			p.SetState(46)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewImprimir(localctx.(*InstruccionContext).Get_expression().GetP(), true)

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(49)
			p.Match(ChemsP_LET)
		}
		{
			p.SetState(50)

			var _x = p.Mut()

			localctx.(*InstruccionContext).muteable = _x
		}
		{
			p.SetState(51)

			var _x = p.Array_st()

			localctx.(*InstruccionContext).isArray = _x
		}
		{
			p.SetState(52)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(53)
			p.Match(ChemsDOSPUNTOS)
		}
		{
			p.SetState(54)

			var _x = p.Tipo()

			localctx.(*InstruccionContext).isTipo = _x
		}
		{
			p.SetState(55)
			p.Match(ChemsIGUAL)
		}
		{
			p.SetState(56)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(57)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewDeclaration((func() string {
			if localctx.(*InstruccionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*InstruccionContext).GetId().GetText()
			}
		}()), localctx.(*InstruccionContext).GetIsTipo().GetP(), localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).GetIsArray().GetArr(), localctx.(*InstruccionContext).GetMuteable().GetArr(), (func() antlr.Token {
			if localctx.(*InstruccionContext).Get_expression() == nil {
				return nil
			} else {
				return localctx.(*InstruccionContext).Get_expression().GetStart()
			}
		}()).GetLine(), (func() antlr.Token {
			if localctx.(*InstruccionContext).Get_expression() == nil {
				return nil
			} else {
				return localctx.(*InstruccionContext).Get_expression().GetStart()
			}
		}()).GetColumn())

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(60)
			p.Match(ChemsP_LET)
		}
		{
			p.SetState(61)

			var _x = p.Mut()

			localctx.(*InstruccionContext).muteable = _x
		}
		{
			p.SetState(62)

			var _x = p.Array_st()

			localctx.(*InstruccionContext).isArray = _x
		}
		{
			p.SetState(63)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(64)
			p.Match(ChemsIGUAL)
		}
		{
			p.SetState(65)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(66)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewDeclaration((func() string {
			if localctx.(*InstruccionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*InstruccionContext).GetId().GetText()
			}
		}()), interfaces.NULL, localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).GetIsArray().GetArr(), localctx.(*InstruccionContext).GetMuteable().GetArr(), (func() antlr.Token {
			if localctx.(*InstruccionContext).Get_expression() == nil {
				return nil
			} else {
				return localctx.(*InstruccionContext).Get_expression().GetStart()
			}
		}()).GetLine(), (func() antlr.Token {
			if localctx.(*InstruccionContext).Get_expression() == nil {
				return nil
			} else {
				return localctx.(*InstruccionContext).Get_expression().GetStart()
			}
		}()).GetColumn())

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(69)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(70)
			p.Match(ChemsIGUAL)
		}
		{
			p.SetState(71)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(72)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewAssignment((func() string {
			if localctx.(*InstruccionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*InstruccionContext).GetId().GetText()
			}
		}()), localctx.(*InstruccionContext).Get_expression().GetP())

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(75)
			p.Match(ChemsP_IF)
		}
		{
			p.SetState(76)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(77)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(78)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext)._instrucciones = _x
		}
		{
			p.SetState(79)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewIf(localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).Get_instrucciones().GetL(), false, nil)

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(82)
			p.Match(ChemsP_IF)
		}
		{
			p.SetState(83)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(84)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(85)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext).i1 = _x
		}
		{
			p.SetState(86)
			p.Match(ChemsLLAVEDER)
		}
		{
			p.SetState(87)
			p.Match(ChemsP_ELSE)
		}
		{
			p.SetState(88)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(89)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext).i2 = _x
		}
		{
			p.SetState(90)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewIf(localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).GetI1().GetL(), true, localctx.(*InstruccionContext).GetI2().GetL())

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(93)
			p.Match(ChemsP_WHILE)
		}
		{
			p.SetState(94)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(95)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(96)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext)._instrucciones = _x
		}
		{
			p.SetState(97)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewWhile(localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).Get_instrucciones().GetL())

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(100)
			p.Match(ChemsP_LOOP)
		}
		{
			p.SetState(101)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(102)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext)._instrucciones = _x
		}
		{
			p.SetState(103)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewLoop(localctx.(*InstruccionContext).Get_instrucciones().GetL())

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(106)
			p.Match(ChemsP_FOR)
		}
		{
			p.SetState(107)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(108)
			p.Match(ChemsP_IN)
		}
		{
			p.SetState(109)

			var _x = p.Expression()

			localctx.(*InstruccionContext).f2 = _x
		}
		{
			p.SetState(110)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(111)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext)._instrucciones = _x
		}
		{
			p.SetState(112)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewForin((func() string {
			if localctx.(*InstruccionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*InstruccionContext).GetId().GetText()
			}
		}()), localctx.(*InstruccionContext).GetF2().GetP(), localctx.(*InstruccionContext).Get_instrucciones().GetL())

	}

	return localctx
}

// ITipoContext is an interface to support dynamic dispatch.
type ITipoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetP returns the p attribute.
	GetP() interfaces.TipoExpresion

	// SetP sets the p attribute.
	SetP(interfaces.TipoExpresion)

	// IsTipoContext differentiates from other interfaces.
	IsTipoContext()
}

type TipoContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	p      interfaces.TipoExpresion
}

func NewEmptyTipoContext() *TipoContext {
	var p = new(TipoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_tipo
	return p
}

func (*TipoContext) IsTipoContext() {}

func NewTipoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *TipoContext {
	var p = new(TipoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_tipo

	return p
}

func (s *TipoContext) GetParser() antlr.Parser { return s.parser }

func (s *TipoContext) GetP() interfaces.TipoExpresion { return s.p }

func (s *TipoContext) SetP(v interfaces.TipoExpresion) { s.p = v }

func (s *TipoContext) P_F64() antlr.TerminalNode {
	return s.GetToken(ChemsP_F64, 0)
}

func (s *TipoContext) P_I64() antlr.TerminalNode {
	return s.GetToken(ChemsP_I64, 0)
}

func (s *TipoContext) P_STRING() antlr.TerminalNode {
	return s.GetToken(ChemsP_STRING, 0)
}

func (s *TipoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *TipoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *TipoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterTipo(s)
	}
}

func (s *TipoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitTipo(s)
	}
}

func (p *Chems) Tipo() (localctx ITipoContext) {
	localctx = NewTipoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, ChemsRULE_tipo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(123)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ChemsP_F64:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(117)
			p.Match(ChemsP_F64)
		}
		localctx.(*TipoContext).p = interfaces.FLOAT

	case ChemsP_I64:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(119)
			p.Match(ChemsP_I64)
		}
		localctx.(*TipoContext).p = interfaces.INTEGER

	case ChemsP_STRING:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(121)
			p.Match(ChemsP_STRING)
		}
		localctx.(*TipoContext).p = interfaces.STRING

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IMutContext is an interface to support dynamic dispatch.
type IMutContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetArr returns the arr attribute.
	GetArr() bool

	// SetArr sets the arr attribute.
	SetArr(bool)

	// IsMutContext differentiates from other interfaces.
	IsMutContext()
}

type MutContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	arr    bool
}

func NewEmptyMutContext() *MutContext {
	var p = new(MutContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_mut
	return p
}

func (*MutContext) IsMutContext() {}

func NewMutContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MutContext {
	var p = new(MutContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_mut

	return p
}

func (s *MutContext) GetParser() antlr.Parser { return s.parser }

func (s *MutContext) GetArr() bool { return s.arr }

func (s *MutContext) SetArr(v bool) { s.arr = v }

func (s *MutContext) P_MUT() antlr.TerminalNode {
	return s.GetToken(ChemsP_MUT, 0)
}

func (s *MutContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MutContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MutContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterMut(s)
	}
}

func (s *MutContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitMut(s)
	}
}

func (p *Chems) Mut() (localctx IMutContext) {
	localctx = NewMutContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, ChemsRULE_mut)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(128)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ChemsP_MUT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(125)
			p.Match(ChemsP_MUT)
		}
		localctx.(*MutContext).arr = true

	case ChemsID, ChemsCORIZQ:
		p.EnterOuterAlt(localctx, 2)

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IArray_stContext is an interface to support dynamic dispatch.
type IArray_stContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetArr returns the arr attribute.
	GetArr() bool

	// SetArr sets the arr attribute.
	SetArr(bool)

	// IsArray_stContext differentiates from other interfaces.
	IsArray_stContext()
}

type Array_stContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	arr    bool
}

func NewEmptyArray_stContext() *Array_stContext {
	var p = new(Array_stContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_array_st
	return p
}

func (*Array_stContext) IsArray_stContext() {}

func NewArray_stContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Array_stContext {
	var p = new(Array_stContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_array_st

	return p
}

func (s *Array_stContext) GetParser() antlr.Parser { return s.parser }

func (s *Array_stContext) GetArr() bool { return s.arr }

func (s *Array_stContext) SetArr(v bool) { s.arr = v }

func (s *Array_stContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(ChemsCORIZQ, 0)
}

func (s *Array_stContext) CORDER() antlr.TerminalNode {
	return s.GetToken(ChemsCORDER, 0)
}

func (s *Array_stContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Array_stContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Array_stContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterArray_st(s)
	}
}

func (s *Array_stContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitArray_st(s)
	}
}

func (p *Chems) Array_st() (localctx IArray_stContext) {
	localctx = NewArray_stContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, ChemsRULE_array_st)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(134)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ChemsCORIZQ:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(130)
			p.Match(ChemsCORIZQ)
		}
		{
			p.SetState(131)
			p.Match(ChemsCORDER)
		}
		localctx.(*Array_stContext).arr = true

	case ChemsID:
		p.EnterOuterAlt(localctx, 2)

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expr_arit returns the _expr_arit rule contexts.
	Get_expr_arit() IExpr_aritContext

	// Set_expr_arit sets the _expr_arit rule contexts.
	Set_expr_arit(IExpr_aritContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	p          interfaces.Expresion
	_expr_arit IExpr_aritContext
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) Get_expr_arit() IExpr_aritContext { return s._expr_arit }

func (s *ExpressionContext) Set_expr_arit(v IExpr_aritContext) { s._expr_arit = v }

func (s *ExpressionContext) GetP() interfaces.Expresion { return s.p }

func (s *ExpressionContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *ExpressionContext) Expr_arit() IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterExpression(s)
	}
}

func (s *ExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitExpression(s)
	}
}

func (p *Chems) Expression() (localctx IExpressionContext) {
	localctx = NewExpressionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, ChemsRULE_expression)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(136)

		var _x = p.expr_arit(0)

		localctx.(*ExpressionContext)._expr_arit = _x
	}
	localctx.(*ExpressionContext).p = localctx.(*ExpressionContext).Get_expr_arit().GetP()

	return localctx
}

// IExpr_aritContext is an interface to support dynamic dispatch.
type IExpr_aritContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetReservada returns the reservada token.
	GetReservada() antlr.Token

	// GetOp returns the op token.
	GetOp() antlr.Token

	// SetReservada sets the reservada token.
	SetReservada(antlr.Token)

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// GetOpIz returns the opIz rule contexts.
	GetOpIz() IExpr_aritContext

	// GetOpDe returns the opDe rule contexts.
	GetOpDe() IExpr_aritContext

	// Get_listValues returns the _listValues rule contexts.
	Get_listValues() IListValuesContext

	// Get_primitivo returns the _primitivo rule contexts.
	Get_primitivo() IPrimitivoContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// SetOpIz sets the opIz rule contexts.
	SetOpIz(IExpr_aritContext)

	// SetOpDe sets the opDe rule contexts.
	SetOpDe(IExpr_aritContext)

	// Set_listValues sets the _listValues rule contexts.
	Set_listValues(IListValuesContext)

	// Set_primitivo sets the _primitivo rule contexts.
	Set_primitivo(IPrimitivoContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsExpr_aritContext differentiates from other interfaces.
	IsExpr_aritContext()
}

type Expr_aritContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	opIz        IExpr_aritContext
	reservada   antlr.Token
	op          antlr.Token
	opDe        IExpr_aritContext
	_listValues IListValuesContext
	_primitivo  IPrimitivoContext
	_expression IExpressionContext
}

func NewEmptyExpr_aritContext() *Expr_aritContext {
	var p = new(Expr_aritContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_expr_arit
	return p
}

func (*Expr_aritContext) IsExpr_aritContext() {}

func NewExpr_aritContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Expr_aritContext {
	var p = new(Expr_aritContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_expr_arit

	return p
}

func (s *Expr_aritContext) GetParser() antlr.Parser { return s.parser }

func (s *Expr_aritContext) GetReservada() antlr.Token { return s.reservada }

func (s *Expr_aritContext) GetOp() antlr.Token { return s.op }

func (s *Expr_aritContext) SetReservada(v antlr.Token) { s.reservada = v }

func (s *Expr_aritContext) SetOp(v antlr.Token) { s.op = v }

func (s *Expr_aritContext) GetOpIz() IExpr_aritContext { return s.opIz }

func (s *Expr_aritContext) GetOpDe() IExpr_aritContext { return s.opDe }

func (s *Expr_aritContext) Get_listValues() IListValuesContext { return s._listValues }

func (s *Expr_aritContext) Get_primitivo() IPrimitivoContext { return s._primitivo }

func (s *Expr_aritContext) Get_expression() IExpressionContext { return s._expression }

func (s *Expr_aritContext) SetOpIz(v IExpr_aritContext) { s.opIz = v }

func (s *Expr_aritContext) SetOpDe(v IExpr_aritContext) { s.opDe = v }

func (s *Expr_aritContext) Set_listValues(v IListValuesContext) { s._listValues = v }

func (s *Expr_aritContext) Set_primitivo(v IPrimitivoContext) { s._primitivo = v }

func (s *Expr_aritContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Expr_aritContext) GetP() interfaces.Expresion { return s.p }

func (s *Expr_aritContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *Expr_aritContext) AllDOSPUNTOS() []antlr.TerminalNode {
	return s.GetTokens(ChemsDOSPUNTOS)
}

func (s *Expr_aritContext) DOSPUNTOS(i int) antlr.TerminalNode {
	return s.GetToken(ChemsDOSPUNTOS, i)
}

func (s *Expr_aritContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(ChemsPARIZQ, 0)
}

func (s *Expr_aritContext) COMA() antlr.TerminalNode {
	return s.GetToken(ChemsCOMA, 0)
}

func (s *Expr_aritContext) PARDER() antlr.TerminalNode {
	return s.GetToken(ChemsPARDER, 0)
}

func (s *Expr_aritContext) AllExpr_arit() []IExpr_aritContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem())
	var tst = make([]IExpr_aritContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpr_aritContext)
		}
	}

	return tst
}

func (s *Expr_aritContext) Expr_arit(i int) IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *Expr_aritContext) P_F64() antlr.TerminalNode {
	return s.GetToken(ChemsP_F64, 0)
}

func (s *Expr_aritContext) P_I64() antlr.TerminalNode {
	return s.GetToken(ChemsP_I64, 0)
}

func (s *Expr_aritContext) P_POW() antlr.TerminalNode {
	return s.GetToken(ChemsP_POW, 0)
}

func (s *Expr_aritContext) P_POWF() antlr.TerminalNode {
	return s.GetToken(ChemsP_POWF, 0)
}

func (s *Expr_aritContext) DIFERENTE() antlr.TerminalNode {
	return s.GetToken(ChemsDIFERENTE, 0)
}

func (s *Expr_aritContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(ChemsCORIZQ, 0)
}

func (s *Expr_aritContext) ListValues() IListValuesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListValuesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListValuesContext)
}

func (s *Expr_aritContext) CORDER() antlr.TerminalNode {
	return s.GetToken(ChemsCORDER, 0)
}

func (s *Expr_aritContext) Primitivo() IPrimitivoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrimitivoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrimitivoContext)
}

func (s *Expr_aritContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Expr_aritContext) MUL() antlr.TerminalNode {
	return s.GetToken(ChemsMUL, 0)
}

func (s *Expr_aritContext) DIV() antlr.TerminalNode {
	return s.GetToken(ChemsDIV, 0)
}

func (s *Expr_aritContext) ADD() antlr.TerminalNode {
	return s.GetToken(ChemsADD, 0)
}

func (s *Expr_aritContext) SUB() antlr.TerminalNode {
	return s.GetToken(ChemsSUB, 0)
}

func (s *Expr_aritContext) MENOR() antlr.TerminalNode {
	return s.GetToken(ChemsMENOR, 0)
}

func (s *Expr_aritContext) MENORIGUAL() antlr.TerminalNode {
	return s.GetToken(ChemsMENORIGUAL, 0)
}

func (s *Expr_aritContext) MAYORIGUAL() antlr.TerminalNode {
	return s.GetToken(ChemsMAYORIGUAL, 0)
}

func (s *Expr_aritContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(ChemsMAYOR, 0)
}

func (s *Expr_aritContext) MODULO() antlr.TerminalNode {
	return s.GetToken(ChemsMODULO, 0)
}

func (s *Expr_aritContext) DIFERENTEDE() antlr.TerminalNode {
	return s.GetToken(ChemsDIFERENTEDE, 0)
}

func (s *Expr_aritContext) IGUALIGUA() antlr.TerminalNode {
	return s.GetToken(ChemsIGUALIGUA, 0)
}

func (s *Expr_aritContext) OR() antlr.TerminalNode {
	return s.GetToken(ChemsOR, 0)
}

func (s *Expr_aritContext) AND() antlr.TerminalNode {
	return s.GetToken(ChemsAND, 0)
}

func (s *Expr_aritContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(ChemsPUNTO, 0)
}

func (s *Expr_aritContext) P_ABS() antlr.TerminalNode {
	return s.GetToken(ChemsP_ABS, 0)
}

func (s *Expr_aritContext) P_SQRT() antlr.TerminalNode {
	return s.GetToken(ChemsP_SQRT, 0)
}

func (s *Expr_aritContext) P_TOSTRING() antlr.TerminalNode {
	return s.GetToken(ChemsP_TOSTRING, 0)
}

func (s *Expr_aritContext) P_CLONE() antlr.TerminalNode {
	return s.GetToken(ChemsP_CLONE, 0)
}

func (s *Expr_aritContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Expr_aritContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Expr_aritContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterExpr_arit(s)
	}
}

func (s *Expr_aritContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitExpr_arit(s)
	}
}

func (p *Chems) Expr_arit() (localctx IExpr_aritContext) {
	return p.expr_arit(0)
}

func (p *Chems) expr_arit(_p int) (localctx IExpr_aritContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpr_aritContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpr_aritContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 14
	p.EnterRecursionRule(localctx, 14, ChemsRULE_expr_arit, _p)
	var _la int

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(168)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ChemsP_I64, ChemsP_F64:
		{
			p.SetState(140)

			var _lt = p.GetTokenStream().LT(1)

			localctx.(*Expr_aritContext).reservada = _lt

			_la = p.GetTokenStream().LA(1)

			if !(_la == ChemsP_I64 || _la == ChemsP_F64) {
				var _ri = p.GetErrorHandler().RecoverInline(p)

				localctx.(*Expr_aritContext).reservada = _ri
			} else {
				p.GetErrorHandler().ReportMatch(p)
				p.Consume()
			}
		}
		{
			p.SetState(141)
			p.Match(ChemsDOSPUNTOS)
		}
		{
			p.SetState(142)
			p.Match(ChemsDOSPUNTOS)
		}
		{
			p.SetState(143)

			var _lt = p.GetTokenStream().LT(1)

			localctx.(*Expr_aritContext).op = _lt

			_la = p.GetTokenStream().LA(1)

			if !(_la == ChemsP_POW || _la == ChemsP_POWF) {
				var _ri = p.GetErrorHandler().RecoverInline(p)

				localctx.(*Expr_aritContext).op = _ri
			} else {
				p.GetErrorHandler().ReportMatch(p)
				p.Consume()
			}
		}
		{
			p.SetState(144)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(145)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opIz = _x
		}
		{
			p.SetState(146)
			p.Match(ChemsCOMA)
		}
		{
			p.SetState(147)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opDe = _x
		}
		{
			p.SetState(148)
			p.Match(ChemsPARDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return ""
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetText()
			}
		}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() antlr.Token {
			if localctx.(*Expr_aritContext).GetOpIz() == nil {
				return nil
			} else {
				return localctx.(*Expr_aritContext).GetOpIz().GetStart()
			}
		}()).GetLine(), (func() antlr.Token {
			if localctx.(*Expr_aritContext).GetOpIz() == nil {
				return nil
			} else {
				return localctx.(*Expr_aritContext).GetOpIz().GetStart()
			}
		}()).GetColumn())

	case ChemsDIFERENTE:
		{
			p.SetState(151)

			var _m = p.Match(ChemsDIFERENTE)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(152)

			var _x = p.expr_arit(8)

			localctx.(*Expr_aritContext).opDe = _x
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(nil, (func() string {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return ""
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetText()
			}
		}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() antlr.Token {
			if localctx.(*Expr_aritContext).GetOpDe() == nil {
				return nil
			} else {
				return localctx.(*Expr_aritContext).GetOpDe().GetStart()
			}
		}()).GetLine(), (func() antlr.Token {
			if localctx.(*Expr_aritContext).GetOpDe() == nil {
				return nil
			} else {
				return localctx.(*Expr_aritContext).GetOpDe().GetStart()
			}
		}()).GetColumn())

	case ChemsCORIZQ:
		{
			p.SetState(155)
			p.Match(ChemsCORIZQ)
		}
		{
			p.SetState(156)

			var _x = p.listValues(0)

			localctx.(*Expr_aritContext)._listValues = _x
		}
		{
			p.SetState(157)
			p.Match(ChemsCORDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewArray(localctx.(*Expr_aritContext).Get_listValues().GetL())

	case ChemsP_TRUE, ChemsP_FALSE, ChemsNUMBER, ChemsDECIMAL, ChemsSTRING, ChemsID, ChemsSUB:
		{
			p.SetState(160)

			var _x = p.Primitivo()

			localctx.(*Expr_aritContext)._primitivo = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_primitivo().GetP()

	case ChemsPARIZQ:
		{
			p.SetState(163)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(164)

			var _x = p.Expression()

			localctx.(*Expr_aritContext)._expression = _x
		}
		{
			p.SetState(165)
			p.Match(ChemsPARDER)
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_expression().GetP()

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(221)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(219)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 6, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(170)

				if !(p.Precpred(p.GetParserRuleContext(), 14)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 14)", ""))
				}
				{
					p.SetState(171)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == ChemsMUL || _la == ChemsDIV) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(172)

					var _x = p.expr_arit(15)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			case 2:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(175)

				if !(p.Precpred(p.GetParserRuleContext(), 13)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 13)", ""))
				}
				{
					p.SetState(176)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == ChemsADD || _la == ChemsSUB) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(177)

					var _x = p.expr_arit(14)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			case 3:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(180)

				if !(p.Precpred(p.GetParserRuleContext(), 11)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 11)", ""))
				}
				{
					p.SetState(181)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la-34)&-(0x1f+1)) == 0 && ((1<<uint((_la-34)))&((1<<(ChemsDIFERENTEDE-34))|(1<<(ChemsMAYORIGUAL-34))|(1<<(ChemsMENORIGUAL-34))|(1<<(ChemsMAYOR-34))|(1<<(ChemsMENOR-34))|(1<<(ChemsMODULO-34)))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(182)

					var _x = p.expr_arit(12)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			case 4:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(185)

				if !(p.Precpred(p.GetParserRuleContext(), 10)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 10)", ""))
				}
				{
					p.SetState(186)

					var _m = p.Match(ChemsIGUALIGUA)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(187)

					var _x = p.expr_arit(11)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			case 5:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(190)

				if !(p.Precpred(p.GetParserRuleContext(), 9)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 9)", ""))
				}
				{
					p.SetState(191)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == ChemsOR || _la == ChemsAND) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(192)

					var _x = p.expr_arit(10)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			case 6:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(195)

				if !(p.Precpred(p.GetParserRuleContext(), 7)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 7)", ""))
				}
				{
					p.SetState(196)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(197)

					var _m = p.Match(ChemsP_ABS)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(198)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(199)
					p.Match(ChemsPARDER)
				}
				localctx.(*Expr_aritContext).p = expresion.NewNativas(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			case 7:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(201)

				if !(p.Precpred(p.GetParserRuleContext(), 6)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 6)", ""))
				}
				{
					p.SetState(202)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(203)

					var _m = p.Match(ChemsP_SQRT)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(204)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(205)
					p.Match(ChemsPARDER)
				}
				localctx.(*Expr_aritContext).p = expresion.NewNativas(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			case 8:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(207)

				if !(p.Precpred(p.GetParserRuleContext(), 5)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 5)", ""))
				}
				{
					p.SetState(208)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(209)

					var _m = p.Match(ChemsP_TOSTRING)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(210)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(211)
					p.Match(ChemsPARDER)
				}
				localctx.(*Expr_aritContext).p = expresion.NewNativas(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			case 9:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(213)

				if !(p.Precpred(p.GetParserRuleContext(), 4)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 4)", ""))
				}
				{
					p.SetState(214)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(215)

					var _m = p.Match(ChemsP_CLONE)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(216)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(217)
					p.Match(ChemsPARDER)
				}
				localctx.(*Expr_aritContext).p = expresion.NewNativas(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*Expr_aritContext).GetOpIz() == nil {
						return nil
					} else {
						return localctx.(*Expr_aritContext).GetOpIz().GetStart()
					}
				}()).GetColumn())

			}

		}
		p.SetState(223)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext())
	}

	return localctx
}

// IListValuesContext is an interface to support dynamic dispatch.
type IListValuesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IListValuesContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// SetList sets the list rule contexts.
	SetList(IListValuesContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsListValuesContext differentiates from other interfaces.
	IsListValuesContext()
}

type ListValuesContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	l           *arrayList.List
	list        IListValuesContext
	_expression IExpressionContext
}

func NewEmptyListValuesContext() *ListValuesContext {
	var p = new(ListValuesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_listValues
	return p
}

func (*ListValuesContext) IsListValuesContext() {}

func NewListValuesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListValuesContext {
	var p = new(ListValuesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_listValues

	return p
}

func (s *ListValuesContext) GetParser() antlr.Parser { return s.parser }

func (s *ListValuesContext) GetList() IListValuesContext { return s.list }

func (s *ListValuesContext) Get_expression() IExpressionContext { return s._expression }

func (s *ListValuesContext) SetList(v IListValuesContext) { s.list = v }

func (s *ListValuesContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ListValuesContext) GetL() *arrayList.List { return s.l }

func (s *ListValuesContext) SetL(v *arrayList.List) { s.l = v }

func (s *ListValuesContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ListValuesContext) COMA() antlr.TerminalNode {
	return s.GetToken(ChemsCOMA, 0)
}

func (s *ListValuesContext) ListValues() IListValuesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListValuesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListValuesContext)
}

func (s *ListValuesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListValuesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListValuesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterListValues(s)
	}
}

func (s *ListValuesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitListValues(s)
	}
}

func (p *Chems) ListValues() (localctx IListValuesContext) {
	return p.listValues(0)
}

func (p *Chems) listValues(_p int) (localctx IListValuesContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListValuesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListValuesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 16
	p.EnterRecursionRule(localctx, 16, ChemsRULE_listValues, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(225)

		var _x = p.Expression()

		localctx.(*ListValuesContext)._expression = _x
	}

	localctx.(*ListValuesContext).l = arrayList.New()
	localctx.(*ListValuesContext).l.Add(localctx.(*ListValuesContext).Get_expression().GetP())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(235)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 8, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListValuesContext(p, _parentctx, _parentState)
			localctx.(*ListValuesContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ChemsRULE_listValues)
			p.SetState(228)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(229)
				p.Match(ChemsCOMA)
			}
			{
				p.SetState(230)

				var _x = p.Expression()

				localctx.(*ListValuesContext)._expression = _x
			}

			localctx.(*ListValuesContext).GetList().GetL().Add(localctx.(*ListValuesContext).Get_expression().GetP())
			localctx.(*ListValuesContext).l = localctx.(*ListValuesContext).GetList().GetL()

		}
		p.SetState(237)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 8, p.GetParserRuleContext())
	}

	return localctx
}

// IPrimitivoContext is an interface to support dynamic dispatch.
type IPrimitivoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_DECIMAL returns the _DECIMAL token.
	Get_DECIMAL() antlr.Token

	// Get_STRING returns the _STRING token.
	Get_STRING() antlr.Token

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_DECIMAL sets the _DECIMAL token.
	Set_DECIMAL(antlr.Token)

	// Set_STRING sets the _STRING token.
	Set_STRING(antlr.Token)

	// GetList returns the list rule contexts.
	GetList() IListArrayContext

	// SetList sets the list rule contexts.
	SetList(IListArrayContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsPrimitivoContext differentiates from other interfaces.
	IsPrimitivoContext()
}

type PrimitivoContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	p        interfaces.Expresion
	_NUMBER  antlr.Token
	_DECIMAL antlr.Token
	_STRING  antlr.Token
	list     IListArrayContext
}

func NewEmptyPrimitivoContext() *PrimitivoContext {
	var p = new(PrimitivoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_primitivo
	return p
}

func (*PrimitivoContext) IsPrimitivoContext() {}

func NewPrimitivoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrimitivoContext {
	var p = new(PrimitivoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_primitivo

	return p
}

func (s *PrimitivoContext) GetParser() antlr.Parser { return s.parser }

func (s *PrimitivoContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *PrimitivoContext) Get_DECIMAL() antlr.Token { return s._DECIMAL }

func (s *PrimitivoContext) Get_STRING() antlr.Token { return s._STRING }

func (s *PrimitivoContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *PrimitivoContext) Set_DECIMAL(v antlr.Token) { s._DECIMAL = v }

func (s *PrimitivoContext) Set_STRING(v antlr.Token) { s._STRING = v }

func (s *PrimitivoContext) GetList() IListArrayContext { return s.list }

func (s *PrimitivoContext) SetList(v IListArrayContext) { s.list = v }

func (s *PrimitivoContext) GetP() interfaces.Expresion { return s.p }

func (s *PrimitivoContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *PrimitivoContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(ChemsNUMBER, 0)
}

func (s *PrimitivoContext) SUB() antlr.TerminalNode {
	return s.GetToken(ChemsSUB, 0)
}

func (s *PrimitivoContext) DECIMAL() antlr.TerminalNode {
	return s.GetToken(ChemsDECIMAL, 0)
}

func (s *PrimitivoContext) STRING() antlr.TerminalNode {
	return s.GetToken(ChemsSTRING, 0)
}

func (s *PrimitivoContext) P_AS() antlr.TerminalNode {
	return s.GetToken(ChemsP_AS, 0)
}

func (s *PrimitivoContext) P_I64() antlr.TerminalNode {
	return s.GetToken(ChemsP_I64, 0)
}

func (s *PrimitivoContext) P_F64() antlr.TerminalNode {
	return s.GetToken(ChemsP_F64, 0)
}

func (s *PrimitivoContext) ListArray() IListArrayContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListArrayContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListArrayContext)
}

func (s *PrimitivoContext) P_TRUE() antlr.TerminalNode {
	return s.GetToken(ChemsP_TRUE, 0)
}

func (s *PrimitivoContext) P_FALSE() antlr.TerminalNode {
	return s.GetToken(ChemsP_FALSE, 0)
}

func (s *PrimitivoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrimitivoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrimitivoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterPrimitivo(s)
	}
}

func (s *PrimitivoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitPrimitivo(s)
	}
}

func (p *Chems) Primitivo() (localctx IPrimitivoContext) {
	localctx = NewPrimitivoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, ChemsRULE_primitivo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(265)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 9, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(238)

			var _m = p.Match(ChemsNUMBER)

			localctx.(*PrimitivoContext)._NUMBER = _m
		}

		num, err := strconv.Atoi((func() string {
			if localctx.(*PrimitivoContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_NUMBER().GetText()
			}
		}()))
		if err != nil {
			fmt.Println(err)
		}

		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(num, interfaces.INTEGER)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(240)
			p.Match(ChemsSUB)
		}
		{
			p.SetState(241)

			var _m = p.Match(ChemsNUMBER)

			localctx.(*PrimitivoContext)._NUMBER = _m
		}

		num, err := strconv.Atoi((func() string {
			if localctx.(*PrimitivoContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_NUMBER().GetText()
			}
		}()))
		if err != nil {
			fmt.Println(err)
		}

		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(-num, interfaces.INTEGER)

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(243)
			p.Match(ChemsSUB)
		}
		{
			p.SetState(244)

			var _m = p.Match(ChemsDECIMAL)

			localctx.(*PrimitivoContext)._DECIMAL = _m
		}

		num, err := strconv.ParseFloat((func() string {
			if localctx.(*PrimitivoContext).Get_DECIMAL() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_DECIMAL().GetText()
			}
		}()), 64)
		if err != nil {
			fmt.Println(err)
		}
		a := float64(num)
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(-a, interfaces.FLOAT)

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(246)

			var _m = p.Match(ChemsSTRING)

			localctx.(*PrimitivoContext)._STRING = _m
		}

		str := (func() string {
			if localctx.(*PrimitivoContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*PrimitivoContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_STRING().GetText()
			}
		}()))-1]

		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(str, interfaces.STRING)

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(248)

			var _m = p.Match(ChemsDECIMAL)

			localctx.(*PrimitivoContext)._DECIMAL = _m
		}

		num, err := strconv.ParseFloat((func() string {
			if localctx.(*PrimitivoContext).Get_DECIMAL() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_DECIMAL().GetText()
			}
		}()), 64)
		if err != nil {
			fmt.Println(err)
		}
		a := float64(num)
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(a, interfaces.FLOAT)

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(250)

			var _m = p.Match(ChemsDECIMAL)

			localctx.(*PrimitivoContext)._DECIMAL = _m
		}
		{
			p.SetState(251)
			p.Match(ChemsP_AS)
		}
		{
			p.SetState(252)
			p.Match(ChemsP_I64)
		}

		num, err := strconv.ParseFloat((func() string {
			if localctx.(*PrimitivoContext).Get_DECIMAL() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_DECIMAL().GetText()
			}
		}()), 64)
		if err != nil {
			fmt.Println(err)
		}
		a := int(num)
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(a, interfaces.INTEGER)

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(254)

			var _m = p.Match(ChemsNUMBER)

			localctx.(*PrimitivoContext)._NUMBER = _m
		}
		{
			p.SetState(255)
			p.Match(ChemsP_AS)
		}
		{
			p.SetState(256)
			p.Match(ChemsP_F64)
		}

		num, err := strconv.Atoi((func() string {
			if localctx.(*PrimitivoContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_NUMBER().GetText()
			}
		}()))
		if err != nil {
			fmt.Println(err)
		}
		a := float64(num)
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(a, interfaces.FLOAT)

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(258)

			var _x = p.listArray(0)

			localctx.(*PrimitivoContext).list = _x
		}
		localctx.(*PrimitivoContext).p = localctx.(*PrimitivoContext).GetList().GetP()

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(261)
			p.Match(ChemsP_TRUE)
		}

		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo("true", interfaces.TRUE)

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(263)
			p.Match(ChemsP_FALSE)
		}

		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo("false", interfaces.FALSE)

	}

	return localctx
}

// IListArrayContext is an interface to support dynamic dispatch.
type IListArrayContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// GetList returns the list rule contexts.
	GetList() IListArrayContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// SetList sets the list rule contexts.
	SetList(IListArrayContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsListArrayContext differentiates from other interfaces.
	IsListArrayContext()
}

type ListArrayContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	list        IListArrayContext
	_ID         antlr.Token
	_expression IExpressionContext
}

func NewEmptyListArrayContext() *ListArrayContext {
	var p = new(ListArrayContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_listArray
	return p
}

func (*ListArrayContext) IsListArrayContext() {}

func NewListArrayContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListArrayContext {
	var p = new(ListArrayContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_listArray

	return p
}

func (s *ListArrayContext) GetParser() antlr.Parser { return s.parser }

func (s *ListArrayContext) Get_ID() antlr.Token { return s._ID }

func (s *ListArrayContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *ListArrayContext) GetList() IListArrayContext { return s.list }

func (s *ListArrayContext) Get_expression() IExpressionContext { return s._expression }

func (s *ListArrayContext) SetList(v IListArrayContext) { s.list = v }

func (s *ListArrayContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ListArrayContext) GetP() interfaces.Expresion { return s.p }

func (s *ListArrayContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *ListArrayContext) ID() antlr.TerminalNode {
	return s.GetToken(ChemsID, 0)
}

func (s *ListArrayContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(ChemsCORIZQ, 0)
}

func (s *ListArrayContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ListArrayContext) CORDER() antlr.TerminalNode {
	return s.GetToken(ChemsCORDER, 0)
}

func (s *ListArrayContext) ListArray() IListArrayContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListArrayContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListArrayContext)
}

func (s *ListArrayContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListArrayContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListArrayContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterListArray(s)
	}
}

func (s *ListArrayContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitListArray(s)
	}
}

func (p *Chems) ListArray() (localctx IListArrayContext) {
	return p.listArray(0)
}

func (p *Chems) listArray(_p int) (localctx IListArrayContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListArrayContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListArrayContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 20
	p.EnterRecursionRule(localctx, 20, ChemsRULE_listArray, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(268)

		var _m = p.Match(ChemsID)

		localctx.(*ListArrayContext)._ID = _m
	}
	localctx.(*ListArrayContext).p = expresion.NewCallVariable((func() string {
		if localctx.(*ListArrayContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*ListArrayContext).Get_ID().GetText()
		}
	}()))

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(279)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 10, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListArrayContext(p, _parentctx, _parentState)
			localctx.(*ListArrayContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ChemsRULE_listArray)
			p.SetState(271)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(272)
				p.Match(ChemsCORIZQ)
			}
			{
				p.SetState(273)

				var _x = p.Expression()

				localctx.(*ListArrayContext)._expression = _x
			}
			{
				p.SetState(274)
				p.Match(ChemsCORDER)
			}
			localctx.(*ListArrayContext).p = expresion.NewArrayAccess(localctx.(*ListArrayContext).GetList().GetP(), localctx.(*ListArrayContext).Get_expression().GetP())

		}
		p.SetState(281)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 10, p.GetParserRuleContext())
	}

	return localctx
}

func (p *Chems) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 7:
		var t *Expr_aritContext = nil
		if localctx != nil {
			t = localctx.(*Expr_aritContext)
		}
		return p.Expr_arit_Sempred(t, predIndex)

	case 8:
		var t *ListValuesContext = nil
		if localctx != nil {
			t = localctx.(*ListValuesContext)
		}
		return p.ListValues_Sempred(t, predIndex)

	case 10:
		var t *ListArrayContext = nil
		if localctx != nil {
			t = localctx.(*ListArrayContext)
		}
		return p.ListArray_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *Chems) Expr_arit_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 14)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 13)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 11)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 10)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 9)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 7)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 6)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 5)

	case 8:
		return p.Precpred(p.GetParserRuleContext(), 4)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Chems) ListValues_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 9:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Chems) ListArray_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 10:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

// Code generated from ChemsLexer.g4 by ANTLR 4.7.2. DO NOT EDIT.

package parser

import (
	"fmt"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = unicode.IsLetter

var serializedLexerAtn = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 57, 371,
	8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7,
	9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12,
	4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4,
	18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23,
	9, 23, 4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9,
	28, 4, 29, 9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33,
	4, 34, 9, 34, 4, 35, 9, 35, 4, 36, 9, 36, 4, 37, 9, 37, 4, 38, 9, 38, 4,
	39, 9, 39, 4, 40, 9, 40, 4, 41, 9, 41, 4, 42, 9, 42, 4, 43, 9, 43, 4, 44,
	9, 44, 4, 45, 9, 45, 4, 46, 9, 46, 4, 47, 9, 47, 4, 48, 9, 48, 4, 49, 9,
	49, 4, 50, 9, 50, 4, 51, 9, 51, 4, 52, 9, 52, 4, 53, 9, 53, 4, 54, 9, 54,
	4, 55, 9, 55, 4, 56, 9, 56, 4, 57, 9, 57, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2,
	3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6,
	3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8,
	3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3, 13, 3, 13, 3, 13, 3,
	13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 16,
	3, 16, 3, 16, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3, 18, 3, 18, 3,
	18, 3, 18, 3, 18, 3, 18, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 20, 3, 20,
	3, 20, 3, 20, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 22, 3, 22, 3, 22, 3,
	22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 23, 3, 23, 3, 23, 3, 23,
	3, 23, 3, 23, 3, 24, 3, 24, 3, 24, 3, 24, 3, 25, 3, 25, 3, 25, 3, 26, 6,
	26, 241, 10, 26, 13, 26, 14, 26, 242, 3, 27, 6, 27, 246, 10, 27, 13, 27,
	14, 27, 247, 3, 27, 3, 27, 6, 27, 252, 10, 27, 13, 27, 14, 27, 253, 3,
	28, 3, 28, 7, 28, 258, 10, 28, 12, 28, 14, 28, 261, 11, 28, 3, 28, 3, 28,
	3, 29, 3, 29, 7, 29, 267, 10, 29, 12, 29, 14, 29, 270, 11, 29, 3, 30, 3,
	30, 3, 31, 3, 31, 3, 32, 3, 32, 3, 33, 3, 33, 3, 34, 3, 34, 3, 35, 3, 35,
	3, 35, 3, 36, 3, 36, 3, 37, 3, 37, 3, 37, 3, 38, 3, 38, 3, 38, 3, 39, 3,
	39, 3, 39, 3, 40, 3, 40, 3, 41, 3, 41, 3, 42, 3, 42, 3, 43, 3, 43, 3, 44,
	3, 44, 3, 45, 3, 45, 3, 46, 3, 46, 3, 47, 3, 47, 3, 48, 3, 48, 3, 49, 3,
	49, 3, 50, 3, 50, 3, 51, 3, 51, 3, 52, 3, 52, 3, 53, 3, 53, 3, 53, 3, 54,
	3, 54, 3, 54, 3, 55, 3, 55, 3, 55, 7, 55, 331, 10, 55, 12, 55, 14, 55,
	334, 11, 55, 3, 55, 6, 55, 337, 10, 55, 13, 55, 14, 55, 338, 3, 55, 3,
	55, 7, 55, 343, 10, 55, 12, 55, 14, 55, 346, 11, 55, 3, 55, 6, 55, 349,
	10, 55, 13, 55, 14, 55, 350, 7, 55, 353, 10, 55, 12, 55, 14, 55, 356, 11,
	55, 3, 55, 3, 55, 3, 55, 3, 55, 3, 56, 6, 56, 363, 10, 56, 13, 56, 14,
	56, 364, 3, 56, 3, 56, 3, 57, 3, 57, 3, 57, 2, 2, 58, 3, 3, 5, 4, 7, 5,
	9, 6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23, 13, 25, 14, 27,
	15, 29, 16, 31, 17, 33, 18, 35, 19, 37, 20, 39, 21, 41, 22, 43, 23, 45,
	24, 47, 25, 49, 26, 51, 27, 53, 28, 55, 29, 57, 30, 59, 31, 61, 32, 63,
	33, 65, 34, 67, 35, 69, 36, 71, 37, 73, 38, 75, 39, 77, 40, 79, 41, 81,
	42, 83, 43, 85, 44, 87, 45, 89, 46, 91, 47, 93, 48, 95, 49, 97, 50, 99,
	51, 101, 52, 103, 53, 105, 54, 107, 55, 109, 56, 111, 57, 113, 2, 3, 2,
	12, 3, 2, 50, 59, 3, 2, 36, 36, 5, 2, 67, 92, 97, 97, 99, 124, 6, 2, 50,
	59, 67, 92, 97, 97, 99, 124, 3, 2, 49, 49, 3, 2, 44, 44, 4, 2, 44, 44,
	96, 96, 5, 2, 44, 44, 49, 49, 96, 96, 6, 2, 11, 12, 15, 15, 34, 34, 94,
	94, 9, 2, 34, 35, 37, 37, 45, 45, 47, 48, 60, 60, 66, 66, 93, 95, 2, 380,
	2, 3, 3, 2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2,
	2, 11, 3, 2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2,
	2, 2, 19, 3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 3, 2,
	2, 2, 2, 27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 2, 33, 3,
	2, 2, 2, 2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 2, 2, 2, 41,
	3, 2, 2, 2, 2, 43, 3, 2, 2, 2, 2, 45, 3, 2, 2, 2, 2, 47, 3, 2, 2, 2, 2,
	49, 3, 2, 2, 2, 2, 51, 3, 2, 2, 2, 2, 53, 3, 2, 2, 2, 2, 55, 3, 2, 2, 2,
	2, 57, 3, 2, 2, 2, 2, 59, 3, 2, 2, 2, 2, 61, 3, 2, 2, 2, 2, 63, 3, 2, 2,
	2, 2, 65, 3, 2, 2, 2, 2, 67, 3, 2, 2, 2, 2, 69, 3, 2, 2, 2, 2, 71, 3, 2,
	2, 2, 2, 73, 3, 2, 2, 2, 2, 75, 3, 2, 2, 2, 2, 77, 3, 2, 2, 2, 2, 79, 3,
	2, 2, 2, 2, 81, 3, 2, 2, 2, 2, 83, 3, 2, 2, 2, 2, 85, 3, 2, 2, 2, 2, 87,
	3, 2, 2, 2, 2, 89, 3, 2, 2, 2, 2, 91, 3, 2, 2, 2, 2, 93, 3, 2, 2, 2, 2,
	95, 3, 2, 2, 2, 2, 97, 3, 2, 2, 2, 2, 99, 3, 2, 2, 2, 2, 101, 3, 2, 2,
	2, 2, 103, 3, 2, 2, 2, 2, 105, 3, 2, 2, 2, 2, 107, 3, 2, 2, 2, 2, 109,
	3, 2, 2, 2, 2, 111, 3, 2, 2, 2, 3, 115, 3, 2, 2, 2, 5, 123, 3, 2, 2, 2,
	7, 129, 3, 2, 2, 2, 9, 136, 3, 2, 2, 2, 11, 143, 3, 2, 2, 2, 13, 146, 3,
	2, 2, 2, 15, 151, 3, 2, 2, 2, 17, 157, 3, 2, 2, 2, 19, 161, 3, 2, 2, 2,
	21, 166, 3, 2, 2, 2, 23, 170, 3, 2, 2, 2, 25, 174, 3, 2, 2, 2, 27, 178,
	3, 2, 2, 2, 29, 182, 3, 2, 2, 2, 31, 185, 3, 2, 2, 2, 33, 190, 3, 2, 2,
	2, 35, 196, 3, 2, 2, 2, 37, 202, 3, 2, 2, 2, 39, 207, 3, 2, 2, 2, 41, 211,
	3, 2, 2, 2, 43, 216, 3, 2, 2, 2, 45, 226, 3, 2, 2, 2, 47, 232, 3, 2, 2,
	2, 49, 236, 3, 2, 2, 2, 51, 240, 3, 2, 2, 2, 53, 245, 3, 2, 2, 2, 55, 255,
	3, 2, 2, 2, 57, 264, 3, 2, 2, 2, 59, 271, 3, 2, 2, 2, 61, 273, 3, 2, 2,
	2, 63, 275, 3, 2, 2, 2, 65, 277, 3, 2, 2, 2, 67, 279, 3, 2, 2, 2, 69, 281,
	3, 2, 2, 2, 71, 284, 3, 2, 2, 2, 73, 286, 3, 2, 2, 2, 75, 289, 3, 2, 2,
	2, 77, 292, 3, 2, 2, 2, 79, 295, 3, 2, 2, 2, 81, 297, 3, 2, 2, 2, 83, 299,
	3, 2, 2, 2, 85, 301, 3, 2, 2, 2, 87, 303, 3, 2, 2, 2, 89, 305, 3, 2, 2,
	2, 91, 307, 3, 2, 2, 2, 93, 309, 3, 2, 2, 2, 95, 311, 3, 2, 2, 2, 97, 313,
	3, 2, 2, 2, 99, 315, 3, 2, 2, 2, 101, 317, 3, 2, 2, 2, 103, 319, 3, 2,
	2, 2, 105, 321, 3, 2, 2, 2, 107, 324, 3, 2, 2, 2, 109, 327, 3, 2, 2, 2,
	111, 362, 3, 2, 2, 2, 113, 368, 3, 2, 2, 2, 115, 116, 7, 114, 2, 2, 116,
	117, 7, 116, 2, 2, 117, 118, 7, 107, 2, 2, 118, 119, 7, 112, 2, 2, 119,
	120, 7, 118, 2, 2, 120, 121, 7, 110, 2, 2, 121, 122, 7, 112, 2, 2, 122,
	4, 3, 2, 2, 2, 123, 124, 7, 114, 2, 2, 124, 125, 7, 116, 2, 2, 125, 126,
	7, 107, 2, 2, 126, 127, 7, 112, 2, 2, 127, 128, 7, 118, 2, 2, 128, 6, 3,
	2, 2, 2, 129, 130, 7, 112, 2, 2, 130, 131, 7, 119, 2, 2, 131, 132, 7, 111,
	2, 2, 132, 133, 7, 100, 2, 2, 133, 134, 7, 103, 2, 2, 134, 135, 7, 116,
	2, 2, 135, 8, 3, 2, 2, 2, 136, 137, 7, 117, 2, 2, 137, 138, 7, 118, 2,
	2, 138, 139, 7, 116, 2, 2, 139, 140, 7, 107, 2, 2, 140, 141, 7, 112, 2,
	2, 141, 142, 7, 105, 2, 2, 142, 10, 3, 2, 2, 2, 143, 144, 7, 107, 2, 2,
	144, 145, 7, 104, 2, 2, 145, 12, 3, 2, 2, 2, 146, 147, 7, 103, 2, 2, 147,
	148, 7, 110, 2, 2, 148, 149, 7, 117, 2, 2, 149, 150, 7, 103, 2, 2, 150,
	14, 3, 2, 2, 2, 151, 152, 7, 121, 2, 2, 152, 153, 7, 106, 2, 2, 153, 154,
	7, 107, 2, 2, 154, 155, 7, 110, 2, 2, 155, 156, 7, 103, 2, 2, 156, 16,
	3, 2, 2, 2, 157, 158, 7, 114, 2, 2, 158, 159, 7, 113, 2, 2, 159, 160, 7,
	121, 2, 2, 160, 18, 3, 2, 2, 2, 161, 162, 7, 114, 2, 2, 162, 163, 7, 113,
	2, 2, 163, 164, 7, 121, 2, 2, 164, 165, 7, 104, 2, 2, 165, 20, 3, 2, 2,
	2, 166, 167, 7, 107, 2, 2, 167, 168, 7, 56, 2, 2, 168, 169, 7, 54, 2, 2,
	169, 22, 3, 2, 2, 2, 170, 171, 7, 104, 2, 2, 171, 172, 7, 56, 2, 2, 172,
	173, 7, 54, 2, 2, 173, 24, 3, 2, 2, 2, 174, 175, 7, 110, 2, 2, 175, 176,
	7, 103, 2, 2, 176, 177, 7, 118, 2, 2, 177, 26, 3, 2, 2, 2, 178, 179, 7,
	111, 2, 2, 179, 180, 7, 119, 2, 2, 180, 181, 7, 118, 2, 2, 181, 28, 3,
	2, 2, 2, 182, 183, 7, 99, 2, 2, 183, 184, 7, 117, 2, 2, 184, 30, 3, 2,
	2, 2, 185, 186, 7, 118, 2, 2, 186, 187, 7, 116, 2, 2, 187, 188, 7, 119,
	2, 2, 188, 189, 7, 103, 2, 2, 189, 32, 3, 2, 2, 2, 190, 191, 7, 104, 2,
	2, 191, 192, 7, 99, 2, 2, 192, 193, 7, 110, 2, 2, 193, 194, 7, 117, 2,
	2, 194, 195, 7, 103, 2, 2, 195, 34, 3, 2, 2, 2, 196, 197, 7, 111, 2, 2,
	197, 198, 7, 99, 2, 2, 198, 199, 7, 118, 2, 2, 199, 200, 7, 101, 2, 2,
	200, 201, 7, 106, 2, 2, 201, 36, 3, 2, 2, 2, 202, 203, 7, 110, 2, 2, 203,
	204, 7, 113, 2, 2, 204, 205, 7, 113, 2, 2, 205, 206, 7, 114, 2, 2, 206,
	38, 3, 2, 2, 2, 207, 208, 7, 99, 2, 2, 208, 209, 7, 100, 2, 2, 209, 210,
	7, 117, 2, 2, 210, 40, 3, 2, 2, 2, 211, 212, 7, 117, 2, 2, 212, 213, 7,
	115, 2, 2, 213, 214, 7, 116, 2, 2, 214, 215, 7, 118, 2, 2, 215, 42, 3,
	2, 2, 2, 216, 217, 7, 118, 2, 2, 217, 218, 7, 113, 2, 2, 218, 219, 7, 97,
	2, 2, 219, 220, 7, 117, 2, 2, 220, 221, 7, 118, 2, 2, 221, 222, 7, 116,
	2, 2, 222, 223, 7, 107, 2, 2, 223, 224, 7, 112, 2, 2, 224, 225, 7, 105,
	2, 2, 225, 44, 3, 2, 2, 2, 226, 227, 7, 101, 2, 2, 227, 228, 7, 110, 2,
	2, 228, 229, 7, 113, 2, 2, 229, 230, 7, 112, 2, 2, 230, 231, 7, 103, 2,
	2, 231, 46, 3, 2, 2, 2, 232, 233, 7, 104, 2, 2, 233, 234, 7, 113, 2, 2,
	234, 235, 7, 116, 2, 2, 235, 48, 3, 2, 2, 2, 236, 237, 7, 107, 2, 2, 237,
	238, 7, 112, 2, 2, 238, 50, 3, 2, 2, 2, 239, 241, 9, 2, 2, 2, 240, 239,
	3, 2, 2, 2, 241, 242, 3, 2, 2, 2, 242, 240, 3, 2, 2, 2, 242, 243, 3, 2,
	2, 2, 243, 52, 3, 2, 2, 2, 244, 246, 9, 2, 2, 2, 245, 244, 3, 2, 2, 2,
	246, 247, 3, 2, 2, 2, 247, 245, 3, 2, 2, 2, 247, 248, 3, 2, 2, 2, 248,
	249, 3, 2, 2, 2, 249, 251, 7, 48, 2, 2, 250, 252, 9, 2, 2, 2, 251, 250,
	3, 2, 2, 2, 252, 253, 3, 2, 2, 2, 253, 251, 3, 2, 2, 2, 253, 254, 3, 2,
	2, 2, 254, 54, 3, 2, 2, 2, 255, 259, 7, 36, 2, 2, 256, 258, 10, 3, 2, 2,
	257, 256, 3, 2, 2, 2, 258, 261, 3, 2, 2, 2, 259, 257, 3, 2, 2, 2, 259,
	260, 3, 2, 2, 2, 260, 262, 3, 2, 2, 2, 261, 259, 3, 2, 2, 2, 262, 263,
	7, 36, 2, 2, 263, 56, 3, 2, 2, 2, 264, 268, 9, 4, 2, 2, 265, 267, 9, 5,
	2, 2, 266, 265, 3, 2, 2, 2, 267, 270, 3, 2, 2, 2, 268, 266, 3, 2, 2, 2,
	268, 269, 3, 2, 2, 2, 269, 58, 3, 2, 2, 2, 270, 268, 3, 2, 2, 2, 271, 272,
	7, 48, 2, 2, 272, 60, 3, 2, 2, 2, 273, 274, 7, 61, 2, 2, 274, 62, 3, 2,
	2, 2, 275, 276, 7, 46, 2, 2, 276, 64, 3, 2, 2, 2, 277, 278, 7, 60, 2, 2,
	278, 66, 3, 2, 2, 2, 279, 280, 7, 35, 2, 2, 280, 68, 3, 2, 2, 2, 281, 282,
	7, 35, 2, 2, 282, 283, 7, 63, 2, 2, 283, 70, 3, 2, 2, 2, 284, 285, 7, 63,
	2, 2, 285, 72, 3, 2, 2, 2, 286, 287, 7, 63, 2, 2, 287, 288, 7, 63, 2, 2,
	288, 74, 3, 2, 2, 2, 289, 290, 7, 64, 2, 2, 290, 291, 7, 63, 2, 2, 291,
	76, 3, 2, 2, 2, 292, 293, 7, 62, 2, 2, 293, 294, 7, 63, 2, 2, 294, 78,
	3, 2, 2, 2, 295, 296, 7, 64, 2, 2, 296, 80, 3, 2, 2, 2, 297, 298, 7, 62,
	2, 2, 298, 82, 3, 2, 2, 2, 299, 300, 7, 44, 2, 2, 300, 84, 3, 2, 2, 2,
	301, 302, 7, 49, 2, 2, 302, 86, 3, 2, 2, 2, 303, 304, 7, 39, 2, 2, 304,
	88, 3, 2, 2, 2, 305, 306, 7, 45, 2, 2, 306, 90, 3, 2, 2, 2, 307, 308, 7,
	47, 2, 2, 308, 92, 3, 2, 2, 2, 309, 310, 7, 42, 2, 2, 310, 94, 3, 2, 2,
	2, 311, 312, 7, 43, 2, 2, 312, 96, 3, 2, 2, 2, 313, 314, 7, 125, 2, 2,
	314, 98, 3, 2, 2, 2, 315, 316, 7, 127, 2, 2, 316, 100, 3, 2, 2, 2, 317,
	318, 7, 93, 2, 2, 318, 102, 3, 2, 2, 2, 319, 320, 7, 95, 2, 2, 320, 104,
	3, 2, 2, 2, 321, 322, 7, 126, 2, 2, 322, 323, 7, 126, 2, 2, 323, 106, 3,
	2, 2, 2, 324, 325, 7, 40, 2, 2, 325, 326, 7, 40, 2, 2, 326, 108, 3, 2,
	2, 2, 327, 328, 9, 6, 2, 2, 328, 332, 9, 7, 2, 2, 329, 331, 9, 8, 2, 2,
	330, 329, 3, 2, 2, 2, 331, 334, 3, 2, 2, 2, 332, 330, 3, 2, 2, 2, 332,
	333, 3, 2, 2, 2, 333, 336, 3, 2, 2, 2, 334, 332, 3, 2, 2, 2, 335, 337,
	9, 7, 2, 2, 336, 335, 3, 2, 2, 2, 337, 338, 3, 2, 2, 2, 338, 336, 3, 2,
	2, 2, 338, 339, 3, 2, 2, 2, 339, 354, 3, 2, 2, 2, 340, 344, 9, 9, 2, 2,
	341, 343, 9, 8, 2, 2, 342, 341, 3, 2, 2, 2, 343, 346, 3, 2, 2, 2, 344,
	342, 3, 2, 2, 2, 344, 345, 3, 2, 2, 2, 345, 348, 3, 2, 2, 2, 346, 344,
	3, 2, 2, 2, 347, 349, 9, 7, 2, 2, 348, 347, 3, 2, 2, 2, 349, 350, 3, 2,
	2, 2, 350, 348, 3, 2, 2, 2, 350, 351, 3, 2, 2, 2, 351, 353, 3, 2, 2, 2,
	352, 340, 3, 2, 2, 2, 353, 356, 3, 2, 2, 2, 354, 352, 3, 2, 2, 2, 354,
	355, 3, 2, 2, 2, 355, 357, 3, 2, 2, 2, 356, 354, 3, 2, 2, 2, 357, 358,
	9, 6, 2, 2, 358, 359, 3, 2, 2, 2, 359, 360, 8, 55, 2, 2, 360, 110, 3, 2,
	2, 2, 361, 363, 9, 10, 2, 2, 362, 361, 3, 2, 2, 2, 363, 364, 3, 2, 2, 2,
	364, 362, 3, 2, 2, 2, 364, 365, 3, 2, 2, 2, 365, 366, 3, 2, 2, 2, 366,
	367, 8, 56, 2, 2, 367, 112, 3, 2, 2, 2, 368, 369, 7, 94, 2, 2, 369, 370,
	9, 11, 2, 2, 370, 114, 3, 2, 2, 2, 14, 2, 242, 247, 253, 259, 268, 332,
	338, 344, 350, 354, 364, 3, 8, 2, 2,
}

var lexerDeserializer = antlr.NewATNDeserializer(nil)
var lexerAtn = lexerDeserializer.DeserializeFromUInt16(serializedLexerAtn)

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "'println'", "'print'", "'number'", "'string'", "'if'", "'else'", "'while'",
	"'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'", "'true'",
	"'false'", "'match'", "'loop'", "'abs'", "'sqrt'", "'to_string'", "'clone'",
	"'for'", "'in'", "", "", "", "", "'.'", "';'", "','", "':'", "'!'", "'!='",
	"'='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'+'",
	"'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'||'", "'&&'",
}

var lexerSymbolicNames = []string{
	"", "PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE",
	"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE",
	"P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", "P_CLONE",
	"P_FOR", "P_IN", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA",
	"COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA",
	"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD",
	"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER",
	"OR", "AND", "MULTICOMENT", "WHITESPACE",
}

var lexerRuleNames = []string{
	"PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE",
	"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE",
	"P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", "P_CLONE",
	"P_FOR", "P_IN", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA",
	"COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA",
	"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD",
	"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER",
	"OR", "AND", "MULTICOMENT", "WHITESPACE", "ESC_SEQ",
}

type ChemsLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

var lexerDecisionToDFA = make([]*antlr.DFA, len(lexerAtn.DecisionToState))

func init() {
	for index, ds := range lexerAtn.DecisionToState {
		lexerDecisionToDFA[index] = antlr.NewDFA(ds, index)
	}
}

func NewChemsLexer(input antlr.CharStream) *ChemsLexer {

	l := new(ChemsLexer)

	l.BaseLexer = antlr.NewBaseLexer(input)
	l.Interpreter = antlr.NewLexerATNSimulator(l, lexerAtn, lexerDecisionToDFA, antlr.NewPredictionContextCache())

	l.channelNames = lexerChannelNames
	l.modeNames = lexerModeNames
	l.RuleNames = lexerRuleNames
	l.LiteralNames = lexerLiteralNames
	l.SymbolicNames = lexerSymbolicNames
	l.GrammarFileName = "ChemsLexer.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// ChemsLexer tokens.
const (
	ChemsLexerPRINTLN     = 1
	ChemsLexerPRINT       = 2
	ChemsLexerP_NUMBER    = 3
	ChemsLexerP_STRING    = 4
	ChemsLexerP_IF        = 5
	ChemsLexerP_ELSE      = 6
	ChemsLexerP_WHILE     = 7
	ChemsLexerP_POW       = 8
	ChemsLexerP_POWF      = 9
	ChemsLexerP_I64       = 10
	ChemsLexerP_F64       = 11
	ChemsLexerP_LET       = 12
	ChemsLexerP_MUT       = 13
	ChemsLexerP_AS        = 14
	ChemsLexerP_TRUE      = 15
	ChemsLexerP_FALSE     = 16
	ChemsLexerP_MATCH     = 17
	ChemsLexerP_LOOP      = 18
	ChemsLexerP_ABS       = 19
	ChemsLexerP_SQRT      = 20
	ChemsLexerP_TOSTRING  = 21
	ChemsLexerP_CLONE     = 22
	ChemsLexerP_FOR       = 23
	ChemsLexerP_IN        = 24
	ChemsLexerNUMBER      = 25
	ChemsLexerDECIMAL     = 26
	ChemsLexerSTRING      = 27
	ChemsLexerID          = 28
	ChemsLexerPUNTO       = 29
	ChemsLexerPTCOMA      = 30
	ChemsLexerCOMA        = 31
	ChemsLexerDOSPUNTOS   = 32
	ChemsLexerDIFERENTE   = 33
	ChemsLexerDIFERENTEDE = 34
	ChemsLexerIGUAL       = 35
	ChemsLexerIGUALIGUA   = 36
	ChemsLexerMAYORIGUAL  = 37
	ChemsLexerMENORIGUAL  = 38
	ChemsLexerMAYOR       = 39
	ChemsLexerMENOR       = 40
	ChemsLexerMUL         = 41
	ChemsLexerDIV         = 42
	ChemsLexerMODULO      = 43
	ChemsLexerADD         = 44
	ChemsLexerSUB         = 45
	ChemsLexerPARIZQ      = 46
	ChemsLexerPARDER      = 47
	ChemsLexerLLAVEIZQ    = 48
	ChemsLexerLLAVEDER    = 49
	ChemsLexerCORIZQ      = 50
	ChemsLexerCORDER      = 51
	ChemsLexerOR          = 52
	ChemsLexerAND         = 53
	ChemsLexerMULTICOMENT = 54
	ChemsLexerWHITESPACE  = 55
)

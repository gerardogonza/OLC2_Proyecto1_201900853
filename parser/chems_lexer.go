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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 69, 478,
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
	4, 55, 9, 55, 4, 56, 9, 56, 4, 57, 9, 57, 4, 58, 9, 58, 4, 59, 9, 59, 4,
	60, 9, 60, 4, 61, 9, 61, 4, 62, 9, 62, 4, 63, 9, 63, 4, 64, 9, 64, 4, 65,
	9, 65, 4, 66, 9, 66, 4, 67, 9, 67, 4, 68, 9, 68, 4, 69, 9, 69, 3, 2, 3,
	2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
	3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3,
	5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 8, 3,
	8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 10, 3, 10,
	3, 10, 3, 10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 13, 3, 13, 3, 13, 3, 13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 15, 3, 15,
	3, 15, 3, 15, 3, 16, 3, 16, 3, 16, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3,
	18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19,
	3, 19, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 21, 3, 21, 3, 21, 3, 21, 3,
	22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23,
	3, 23, 3, 23, 3, 23, 3, 23, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3,
	25, 3, 25, 3, 25, 3, 25, 3, 26, 3, 26, 3, 26, 3, 27, 3, 27, 3, 27, 3, 27,
	3, 27, 3, 27, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3,
	28, 3, 29, 3, 29, 3, 29, 3, 29, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 31,
	3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 32, 3, 32, 3, 32, 3, 32, 3,
	32, 3, 32, 3, 32, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33,
	3, 33, 3, 34, 3, 34, 3, 34, 3, 34, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3,
	35, 3, 35, 3, 35, 3, 35, 3, 36, 3, 36, 3, 36, 3, 36, 3, 37, 3, 37, 3, 37,
	3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3,
	37, 3, 38, 6, 38, 348, 10, 38, 13, 38, 14, 38, 349, 3, 39, 6, 39, 353,
	10, 39, 13, 39, 14, 39, 354, 3, 39, 3, 39, 6, 39, 359, 10, 39, 13, 39,
	14, 39, 360, 3, 40, 3, 40, 7, 40, 365, 10, 40, 12, 40, 14, 40, 368, 11,
	40, 3, 40, 3, 40, 3, 41, 3, 41, 7, 41, 374, 10, 41, 12, 41, 14, 41, 377,
	11, 41, 3, 42, 3, 42, 3, 43, 3, 43, 3, 44, 3, 44, 3, 45, 3, 45, 3, 46,
	3, 46, 3, 47, 3, 47, 3, 47, 3, 48, 3, 48, 3, 49, 3, 49, 3, 49, 3, 50, 3,
	50, 3, 50, 3, 51, 3, 51, 3, 51, 3, 52, 3, 52, 3, 53, 3, 53, 3, 54, 3, 54,
	3, 55, 3, 55, 3, 56, 3, 56, 3, 57, 3, 57, 3, 58, 3, 58, 3, 59, 3, 59, 3,
	60, 3, 60, 3, 61, 3, 61, 3, 62, 3, 62, 3, 63, 3, 63, 3, 64, 3, 64, 3, 65,
	3, 65, 3, 65, 3, 66, 3, 66, 3, 66, 3, 67, 3, 67, 3, 67, 7, 67, 438, 10,
	67, 12, 67, 14, 67, 441, 11, 67, 3, 67, 6, 67, 444, 10, 67, 13, 67, 14,
	67, 445, 3, 67, 3, 67, 7, 67, 450, 10, 67, 12, 67, 14, 67, 453, 11, 67,
	3, 67, 6, 67, 456, 10, 67, 13, 67, 14, 67, 457, 7, 67, 460, 10, 67, 12,
	67, 14, 67, 463, 11, 67, 3, 67, 3, 67, 3, 67, 3, 67, 3, 68, 6, 68, 470,
	10, 68, 13, 68, 14, 68, 471, 3, 68, 3, 68, 3, 69, 3, 69, 3, 69, 2, 2, 70,
	3, 3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23,
	13, 25, 14, 27, 15, 29, 16, 31, 17, 33, 18, 35, 19, 37, 20, 39, 21, 41,
	22, 43, 23, 45, 24, 47, 25, 49, 26, 51, 27, 53, 28, 55, 29, 57, 30, 59,
	31, 61, 32, 63, 33, 65, 34, 67, 35, 69, 36, 71, 37, 73, 38, 75, 39, 77,
	40, 79, 41, 81, 42, 83, 43, 85, 44, 87, 45, 89, 46, 91, 47, 93, 48, 95,
	49, 97, 50, 99, 51, 101, 52, 103, 53, 105, 54, 107, 55, 109, 56, 111, 57,
	113, 58, 115, 59, 117, 60, 119, 61, 121, 62, 123, 63, 125, 64, 127, 65,
	129, 66, 131, 67, 133, 68, 135, 69, 137, 2, 3, 2, 12, 3, 2, 50, 59, 3,
	2, 36, 36, 5, 2, 67, 92, 97, 97, 99, 124, 6, 2, 50, 59, 67, 92, 97, 97,
	99, 124, 3, 2, 49, 49, 3, 2, 44, 44, 4, 2, 44, 44, 96, 96, 5, 2, 44, 44,
	49, 49, 96, 96, 6, 2, 11, 12, 15, 15, 34, 34, 94, 94, 9, 2, 34, 35, 37,
	37, 45, 45, 47, 48, 60, 60, 66, 66, 93, 95, 2, 487, 2, 3, 3, 2, 2, 2, 2,
	5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3, 2, 2, 2, 2,
	13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19, 3, 2, 2, 2,
	2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 2, 27, 3, 2, 2,
	2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 2, 33, 3, 2, 2, 2, 2, 35, 3, 2,
	2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 2, 2, 2, 41, 3, 2, 2, 2, 2, 43, 3,
	2, 2, 2, 2, 45, 3, 2, 2, 2, 2, 47, 3, 2, 2, 2, 2, 49, 3, 2, 2, 2, 2, 51,
	3, 2, 2, 2, 2, 53, 3, 2, 2, 2, 2, 55, 3, 2, 2, 2, 2, 57, 3, 2, 2, 2, 2,
	59, 3, 2, 2, 2, 2, 61, 3, 2, 2, 2, 2, 63, 3, 2, 2, 2, 2, 65, 3, 2, 2, 2,
	2, 67, 3, 2, 2, 2, 2, 69, 3, 2, 2, 2, 2, 71, 3, 2, 2, 2, 2, 73, 3, 2, 2,
	2, 2, 75, 3, 2, 2, 2, 2, 77, 3, 2, 2, 2, 2, 79, 3, 2, 2, 2, 2, 81, 3, 2,
	2, 2, 2, 83, 3, 2, 2, 2, 2, 85, 3, 2, 2, 2, 2, 87, 3, 2, 2, 2, 2, 89, 3,
	2, 2, 2, 2, 91, 3, 2, 2, 2, 2, 93, 3, 2, 2, 2, 2, 95, 3, 2, 2, 2, 2, 97,
	3, 2, 2, 2, 2, 99, 3, 2, 2, 2, 2, 101, 3, 2, 2, 2, 2, 103, 3, 2, 2, 2,
	2, 105, 3, 2, 2, 2, 2, 107, 3, 2, 2, 2, 2, 109, 3, 2, 2, 2, 2, 111, 3,
	2, 2, 2, 2, 113, 3, 2, 2, 2, 2, 115, 3, 2, 2, 2, 2, 117, 3, 2, 2, 2, 2,
	119, 3, 2, 2, 2, 2, 121, 3, 2, 2, 2, 2, 123, 3, 2, 2, 2, 2, 125, 3, 2,
	2, 2, 2, 127, 3, 2, 2, 2, 2, 129, 3, 2, 2, 2, 2, 131, 3, 2, 2, 2, 2, 133,
	3, 2, 2, 2, 2, 135, 3, 2, 2, 2, 3, 139, 3, 2, 2, 2, 5, 147, 3, 2, 2, 2,
	7, 153, 3, 2, 2, 2, 9, 160, 3, 2, 2, 2, 11, 167, 3, 2, 2, 2, 13, 172, 3,
	2, 2, 2, 15, 175, 3, 2, 2, 2, 17, 180, 3, 2, 2, 2, 19, 186, 3, 2, 2, 2,
	21, 190, 3, 2, 2, 2, 23, 195, 3, 2, 2, 2, 25, 199, 3, 2, 2, 2, 27, 203,
	3, 2, 2, 2, 29, 207, 3, 2, 2, 2, 31, 211, 3, 2, 2, 2, 33, 214, 3, 2, 2,
	2, 35, 219, 3, 2, 2, 2, 37, 225, 3, 2, 2, 2, 39, 231, 3, 2, 2, 2, 41, 236,
	3, 2, 2, 2, 43, 240, 3, 2, 2, 2, 45, 245, 3, 2, 2, 2, 47, 255, 3, 2, 2,
	2, 49, 261, 3, 2, 2, 2, 51, 265, 3, 2, 2, 2, 53, 268, 3, 2, 2, 2, 55, 274,
	3, 2, 2, 2, 57, 283, 3, 2, 2, 2, 59, 287, 3, 2, 2, 2, 61, 292, 3, 2, 2,
	2, 63, 299, 3, 2, 2, 2, 65, 306, 3, 2, 2, 2, 67, 315, 3, 2, 2, 2, 69, 319,
	3, 2, 2, 2, 71, 328, 3, 2, 2, 2, 73, 332, 3, 2, 2, 2, 75, 347, 3, 2, 2,
	2, 77, 352, 3, 2, 2, 2, 79, 362, 3, 2, 2, 2, 81, 371, 3, 2, 2, 2, 83, 378,
	3, 2, 2, 2, 85, 380, 3, 2, 2, 2, 87, 382, 3, 2, 2, 2, 89, 384, 3, 2, 2,
	2, 91, 386, 3, 2, 2, 2, 93, 388, 3, 2, 2, 2, 95, 391, 3, 2, 2, 2, 97, 393,
	3, 2, 2, 2, 99, 396, 3, 2, 2, 2, 101, 399, 3, 2, 2, 2, 103, 402, 3, 2,
	2, 2, 105, 404, 3, 2, 2, 2, 107, 406, 3, 2, 2, 2, 109, 408, 3, 2, 2, 2,
	111, 410, 3, 2, 2, 2, 113, 412, 3, 2, 2, 2, 115, 414, 3, 2, 2, 2, 117,
	416, 3, 2, 2, 2, 119, 418, 3, 2, 2, 2, 121, 420, 3, 2, 2, 2, 123, 422,
	3, 2, 2, 2, 125, 424, 3, 2, 2, 2, 127, 426, 3, 2, 2, 2, 129, 428, 3, 2,
	2, 2, 131, 431, 3, 2, 2, 2, 133, 434, 3, 2, 2, 2, 135, 469, 3, 2, 2, 2,
	137, 475, 3, 2, 2, 2, 139, 140, 7, 114, 2, 2, 140, 141, 7, 116, 2, 2, 141,
	142, 7, 107, 2, 2, 142, 143, 7, 112, 2, 2, 143, 144, 7, 118, 2, 2, 144,
	145, 7, 110, 2, 2, 145, 146, 7, 112, 2, 2, 146, 4, 3, 2, 2, 2, 147, 148,
	7, 114, 2, 2, 148, 149, 7, 116, 2, 2, 149, 150, 7, 107, 2, 2, 150, 151,
	7, 112, 2, 2, 151, 152, 7, 118, 2, 2, 152, 6, 3, 2, 2, 2, 153, 154, 7,
	112, 2, 2, 154, 155, 7, 119, 2, 2, 155, 156, 7, 111, 2, 2, 156, 157, 7,
	100, 2, 2, 157, 158, 7, 103, 2, 2, 158, 159, 7, 116, 2, 2, 159, 8, 3, 2,
	2, 2, 160, 161, 7, 117, 2, 2, 161, 162, 7, 118, 2, 2, 162, 163, 7, 116,
	2, 2, 163, 164, 7, 107, 2, 2, 164, 165, 7, 112, 2, 2, 165, 166, 7, 105,
	2, 2, 166, 10, 3, 2, 2, 2, 167, 168, 7, 40, 2, 2, 168, 169, 7, 117, 2,
	2, 169, 170, 7, 118, 2, 2, 170, 171, 7, 116, 2, 2, 171, 12, 3, 2, 2, 2,
	172, 173, 7, 107, 2, 2, 173, 174, 7, 104, 2, 2, 174, 14, 3, 2, 2, 2, 175,
	176, 7, 103, 2, 2, 176, 177, 7, 110, 2, 2, 177, 178, 7, 117, 2, 2, 178,
	179, 7, 103, 2, 2, 179, 16, 3, 2, 2, 2, 180, 181, 7, 121, 2, 2, 181, 182,
	7, 106, 2, 2, 182, 183, 7, 107, 2, 2, 183, 184, 7, 110, 2, 2, 184, 185,
	7, 103, 2, 2, 185, 18, 3, 2, 2, 2, 186, 187, 7, 114, 2, 2, 187, 188, 7,
	113, 2, 2, 188, 189, 7, 121, 2, 2, 189, 20, 3, 2, 2, 2, 190, 191, 7, 114,
	2, 2, 191, 192, 7, 113, 2, 2, 192, 193, 7, 121, 2, 2, 193, 194, 7, 104,
	2, 2, 194, 22, 3, 2, 2, 2, 195, 196, 7, 107, 2, 2, 196, 197, 7, 56, 2,
	2, 197, 198, 7, 54, 2, 2, 198, 24, 3, 2, 2, 2, 199, 200, 7, 104, 2, 2,
	200, 201, 7, 56, 2, 2, 201, 202, 7, 54, 2, 2, 202, 26, 3, 2, 2, 2, 203,
	204, 7, 110, 2, 2, 204, 205, 7, 103, 2, 2, 205, 206, 7, 118, 2, 2, 206,
	28, 3, 2, 2, 2, 207, 208, 7, 111, 2, 2, 208, 209, 7, 119, 2, 2, 209, 210,
	7, 118, 2, 2, 210, 30, 3, 2, 2, 2, 211, 212, 7, 99, 2, 2, 212, 213, 7,
	117, 2, 2, 213, 32, 3, 2, 2, 2, 214, 215, 7, 118, 2, 2, 215, 216, 7, 116,
	2, 2, 216, 217, 7, 119, 2, 2, 217, 218, 7, 103, 2, 2, 218, 34, 3, 2, 2,
	2, 219, 220, 7, 104, 2, 2, 220, 221, 7, 99, 2, 2, 221, 222, 7, 110, 2,
	2, 222, 223, 7, 117, 2, 2, 223, 224, 7, 103, 2, 2, 224, 36, 3, 2, 2, 2,
	225, 226, 7, 111, 2, 2, 226, 227, 7, 99, 2, 2, 227, 228, 7, 118, 2, 2,
	228, 229, 7, 101, 2, 2, 229, 230, 7, 106, 2, 2, 230, 38, 3, 2, 2, 2, 231,
	232, 7, 110, 2, 2, 232, 233, 7, 113, 2, 2, 233, 234, 7, 113, 2, 2, 234,
	235, 7, 114, 2, 2, 235, 40, 3, 2, 2, 2, 236, 237, 7, 99, 2, 2, 237, 238,
	7, 100, 2, 2, 238, 239, 7, 117, 2, 2, 239, 42, 3, 2, 2, 2, 240, 241, 7,
	117, 2, 2, 241, 242, 7, 115, 2, 2, 242, 243, 7, 116, 2, 2, 243, 244, 7,
	118, 2, 2, 244, 44, 3, 2, 2, 2, 245, 246, 7, 118, 2, 2, 246, 247, 7, 113,
	2, 2, 247, 248, 7, 97, 2, 2, 248, 249, 7, 117, 2, 2, 249, 250, 7, 118,
	2, 2, 250, 251, 7, 116, 2, 2, 251, 252, 7, 107, 2, 2, 252, 253, 7, 112,
	2, 2, 253, 254, 7, 105, 2, 2, 254, 46, 3, 2, 2, 2, 255, 256, 7, 101, 2,
	2, 256, 257, 7, 110, 2, 2, 257, 258, 7, 113, 2, 2, 258, 259, 7, 112, 2,
	2, 259, 260, 7, 103, 2, 2, 260, 48, 3, 2, 2, 2, 261, 262, 7, 104, 2, 2,
	262, 263, 7, 113, 2, 2, 263, 264, 7, 116, 2, 2, 264, 50, 3, 2, 2, 2, 265,
	266, 7, 107, 2, 2, 266, 267, 7, 112, 2, 2, 267, 52, 3, 2, 2, 2, 268, 269,
	7, 100, 2, 2, 269, 270, 7, 116, 2, 2, 270, 271, 7, 103, 2, 2, 271, 272,
	7, 99, 2, 2, 272, 273, 7, 109, 2, 2, 273, 54, 3, 2, 2, 2, 274, 275, 7,
	101, 2, 2, 275, 276, 7, 113, 2, 2, 276, 277, 7, 112, 2, 2, 277, 278, 7,
	118, 2, 2, 278, 279, 7, 107, 2, 2, 279, 280, 7, 112, 2, 2, 280, 281, 7,
	119, 2, 2, 281, 282, 7, 103, 2, 2, 282, 56, 3, 2, 2, 2, 283, 284, 7, 120,
	2, 2, 284, 285, 7, 103, 2, 2, 285, 286, 7, 101, 2, 2, 286, 58, 3, 2, 2,
	2, 287, 288, 7, 114, 2, 2, 288, 289, 7, 119, 2, 2, 289, 290, 7, 117, 2,
	2, 290, 291, 7, 106, 2, 2, 291, 60, 3, 2, 2, 2, 292, 293, 7, 107, 2, 2,
	293, 294, 7, 112, 2, 2, 294, 295, 7, 117, 2, 2, 295, 296, 7, 103, 2, 2,
	296, 297, 7, 116, 2, 2, 297, 298, 7, 118, 2, 2, 298, 62, 3, 2, 2, 2, 299,
	300, 7, 116, 2, 2, 300, 301, 7, 103, 2, 2, 301, 302, 7, 111, 2, 2, 302,
	303, 7, 113, 2, 2, 303, 304, 7, 120, 2, 2, 304, 305, 7, 103, 2, 2, 305,
	64, 3, 2, 2, 2, 306, 307, 7, 101, 2, 2, 307, 308, 7, 113, 2, 2, 308, 309,
	7, 112, 2, 2, 309, 310, 7, 118, 2, 2, 310, 311, 7, 99, 2, 2, 311, 312,
	7, 107, 2, 2, 312, 313, 7, 112, 2, 2, 313, 314, 7, 117, 2, 2, 314, 66,
	3, 2, 2, 2, 315, 316, 7, 110, 2, 2, 316, 317, 7, 103, 2, 2, 317, 318, 7,
	112, 2, 2, 318, 68, 3, 2, 2, 2, 319, 320, 7, 101, 2, 2, 320, 321, 7, 99,
	2, 2, 321, 322, 7, 114, 2, 2, 322, 323, 7, 99, 2, 2, 323, 324, 7, 101,
	2, 2, 324, 325, 7, 107, 2, 2, 325, 326, 7, 118, 2, 2, 326, 327, 7, 123,
	2, 2, 327, 70, 3, 2, 2, 2, 328, 329, 7, 112, 2, 2, 329, 330, 7, 103, 2,
	2, 330, 331, 7, 121, 2, 2, 331, 72, 3, 2, 2, 2, 332, 333, 7, 121, 2, 2,
	333, 334, 7, 107, 2, 2, 334, 335, 7, 118, 2, 2, 335, 336, 7, 106, 2, 2,
	336, 337, 7, 97, 2, 2, 337, 338, 7, 101, 2, 2, 338, 339, 7, 99, 2, 2, 339,
	340, 7, 114, 2, 2, 340, 341, 7, 99, 2, 2, 341, 342, 7, 101, 2, 2, 342,
	343, 7, 107, 2, 2, 343, 344, 7, 118, 2, 2, 344, 345, 7, 123, 2, 2, 345,
	74, 3, 2, 2, 2, 346, 348, 9, 2, 2, 2, 347, 346, 3, 2, 2, 2, 348, 349, 3,
	2, 2, 2, 349, 347, 3, 2, 2, 2, 349, 350, 3, 2, 2, 2, 350, 76, 3, 2, 2,
	2, 351, 353, 9, 2, 2, 2, 352, 351, 3, 2, 2, 2, 353, 354, 3, 2, 2, 2, 354,
	352, 3, 2, 2, 2, 354, 355, 3, 2, 2, 2, 355, 356, 3, 2, 2, 2, 356, 358,
	7, 48, 2, 2, 357, 359, 9, 2, 2, 2, 358, 357, 3, 2, 2, 2, 359, 360, 3, 2,
	2, 2, 360, 358, 3, 2, 2, 2, 360, 361, 3, 2, 2, 2, 361, 78, 3, 2, 2, 2,
	362, 366, 7, 36, 2, 2, 363, 365, 10, 3, 2, 2, 364, 363, 3, 2, 2, 2, 365,
	368, 3, 2, 2, 2, 366, 364, 3, 2, 2, 2, 366, 367, 3, 2, 2, 2, 367, 369,
	3, 2, 2, 2, 368, 366, 3, 2, 2, 2, 369, 370, 7, 36, 2, 2, 370, 80, 3, 2,
	2, 2, 371, 375, 9, 4, 2, 2, 372, 374, 9, 5, 2, 2, 373, 372, 3, 2, 2, 2,
	374, 377, 3, 2, 2, 2, 375, 373, 3, 2, 2, 2, 375, 376, 3, 2, 2, 2, 376,
	82, 3, 2, 2, 2, 377, 375, 3, 2, 2, 2, 378, 379, 7, 48, 2, 2, 379, 84, 3,
	2, 2, 2, 380, 381, 7, 61, 2, 2, 381, 86, 3, 2, 2, 2, 382, 383, 7, 46, 2,
	2, 383, 88, 3, 2, 2, 2, 384, 385, 7, 60, 2, 2, 385, 90, 3, 2, 2, 2, 386,
	387, 7, 35, 2, 2, 387, 92, 3, 2, 2, 2, 388, 389, 7, 35, 2, 2, 389, 390,
	7, 63, 2, 2, 390, 94, 3, 2, 2, 2, 391, 392, 7, 63, 2, 2, 392, 96, 3, 2,
	2, 2, 393, 394, 7, 63, 2, 2, 394, 395, 7, 63, 2, 2, 395, 98, 3, 2, 2, 2,
	396, 397, 7, 64, 2, 2, 397, 398, 7, 63, 2, 2, 398, 100, 3, 2, 2, 2, 399,
	400, 7, 62, 2, 2, 400, 401, 7, 63, 2, 2, 401, 102, 3, 2, 2, 2, 402, 403,
	7, 64, 2, 2, 403, 104, 3, 2, 2, 2, 404, 405, 7, 62, 2, 2, 405, 106, 3,
	2, 2, 2, 406, 407, 7, 44, 2, 2, 407, 108, 3, 2, 2, 2, 408, 409, 7, 49,
	2, 2, 409, 110, 3, 2, 2, 2, 410, 411, 7, 39, 2, 2, 411, 112, 3, 2, 2, 2,
	412, 413, 7, 45, 2, 2, 413, 114, 3, 2, 2, 2, 414, 415, 7, 47, 2, 2, 415,
	116, 3, 2, 2, 2, 416, 417, 7, 42, 2, 2, 417, 118, 3, 2, 2, 2, 418, 419,
	7, 43, 2, 2, 419, 120, 3, 2, 2, 2, 420, 421, 7, 125, 2, 2, 421, 122, 3,
	2, 2, 2, 422, 423, 7, 127, 2, 2, 423, 124, 3, 2, 2, 2, 424, 425, 7, 93,
	2, 2, 425, 126, 3, 2, 2, 2, 426, 427, 7, 95, 2, 2, 427, 128, 3, 2, 2, 2,
	428, 429, 7, 126, 2, 2, 429, 430, 7, 126, 2, 2, 430, 130, 3, 2, 2, 2, 431,
	432, 7, 40, 2, 2, 432, 433, 7, 40, 2, 2, 433, 132, 3, 2, 2, 2, 434, 435,
	9, 6, 2, 2, 435, 439, 9, 7, 2, 2, 436, 438, 9, 8, 2, 2, 437, 436, 3, 2,
	2, 2, 438, 441, 3, 2, 2, 2, 439, 437, 3, 2, 2, 2, 439, 440, 3, 2, 2, 2,
	440, 443, 3, 2, 2, 2, 441, 439, 3, 2, 2, 2, 442, 444, 9, 7, 2, 2, 443,
	442, 3, 2, 2, 2, 444, 445, 3, 2, 2, 2, 445, 443, 3, 2, 2, 2, 445, 446,
	3, 2, 2, 2, 446, 461, 3, 2, 2, 2, 447, 451, 9, 9, 2, 2, 448, 450, 9, 8,
	2, 2, 449, 448, 3, 2, 2, 2, 450, 453, 3, 2, 2, 2, 451, 449, 3, 2, 2, 2,
	451, 452, 3, 2, 2, 2, 452, 455, 3, 2, 2, 2, 453, 451, 3, 2, 2, 2, 454,
	456, 9, 7, 2, 2, 455, 454, 3, 2, 2, 2, 456, 457, 3, 2, 2, 2, 457, 455,
	3, 2, 2, 2, 457, 458, 3, 2, 2, 2, 458, 460, 3, 2, 2, 2, 459, 447, 3, 2,
	2, 2, 460, 463, 3, 2, 2, 2, 461, 459, 3, 2, 2, 2, 461, 462, 3, 2, 2, 2,
	462, 464, 3, 2, 2, 2, 463, 461, 3, 2, 2, 2, 464, 465, 9, 6, 2, 2, 465,
	466, 3, 2, 2, 2, 466, 467, 8, 67, 2, 2, 467, 134, 3, 2, 2, 2, 468, 470,
	9, 10, 2, 2, 469, 468, 3, 2, 2, 2, 470, 471, 3, 2, 2, 2, 471, 469, 3, 2,
	2, 2, 471, 472, 3, 2, 2, 2, 472, 473, 3, 2, 2, 2, 473, 474, 8, 68, 2, 2,
	474, 136, 3, 2, 2, 2, 475, 476, 7, 94, 2, 2, 476, 477, 9, 11, 2, 2, 477,
	138, 3, 2, 2, 2, 14, 2, 349, 354, 360, 366, 375, 439, 445, 451, 457, 461,
	471, 3, 8, 2, 2,
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
	"", "'println'", "'print'", "'number'", "'string'", "'&str'", "'if'", "'else'",
	"'while'", "'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'",
	"'true'", "'false'", "'match'", "'loop'", "'abs'", "'sqrt'", "'to_string'",
	"'clone'", "'for'", "'in'", "'break'", "'continue'", "'vec'", "'push'",
	"'insert'", "'remove'", "'contains'", "'len'", "'capacity'", "'new'", "'with_capacity'",
	"", "", "", "", "'.'", "';'", "','", "':'", "'!'", "'!='", "'='", "'=='",
	"'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'+'", "'-'", "'('",
	"')'", "'{'", "'}'", "'['", "']'", "'||'", "'&&'",
}

var lexerSymbolicNames = []string{
	"", "PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_STRING2", "P_IF", "P_ELSE",
	"P_WHILE", "P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS",
	"P_TRUE", "P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING",
	"P_CLONE", "P_FOR", "P_IN", "P_BREAK", "P_CONTINUE", "P_VECTOR", "P_PUSH",
	"P_INSERT", "P_REMOVE", "P_CONTAINS", "P_LEN", "P_CAPACITY", "P_NEW", "P_WITHCAPACITY",
	"NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DOSPUNTOS",
	"DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", "MAYORIGUAL", "MENORIGUAL",
	"MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD", "SUB", "PARIZQ", "PARDER",
	"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "OR", "AND", "MULTICOMENT",
	"WHITESPACE",
}

var lexerRuleNames = []string{
	"PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_STRING2", "P_IF", "P_ELSE",
	"P_WHILE", "P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS",
	"P_TRUE", "P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING",
	"P_CLONE", "P_FOR", "P_IN", "P_BREAK", "P_CONTINUE", "P_VECTOR", "P_PUSH",
	"P_INSERT", "P_REMOVE", "P_CONTAINS", "P_LEN", "P_CAPACITY", "P_NEW", "P_WITHCAPACITY",
	"NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DOSPUNTOS",
	"DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", "MAYORIGUAL", "MENORIGUAL",
	"MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD", "SUB", "PARIZQ", "PARDER",
	"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "OR", "AND", "MULTICOMENT",
	"WHITESPACE", "ESC_SEQ",
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
	ChemsLexerPRINTLN        = 1
	ChemsLexerPRINT          = 2
	ChemsLexerP_NUMBER       = 3
	ChemsLexerP_STRING       = 4
	ChemsLexerP_STRING2      = 5
	ChemsLexerP_IF           = 6
	ChemsLexerP_ELSE         = 7
	ChemsLexerP_WHILE        = 8
	ChemsLexerP_POW          = 9
	ChemsLexerP_POWF         = 10
	ChemsLexerP_I64          = 11
	ChemsLexerP_F64          = 12
	ChemsLexerP_LET          = 13
	ChemsLexerP_MUT          = 14
	ChemsLexerP_AS           = 15
	ChemsLexerP_TRUE         = 16
	ChemsLexerP_FALSE        = 17
	ChemsLexerP_MATCH        = 18
	ChemsLexerP_LOOP         = 19
	ChemsLexerP_ABS          = 20
	ChemsLexerP_SQRT         = 21
	ChemsLexerP_TOSTRING     = 22
	ChemsLexerP_CLONE        = 23
	ChemsLexerP_FOR          = 24
	ChemsLexerP_IN           = 25
	ChemsLexerP_BREAK        = 26
	ChemsLexerP_CONTINUE     = 27
	ChemsLexerP_VECTOR       = 28
	ChemsLexerP_PUSH         = 29
	ChemsLexerP_INSERT       = 30
	ChemsLexerP_REMOVE       = 31
	ChemsLexerP_CONTAINS     = 32
	ChemsLexerP_LEN          = 33
	ChemsLexerP_CAPACITY     = 34
	ChemsLexerP_NEW          = 35
	ChemsLexerP_WITHCAPACITY = 36
	ChemsLexerNUMBER         = 37
	ChemsLexerDECIMAL        = 38
	ChemsLexerSTRING         = 39
	ChemsLexerID             = 40
	ChemsLexerPUNTO          = 41
	ChemsLexerPTCOMA         = 42
	ChemsLexerCOMA           = 43
	ChemsLexerDOSPUNTOS      = 44
	ChemsLexerDIFERENTE      = 45
	ChemsLexerDIFERENTEDE    = 46
	ChemsLexerIGUAL          = 47
	ChemsLexerIGUALIGUA      = 48
	ChemsLexerMAYORIGUAL     = 49
	ChemsLexerMENORIGUAL     = 50
	ChemsLexerMAYOR          = 51
	ChemsLexerMENOR          = 52
	ChemsLexerMUL            = 53
	ChemsLexerDIV            = 54
	ChemsLexerMODULO         = 55
	ChemsLexerADD            = 56
	ChemsLexerSUB            = 57
	ChemsLexerPARIZQ         = 58
	ChemsLexerPARDER         = 59
	ChemsLexerLLAVEIZQ       = 60
	ChemsLexerLLAVEDER       = 61
	ChemsLexerCORIZQ         = 62
	ChemsLexerCORDER         = 63
	ChemsLexerOR             = 64
	ChemsLexerAND            = 65
	ChemsLexerMULTICOMENT    = 66
	ChemsLexerWHITESPACE     = 67
)

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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 71, 406,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 3, 2, 3, 2, 3, 2, 3, 3, 7, 3, 35, 10,
	3, 12, 3, 14, 3, 38, 11, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 5, 4, 202,
	10, 4, 3, 5, 7, 5, 205, 10, 5, 12, 5, 14, 5, 208, 11, 5, 3, 5, 3, 5, 3,
	6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 5, 7, 228, 10, 7, 3, 8, 3, 8, 3, 8, 5, 8, 233, 10,
	8, 3, 9, 3, 9, 3, 9, 3, 9, 5, 9, 239, 10, 9, 3, 10, 3, 10, 3, 10, 3, 10,
	5, 10, 245, 10, 10, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	5, 12, 286, 10, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 7, 12, 343, 10, 12, 12, 12, 14,
	12, 346, 11, 12, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13,
	3, 13, 7, 13, 357, 10, 13, 12, 13, 14, 13, 360, 11, 13, 3, 14, 3, 14, 3,
	14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3,
	14, 3, 14, 3, 14, 3, 14, 5, 14, 389, 10, 14, 3, 15, 3, 15, 3, 15, 3, 15,
	3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 7, 15, 401, 10, 15, 12, 15, 14,
	15, 404, 11, 15, 3, 15, 2, 5, 22, 24, 28, 16, 2, 4, 6, 8, 10, 12, 14, 16,
	18, 20, 22, 24, 26, 28, 2, 8, 3, 2, 13, 14, 3, 2, 11, 12, 3, 2, 57, 58,
	3, 2, 60, 61, 5, 2, 50, 50, 53, 56, 59, 59, 3, 2, 68, 69, 2, 443, 2, 30,
	3, 2, 2, 2, 4, 36, 3, 2, 2, 2, 6, 201, 3, 2, 2, 2, 8, 206, 3, 2, 2, 2,
	10, 211, 3, 2, 2, 2, 12, 227, 3, 2, 2, 2, 14, 232, 3, 2, 2, 2, 16, 238,
	3, 2, 2, 2, 18, 244, 3, 2, 2, 2, 20, 246, 3, 2, 2, 2, 22, 285, 3, 2, 2,
	2, 24, 347, 3, 2, 2, 2, 26, 388, 3, 2, 2, 2, 28, 390, 3, 2, 2, 2, 30, 31,
	5, 4, 3, 2, 31, 32, 8, 2, 1, 2, 32, 3, 3, 2, 2, 2, 33, 35, 5, 6, 4, 2,
	34, 33, 3, 2, 2, 2, 35, 38, 3, 2, 2, 2, 36, 34, 3, 2, 2, 2, 36, 37, 3,
	2, 2, 2, 37, 39, 3, 2, 2, 2, 38, 36, 3, 2, 2, 2, 39, 40, 8, 3, 1, 2, 40,
	5, 3, 2, 2, 2, 41, 42, 7, 3, 2, 2, 42, 43, 7, 49, 2, 2, 43, 44, 7, 62,
	2, 2, 44, 45, 5, 20, 11, 2, 45, 46, 7, 63, 2, 2, 46, 47, 7, 46, 2, 2, 47,
	48, 8, 4, 1, 2, 48, 202, 3, 2, 2, 2, 49, 50, 7, 4, 2, 2, 50, 51, 7, 49,
	2, 2, 51, 52, 7, 62, 2, 2, 52, 53, 5, 20, 11, 2, 53, 54, 7, 63, 2, 2, 54,
	55, 7, 46, 2, 2, 55, 56, 8, 4, 1, 2, 56, 202, 3, 2, 2, 2, 57, 58, 7, 15,
	2, 2, 58, 59, 5, 14, 8, 2, 59, 60, 5, 18, 10, 2, 60, 61, 7, 44, 2, 2, 61,
	62, 7, 48, 2, 2, 62, 63, 5, 12, 7, 2, 63, 64, 7, 51, 2, 2, 64, 65, 5, 20,
	11, 2, 65, 66, 7, 46, 2, 2, 66, 67, 8, 4, 1, 2, 67, 202, 3, 2, 2, 2, 68,
	69, 7, 15, 2, 2, 69, 70, 5, 14, 8, 2, 70, 71, 5, 18, 10, 2, 71, 72, 7,
	44, 2, 2, 72, 73, 7, 51, 2, 2, 73, 74, 5, 20, 11, 2, 74, 75, 7, 46, 2,
	2, 75, 76, 8, 4, 1, 2, 76, 202, 3, 2, 2, 2, 77, 78, 7, 15, 2, 2, 78, 79,
	5, 14, 8, 2, 79, 80, 5, 18, 10, 2, 80, 81, 7, 44, 2, 2, 81, 82, 7, 51,
	2, 2, 82, 83, 5, 16, 9, 2, 83, 84, 5, 20, 11, 2, 84, 85, 7, 46, 2, 2, 85,
	86, 8, 4, 1, 2, 86, 202, 3, 2, 2, 2, 87, 88, 7, 15, 2, 2, 88, 89, 5, 14,
	8, 2, 89, 90, 7, 44, 2, 2, 90, 91, 7, 48, 2, 2, 91, 92, 7, 66, 2, 2, 92,
	93, 5, 12, 7, 2, 93, 94, 7, 46, 2, 2, 94, 95, 7, 41, 2, 2, 95, 96, 7, 67,
	2, 2, 96, 97, 7, 51, 2, 2, 97, 98, 5, 20, 11, 2, 98, 99, 7, 46, 2, 2, 99,
	100, 8, 4, 1, 2, 100, 202, 3, 2, 2, 2, 101, 102, 7, 44, 2, 2, 102, 103,
	7, 51, 2, 2, 103, 104, 5, 20, 11, 2, 104, 105, 7, 46, 2, 2, 105, 106, 8,
	4, 1, 2, 106, 202, 3, 2, 2, 2, 107, 108, 7, 8, 2, 2, 108, 109, 5, 20, 11,
	2, 109, 110, 7, 64, 2, 2, 110, 111, 5, 4, 3, 2, 111, 112, 7, 65, 2, 2,
	112, 113, 8, 4, 1, 2, 113, 202, 3, 2, 2, 2, 114, 115, 7, 8, 2, 2, 115,
	116, 5, 20, 11, 2, 116, 117, 7, 64, 2, 2, 117, 118, 5, 4, 3, 2, 118, 119,
	7, 65, 2, 2, 119, 120, 7, 9, 2, 2, 120, 121, 7, 64, 2, 2, 121, 122, 5,
	4, 3, 2, 122, 123, 7, 65, 2, 2, 123, 124, 8, 4, 1, 2, 124, 202, 3, 2, 2,
	2, 125, 126, 7, 8, 2, 2, 126, 127, 5, 20, 11, 2, 127, 128, 7, 64, 2, 2,
	128, 129, 5, 4, 3, 2, 129, 130, 7, 65, 2, 2, 130, 131, 5, 8, 5, 2, 131,
	132, 7, 9, 2, 2, 132, 133, 7, 64, 2, 2, 133, 134, 5, 4, 3, 2, 134, 135,
	7, 65, 2, 2, 135, 136, 8, 4, 1, 2, 136, 202, 3, 2, 2, 2, 137, 138, 7, 10,
	2, 2, 138, 139, 5, 20, 11, 2, 139, 140, 7, 64, 2, 2, 140, 141, 5, 4, 3,
	2, 141, 142, 7, 65, 2, 2, 142, 143, 8, 4, 1, 2, 143, 202, 3, 2, 2, 2, 144,
	145, 7, 21, 2, 2, 145, 146, 7, 64, 2, 2, 146, 147, 5, 4, 3, 2, 147, 148,
	7, 65, 2, 2, 148, 149, 8, 4, 1, 2, 149, 202, 3, 2, 2, 2, 150, 151, 7, 26,
	2, 2, 151, 152, 7, 44, 2, 2, 152, 153, 7, 27, 2, 2, 153, 154, 5, 20, 11,
	2, 154, 155, 7, 64, 2, 2, 155, 156, 5, 4, 3, 2, 156, 157, 7, 65, 2, 2,
	157, 158, 8, 4, 1, 2, 158, 202, 3, 2, 2, 2, 159, 160, 7, 28, 2, 2, 160,
	161, 7, 46, 2, 2, 161, 202, 8, 4, 1, 2, 162, 163, 7, 29, 2, 2, 163, 164,
	7, 46, 2, 2, 164, 202, 8, 4, 1, 2, 165, 166, 5, 20, 11, 2, 166, 167, 7,
	45, 2, 2, 167, 168, 7, 31, 2, 2, 168, 169, 7, 62, 2, 2, 169, 170, 5, 20,
	11, 2, 170, 171, 7, 63, 2, 2, 171, 172, 7, 46, 2, 2, 172, 173, 8, 4, 1,
	2, 173, 202, 3, 2, 2, 2, 174, 175, 5, 20, 11, 2, 175, 176, 7, 45, 2, 2,
	176, 177, 7, 32, 2, 2, 177, 178, 7, 62, 2, 2, 178, 179, 5, 20, 11, 2, 179,
	180, 7, 47, 2, 2, 180, 181, 5, 20, 11, 2, 181, 182, 7, 63, 2, 2, 182, 183,
	7, 46, 2, 2, 183, 184, 8, 4, 1, 2, 184, 202, 3, 2, 2, 2, 185, 186, 5, 20,
	11, 2, 186, 187, 7, 45, 2, 2, 187, 188, 7, 33, 2, 2, 188, 189, 7, 62, 2,
	2, 189, 190, 5, 20, 11, 2, 190, 191, 7, 63, 2, 2, 191, 192, 7, 46, 2, 2,
	192, 193, 8, 4, 1, 2, 193, 202, 3, 2, 2, 2, 194, 195, 5, 20, 11, 2, 195,
	196, 7, 45, 2, 2, 196, 197, 7, 35, 2, 2, 197, 198, 7, 62, 2, 2, 198, 199,
	7, 63, 2, 2, 199, 200, 8, 4, 1, 2, 200, 202, 3, 2, 2, 2, 201, 41, 3, 2,
	2, 2, 201, 49, 3, 2, 2, 2, 201, 57, 3, 2, 2, 2, 201, 68, 3, 2, 2, 2, 201,
	77, 3, 2, 2, 2, 201, 87, 3, 2, 2, 2, 201, 101, 3, 2, 2, 2, 201, 107, 3,
	2, 2, 2, 201, 114, 3, 2, 2, 2, 201, 125, 3, 2, 2, 2, 201, 137, 3, 2, 2,
	2, 201, 144, 3, 2, 2, 2, 201, 150, 3, 2, 2, 2, 201, 159, 3, 2, 2, 2, 201,
	162, 3, 2, 2, 2, 201, 165, 3, 2, 2, 2, 201, 174, 3, 2, 2, 2, 201, 185,
	3, 2, 2, 2, 201, 194, 3, 2, 2, 2, 202, 7, 3, 2, 2, 2, 203, 205, 5, 10,
	6, 2, 204, 203, 3, 2, 2, 2, 205, 208, 3, 2, 2, 2, 206, 204, 3, 2, 2, 2,
	206, 207, 3, 2, 2, 2, 207, 209, 3, 2, 2, 2, 208, 206, 3, 2, 2, 2, 209,
	210, 8, 5, 1, 2, 210, 9, 3, 2, 2, 2, 211, 212, 7, 9, 2, 2, 212, 213, 7,
	8, 2, 2, 213, 214, 5, 20, 11, 2, 214, 215, 7, 64, 2, 2, 215, 216, 5, 4,
	3, 2, 216, 217, 7, 65, 2, 2, 217, 218, 8, 6, 1, 2, 218, 11, 3, 2, 2, 2,
	219, 220, 7, 14, 2, 2, 220, 228, 8, 7, 1, 2, 221, 222, 7, 13, 2, 2, 222,
	228, 8, 7, 1, 2, 223, 224, 7, 6, 2, 2, 224, 228, 8, 7, 1, 2, 225, 226,
	7, 7, 2, 2, 226, 228, 8, 7, 1, 2, 227, 219, 3, 2, 2, 2, 227, 221, 3, 2,
	2, 2, 227, 223, 3, 2, 2, 2, 227, 225, 3, 2, 2, 2, 228, 13, 3, 2, 2, 2,
	229, 230, 7, 16, 2, 2, 230, 233, 8, 8, 1, 2, 231, 233, 3, 2, 2, 2, 232,
	229, 3, 2, 2, 2, 232, 231, 3, 2, 2, 2, 233, 15, 3, 2, 2, 2, 234, 235, 7,
	30, 2, 2, 235, 236, 7, 49, 2, 2, 236, 239, 8, 9, 1, 2, 237, 239, 3, 2,
	2, 2, 238, 234, 3, 2, 2, 2, 238, 237, 3, 2, 2, 2, 239, 17, 3, 2, 2, 2,
	240, 241, 7, 66, 2, 2, 241, 242, 7, 67, 2, 2, 242, 245, 8, 10, 1, 2, 243,
	245, 3, 2, 2, 2, 244, 240, 3, 2, 2, 2, 244, 243, 3, 2, 2, 2, 245, 19, 3,
	2, 2, 2, 246, 247, 5, 22, 12, 2, 247, 248, 8, 11, 1, 2, 248, 21, 3, 2,
	2, 2, 249, 250, 8, 12, 1, 2, 250, 251, 9, 2, 2, 2, 251, 252, 7, 48, 2,
	2, 252, 253, 7, 48, 2, 2, 253, 254, 9, 3, 2, 2, 254, 255, 7, 62, 2, 2,
	255, 256, 5, 22, 12, 2, 256, 257, 7, 47, 2, 2, 257, 258, 5, 22, 12, 2,
	258, 259, 7, 63, 2, 2, 259, 260, 8, 12, 1, 2, 260, 286, 3, 2, 2, 2, 261,
	262, 7, 49, 2, 2, 262, 263, 5, 22, 12, 12, 263, 264, 8, 12, 1, 2, 264,
	286, 3, 2, 2, 2, 265, 266, 7, 66, 2, 2, 266, 267, 5, 24, 13, 2, 267, 268,
	7, 67, 2, 2, 268, 269, 8, 12, 1, 2, 269, 286, 3, 2, 2, 2, 270, 271, 7,
	66, 2, 2, 271, 272, 5, 24, 13, 2, 272, 273, 7, 46, 2, 2, 273, 274, 5, 22,
	12, 2, 274, 275, 7, 67, 2, 2, 275, 276, 8, 12, 1, 2, 276, 286, 3, 2, 2,
	2, 277, 278, 5, 26, 14, 2, 278, 279, 8, 12, 1, 2, 279, 286, 3, 2, 2, 2,
	280, 281, 7, 62, 2, 2, 281, 282, 5, 20, 11, 2, 282, 283, 7, 63, 2, 2, 283,
	284, 8, 12, 1, 2, 284, 286, 3, 2, 2, 2, 285, 249, 3, 2, 2, 2, 285, 261,
	3, 2, 2, 2, 285, 265, 3, 2, 2, 2, 285, 270, 3, 2, 2, 2, 285, 277, 3, 2,
	2, 2, 285, 280, 3, 2, 2, 2, 286, 344, 3, 2, 2, 2, 287, 288, 12, 18, 2,
	2, 288, 289, 9, 4, 2, 2, 289, 290, 5, 22, 12, 19, 290, 291, 8, 12, 1, 2,
	291, 343, 3, 2, 2, 2, 292, 293, 12, 17, 2, 2, 293, 294, 9, 5, 2, 2, 294,
	295, 5, 22, 12, 18, 295, 296, 8, 12, 1, 2, 296, 343, 3, 2, 2, 2, 297, 298,
	12, 15, 2, 2, 298, 299, 9, 6, 2, 2, 299, 300, 5, 22, 12, 16, 300, 301,
	8, 12, 1, 2, 301, 343, 3, 2, 2, 2, 302, 303, 12, 14, 2, 2, 303, 304, 7,
	52, 2, 2, 304, 305, 5, 22, 12, 15, 305, 306, 8, 12, 1, 2, 306, 343, 3,
	2, 2, 2, 307, 308, 12, 13, 2, 2, 308, 309, 9, 7, 2, 2, 309, 310, 5, 22,
	12, 14, 310, 311, 8, 12, 1, 2, 311, 343, 3, 2, 2, 2, 312, 313, 12, 11,
	2, 2, 313, 314, 7, 45, 2, 2, 314, 315, 7, 22, 2, 2, 315, 316, 7, 62, 2,
	2, 316, 317, 7, 63, 2, 2, 317, 343, 8, 12, 1, 2, 318, 319, 12, 10, 2, 2,
	319, 320, 7, 45, 2, 2, 320, 321, 7, 23, 2, 2, 321, 322, 7, 62, 2, 2, 322,
	323, 7, 63, 2, 2, 323, 343, 8, 12, 1, 2, 324, 325, 12, 9, 2, 2, 325, 326,
	7, 45, 2, 2, 326, 327, 7, 24, 2, 2, 327, 328, 7, 62, 2, 2, 328, 329, 7,
	63, 2, 2, 329, 343, 8, 12, 1, 2, 330, 331, 12, 8, 2, 2, 331, 332, 7, 45,
	2, 2, 332, 333, 7, 25, 2, 2, 333, 334, 7, 62, 2, 2, 334, 335, 7, 63, 2,
	2, 335, 343, 8, 12, 1, 2, 336, 337, 12, 7, 2, 2, 337, 338, 7, 45, 2, 2,
	338, 339, 7, 35, 2, 2, 339, 340, 7, 62, 2, 2, 340, 341, 7, 63, 2, 2, 341,
	343, 8, 12, 1, 2, 342, 287, 3, 2, 2, 2, 342, 292, 3, 2, 2, 2, 342, 297,
	3, 2, 2, 2, 342, 302, 3, 2, 2, 2, 342, 307, 3, 2, 2, 2, 342, 312, 3, 2,
	2, 2, 342, 318, 3, 2, 2, 2, 342, 324, 3, 2, 2, 2, 342, 330, 3, 2, 2, 2,
	342, 336, 3, 2, 2, 2, 343, 346, 3, 2, 2, 2, 344, 342, 3, 2, 2, 2, 344,
	345, 3, 2, 2, 2, 345, 23, 3, 2, 2, 2, 346, 344, 3, 2, 2, 2, 347, 348, 8,
	13, 1, 2, 348, 349, 5, 20, 11, 2, 349, 350, 8, 13, 1, 2, 350, 358, 3, 2,
	2, 2, 351, 352, 12, 4, 2, 2, 352, 353, 7, 47, 2, 2, 353, 354, 5, 20, 11,
	2, 354, 355, 8, 13, 1, 2, 355, 357, 3, 2, 2, 2, 356, 351, 3, 2, 2, 2, 357,
	360, 3, 2, 2, 2, 358, 356, 3, 2, 2, 2, 358, 359, 3, 2, 2, 2, 359, 25, 3,
	2, 2, 2, 360, 358, 3, 2, 2, 2, 361, 362, 7, 41, 2, 2, 362, 389, 8, 14,
	1, 2, 363, 364, 7, 61, 2, 2, 364, 365, 7, 41, 2, 2, 365, 389, 8, 14, 1,
	2, 366, 367, 7, 61, 2, 2, 367, 368, 7, 42, 2, 2, 368, 389, 8, 14, 1, 2,
	369, 370, 7, 43, 2, 2, 370, 389, 8, 14, 1, 2, 371, 372, 7, 42, 2, 2, 372,
	389, 8, 14, 1, 2, 373, 374, 7, 42, 2, 2, 374, 375, 7, 17, 2, 2, 375, 376,
	7, 13, 2, 2, 376, 389, 8, 14, 1, 2, 377, 378, 7, 41, 2, 2, 378, 379, 7,
	17, 2, 2, 379, 380, 7, 14, 2, 2, 380, 389, 8, 14, 1, 2, 381, 382, 5, 28,
	15, 2, 382, 383, 8, 14, 1, 2, 383, 389, 3, 2, 2, 2, 384, 385, 7, 18, 2,
	2, 385, 389, 8, 14, 1, 2, 386, 387, 7, 19, 2, 2, 387, 389, 8, 14, 1, 2,
	388, 361, 3, 2, 2, 2, 388, 363, 3, 2, 2, 2, 388, 366, 3, 2, 2, 2, 388,
	369, 3, 2, 2, 2, 388, 371, 3, 2, 2, 2, 388, 373, 3, 2, 2, 2, 388, 377,
	3, 2, 2, 2, 388, 381, 3, 2, 2, 2, 388, 384, 3, 2, 2, 2, 388, 386, 3, 2,
	2, 2, 389, 27, 3, 2, 2, 2, 390, 391, 8, 15, 1, 2, 391, 392, 7, 44, 2, 2,
	392, 393, 8, 15, 1, 2, 393, 402, 3, 2, 2, 2, 394, 395, 12, 4, 2, 2, 395,
	396, 7, 66, 2, 2, 396, 397, 5, 20, 11, 2, 397, 398, 7, 67, 2, 2, 398, 399,
	8, 15, 1, 2, 399, 401, 3, 2, 2, 2, 400, 394, 3, 2, 2, 2, 401, 404, 3, 2,
	2, 2, 402, 400, 3, 2, 2, 2, 402, 403, 3, 2, 2, 2, 403, 29, 3, 2, 2, 2,
	404, 402, 3, 2, 2, 2, 15, 36, 201, 206, 227, 232, 238, 244, 285, 342, 344,
	358, 388, 402,
}
var deserializer = antlr.NewATNDeserializer(nil)
var deserializedATN = deserializer.DeserializeFromUInt16(parserATN)

var literalNames = []string{
	"", "'println'", "'print'", "'number'", "'string'", "'&str'", "'if'", "'else'",
	"'while'", "'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'",
	"'true'", "'false'", "'match'", "'loop'", "'abs'", "'sqrt'", "'to_string'",
	"'clone'", "'for'", "'in'", "'break'", "'continue'", "'vec'", "'push'",
	"'insert'", "'remove'", "'contains'", "'len'", "'capacity'", "'new'", "'with_capacity'",
	"'main'", "'fn'", "", "", "", "", "'.'", "';'", "','", "':'", "'!'", "'!='",
	"'='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'+'",
	"'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'||'", "'&&'",
}
var symbolicNames = []string{
	"", "PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_STRING2", "P_IF", "P_ELSE",
	"P_WHILE", "P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS",
	"P_TRUE", "P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING",
	"P_CLONE", "P_FOR", "P_IN", "P_BREAK", "P_CONTINUE", "P_VECTOR", "P_PUSH",
	"P_INSERT", "P_REMOVE", "P_CONTAINS", "P_LEN", "P_CAPACITY", "P_NEW", "P_WITHCAPACITY",
	"P_MAIN", "P_fn", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA",
	"COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA",
	"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD",
	"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER",
	"OR", "AND", "MULTICOMENT", "WHITESPACE",
}

var ruleNames = []string{
	"start", "instrucciones", "instruccion", "listaelseif", "else_if", "tipo",
	"mut", "vector_st", "array_st", "expression", "expr_arit", "listValues",
	"primitivo", "listArray",
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
	ChemsEOF            = antlr.TokenEOF
	ChemsPRINTLN        = 1
	ChemsPRINT          = 2
	ChemsP_NUMBER       = 3
	ChemsP_STRING       = 4
	ChemsP_STRING2      = 5
	ChemsP_IF           = 6
	ChemsP_ELSE         = 7
	ChemsP_WHILE        = 8
	ChemsP_POW          = 9
	ChemsP_POWF         = 10
	ChemsP_I64          = 11
	ChemsP_F64          = 12
	ChemsP_LET          = 13
	ChemsP_MUT          = 14
	ChemsP_AS           = 15
	ChemsP_TRUE         = 16
	ChemsP_FALSE        = 17
	ChemsP_MATCH        = 18
	ChemsP_LOOP         = 19
	ChemsP_ABS          = 20
	ChemsP_SQRT         = 21
	ChemsP_TOSTRING     = 22
	ChemsP_CLONE        = 23
	ChemsP_FOR          = 24
	ChemsP_IN           = 25
	ChemsP_BREAK        = 26
	ChemsP_CONTINUE     = 27
	ChemsP_VECTOR       = 28
	ChemsP_PUSH         = 29
	ChemsP_INSERT       = 30
	ChemsP_REMOVE       = 31
	ChemsP_CONTAINS     = 32
	ChemsP_LEN          = 33
	ChemsP_CAPACITY     = 34
	ChemsP_NEW          = 35
	ChemsP_WITHCAPACITY = 36
	ChemsP_MAIN         = 37
	ChemsP_fn           = 38
	ChemsNUMBER         = 39
	ChemsDECIMAL        = 40
	ChemsSTRING         = 41
	ChemsID             = 42
	ChemsPUNTO          = 43
	ChemsPTCOMA         = 44
	ChemsCOMA           = 45
	ChemsDOSPUNTOS      = 46
	ChemsDIFERENTE      = 47
	ChemsDIFERENTEDE    = 48
	ChemsIGUAL          = 49
	ChemsIGUALIGUA      = 50
	ChemsMAYORIGUAL     = 51
	ChemsMENORIGUAL     = 52
	ChemsMAYOR          = 53
	ChemsMENOR          = 54
	ChemsMUL            = 55
	ChemsDIV            = 56
	ChemsMODULO         = 57
	ChemsADD            = 58
	ChemsSUB            = 59
	ChemsPARIZQ         = 60
	ChemsPARDER         = 61
	ChemsLLAVEIZQ       = 62
	ChemsLLAVEDER       = 63
	ChemsCORIZQ         = 64
	ChemsCORDER         = 65
	ChemsOR             = 66
	ChemsAND            = 67
	ChemsMULTICOMENT    = 68
	ChemsWHITESPACE     = 69
)

// Chems rules.
const (
	ChemsRULE_start         = 0
	ChemsRULE_instrucciones = 1
	ChemsRULE_instruccion   = 2
	ChemsRULE_listaelseif   = 3
	ChemsRULE_else_if       = 4
	ChemsRULE_tipo          = 5
	ChemsRULE_mut           = 6
	ChemsRULE_vector_st     = 7
	ChemsRULE_array_st      = 8
	ChemsRULE_expression    = 9
	ChemsRULE_expr_arit     = 10
	ChemsRULE_listValues    = 11
	ChemsRULE_primitivo     = 12
	ChemsRULE_listArray     = 13
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
		p.SetState(28)

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
	p.SetState(34)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<ChemsPRINTLN)|(1<<ChemsPRINT)|(1<<ChemsP_IF)|(1<<ChemsP_WHILE)|(1<<ChemsP_I64)|(1<<ChemsP_F64)|(1<<ChemsP_LET)|(1<<ChemsP_TRUE)|(1<<ChemsP_FALSE)|(1<<ChemsP_LOOP)|(1<<ChemsP_FOR)|(1<<ChemsP_BREAK)|(1<<ChemsP_CONTINUE))) != 0) || (((_la-39)&-(0x1f+1)) == 0 && ((1<<uint((_la-39)))&((1<<(ChemsNUMBER-39))|(1<<(ChemsDECIMAL-39))|(1<<(ChemsSTRING-39))|(1<<(ChemsID-39))|(1<<(ChemsDIFERENTE-39))|(1<<(ChemsSUB-39))|(1<<(ChemsPARIZQ-39))|(1<<(ChemsCORIZQ-39)))) != 0) {
		{
			p.SetState(31)

			var _x = p.Instruccion()

			localctx.(*InstruccionesContext)._instruccion = _x
		}
		localctx.(*InstruccionesContext).e = append(localctx.(*InstruccionesContext).e, localctx.(*InstruccionesContext)._instruccion)

		p.SetState(36)
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

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_P_BREAK returns the _P_BREAK token.
	Get_P_BREAK() antlr.Token

	// Get_P_CONTINUE returns the _P_CONTINUE token.
	Get_P_CONTINUE() antlr.Token

	// SetId sets the id token.
	SetId(antlr.Token)

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_P_BREAK sets the _P_BREAK token.
	Set_P_BREAK(antlr.Token)

	// Set_P_CONTINUE sets the _P_CONTINUE token.
	Set_P_CONTINUE(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// GetMuteable returns the muteable rule contexts.
	GetMuteable() IMutContext

	// GetIsArray returns the isArray rule contexts.
	GetIsArray() IArray_stContext

	// GetIsTipo returns the isTipo rule contexts.
	GetIsTipo() ITipoContext

	// GetIsvector returns the isvector rule contexts.
	GetIsvector() IVector_stContext

	// GetEx1 returns the ex1 rule contexts.
	GetEx1() IExpressionContext

	// Get_instrucciones returns the _instrucciones rule contexts.
	Get_instrucciones() IInstruccionesContext

	// GetI1 returns the i1 rule contexts.
	GetI1() IInstruccionesContext

	// GetI2 returns the i2 rule contexts.
	GetI2() IInstruccionesContext

	// GetD2 returns the d2 rule contexts.
	GetD2() IListaelseifContext

	// GetF2 returns the f2 rule contexts.
	GetF2() IExpressionContext

	// GetId1 returns the id1 rule contexts.
	GetId1() IExpressionContext

	// GetGola returns the gola rule contexts.
	GetGola() IExpressionContext

	// GetPos returns the pos rule contexts.
	GetPos() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// SetMuteable sets the muteable rule contexts.
	SetMuteable(IMutContext)

	// SetIsArray sets the isArray rule contexts.
	SetIsArray(IArray_stContext)

	// SetIsTipo sets the isTipo rule contexts.
	SetIsTipo(ITipoContext)

	// SetIsvector sets the isvector rule contexts.
	SetIsvector(IVector_stContext)

	// SetEx1 sets the ex1 rule contexts.
	SetEx1(IExpressionContext)

	// Set_instrucciones sets the _instrucciones rule contexts.
	Set_instrucciones(IInstruccionesContext)

	// SetI1 sets the i1 rule contexts.
	SetI1(IInstruccionesContext)

	// SetI2 sets the i2 rule contexts.
	SetI2(IInstruccionesContext)

	// SetD2 sets the d2 rule contexts.
	SetD2(IListaelseifContext)

	// SetF2 sets the f2 rule contexts.
	SetF2(IExpressionContext)

	// SetId1 sets the id1 rule contexts.
	SetId1(IExpressionContext)

	// SetGola sets the gola rule contexts.
	SetGola(IExpressionContext)

	// SetPos sets the pos rule contexts.
	SetPos(IExpressionContext)

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
	isvector       IVector_stContext
	_NUMBER        antlr.Token
	ex1            IExpressionContext
	_instrucciones IInstruccionesContext
	i1             IInstruccionesContext
	i2             IInstruccionesContext
	d2             IListaelseifContext
	f2             IExpressionContext
	_P_BREAK       antlr.Token
	_P_CONTINUE    antlr.Token
	id1            IExpressionContext
	gola           IExpressionContext
	pos            IExpressionContext
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

func (s *InstruccionContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *InstruccionContext) Get_P_BREAK() antlr.Token { return s._P_BREAK }

func (s *InstruccionContext) Get_P_CONTINUE() antlr.Token { return s._P_CONTINUE }

func (s *InstruccionContext) SetId(v antlr.Token) { s.id = v }

func (s *InstruccionContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *InstruccionContext) Set_P_BREAK(v antlr.Token) { s._P_BREAK = v }

func (s *InstruccionContext) Set_P_CONTINUE(v antlr.Token) { s._P_CONTINUE = v }

func (s *InstruccionContext) Get_expression() IExpressionContext { return s._expression }

func (s *InstruccionContext) GetMuteable() IMutContext { return s.muteable }

func (s *InstruccionContext) GetIsArray() IArray_stContext { return s.isArray }

func (s *InstruccionContext) GetIsTipo() ITipoContext { return s.isTipo }

func (s *InstruccionContext) GetIsvector() IVector_stContext { return s.isvector }

func (s *InstruccionContext) GetEx1() IExpressionContext { return s.ex1 }

func (s *InstruccionContext) Get_instrucciones() IInstruccionesContext { return s._instrucciones }

func (s *InstruccionContext) GetI1() IInstruccionesContext { return s.i1 }

func (s *InstruccionContext) GetI2() IInstruccionesContext { return s.i2 }

func (s *InstruccionContext) GetD2() IListaelseifContext { return s.d2 }

func (s *InstruccionContext) GetF2() IExpressionContext { return s.f2 }

func (s *InstruccionContext) GetId1() IExpressionContext { return s.id1 }

func (s *InstruccionContext) GetGola() IExpressionContext { return s.gola }

func (s *InstruccionContext) GetPos() IExpressionContext { return s.pos }

func (s *InstruccionContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *InstruccionContext) SetMuteable(v IMutContext) { s.muteable = v }

func (s *InstruccionContext) SetIsArray(v IArray_stContext) { s.isArray = v }

func (s *InstruccionContext) SetIsTipo(v ITipoContext) { s.isTipo = v }

func (s *InstruccionContext) SetIsvector(v IVector_stContext) { s.isvector = v }

func (s *InstruccionContext) SetEx1(v IExpressionContext) { s.ex1 = v }

func (s *InstruccionContext) Set_instrucciones(v IInstruccionesContext) { s._instrucciones = v }

func (s *InstruccionContext) SetI1(v IInstruccionesContext) { s.i1 = v }

func (s *InstruccionContext) SetI2(v IInstruccionesContext) { s.i2 = v }

func (s *InstruccionContext) SetD2(v IListaelseifContext) { s.d2 = v }

func (s *InstruccionContext) SetF2(v IExpressionContext) { s.f2 = v }

func (s *InstruccionContext) SetId1(v IExpressionContext) { s.id1 = v }

func (s *InstruccionContext) SetGola(v IExpressionContext) { s.gola = v }

func (s *InstruccionContext) SetPos(v IExpressionContext) { s.pos = v }

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

func (s *InstruccionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *InstruccionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *InstruccionContext) PARDER() antlr.TerminalNode {
	return s.GetToken(ChemsPARDER, 0)
}

func (s *InstruccionContext) AllPTCOMA() []antlr.TerminalNode {
	return s.GetTokens(ChemsPTCOMA)
}

func (s *InstruccionContext) PTCOMA(i int) antlr.TerminalNode {
	return s.GetToken(ChemsPTCOMA, i)
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

func (s *InstruccionContext) Vector_st() IVector_stContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVector_stContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVector_stContext)
}

func (s *InstruccionContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(ChemsCORIZQ, 0)
}

func (s *InstruccionContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(ChemsNUMBER, 0)
}

func (s *InstruccionContext) CORDER() antlr.TerminalNode {
	return s.GetToken(ChemsCORDER, 0)
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

func (s *InstruccionContext) Listaelseif() IListaelseifContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaelseifContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaelseifContext)
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

func (s *InstruccionContext) P_BREAK() antlr.TerminalNode {
	return s.GetToken(ChemsP_BREAK, 0)
}

func (s *InstruccionContext) P_CONTINUE() antlr.TerminalNode {
	return s.GetToken(ChemsP_CONTINUE, 0)
}

func (s *InstruccionContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(ChemsPUNTO, 0)
}

func (s *InstruccionContext) P_PUSH() antlr.TerminalNode {
	return s.GetToken(ChemsP_PUSH, 0)
}

func (s *InstruccionContext) P_INSERT() antlr.TerminalNode {
	return s.GetToken(ChemsP_INSERT, 0)
}

func (s *InstruccionContext) COMA() antlr.TerminalNode {
	return s.GetToken(ChemsCOMA, 0)
}

func (s *InstruccionContext) P_REMOVE() antlr.TerminalNode {
	return s.GetToken(ChemsP_REMOVE, 0)
}

func (s *InstruccionContext) P_LEN() antlr.TerminalNode {
	return s.GetToken(ChemsP_LEN, 0)
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

	p.SetState(199)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 1, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(39)
			p.Match(ChemsPRINTLN)
		}
		{
			p.SetState(40)
			p.Match(ChemsDIFERENTE)
		}
		{
			p.SetState(41)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(42)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(43)
			p.Match(ChemsPARDER)
		}
		{
			p.SetState(44)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewImprimir(localctx.(*InstruccionContext).Get_expression().GetP(), false)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(47)
			p.Match(ChemsPRINT)
		}
		{
			p.SetState(48)
			p.Match(ChemsDIFERENTE)
		}
		{
			p.SetState(49)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(50)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(51)
			p.Match(ChemsPARDER)
		}
		{
			p.SetState(52)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewImprimir(localctx.(*InstruccionContext).Get_expression().GetP(), true)

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(55)
			p.Match(ChemsP_LET)
		}
		{
			p.SetState(56)

			var _x = p.Mut()

			localctx.(*InstruccionContext).muteable = _x
		}
		{
			p.SetState(57)

			var _x = p.Array_st()

			localctx.(*InstruccionContext).isArray = _x
		}
		{
			p.SetState(58)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(59)
			p.Match(ChemsDOSPUNTOS)
		}
		{
			p.SetState(60)

			var _x = p.Tipo()

			localctx.(*InstruccionContext).isTipo = _x
		}
		{
			p.SetState(61)
			p.Match(ChemsIGUAL)
		}
		{
			p.SetState(62)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(63)
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
		}()).GetColumn(), 0, false)

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(66)
			p.Match(ChemsP_LET)
		}
		{
			p.SetState(67)

			var _x = p.Mut()

			localctx.(*InstruccionContext).muteable = _x
		}
		{
			p.SetState(68)

			var _x = p.Array_st()

			localctx.(*InstruccionContext).isArray = _x
		}
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
		}()).GetColumn(), 0, false)

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(75)
			p.Match(ChemsP_LET)
		}
		{
			p.SetState(76)

			var _x = p.Mut()

			localctx.(*InstruccionContext).muteable = _x
		}
		{
			p.SetState(77)

			var _x = p.Array_st()

			localctx.(*InstruccionContext).isArray = _x
		}
		{
			p.SetState(78)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(79)
			p.Match(ChemsIGUAL)
		}
		{
			p.SetState(80)

			var _x = p.Vector_st()

			localctx.(*InstruccionContext).isvector = _x
		}
		{
			p.SetState(81)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(82)
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
		}()).GetColumn(), 0, localctx.(*InstruccionContext).GetIsvector().GetArr())

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(85)
			p.Match(ChemsP_LET)
		}
		{
			p.SetState(86)

			var _x = p.Mut()

			localctx.(*InstruccionContext).muteable = _x
		}
		{
			p.SetState(87)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(88)
			p.Match(ChemsDOSPUNTOS)
		}
		{
			p.SetState(89)
			p.Match(ChemsCORIZQ)
		}
		{
			p.SetState(90)

			var _x = p.Tipo()

			localctx.(*InstruccionContext).isTipo = _x
		}
		{
			p.SetState(91)
			p.Match(ChemsPTCOMA)
		}
		{
			p.SetState(92)

			var _m = p.Match(ChemsNUMBER)

			localctx.(*InstruccionContext)._NUMBER = _m
		}
		{
			p.SetState(93)
			p.Match(ChemsCORDER)
		}
		{
			p.SetState(94)
			p.Match(ChemsIGUAL)
		}
		{
			p.SetState(95)

			var _x = p.Expression()

			localctx.(*InstruccionContext).ex1 = _x
		}
		{
			p.SetState(96)
			p.Match(ChemsPTCOMA)
		}

		num, err := strconv.Atoi((func() string {
			if localctx.(*InstruccionContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*InstruccionContext).Get_NUMBER().GetText()
			}
		}()))
		if err != nil {
			fmt.Println(err)
		}
		localctx.(*InstruccionContext).instr = instruction.NewDeclaration((func() string {
			if localctx.(*InstruccionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*InstruccionContext).GetId().GetText()
			}
		}()), localctx.(*InstruccionContext).GetIsTipo().GetP(), localctx.(*InstruccionContext).GetEx1().GetP(), true, localctx.(*InstruccionContext).GetMuteable().GetArr(), (func() antlr.Token {
			if localctx.(*InstruccionContext).GetEx1() == nil {
				return nil
			} else {
				return localctx.(*InstruccionContext).GetEx1().GetStart()
			}
		}()).GetLine(), (func() antlr.Token {
			if localctx.(*InstruccionContext).GetEx1() == nil {
				return nil
			} else {
				return localctx.(*InstruccionContext).GetEx1().GetStart()
			}
		}()).GetColumn(), num, false)

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(99)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(100)
			p.Match(ChemsIGUAL)
		}
		{
			p.SetState(101)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(102)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewAssignment((func() string {
			if localctx.(*InstruccionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*InstruccionContext).GetId().GetText()
			}
		}()), localctx.(*InstruccionContext).Get_expression().GetP())

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(105)
			p.Match(ChemsP_IF)
		}
		{
			p.SetState(106)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(107)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(108)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext)._instrucciones = _x
		}
		{
			p.SetState(109)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewIf(localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).Get_instrucciones().GetL(), nil, nil)

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(112)
			p.Match(ChemsP_IF)
		}
		{
			p.SetState(113)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(114)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(115)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext).i1 = _x
		}
		{
			p.SetState(116)
			p.Match(ChemsLLAVEDER)
		}
		{
			p.SetState(117)
			p.Match(ChemsP_ELSE)
		}
		{
			p.SetState(118)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(119)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext).i2 = _x
		}
		{
			p.SetState(120)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewIf(localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).GetI1().GetL(), nil, localctx.(*InstruccionContext).GetI2().GetL())

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(123)
			p.Match(ChemsP_IF)
		}
		{
			p.SetState(124)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(125)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(126)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext).i1 = _x
		}
		{
			p.SetState(127)
			p.Match(ChemsLLAVEDER)
		}
		{
			p.SetState(128)

			var _x = p.Listaelseif()

			localctx.(*InstruccionContext).d2 = _x
		}
		{
			p.SetState(129)
			p.Match(ChemsP_ELSE)
		}
		{
			p.SetState(130)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(131)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext).i2 = _x
		}
		{
			p.SetState(132)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewIf(localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).GetI1().GetL(), localctx.(*InstruccionContext).GetD2().GetLista(), localctx.(*InstruccionContext).GetI2().GetL())

	case 11:
		p.EnterOuterAlt(localctx, 11)
		{
			p.SetState(135)
			p.Match(ChemsP_WHILE)
		}
		{
			p.SetState(136)

			var _x = p.Expression()

			localctx.(*InstruccionContext)._expression = _x
		}
		{
			p.SetState(137)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(138)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext)._instrucciones = _x
		}
		{
			p.SetState(139)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewWhile(localctx.(*InstruccionContext).Get_expression().GetP(), localctx.(*InstruccionContext).Get_instrucciones().GetL())

	case 12:
		p.EnterOuterAlt(localctx, 12)
		{
			p.SetState(142)
			p.Match(ChemsP_LOOP)
		}
		{
			p.SetState(143)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(144)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext)._instrucciones = _x
		}
		{
			p.SetState(145)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewLoop(localctx.(*InstruccionContext).Get_instrucciones().GetL())

	case 13:
		p.EnterOuterAlt(localctx, 13)
		{
			p.SetState(148)
			p.Match(ChemsP_FOR)
		}
		{
			p.SetState(149)

			var _m = p.Match(ChemsID)

			localctx.(*InstruccionContext).id = _m
		}
		{
			p.SetState(150)
			p.Match(ChemsP_IN)
		}
		{
			p.SetState(151)

			var _x = p.Expression()

			localctx.(*InstruccionContext).f2 = _x
		}
		{
			p.SetState(152)
			p.Match(ChemsLLAVEIZQ)
		}
		{
			p.SetState(153)

			var _x = p.Instrucciones()

			localctx.(*InstruccionContext)._instrucciones = _x
		}
		{
			p.SetState(154)
			p.Match(ChemsLLAVEDER)
		}
		localctx.(*InstruccionContext).instr = instruction.NewForin((func() string {
			if localctx.(*InstruccionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*InstruccionContext).GetId().GetText()
			}
		}()), localctx.(*InstruccionContext).GetF2().GetP(), localctx.(*InstruccionContext).Get_instrucciones().GetL())

	case 14:
		p.EnterOuterAlt(localctx, 14)
		{
			p.SetState(157)

			var _m = p.Match(ChemsP_BREAK)

			localctx.(*InstruccionContext)._P_BREAK = _m
		}
		{
			p.SetState(158)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewBreak(interfaces.BREAK, (func() int {
			if localctx.(*InstruccionContext).Get_P_BREAK() == nil {
				return 0
			} else {
				return localctx.(*InstruccionContext).Get_P_BREAK().GetLine()
			}
		}()), (func() int {
			if localctx.(*InstruccionContext).Get_P_BREAK() == nil {
				return 0
			} else {
				return localctx.(*InstruccionContext).Get_P_BREAK().GetColumn()
			}
		}()))

	case 15:
		p.EnterOuterAlt(localctx, 15)
		{
			p.SetState(160)

			var _m = p.Match(ChemsP_CONTINUE)

			localctx.(*InstruccionContext)._P_CONTINUE = _m
		}
		{
			p.SetState(161)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = instruction.NewContinue(interfaces.CONTINUE, (func() int {
			if localctx.(*InstruccionContext).Get_P_CONTINUE() == nil {
				return 0
			} else {
				return localctx.(*InstruccionContext).Get_P_CONTINUE().GetLine()
			}
		}()), (func() int {
			if localctx.(*InstruccionContext).Get_P_CONTINUE() == nil {
				return 0
			} else {
				return localctx.(*InstruccionContext).Get_P_CONTINUE().GetColumn()
			}
		}()))

	case 16:
		p.EnterOuterAlt(localctx, 16)
		{
			p.SetState(163)

			var _x = p.Expression()

			localctx.(*InstruccionContext).id1 = _x
		}
		{
			p.SetState(164)
			p.Match(ChemsPUNTO)
		}
		{
			p.SetState(165)
			p.Match(ChemsP_PUSH)
		}
		{
			p.SetState(166)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(167)

			var _x = p.Expression()

			localctx.(*InstruccionContext).gola = _x
		}
		{
			p.SetState(168)
			p.Match(ChemsPARDER)
		}
		{
			p.SetState(169)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = expresion.NewVectorNative(localctx.(*InstruccionContext).GetId1().GetP(), interfaces.PUSH, localctx.(*InstruccionContext).GetGola().GetP(), nil)

	case 17:
		p.EnterOuterAlt(localctx, 17)
		{
			p.SetState(172)

			var _x = p.Expression()

			localctx.(*InstruccionContext).id1 = _x
		}
		{
			p.SetState(173)
			p.Match(ChemsPUNTO)
		}
		{
			p.SetState(174)
			p.Match(ChemsP_INSERT)
		}
		{
			p.SetState(175)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(176)

			var _x = p.Expression()

			localctx.(*InstruccionContext).pos = _x
		}
		{
			p.SetState(177)
			p.Match(ChemsCOMA)
		}
		{
			p.SetState(178)

			var _x = p.Expression()

			localctx.(*InstruccionContext).gola = _x
		}
		{
			p.SetState(179)
			p.Match(ChemsPARDER)
		}
		{
			p.SetState(180)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = expresion.NewVectorNative(localctx.(*InstruccionContext).GetId1().GetP(), interfaces.INSERT, localctx.(*InstruccionContext).GetGola().GetP(), localctx.(*InstruccionContext).GetPos().GetP())

	case 18:
		p.EnterOuterAlt(localctx, 18)
		{
			p.SetState(183)

			var _x = p.Expression()

			localctx.(*InstruccionContext).id1 = _x
		}
		{
			p.SetState(184)
			p.Match(ChemsPUNTO)
		}
		{
			p.SetState(185)
			p.Match(ChemsP_REMOVE)
		}
		{
			p.SetState(186)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(187)

			var _x = p.Expression()

			localctx.(*InstruccionContext).pos = _x
		}
		{
			p.SetState(188)
			p.Match(ChemsPARDER)
		}
		{
			p.SetState(189)
			p.Match(ChemsPTCOMA)
		}
		localctx.(*InstruccionContext).instr = expresion.NewVectorNative(localctx.(*InstruccionContext).GetId1().GetP(), interfaces.REMOVE, nil, localctx.(*InstruccionContext).GetPos().GetP())

	case 19:
		p.EnterOuterAlt(localctx, 19)
		{
			p.SetState(192)

			var _x = p.Expression()

			localctx.(*InstruccionContext).id1 = _x
		}
		{
			p.SetState(193)
			p.Match(ChemsPUNTO)
		}
		{
			p.SetState(194)
			p.Match(ChemsP_LEN)
		}
		{
			p.SetState(195)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(196)
			p.Match(ChemsPARDER)
		}
		localctx.(*InstruccionContext).instr = expresion.NewVectorNative(localctx.(*InstruccionContext).GetId1().GetP(), interfaces.LEN, nil, nil)

	}

	return localctx
}

// IListaelseifContext is an interface to support dynamic dispatch.
type IListaelseifContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_else_if returns the _else_if rule contexts.
	Get_else_if() IElse_ifContext

	// Set_else_if sets the _else_if rule contexts.
	Set_else_if(IElse_ifContext)

	// GetList returns the list rule context list.
	GetList() []IElse_ifContext

	// SetList sets the list rule context list.
	SetList([]IElse_ifContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListaelseifContext differentiates from other interfaces.
	IsListaelseifContext()
}

type ListaelseifContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	lista    *arrayList.List
	_else_if IElse_ifContext
	list     []IElse_ifContext
}

func NewEmptyListaelseifContext() *ListaelseifContext {
	var p = new(ListaelseifContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_listaelseif
	return p
}

func (*ListaelseifContext) IsListaelseifContext() {}

func NewListaelseifContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListaelseifContext {
	var p = new(ListaelseifContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_listaelseif

	return p
}

func (s *ListaelseifContext) GetParser() antlr.Parser { return s.parser }

func (s *ListaelseifContext) Get_else_if() IElse_ifContext { return s._else_if }

func (s *ListaelseifContext) Set_else_if(v IElse_ifContext) { s._else_if = v }

func (s *ListaelseifContext) GetList() []IElse_ifContext { return s.list }

func (s *ListaelseifContext) SetList(v []IElse_ifContext) { s.list = v }

func (s *ListaelseifContext) GetLista() *arrayList.List { return s.lista }

func (s *ListaelseifContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ListaelseifContext) AllElse_if() []IElse_ifContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IElse_ifContext)(nil)).Elem())
	var tst = make([]IElse_ifContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IElse_ifContext)
		}
	}

	return tst
}

func (s *ListaelseifContext) Else_if(i int) IElse_ifContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IElse_ifContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IElse_ifContext)
}

func (s *ListaelseifContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListaelseifContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListaelseifContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterListaelseif(s)
	}
}

func (s *ListaelseifContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitListaelseif(s)
	}
}

func (p *Chems) Listaelseif() (localctx IListaelseifContext) {
	localctx = NewListaelseifContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, ChemsRULE_listaelseif)
	localctx.(*ListaelseifContext).lista = arrayList.New()

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

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(204)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			{
				p.SetState(201)

				var _x = p.Else_if()

				localctx.(*ListaelseifContext)._else_if = _x
			}
			localctx.(*ListaelseifContext).list = append(localctx.(*ListaelseifContext).list, localctx.(*ListaelseifContext)._else_if)

		}
		p.SetState(206)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext())
	}

	listInt := localctx.(*ListaelseifContext).GetList()
	for _, e := range listInt {
		localctx.(*ListaelseifContext).lista.Add(e.GetInstr())
	}

	return localctx
}

// IElse_ifContext is an interface to support dynamic dispatch.
type IElse_ifContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_instrucciones returns the _instrucciones rule contexts.
	Get_instrucciones() IInstruccionesContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_instrucciones sets the _instrucciones rule contexts.
	Set_instrucciones(IInstruccionesContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsElse_ifContext differentiates from other interfaces.
	IsElse_ifContext()
}

type Else_ifContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	instr          interfaces.Instruction
	_expression    IExpressionContext
	_instrucciones IInstruccionesContext
}

func NewEmptyElse_ifContext() *Else_ifContext {
	var p = new(Else_ifContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_else_if
	return p
}

func (*Else_ifContext) IsElse_ifContext() {}

func NewElse_ifContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Else_ifContext {
	var p = new(Else_ifContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_else_if

	return p
}

func (s *Else_ifContext) GetParser() antlr.Parser { return s.parser }

func (s *Else_ifContext) Get_expression() IExpressionContext { return s._expression }

func (s *Else_ifContext) Get_instrucciones() IInstruccionesContext { return s._instrucciones }

func (s *Else_ifContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Else_ifContext) Set_instrucciones(v IInstruccionesContext) { s._instrucciones = v }

func (s *Else_ifContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *Else_ifContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *Else_ifContext) P_ELSE() antlr.TerminalNode {
	return s.GetToken(ChemsP_ELSE, 0)
}

func (s *Else_ifContext) P_IF() antlr.TerminalNode {
	return s.GetToken(ChemsP_IF, 0)
}

func (s *Else_ifContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Else_ifContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(ChemsLLAVEIZQ, 0)
}

func (s *Else_ifContext) Instrucciones() IInstruccionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccionesContext)
}

func (s *Else_ifContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(ChemsLLAVEDER, 0)
}

func (s *Else_ifContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Else_ifContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Else_ifContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterElse_if(s)
	}
}

func (s *Else_ifContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitElse_if(s)
	}
}

func (p *Chems) Else_if() (localctx IElse_ifContext) {
	localctx = NewElse_ifContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, ChemsRULE_else_if)

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
		p.SetState(209)
		p.Match(ChemsP_ELSE)
	}
	{
		p.SetState(210)
		p.Match(ChemsP_IF)
	}
	{
		p.SetState(211)

		var _x = p.Expression()

		localctx.(*Else_ifContext)._expression = _x
	}
	{
		p.SetState(212)
		p.Match(ChemsLLAVEIZQ)
	}
	{
		p.SetState(213)

		var _x = p.Instrucciones()

		localctx.(*Else_ifContext)._instrucciones = _x
	}
	{
		p.SetState(214)
		p.Match(ChemsLLAVEDER)
	}
	localctx.(*Else_ifContext).instr = instruction.NewIf(localctx.(*Else_ifContext).Get_expression().GetP(), localctx.(*Else_ifContext).Get_instrucciones().GetL(), nil, nil)

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

func (s *TipoContext) P_STRING2() antlr.TerminalNode {
	return s.GetToken(ChemsP_STRING2, 0)
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
	p.EnterRule(localctx, 10, ChemsRULE_tipo)

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

	p.SetState(225)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ChemsP_F64:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(217)
			p.Match(ChemsP_F64)
		}
		localctx.(*TipoContext).p = interfaces.FLOAT

	case ChemsP_I64:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(219)
			p.Match(ChemsP_I64)
		}
		localctx.(*TipoContext).p = interfaces.INTEGER

	case ChemsP_STRING:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(221)
			p.Match(ChemsP_STRING)
		}
		localctx.(*TipoContext).p = interfaces.STRING

	case ChemsP_STRING2:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(223)
			p.Match(ChemsP_STRING2)
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
	p.EnterRule(localctx, 12, ChemsRULE_mut)

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

	p.SetState(230)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ChemsP_MUT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(227)
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

// IVector_stContext is an interface to support dynamic dispatch.
type IVector_stContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetArr returns the arr attribute.
	GetArr() bool

	// SetArr sets the arr attribute.
	SetArr(bool)

	// IsVector_stContext differentiates from other interfaces.
	IsVector_stContext()
}

type Vector_stContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	arr    bool
}

func NewEmptyVector_stContext() *Vector_stContext {
	var p = new(Vector_stContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ChemsRULE_vector_st
	return p
}

func (*Vector_stContext) IsVector_stContext() {}

func NewVector_stContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Vector_stContext {
	var p = new(Vector_stContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ChemsRULE_vector_st

	return p
}

func (s *Vector_stContext) GetParser() antlr.Parser { return s.parser }

func (s *Vector_stContext) GetArr() bool { return s.arr }

func (s *Vector_stContext) SetArr(v bool) { s.arr = v }

func (s *Vector_stContext) P_VECTOR() antlr.TerminalNode {
	return s.GetToken(ChemsP_VECTOR, 0)
}

func (s *Vector_stContext) DIFERENTE() antlr.TerminalNode {
	return s.GetToken(ChemsDIFERENTE, 0)
}

func (s *Vector_stContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Vector_stContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Vector_stContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.EnterVector_st(s)
	}
}

func (s *Vector_stContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ChemsListener); ok {
		listenerT.ExitVector_st(s)
	}
}

func (p *Chems) Vector_st() (localctx IVector_stContext) {
	localctx = NewVector_stContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, ChemsRULE_vector_st)

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

	p.SetState(236)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ChemsP_VECTOR:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(232)
			p.Match(ChemsP_VECTOR)
		}
		{
			p.SetState(233)
			p.Match(ChemsDIFERENTE)
		}
		localctx.(*Vector_stContext).arr = true

	case ChemsP_I64, ChemsP_F64, ChemsP_TRUE, ChemsP_FALSE, ChemsNUMBER, ChemsDECIMAL, ChemsSTRING, ChemsID, ChemsDIFERENTE, ChemsSUB, ChemsPARIZQ, ChemsCORIZQ:
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
	p.EnterRule(localctx, 16, ChemsRULE_array_st)

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

	p.SetState(242)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ChemsCORIZQ:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(238)
			p.Match(ChemsCORIZQ)
		}
		{
			p.SetState(239)
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
	p.EnterRule(localctx, 18, ChemsRULE_expression)

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
		p.SetState(244)

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

	// Get_expr_arit returns the _expr_arit rule contexts.
	Get_expr_arit() IExpr_aritContext

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

	// Set_expr_arit sets the _expr_arit rule contexts.
	Set_expr_arit(IExpr_aritContext)

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
	_expr_arit  IExpr_aritContext
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

func (s *Expr_aritContext) Get_expr_arit() IExpr_aritContext { return s._expr_arit }

func (s *Expr_aritContext) GetOpDe() IExpr_aritContext { return s.opDe }

func (s *Expr_aritContext) Get_listValues() IListValuesContext { return s._listValues }

func (s *Expr_aritContext) Get_primitivo() IPrimitivoContext { return s._primitivo }

func (s *Expr_aritContext) Get_expression() IExpressionContext { return s._expression }

func (s *Expr_aritContext) SetOpIz(v IExpr_aritContext) { s.opIz = v }

func (s *Expr_aritContext) Set_expr_arit(v IExpr_aritContext) { s._expr_arit = v }

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

func (s *Expr_aritContext) PTCOMA() antlr.TerminalNode {
	return s.GetToken(ChemsPTCOMA, 0)
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

func (s *Expr_aritContext) P_LEN() antlr.TerminalNode {
	return s.GetToken(ChemsP_LEN, 0)
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
	_startState := 20
	p.EnterRecursionRule(localctx, 20, ChemsRULE_expr_arit, _p)
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
	p.SetState(283)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext()) {
	case 1:
		{
			p.SetState(248)

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
			p.SetState(249)
			p.Match(ChemsDOSPUNTOS)
		}
		{
			p.SetState(250)
			p.Match(ChemsDOSPUNTOS)
		}
		{
			p.SetState(251)

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
			p.SetState(252)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(253)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opIz = _x
			localctx.(*Expr_aritContext)._expr_arit = _x
		}
		{
			p.SetState(254)
			p.Match(ChemsCOMA)
		}
		{
			p.SetState(255)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opDe = _x
			localctx.(*Expr_aritContext)._expr_arit = _x
		}
		{
			p.SetState(256)
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

	case 2:
		{
			p.SetState(259)

			var _m = p.Match(ChemsDIFERENTE)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(260)

			var _x = p.expr_arit(10)

			localctx.(*Expr_aritContext).opDe = _x
			localctx.(*Expr_aritContext)._expr_arit = _x
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

	case 3:
		{
			p.SetState(263)
			p.Match(ChemsCORIZQ)
		}
		{
			p.SetState(264)

			var _x = p.listValues(0)

			localctx.(*Expr_aritContext)._listValues = _x
		}
		{
			p.SetState(265)
			p.Match(ChemsCORDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewArray(localctx.(*Expr_aritContext).Get_listValues().GetL(), nil)

	case 4:
		{
			p.SetState(268)
			p.Match(ChemsCORIZQ)
		}
		{
			p.SetState(269)

			var _x = p.listValues(0)

			localctx.(*Expr_aritContext)._listValues = _x
		}
		{
			p.SetState(270)
			p.Match(ChemsPTCOMA)
		}
		{
			p.SetState(271)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext)._expr_arit = _x
		}
		{
			p.SetState(272)
			p.Match(ChemsCORDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewArray(localctx.(*Expr_aritContext).Get_listValues().GetL(), localctx.(*Expr_aritContext).Get_expr_arit().GetP())

	case 5:
		{
			p.SetState(275)

			var _x = p.Primitivo()

			localctx.(*Expr_aritContext)._primitivo = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_primitivo().GetP()

	case 6:
		{
			p.SetState(278)
			p.Match(ChemsPARIZQ)
		}
		{
			p.SetState(279)

			var _x = p.Expression()

			localctx.(*Expr_aritContext)._expression = _x
		}
		{
			p.SetState(280)
			p.Match(ChemsPARDER)
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_expression().GetP()

	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(342)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 9, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(340)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 8, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(285)

				if !(p.Precpred(p.GetParserRuleContext(), 16)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 16)", ""))
				}
				{
					p.SetState(286)

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
					p.SetState(287)

					var _x = p.expr_arit(17)

					localctx.(*Expr_aritContext).opDe = _x
					localctx.(*Expr_aritContext)._expr_arit = _x
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
				p.SetState(290)

				if !(p.Precpred(p.GetParserRuleContext(), 15)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 15)", ""))
				}
				{
					p.SetState(291)

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
					p.SetState(292)

					var _x = p.expr_arit(16)

					localctx.(*Expr_aritContext).opDe = _x
					localctx.(*Expr_aritContext)._expr_arit = _x
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
				p.SetState(295)

				if !(p.Precpred(p.GetParserRuleContext(), 13)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 13)", ""))
				}
				{
					p.SetState(296)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la-48)&-(0x1f+1)) == 0 && ((1<<uint((_la-48)))&((1<<(ChemsDIFERENTEDE-48))|(1<<(ChemsMAYORIGUAL-48))|(1<<(ChemsMENORIGUAL-48))|(1<<(ChemsMAYOR-48))|(1<<(ChemsMENOR-48))|(1<<(ChemsMODULO-48)))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(297)

					var _x = p.expr_arit(14)

					localctx.(*Expr_aritContext).opDe = _x
					localctx.(*Expr_aritContext)._expr_arit = _x
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
				p.SetState(300)

				if !(p.Precpred(p.GetParserRuleContext(), 12)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 12)", ""))
				}
				{
					p.SetState(301)

					var _m = p.Match(ChemsIGUALIGUA)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(302)

					var _x = p.expr_arit(13)

					localctx.(*Expr_aritContext).opDe = _x
					localctx.(*Expr_aritContext)._expr_arit = _x
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
				p.SetState(305)

				if !(p.Precpred(p.GetParserRuleContext(), 11)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 11)", ""))
				}
				{
					p.SetState(306)

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
					p.SetState(307)

					var _x = p.expr_arit(12)

					localctx.(*Expr_aritContext).opDe = _x
					localctx.(*Expr_aritContext)._expr_arit = _x
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
				p.SetState(310)

				if !(p.Precpred(p.GetParserRuleContext(), 9)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 9)", ""))
				}
				{
					p.SetState(311)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(312)

					var _m = p.Match(ChemsP_ABS)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(313)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(314)
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
				p.SetState(316)

				if !(p.Precpred(p.GetParserRuleContext(), 8)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 8)", ""))
				}
				{
					p.SetState(317)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(318)

					var _m = p.Match(ChemsP_SQRT)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(319)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(320)
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
				p.SetState(322)

				if !(p.Precpred(p.GetParserRuleContext(), 7)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 7)", ""))
				}
				{
					p.SetState(323)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(324)

					var _m = p.Match(ChemsP_TOSTRING)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(325)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(326)
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
				p.SetState(328)

				if !(p.Precpred(p.GetParserRuleContext(), 6)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 6)", ""))
				}
				{
					p.SetState(329)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(330)

					var _m = p.Match(ChemsP_CLONE)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(331)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(332)
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

			case 10:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ChemsRULE_expr_arit)
				p.SetState(334)

				if !(p.Precpred(p.GetParserRuleContext(), 5)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 5)", ""))
				}
				{
					p.SetState(335)
					p.Match(ChemsPUNTO)
				}
				{
					p.SetState(336)

					var _m = p.Match(ChemsP_LEN)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(337)
					p.Match(ChemsPARIZQ)
				}
				{
					p.SetState(338)
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
		p.SetState(344)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 9, p.GetParserRuleContext())
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
	_startState := 22
	p.EnterRecursionRule(localctx, 22, ChemsRULE_listValues, _p)

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
		p.SetState(346)

		var _x = p.Expression()

		localctx.(*ListValuesContext)._expression = _x
	}

	localctx.(*ListValuesContext).l = arrayList.New()
	localctx.(*ListValuesContext).l.Add(localctx.(*ListValuesContext).Get_expression().GetP())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(356)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 10, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListValuesContext(p, _parentctx, _parentState)
			localctx.(*ListValuesContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ChemsRULE_listValues)
			p.SetState(349)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(350)
				p.Match(ChemsCOMA)
			}
			{
				p.SetState(351)

				var _x = p.Expression()

				localctx.(*ListValuesContext)._expression = _x
			}

			localctx.(*ListValuesContext).GetList().GetL().Add(localctx.(*ListValuesContext).Get_expression().GetP())
			localctx.(*ListValuesContext).l = localctx.(*ListValuesContext).GetList().GetL()

		}
		p.SetState(358)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 10, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 24, ChemsRULE_primitivo)

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

	p.SetState(386)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 11, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(359)

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
			p.SetState(361)
			p.Match(ChemsSUB)
		}
		{
			p.SetState(362)

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
			p.SetState(364)
			p.Match(ChemsSUB)
		}
		{
			p.SetState(365)

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
			p.SetState(367)

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
			p.SetState(369)

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
			p.SetState(371)

			var _m = p.Match(ChemsDECIMAL)

			localctx.(*PrimitivoContext)._DECIMAL = _m
		}
		{
			p.SetState(372)
			p.Match(ChemsP_AS)
		}
		{
			p.SetState(373)
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
			p.SetState(375)

			var _m = p.Match(ChemsNUMBER)

			localctx.(*PrimitivoContext)._NUMBER = _m
		}
		{
			p.SetState(376)
			p.Match(ChemsP_AS)
		}
		{
			p.SetState(377)
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
			p.SetState(379)

			var _x = p.listArray(0)

			localctx.(*PrimitivoContext).list = _x
		}
		localctx.(*PrimitivoContext).p = localctx.(*PrimitivoContext).GetList().GetP()

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(382)
			p.Match(ChemsP_TRUE)
		}

		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo("true", interfaces.TRUE)

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(384)
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
	_startState := 26
	p.EnterRecursionRule(localctx, 26, ChemsRULE_listArray, _p)

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
		p.SetState(389)

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
	p.SetState(400)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListArrayContext(p, _parentctx, _parentState)
			localctx.(*ListArrayContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ChemsRULE_listArray)
			p.SetState(392)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(393)
				p.Match(ChemsCORIZQ)
			}
			{
				p.SetState(394)

				var _x = p.Expression()

				localctx.(*ListArrayContext)._expression = _x
			}
			{
				p.SetState(395)
				p.Match(ChemsCORDER)
			}
			localctx.(*ListArrayContext).p = expresion.NewArrayAccess(localctx.(*ListArrayContext).GetList().GetP(), localctx.(*ListArrayContext).Get_expression().GetP())

		}
		p.SetState(402)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext())
	}

	return localctx
}

func (p *Chems) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 10:
		var t *Expr_aritContext = nil
		if localctx != nil {
			t = localctx.(*Expr_aritContext)
		}
		return p.Expr_arit_Sempred(t, predIndex)

	case 11:
		var t *ListValuesContext = nil
		if localctx != nil {
			t = localctx.(*ListValuesContext)
		}
		return p.ListValues_Sempred(t, predIndex)

	case 13:
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
		return p.Precpred(p.GetParserRuleContext(), 16)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 15)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 13)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 12)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 11)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 9)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 8)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 7)

	case 8:
		return p.Precpred(p.GetParserRuleContext(), 6)

	case 9:
		return p.Precpred(p.GetParserRuleContext(), 5)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Chems) ListValues_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 10:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Chems) ListArray_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 11:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

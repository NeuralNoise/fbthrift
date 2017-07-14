#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from __future__ import absolute_import
import six
from thrift.util.Recursive import fix_spec
from thrift.Thrift import *
from thrift.protocol.TProtocol import TProtocolException



from .ttypes import *

myInt = 1337

name = "Mark Zuckerberg"

states = [
  {
    "San Diego" : 3211000,
    "Sacramento" : 479600,
    "SF" : 837400,
  },
  {
    "New York" : 8406000,
    "Albany" : 98400,
  },
]

x = 1

y = 1000000

z = 1e+09

instagram = Internship(**{
  "weeks" : 12,
  "title" : "Software Engineer",
  "employer" :   3,
})

kRanges = [
  Range(**{
    "min" : 1,
    "max" : 2,
  }),
  Range(**{
    "min" : 5,
    "max" : 6,
  }),
]

internList = [
  Internship(**{
    "weeks" : 12,
    "title" : "Software Engineer",
    "employer" :     3,
  }),
  Internship(**{
    "weeks" : 10,
    "title" : "Sales Intern",
    "employer" :     0,
  }),
]

pod_0 = struct1(**{
})

pod_1 = struct1(**{
  "a" : 10,
  "b" : "foo",
})

pod_2 = struct2(**{
  "a" : 98,
  "b" : "gaz",
  "c" : struct1(**{
    "a" : 12,
    "b" : "bar",
  }),
  "d" : [
    11,
    22,
    33,
  ],
})

pod_3 = struct3(**{
  "a" : "abc",
  "b" : 456,
  "c" : struct2(**{
    "a" : 888,
    "c" : struct1(**{
      "b" : "gaz",
    }),
    "d" : [
      1,
      2,
      3,
    ],
  }),
})

u_1_1 = union1(**{
  "i" : 97,
})

u_1_2 = union1(**{
  "d" : 5.6,
})

u_1_3 = union1(**{
})

u_2_1 = union2(**{
  "i" : 51,
})

u_2_2 = union2(**{
  "d" : 6.7,
})

u_2_3 = union2(**{
  "s" : struct1(**{
    "a" : 8,
    "b" : "abacabb",
  }),
})

u_2_4 = union2(**{
  "u" : union1(**{
    "i" : 43,
  }),
})

u_2_5 = union2(**{
  "u" : union1(**{
    "d" : 9.8,
  }),
})

u_2_6 = union2(**{
  "u" : union1(**{
  }),
})

apostrophe = "'"

tripleApostrophe = "'''"

quotationMark = "\""

backslash = "\\"

escaped_a = "\x61"

char2ascii = {
  "'" : 39,
  "\"" : 34,
  "\\" : 92,
  "\x61" : 97,
}

escaped_strings = [
  "\x61",
  "\xab",
  "\x6a",
  "\xa6",
  "\x61yyy",
  "\xabyyy",
  "\x6ayyy",
  "\xa6yyy",
  "zzz\x61",
  "zzz\xab",
  "zzz\x6a",
  "zzz\xa6",
  "zzz\x61yyy",
  "zzz\xabyyy",
  "zzz\x6ayyy",
  "zzz\xa6yyy",
]

false_c = False

true_c = True

zero_byte = 0

zero16 = 0

zero32 = 0

zero64 = 0

zero_dot_zero = 0

empty_string = ""

empty_int_list = [
]

empty_string_list = [
]

empty_int_set = set([
])

empty_string_set = set([
])

empty_int_int_map = {
}

empty_int_string_map = {
}

empty_string_int_map = {
}

empty_string_string_map = {
}


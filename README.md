# petname

## NAME

**petname** − a utility to generate "pet names", consisting of a random combination of adverbs, an adjective, and an animal name

## DESCRIPTION

This utility will generate "pet names", consisting of a random combination of an adverb, adjective, and an animal name. These are useful for unique hostnames or container names, for instance.

As such, PetName tries to follow the tenets of Zooko’s triangle. Names are:

- human meaningful
- decentralized
- secure

## USAGE

`generatePetname(words = 3, separator = "-", complexity = Complexity.Large)` will return a petname string

## COPYRIGHT

The initial idea, word-lists, parts of the algorithms and parts of the readme were written by Dustin Kirkland &lt;dustin.kirkland@gmail.com&gt; for Ubuntu systems (but may be used by others). Permission is granted to copy, distribute and/or modify this document and the utility under the terms of the Apache2 License.

The complete text of the Apache2 License can be found in */usr/share/common-licenses/Apache-2.0* on Debian/Ubuntu systems.

/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * A named expression that can be evaluated at search time and used for ranking or thresholding in a search query.
 * </p>
 */
public class NamedRankExpression implements Serializable {

    /**
     * The name of a rank expression. Rank expression names must begin with a
     * letter and can contain the following characters: a-z (lowercase), 0-9,
     * and _ (underscore). Uppercase letters and hyphens are not allowed. The
     * names "body", "docid", and "text_relevance" are reserved and cannot be
     * specified as field or rank expression names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String rankName;

    /**
     * The expression to evaluate for ranking or thresholding while
     * processing a search request. The <code>RankExpression</code> syntax is
     * based on JavaScript expressions and supports:<ul> <li>Integer,
     * floating point, hex and octal literals</li> <li>Shortcut evaluation of
     * logical operators such that an expression <code>a || b</code>
     * evaluates to the value <code>a</code>, if <code>a</code> is true,
     * without evaluating <code>b</code> at all</li> <li>JavaScript order of
     * precedence for operators</li> <li>Arithmetic operators: <code>+ - * /
     * %</code></li> <li>Boolean operators (including the ternary
     * operator)</li> <li>Bitwise operators</li> <li>Comparison
     * operators</li> <li>Common mathematic functions: <code>abs ceil erf exp
     * floor lgamma ln log2 log10 max min sqrt pow</code></li>
     * <li>Trigonometric library functions: <code>acosh acos asinh asin atanh
     * atan cosh cos sinh sin tanh tan</code></li> <li>Random generation of a
     * number between 0 and 1: <code>rand</code></li> <li>Current time in
     * epoch: <code>time</code></li> <li>The <code>min max</code> functions
     * that operate on a variable argument list</li> </ul> <p>Intermediate
     * results are calculated as double precision floating point values. The
     * final return value of a <code>RankExpression</code> is automatically
     * converted from floating point to a 32-bit unsigned integer by rounding
     * to the nearest integer, with a natural floor of 0 and a ceiling of
     * max(uint32_t), 4294967295. Mathematical errors such as dividing by 0
     * will fail during evaluation and return a value of 0. <p>The source
     * data for a <code>RankExpression</code> can be the name of an
     * <code>IndexField</code> of type uint, another
     * <code>RankExpression</code> or the reserved name
     * <i>text_relevance</i>. The text_relevance source is defined to return
     * an integer from 0 to 1000 (inclusive) to indicate how relevant a
     * document is to the search request, taking into account repetition of
     * search terms in the document and proximity of search terms to each
     * other in each matching <code>IndexField</code> in the document. <p>For
     * more information about using rank expressions to customize ranking,
     * see the Amazon CloudSearch Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     */
    private String rankExpression;

    /**
     * The name of a rank expression. Rank expression names must begin with a
     * letter and can contain the following characters: a-z (lowercase), 0-9,
     * and _ (underscore). Uppercase letters and hyphens are not allowed. The
     * names "body", "docid", and "text_relevance" are reserved and cannot be
     * specified as field or rank expression names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return The name of a rank expression. Rank expression names must begin with a
     *         letter and can contain the following characters: a-z (lowercase), 0-9,
     *         and _ (underscore). Uppercase letters and hyphens are not allowed. The
     *         names "body", "docid", and "text_relevance" are reserved and cannot be
     *         specified as field or rank expression names.
     */
    public String getRankName() {
        return rankName;
    }
    
    /**
     * The name of a rank expression. Rank expression names must begin with a
     * letter and can contain the following characters: a-z (lowercase), 0-9,
     * and _ (underscore). Uppercase letters and hyphens are not allowed. The
     * names "body", "docid", and "text_relevance" are reserved and cannot be
     * specified as field or rank expression names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param rankName The name of a rank expression. Rank expression names must begin with a
     *         letter and can contain the following characters: a-z (lowercase), 0-9,
     *         and _ (underscore). Uppercase letters and hyphens are not allowed. The
     *         names "body", "docid", and "text_relevance" are reserved and cannot be
     *         specified as field or rank expression names.
     */
    public void setRankName(String rankName) {
        this.rankName = rankName;
    }
    
    /**
     * The name of a rank expression. Rank expression names must begin with a
     * letter and can contain the following characters: a-z (lowercase), 0-9,
     * and _ (underscore). Uppercase letters and hyphens are not allowed. The
     * names "body", "docid", and "text_relevance" are reserved and cannot be
     * specified as field or rank expression names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param rankName The name of a rank expression. Rank expression names must begin with a
     *         letter and can contain the following characters: a-z (lowercase), 0-9,
     *         and _ (underscore). Uppercase letters and hyphens are not allowed. The
     *         names "body", "docid", and "text_relevance" are reserved and cannot be
     *         specified as field or rank expression names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NamedRankExpression withRankName(String rankName) {
        this.rankName = rankName;
        return this;
    }

    /**
     * The expression to evaluate for ranking or thresholding while
     * processing a search request. The <code>RankExpression</code> syntax is
     * based on JavaScript expressions and supports:<ul> <li>Integer,
     * floating point, hex and octal literals</li> <li>Shortcut evaluation of
     * logical operators such that an expression <code>a || b</code>
     * evaluates to the value <code>a</code>, if <code>a</code> is true,
     * without evaluating <code>b</code> at all</li> <li>JavaScript order of
     * precedence for operators</li> <li>Arithmetic operators: <code>+ - * /
     * %</code></li> <li>Boolean operators (including the ternary
     * operator)</li> <li>Bitwise operators</li> <li>Comparison
     * operators</li> <li>Common mathematic functions: <code>abs ceil erf exp
     * floor lgamma ln log2 log10 max min sqrt pow</code></li>
     * <li>Trigonometric library functions: <code>acosh acos asinh asin atanh
     * atan cosh cos sinh sin tanh tan</code></li> <li>Random generation of a
     * number between 0 and 1: <code>rand</code></li> <li>Current time in
     * epoch: <code>time</code></li> <li>The <code>min max</code> functions
     * that operate on a variable argument list</li> </ul> <p>Intermediate
     * results are calculated as double precision floating point values. The
     * final return value of a <code>RankExpression</code> is automatically
     * converted from floating point to a 32-bit unsigned integer by rounding
     * to the nearest integer, with a natural floor of 0 and a ceiling of
     * max(uint32_t), 4294967295. Mathematical errors such as dividing by 0
     * will fail during evaluation and return a value of 0. <p>The source
     * data for a <code>RankExpression</code> can be the name of an
     * <code>IndexField</code> of type uint, another
     * <code>RankExpression</code> or the reserved name
     * <i>text_relevance</i>. The text_relevance source is defined to return
     * an integer from 0 to 1000 (inclusive) to indicate how relevant a
     * document is to the search request, taking into account repetition of
     * search terms in the document and proximity of search terms to each
     * other in each matching <code>IndexField</code> in the document. <p>For
     * more information about using rank expressions to customize ranking,
     * see the Amazon CloudSearch Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @return The expression to evaluate for ranking or thresholding while
     *         processing a search request. The <code>RankExpression</code> syntax is
     *         based on JavaScript expressions and supports:<ul> <li>Integer,
     *         floating point, hex and octal literals</li> <li>Shortcut evaluation of
     *         logical operators such that an expression <code>a || b</code>
     *         evaluates to the value <code>a</code>, if <code>a</code> is true,
     *         without evaluating <code>b</code> at all</li> <li>JavaScript order of
     *         precedence for operators</li> <li>Arithmetic operators: <code>+ - * /
     *         %</code></li> <li>Boolean operators (including the ternary
     *         operator)</li> <li>Bitwise operators</li> <li>Comparison
     *         operators</li> <li>Common mathematic functions: <code>abs ceil erf exp
     *         floor lgamma ln log2 log10 max min sqrt pow</code></li>
     *         <li>Trigonometric library functions: <code>acosh acos asinh asin atanh
     *         atan cosh cos sinh sin tanh tan</code></li> <li>Random generation of a
     *         number between 0 and 1: <code>rand</code></li> <li>Current time in
     *         epoch: <code>time</code></li> <li>The <code>min max</code> functions
     *         that operate on a variable argument list</li> </ul> <p>Intermediate
     *         results are calculated as double precision floating point values. The
     *         final return value of a <code>RankExpression</code> is automatically
     *         converted from floating point to a 32-bit unsigned integer by rounding
     *         to the nearest integer, with a natural floor of 0 and a ceiling of
     *         max(uint32_t), 4294967295. Mathematical errors such as dividing by 0
     *         will fail during evaluation and return a value of 0. <p>The source
     *         data for a <code>RankExpression</code> can be the name of an
     *         <code>IndexField</code> of type uint, another
     *         <code>RankExpression</code> or the reserved name
     *         <i>text_relevance</i>. The text_relevance source is defined to return
     *         an integer from 0 to 1000 (inclusive) to indicate how relevant a
     *         document is to the search request, taking into account repetition of
     *         search terms in the document and proximity of search terms to each
     *         other in each matching <code>IndexField</code> in the document. <p>For
     *         more information about using rank expressions to customize ranking,
     *         see the Amazon CloudSearch Developer Guide.
     */
    public String getRankExpression() {
        return rankExpression;
    }
    
    /**
     * The expression to evaluate for ranking or thresholding while
     * processing a search request. The <code>RankExpression</code> syntax is
     * based on JavaScript expressions and supports:<ul> <li>Integer,
     * floating point, hex and octal literals</li> <li>Shortcut evaluation of
     * logical operators such that an expression <code>a || b</code>
     * evaluates to the value <code>a</code>, if <code>a</code> is true,
     * without evaluating <code>b</code> at all</li> <li>JavaScript order of
     * precedence for operators</li> <li>Arithmetic operators: <code>+ - * /
     * %</code></li> <li>Boolean operators (including the ternary
     * operator)</li> <li>Bitwise operators</li> <li>Comparison
     * operators</li> <li>Common mathematic functions: <code>abs ceil erf exp
     * floor lgamma ln log2 log10 max min sqrt pow</code></li>
     * <li>Trigonometric library functions: <code>acosh acos asinh asin atanh
     * atan cosh cos sinh sin tanh tan</code></li> <li>Random generation of a
     * number between 0 and 1: <code>rand</code></li> <li>Current time in
     * epoch: <code>time</code></li> <li>The <code>min max</code> functions
     * that operate on a variable argument list</li> </ul> <p>Intermediate
     * results are calculated as double precision floating point values. The
     * final return value of a <code>RankExpression</code> is automatically
     * converted from floating point to a 32-bit unsigned integer by rounding
     * to the nearest integer, with a natural floor of 0 and a ceiling of
     * max(uint32_t), 4294967295. Mathematical errors such as dividing by 0
     * will fail during evaluation and return a value of 0. <p>The source
     * data for a <code>RankExpression</code> can be the name of an
     * <code>IndexField</code> of type uint, another
     * <code>RankExpression</code> or the reserved name
     * <i>text_relevance</i>. The text_relevance source is defined to return
     * an integer from 0 to 1000 (inclusive) to indicate how relevant a
     * document is to the search request, taking into account repetition of
     * search terms in the document and proximity of search terms to each
     * other in each matching <code>IndexField</code> in the document. <p>For
     * more information about using rank expressions to customize ranking,
     * see the Amazon CloudSearch Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @param rankExpression The expression to evaluate for ranking or thresholding while
     *         processing a search request. The <code>RankExpression</code> syntax is
     *         based on JavaScript expressions and supports:<ul> <li>Integer,
     *         floating point, hex and octal literals</li> <li>Shortcut evaluation of
     *         logical operators such that an expression <code>a || b</code>
     *         evaluates to the value <code>a</code>, if <code>a</code> is true,
     *         without evaluating <code>b</code> at all</li> <li>JavaScript order of
     *         precedence for operators</li> <li>Arithmetic operators: <code>+ - * /
     *         %</code></li> <li>Boolean operators (including the ternary
     *         operator)</li> <li>Bitwise operators</li> <li>Comparison
     *         operators</li> <li>Common mathematic functions: <code>abs ceil erf exp
     *         floor lgamma ln log2 log10 max min sqrt pow</code></li>
     *         <li>Trigonometric library functions: <code>acosh acos asinh asin atanh
     *         atan cosh cos sinh sin tanh tan</code></li> <li>Random generation of a
     *         number between 0 and 1: <code>rand</code></li> <li>Current time in
     *         epoch: <code>time</code></li> <li>The <code>min max</code> functions
     *         that operate on a variable argument list</li> </ul> <p>Intermediate
     *         results are calculated as double precision floating point values. The
     *         final return value of a <code>RankExpression</code> is automatically
     *         converted from floating point to a 32-bit unsigned integer by rounding
     *         to the nearest integer, with a natural floor of 0 and a ceiling of
     *         max(uint32_t), 4294967295. Mathematical errors such as dividing by 0
     *         will fail during evaluation and return a value of 0. <p>The source
     *         data for a <code>RankExpression</code> can be the name of an
     *         <code>IndexField</code> of type uint, another
     *         <code>RankExpression</code> or the reserved name
     *         <i>text_relevance</i>. The text_relevance source is defined to return
     *         an integer from 0 to 1000 (inclusive) to indicate how relevant a
     *         document is to the search request, taking into account repetition of
     *         search terms in the document and proximity of search terms to each
     *         other in each matching <code>IndexField</code> in the document. <p>For
     *         more information about using rank expressions to customize ranking,
     *         see the Amazon CloudSearch Developer Guide.
     */
    public void setRankExpression(String rankExpression) {
        this.rankExpression = rankExpression;
    }
    
    /**
     * The expression to evaluate for ranking or thresholding while
     * processing a search request. The <code>RankExpression</code> syntax is
     * based on JavaScript expressions and supports:<ul> <li>Integer,
     * floating point, hex and octal literals</li> <li>Shortcut evaluation of
     * logical operators such that an expression <code>a || b</code>
     * evaluates to the value <code>a</code>, if <code>a</code> is true,
     * without evaluating <code>b</code> at all</li> <li>JavaScript order of
     * precedence for operators</li> <li>Arithmetic operators: <code>+ - * /
     * %</code></li> <li>Boolean operators (including the ternary
     * operator)</li> <li>Bitwise operators</li> <li>Comparison
     * operators</li> <li>Common mathematic functions: <code>abs ceil erf exp
     * floor lgamma ln log2 log10 max min sqrt pow</code></li>
     * <li>Trigonometric library functions: <code>acosh acos asinh asin atanh
     * atan cosh cos sinh sin tanh tan</code></li> <li>Random generation of a
     * number between 0 and 1: <code>rand</code></li> <li>Current time in
     * epoch: <code>time</code></li> <li>The <code>min max</code> functions
     * that operate on a variable argument list</li> </ul> <p>Intermediate
     * results are calculated as double precision floating point values. The
     * final return value of a <code>RankExpression</code> is automatically
     * converted from floating point to a 32-bit unsigned integer by rounding
     * to the nearest integer, with a natural floor of 0 and a ceiling of
     * max(uint32_t), 4294967295. Mathematical errors such as dividing by 0
     * will fail during evaluation and return a value of 0. <p>The source
     * data for a <code>RankExpression</code> can be the name of an
     * <code>IndexField</code> of type uint, another
     * <code>RankExpression</code> or the reserved name
     * <i>text_relevance</i>. The text_relevance source is defined to return
     * an integer from 0 to 1000 (inclusive) to indicate how relevant a
     * document is to the search request, taking into account repetition of
     * search terms in the document and proximity of search terms to each
     * other in each matching <code>IndexField</code> in the document. <p>For
     * more information about using rank expressions to customize ranking,
     * see the Amazon CloudSearch Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @param rankExpression The expression to evaluate for ranking or thresholding while
     *         processing a search request. The <code>RankExpression</code> syntax is
     *         based on JavaScript expressions and supports:<ul> <li>Integer,
     *         floating point, hex and octal literals</li> <li>Shortcut evaluation of
     *         logical operators such that an expression <code>a || b</code>
     *         evaluates to the value <code>a</code>, if <code>a</code> is true,
     *         without evaluating <code>b</code> at all</li> <li>JavaScript order of
     *         precedence for operators</li> <li>Arithmetic operators: <code>+ - * /
     *         %</code></li> <li>Boolean operators (including the ternary
     *         operator)</li> <li>Bitwise operators</li> <li>Comparison
     *         operators</li> <li>Common mathematic functions: <code>abs ceil erf exp
     *         floor lgamma ln log2 log10 max min sqrt pow</code></li>
     *         <li>Trigonometric library functions: <code>acosh acos asinh asin atanh
     *         atan cosh cos sinh sin tanh tan</code></li> <li>Random generation of a
     *         number between 0 and 1: <code>rand</code></li> <li>Current time in
     *         epoch: <code>time</code></li> <li>The <code>min max</code> functions
     *         that operate on a variable argument list</li> </ul> <p>Intermediate
     *         results are calculated as double precision floating point values. The
     *         final return value of a <code>RankExpression</code> is automatically
     *         converted from floating point to a 32-bit unsigned integer by rounding
     *         to the nearest integer, with a natural floor of 0 and a ceiling of
     *         max(uint32_t), 4294967295. Mathematical errors such as dividing by 0
     *         will fail during evaluation and return a value of 0. <p>The source
     *         data for a <code>RankExpression</code> can be the name of an
     *         <code>IndexField</code> of type uint, another
     *         <code>RankExpression</code> or the reserved name
     *         <i>text_relevance</i>. The text_relevance source is defined to return
     *         an integer from 0 to 1000 (inclusive) to indicate how relevant a
     *         document is to the search request, taking into account repetition of
     *         search terms in the document and proximity of search terms to each
     *         other in each matching <code>IndexField</code> in the document. <p>For
     *         more information about using rank expressions to customize ranking,
     *         see the Amazon CloudSearch Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NamedRankExpression withRankExpression(String rankExpression) {
        this.rankExpression = rankExpression;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRankName() != null) sb.append("RankName: " + getRankName() + ",");
        if (getRankExpression() != null) sb.append("RankExpression: " + getRankExpression() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRankName() == null) ? 0 : getRankName().hashCode()); 
        hashCode = prime * hashCode + ((getRankExpression() == null) ? 0 : getRankExpression().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NamedRankExpression == false) return false;
        NamedRankExpression other = (NamedRankExpression)obj;
        
        if (other.getRankName() == null ^ this.getRankName() == null) return false;
        if (other.getRankName() != null && other.getRankName().equals(this.getRankName()) == false) return false; 
        if (other.getRankExpression() == null ^ this.getRankExpression() == null) return false;
        if (other.getRankExpression() != null && other.getRankExpression().equals(this.getRankExpression()) == false) return false; 
        return true;
    }
    
}
    
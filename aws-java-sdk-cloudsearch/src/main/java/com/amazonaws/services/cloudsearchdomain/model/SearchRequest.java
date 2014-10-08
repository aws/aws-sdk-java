/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomain#search(SearchRequest) Search operation}.
 * <p>
 * Retrieves a list of documents that match the specified search
 * criteria. How you specify the search criteria depends on which query
 * parser you use. Amazon CloudSearch supports four query parsers:
 * </p>
 * 
 * <ul>
 * <li> <code>simple</code> : search all <code>text</code> and
 * <code>text-array</code> fields for the specified string. Search for
 * phrases, individual terms, and prefixes. </li>
 * <li> <code>structured</code> : search specific fields, construct
 * compound queries using Boolean operators, and use advanced features
 * such as term boosting and proximity searching.</li>
 * <li> <code>lucene</code> : specify search criteria using the Apache
 * Lucene query parser syntax.</li>
 * <li> <code>dismax</code> : specify search criteria using the
 * simplified subset of the Apache Lucene query parser syntax defined by
 * the DisMax query parser.</li>
 * 
 * </ul>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html"> Searching Your Data </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 * <p>
 * The endpoint for submitting <code>Search</code> requests is
 * domain-specific. You submit search requests to a domain's search
 * endpoint. To get the search endpoint for your domain, use the Amazon
 * CloudSearch configuration service <code>DescribeDomains</code> action.
 * A domain's endpoints are also displayed on the domain dashboard in the
 * Amazon CloudSearch console.
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomain#search(SearchRequest)
 */
public class SearchRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Retrieves a cursor value you can use to page through large result
     * sets. Use the <code>size</code> parameter to control the number of
     * hits to include in each response. You can specify either the
     * <code>cursor</code> or <code>start</code> parameter in a request; they
     * are mutually exclusive. To get the first cursor, set the cursor value
     * to <code>initial</code>. In subsequent requests, specify the cursor
     * value returned in the hits section of the response. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    private String cursor;

    /**
     * Defines one or more numeric expressions that can be used to sort
     * results or specify search or filter criteria. You can also specify
     * expressions as return fields. <p>For more information about defining
     * and using expressions, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html">Configuring
     * Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * <examples> <example> <name>Defining Multiple Expressions</name>
     * <description>You can define and use multiple expressions in a search
     * request.</description> <request> {"expression1":"_score*rating",
     * "expression2":"(1/rank)*year"} </request> <response/> </example>
     * </examples>
     */
    private String expr;

    /**
     * Specifies one or more fields for which to get facet information, and
     * options that control how the facet information is returned. Each
     * specified field must be facet-enabled in the domain configuration. The
     * fields and options are specified in JSON using the form
     * <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     * <p>You can specify the following faceting options: <ul> <li>
     * <p><code>buckets</code> specifies an array of the facet values or
     * ranges to count. Ranges are specified using the same syntax that you
     * use to search for a range of values. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-ranges.html">
     * Searching for a Range of Values</a> in the <i>Amazon CloudSearch
     * Developer Guide</i>. Buckets are returned in the order they are
     * specified in the request. The <code>sort</code> and <code>size</code>
     * options are not valid if you specify <code>buckets</code>. </li> <li>
     * <p><code>size</code> specifies the maximum number of facets to include
     * in the results. By default, Amazon CloudSearch returns counts for the
     * top 10. The <code>size</code> parameter is only valid when you specify
     * the <code>sort</code> option; it cannot be used in conjunction with
     * <code>buckets</code>. </li> <li> <p><code>sort</code> specifies how
     * you want to sort the facets in the results: <code>bucket</code> or
     * <code>count</code>. Specify <code>bucket</code> to sort alphabetically
     * or numerically by facet value (in ascending order). Specify
     * <code>count</code> to sort by the facet counts computed for each facet
     * value (in descending order). To retrieve facet counts for particular
     * values or ranges of values, use the <code>buckets</code> option
     * instead of <code>sort</code>. </li> </ul> <p>If no facet options are
     * specified, facet counts are computed for all field values, the facets
     * are sorted by facet count, and the top 10 facets are returned in the
     * results. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/faceting.html">Getting
     * and Using Facet Information</a> in the <i>Amazon CloudSearch Developer
     * Guide</i>. <examples> <example> <name>Counting Particular Buckets of
     * Values</name> <description>This request uses the <code>buckets</code>
     * option to calculate and return facet counts by decade.</description>
     * <request>
     * {"year":{"buckets":["[1970,1979]","[1980,1989]","[1990,1999]","[2000,2009]","[2010,}"]}}
     * </request> <response/> </example> <example> <name>Sorting Facets By
     * Facet Count</name> <description>This request sets the
     * <code>sort</code> option to <code>count</code> to sort the facet
     * values by facet count, with the facet values that have the most
     * matching documents listed first. Setting the <code>size</code> option
     * to 3 returns only the top three facet values.</description> <request>
     * {"year":{"sort":"count","size":3}} </request> <response/> </example>
     * <example> <name>Sorting Facets By Value</name> <description>This
     * request sets the <code>sort</code> option to <code>bucket</code> to
     * sort the facet values numerically by year, with earliest year listed
     * first. </description> <request> {"year":{"sort":"bucket"}} </request>
     * <response/> </example> </examples>
     */
    private String facet;

    /**
     * Specifies a structured query that filters the results of a search
     * without affecting how the results are scored and sorted. You use
     * <code>filterQuery</code> in conjunction with the <code>query</code>
     * parameter to filter the documents that match the constraints specified
     * in the <code>query</code> parameter. Specifying a filter controls only
     * which matching documents are included in the results, it has no effect
     * on how they are scored and sorted. The <code>filterQuery</code>
     * parameter supports the full structured query syntax. <p>For more
     * information about using filters, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/filtering-results.html">Filtering
     * Matching Documents</a> in the <i>Amazon CloudSearch Developer
     * Guide</i>.
     */
    private String filterQuery;

    /**
     * Retrieves highlights for matches in the specified <code>text</code> or
     * <code>text-array</code> fields. Each specified field must be highlight
     * enabled in the domain configuration. The fields and options are
     * specified in JSON using the form
     * <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     * <p>You can specify the following highlight options: <ul> <li>
     * <code>format</code>: specifies the format of the data in the text
     * field: <code>text</code> or <code>html</code>. When data is returned
     * as HTML, all non-alphanumeric characters are encoded. The default is
     * <code>html</code>. </li> <li> <code>max_phrases</code>: specifies the
     * maximum number of occurrences of the search term(s) you want to
     * highlight. By default, the first occurrence is highlighted. </li> <li>
     * <code>pre_tag</code>: specifies the string to prepend to an occurrence
     * of a search term. The default for HTML highlights is
     * <code><em></code>. The default for text highlights is <code>*</code>.
     * </li> <li> <code>post_tag</code>: specifies the string to append to an
     * occurrence of a search term. The default for HTML highlights is
     * <code></em></code>. The default for text highlights is <code>*</code>.
     * </li> </ul> <p>If no highlight options are specified for a field, the
     * returned field text is treated as HTML and the first match is
     * highlighted with emphasis tags: <code><em>search-term</em></code>.
     * <examples> <example> <name>Setting Highlight Options</name>
     * <description>This example retrieves highlights for the
     * <code>actors</code> and <code>title</code> fields.</description>
     * <request>{ "actors": {}, "title": {"format": "text","max_phrases":
     * 2,"pre_tag": "<b>","post_tag": "</b>"} }</request> </example>
     * </examples>
     */
    private String highlight;

    /**
     * Enables partial results to be returned if one or more index partitions
     * are unavailable. When your search index is partitioned across multiple
     * search instances, by default Amazon CloudSearch only returns results
     * if every partition can be queried. This means that the failure of a
     * single search instance can result in 5xx (internal server) errors.
     * When you enable partial results, Amazon CloudSearch returns whatever
     * results are available and includes the percentage of documents
     * searched in the search results (percent-searched). This enables you to
     * more gracefully degrade your users' search experience. For example,
     * rather than displaying no results, you could display the partial
     * results and a message indicating that the results might be incomplete
     * due to a temporary system outage.
     */
    private Boolean partial;

    /**
     * Specifies the search criteria for the request. How you specify the
     * search criteria depends on the query parser used for the request and
     * the parser options specified in the <code>queryOptions</code>
     * parameter. By default, the <code>simple</code> query parser is used to
     * process requests. To use the <code>structured</code>,
     * <code>lucene</code>, or <code>dismax</code> query parser, you must
     * also specify the <code>queryParser</code> parameter. <p>For more
     * information about specifying search criteria, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching
     * Your Data</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    private String query;

    /**
     * Configures options for the query parser specified in the
     * <code>queryParser</code> parameter. <p>The options you can configure
     * vary according to which parser you use: <ul>
     * <li><code>defaultOperator</code>: The default operator used to combine
     * individual terms in the search string. For example:
     * <code>defaultOperator: 'or'</code>. For the <code>dismax</code>
     * parser, you specify a percentage that represents the percentage of
     * terms in the search string (rounded down) that must match, rather than
     * a default operator. A value of <code>0%</code> is the equivalent to
     * OR, and a value of <code>100%</code> is equivalent to AND. The
     * percentage must be specified as a value in the range 0-100 followed by
     * the percent (%) symbol. For example, <code>defaultOperator:
     * 50%</code>. Valid values: <code>and</code>, <code>or</code>, a
     * percentage in the range 0%-100% (<code>dismax</code>). Default:
     * <code>and</code> (<code>simple</code>, <code>structured</code>,
     * <code>lucene</code>) or <code>100</code> (<code>dismax</code>). Valid
     * for: <code>simple</code>, <code>structured</code>,
     * <code>lucene</code>, and <code>dismax</code>.</li>
     * <li><code>fields</code>: An array of the fields to search when no
     * fields are specified in a search. If no fields are specified in a
     * search and this option is not specified, all text and text-array
     * fields are searched. You can specify a weight for each field to
     * control the relative importance of each field when Amazon CloudSearch
     * calculates relevance scores. To specify a field weight, append a caret
     * (<code>^</code>) symbol and the weight to the field name. For example,
     * to boost the importance of the <code>title</code> field over the
     * <code>description</code> field you could specify:
     * <code>"fields":["title^5","description"]</code>. Valid values: The
     * name of any configured field and an optional numeric value greater
     * than zero. Default: All <code>text</code> and <code>text-array</code>
     * fields. Valid for: <code>simple</code>, <code>structured</code>,
     * <code>lucene</code>, and <code>dismax</code>.</li>
     * <li><code>operators</code>: An array of the operators or special
     * characters you want to disable for the simple query parser. If you
     * disable the <code>and</code>, <code>or</code>, or <code>not</code>
     * operators, the corresponding operators (<code>+</code>,
     * <code>|</code>, <code>-</code>) have no special meaning and are
     * dropped from the search string. Similarly, disabling
     * <code>prefix</code> disables the wildcard operator (<code>*</code>)
     * and disabling <code>phrase</code> disables the ability to search for
     * phrases by enclosing phrases in double quotes. Disabling precedence
     * disables the ability to control order of precedence using parentheses.
     * Disabling <code>near</code> disables the ability to use the ~ operator
     * to perform a sloppy phrase search. Disabling the <code>fuzzy</code>
     * operator disables the ability to use the ~ operator to perform a fuzzy
     * search. <code>escape</code> disables the ability to use a backslash
     * (<code>\</code>) to escape special characters within the search
     * string. Disabling whitespace is an advanced option that prevents the
     * parser from tokenizing on whitespace, which can be useful for
     * Vietnamese. (It prevents Vietnamese words from being split
     * incorrectly.) For example, you could disable all operators other than
     * the phrase operator to support just simple term and phrase queries:
     * <code>"operators":["and","not","or", "prefix"]</code>. Valid values:
     * <code>and</code>, <code>escape</code>, <code>fuzzy</code>,
     * <code>near</code>, <code>not</code>, <code>or</code>,
     * <code>phrase</code>, <code>precedence</code>, <code>prefix</code>,
     * <code>whitespace</code>. Default: All operators and special characters
     * are enabled. Valid for: <code>simple</code>.</li>
     * <li><code>phraseFields</code>: An array of the <code>text</code> or
     * <code>text-array</code> fields you want to use for phrase searches.
     * When the terms in the search string appear in close proximity within a
     * field, the field scores higher. You can specify a weight for each
     * field to boost that score. The <code>phraseSlop</code> option controls
     * how much the matches can deviate from the search string and still be
     * boosted. To specify a field weight, append a caret (<code>^</code>)
     * symbol and the weight to the field name. For example, to boost phrase
     * matches in the <code>title</code> field over the <code>abstract</code>
     * field, you could specify: <code>"phraseFields":["title^3",
     * "plot"]</code> Valid values: The name of any <code>text</code> or
     * <code>text-array</code> field and an optional numeric value greater
     * than zero. Default: No fields. If you don't specify any fields with
     * <code>phraseFields</code>, proximity scoring is disabled even if
     * <code>phraseSlop</code> is specified. Valid for:
     * <code>dismax</code>.</li> <li><code>phraseSlop</code>: An integer
     * value that specifies how much matches can deviate from the search
     * phrase and still be boosted according to the weights specified in the
     * <code>phraseFields</code> option; for example, <code>phraseSlop:
     * 2</code>. You must also specify <code>phraseFields</code> to enable
     * proximity scoring. Valid values: positive integers. Default: 0. Valid
     * for: <code>dismax</code>.</li> <li><code>explicitPhraseSlop</code>: An
     * integer value that specifies how much a match can deviate from the
     * search phrase when the phrase is enclosed in double quotes in the
     * search string. (Phrases that exceed this proximity distance are not
     * considered a match.) For example, to specify a slop of three for
     * dismax phrase queries, you would specify
     * <code>"explicitPhraseSlop":3</code>. Valid values: positive integers.
     * Default: 0. Valid for: <code>dismax</code>.</li>
     * <li><code>tieBreaker</code>: When a term in the search string is found
     * in a document's field, a score is calculated for that field based on
     * how common the word is in that field compared to other documents. If
     * the term occurs in multiple fields within a document, by default only
     * the highest scoring field contributes to the document's overall score.
     * You can specify a <code>tieBreaker</code> value to enable the matches
     * in lower-scoring fields to contribute to the document's score. That
     * way, if two documents have the same max field score for a particular
     * term, the score for the document that has matches in more fields will
     * be higher. The formula for calculating the score with a tieBreaker is
     * <code>(max field score) + (tieBreaker) * (sum of the scores for the
     * rest of the matching fields)</code>. Set <code>tieBreaker</code> to 0
     * to disregard all but the highest scoring field (pure max):
     * <code>"tieBreaker":0</code>. Set to 1 to sum the scores from all
     * fields (pure sum): <code>"tieBreaker":1</code>. Valid values: 0.0 to
     * 1.0. Default: 0.0. Valid for: <code>dismax</code>. </li> </ul>
     * <examples> <example> <name>Setting Default Search Fields</name>
     * <description>This example searches the <code>title</code> and
     * <code>plot</code> fields if no fields are specified in the search
     * criteria.</description> <request>{"fields":["title","plot"]}</request>
     * <response> </response> </example> </examples>
     */
    private String queryOptions;

    /**
     * Specifies which query parser to use to process the request. If
     * <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     * <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     * query parsers: <ul> <li> <code>simple</code>: perform simple searches
     * of <code>text</code> and <code>text-array</code> fields. By default,
     * the <code>simple</code> query parser searches all <code>text</code>
     * and <code>text-array</code> fields. You can specify which fields to
     * search by with the <code>queryOptions</code> parameter. If you prefix
     * a search term with a plus sign (+) documents must contain the term to
     * be considered a match. (This is the default, unless you configure the
     * default operator with the <code>queryOptions</code> parameter.) You
     * can use the <code>-</code> (NOT), <code>|</code> (OR), and
     * <code>*</code> (wildcard) operators to exclude particular terms, find
     * results that match any of the specified terms, or search for a prefix.
     * To search for a phrase rather than individual terms, enclose the
     * phrase in double quotes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     * for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     * <li> <code>structured</code>: perform advanced searches by combining
     * multiple expressions to define the search criteria. You can also
     * search within particular fields, search for values and ranges of
     * values, and use advanced options such as term boosting,
     * <code>matchall</code>, and <code>near</code>. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     * Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </li> <li> <code>lucene</code>: search using the Apache Lucene query
     * parser syntax. For more information, see <a
     * href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     * Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     * using the simplified subset of the Apache Lucene query parser syntax
     * defined by the DisMax query parser. For more information, see <a
     * href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     * Query Parser Syntax</a>. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>simple, structured, lucene, dismax
     */
    private String queryParser;

    /**
     * Specifies the field and expression values to include in the response.
     * Multiple fields or expressions are specified as a comma-separated
     * list. By default, a search response includes all return enabled fields
     * (<code>_all_fields</code>). To return only the document IDs for the
     * matching documents, specify <code>_no_fields</code>. To retrieve the
     * relevance score calculated for each document, specify
     * <code>_score</code>.
     */
    private String returnValue;

    /**
     * Specifies the maximum number of search hits to include in the
     * response.
     */
    private Long size;

    /**
     * Specifies the fields or custom expressions to use to sort the search
     * results. Multiple fields or expressions are specified as a
     * comma-separated list. You must specify the sort direction
     * (<code>asc</code> or <code>desc</code>) for each field; for example,
     * <code>year desc,title asc</code>. To use a field to sort results, the
     * field must be sort-enabled in the domain configuration. Array type
     * fields cannot be used for sorting. If no <code>sort</code> parameter
     * is specified, results are sorted by their default relevance scores in
     * descending order: <code>_score desc</code>. You can also sort by
     * document ID (<code>_id asc</code>) and version (<code>_version
     * desc</code>). <p>For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/sorting-results.html">Sorting
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    private String sort;

    /**
     * Specifies the offset of the first search hit you want to return. Note
     * that the result set is zero-based; the first result is at index 0. You
     * can specify either the <code>start</code> or <code>cursor</code>
     * parameter in a request, they are mutually exclusive. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    private Long start;

    /**
     * Retrieves a cursor value you can use to page through large result
     * sets. Use the <code>size</code> parameter to control the number of
     * hits to include in each response. You can specify either the
     * <code>cursor</code> or <code>start</code> parameter in a request; they
     * are mutually exclusive. To get the first cursor, set the cursor value
     * to <code>initial</code>. In subsequent requests, specify the cursor
     * value returned in the hits section of the response. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return Retrieves a cursor value you can use to page through large result
     *         sets. Use the <code>size</code> parameter to control the number of
     *         hits to include in each response. You can specify either the
     *         <code>cursor</code> or <code>start</code> parameter in a request; they
     *         are mutually exclusive. To get the first cursor, set the cursor value
     *         to <code>initial</code>. In subsequent requests, specify the cursor
     *         value returned in the hits section of the response. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public String getCursor() {
        return cursor;
    }
    
    /**
     * Retrieves a cursor value you can use to page through large result
     * sets. Use the <code>size</code> parameter to control the number of
     * hits to include in each response. You can specify either the
     * <code>cursor</code> or <code>start</code> parameter in a request; they
     * are mutually exclusive. To get the first cursor, set the cursor value
     * to <code>initial</code>. In subsequent requests, specify the cursor
     * value returned in the hits section of the response. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @param cursor Retrieves a cursor value you can use to page through large result
     *         sets. Use the <code>size</code> parameter to control the number of
     *         hits to include in each response. You can specify either the
     *         <code>cursor</code> or <code>start</code> parameter in a request; they
     *         are mutually exclusive. To get the first cursor, set the cursor value
     *         to <code>initial</code>. In subsequent requests, specify the cursor
     *         value returned in the hits section of the response. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
    
    /**
     * Retrieves a cursor value you can use to page through large result
     * sets. Use the <code>size</code> parameter to control the number of
     * hits to include in each response. You can specify either the
     * <code>cursor</code> or <code>start</code> parameter in a request; they
     * are mutually exclusive. To get the first cursor, set the cursor value
     * to <code>initial</code>. In subsequent requests, specify the cursor
     * value returned in the hits section of the response. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cursor Retrieves a cursor value you can use to page through large result
     *         sets. Use the <code>size</code> parameter to control the number of
     *         hits to include in each response. You can specify either the
     *         <code>cursor</code> or <code>start</code> parameter in a request; they
     *         are mutually exclusive. To get the first cursor, set the cursor value
     *         to <code>initial</code>. In subsequent requests, specify the cursor
     *         value returned in the hits section of the response. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /**
     * Defines one or more numeric expressions that can be used to sort
     * results or specify search or filter criteria. You can also specify
     * expressions as return fields. <p>For more information about defining
     * and using expressions, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html">Configuring
     * Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * <examples> <example> <name>Defining Multiple Expressions</name>
     * <description>You can define and use multiple expressions in a search
     * request.</description> <request> {"expression1":"_score*rating",
     * "expression2":"(1/rank)*year"} </request> <response/> </example>
     * </examples>
     *
     * @return Defines one or more numeric expressions that can be used to sort
     *         results or specify search or filter criteria. You can also specify
     *         expressions as return fields. <p>For more information about defining
     *         and using expressions, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html">Configuring
     *         Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *         <examples> <example> <name>Defining Multiple Expressions</name>
     *         <description>You can define and use multiple expressions in a search
     *         request.</description> <request> {"expression1":"_score*rating",
     *         "expression2":"(1/rank)*year"} </request> <response/> </example>
     *         </examples>
     */
    public String getExpr() {
        return expr;
    }
    
    /**
     * Defines one or more numeric expressions that can be used to sort
     * results or specify search or filter criteria. You can also specify
     * expressions as return fields. <p>For more information about defining
     * and using expressions, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html">Configuring
     * Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * <examples> <example> <name>Defining Multiple Expressions</name>
     * <description>You can define and use multiple expressions in a search
     * request.</description> <request> {"expression1":"_score*rating",
     * "expression2":"(1/rank)*year"} </request> <response/> </example>
     * </examples>
     *
     * @param expr Defines one or more numeric expressions that can be used to sort
     *         results or specify search or filter criteria. You can also specify
     *         expressions as return fields. <p>For more information about defining
     *         and using expressions, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html">Configuring
     *         Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *         <examples> <example> <name>Defining Multiple Expressions</name>
     *         <description>You can define and use multiple expressions in a search
     *         request.</description> <request> {"expression1":"_score*rating",
     *         "expression2":"(1/rank)*year"} </request> <response/> </example>
     *         </examples>
     */
    public void setExpr(String expr) {
        this.expr = expr;
    }
    
    /**
     * Defines one or more numeric expressions that can be used to sort
     * results or specify search or filter criteria. You can also specify
     * expressions as return fields. <p>For more information about defining
     * and using expressions, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html">Configuring
     * Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * <examples> <example> <name>Defining Multiple Expressions</name>
     * <description>You can define and use multiple expressions in a search
     * request.</description> <request> {"expression1":"_score*rating",
     * "expression2":"(1/rank)*year"} </request> <response/> </example>
     * </examples>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expr Defines one or more numeric expressions that can be used to sort
     *         results or specify search or filter criteria. You can also specify
     *         expressions as return fields. <p>For more information about defining
     *         and using expressions, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html">Configuring
     *         Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *         <examples> <example> <name>Defining Multiple Expressions</name>
     *         <description>You can define and use multiple expressions in a search
     *         request.</description> <request> {"expression1":"_score*rating",
     *         "expression2":"(1/rank)*year"} </request> <response/> </example>
     *         </examples>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withExpr(String expr) {
        this.expr = expr;
        return this;
    }

    /**
     * Specifies one or more fields for which to get facet information, and
     * options that control how the facet information is returned. Each
     * specified field must be facet-enabled in the domain configuration. The
     * fields and options are specified in JSON using the form
     * <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     * <p>You can specify the following faceting options: <ul> <li>
     * <p><code>buckets</code> specifies an array of the facet values or
     * ranges to count. Ranges are specified using the same syntax that you
     * use to search for a range of values. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-ranges.html">
     * Searching for a Range of Values</a> in the <i>Amazon CloudSearch
     * Developer Guide</i>. Buckets are returned in the order they are
     * specified in the request. The <code>sort</code> and <code>size</code>
     * options are not valid if you specify <code>buckets</code>. </li> <li>
     * <p><code>size</code> specifies the maximum number of facets to include
     * in the results. By default, Amazon CloudSearch returns counts for the
     * top 10. The <code>size</code> parameter is only valid when you specify
     * the <code>sort</code> option; it cannot be used in conjunction with
     * <code>buckets</code>. </li> <li> <p><code>sort</code> specifies how
     * you want to sort the facets in the results: <code>bucket</code> or
     * <code>count</code>. Specify <code>bucket</code> to sort alphabetically
     * or numerically by facet value (in ascending order). Specify
     * <code>count</code> to sort by the facet counts computed for each facet
     * value (in descending order). To retrieve facet counts for particular
     * values or ranges of values, use the <code>buckets</code> option
     * instead of <code>sort</code>. </li> </ul> <p>If no facet options are
     * specified, facet counts are computed for all field values, the facets
     * are sorted by facet count, and the top 10 facets are returned in the
     * results. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/faceting.html">Getting
     * and Using Facet Information</a> in the <i>Amazon CloudSearch Developer
     * Guide</i>. <examples> <example> <name>Counting Particular Buckets of
     * Values</name> <description>This request uses the <code>buckets</code>
     * option to calculate and return facet counts by decade.</description>
     * <request>
     * {"year":{"buckets":["[1970,1979]","[1980,1989]","[1990,1999]","[2000,2009]","[2010,}"]}}
     * </request> <response/> </example> <example> <name>Sorting Facets By
     * Facet Count</name> <description>This request sets the
     * <code>sort</code> option to <code>count</code> to sort the facet
     * values by facet count, with the facet values that have the most
     * matching documents listed first. Setting the <code>size</code> option
     * to 3 returns only the top three facet values.</description> <request>
     * {"year":{"sort":"count","size":3}} </request> <response/> </example>
     * <example> <name>Sorting Facets By Value</name> <description>This
     * request sets the <code>sort</code> option to <code>bucket</code> to
     * sort the facet values numerically by year, with earliest year listed
     * first. </description> <request> {"year":{"sort":"bucket"}} </request>
     * <response/> </example> </examples>
     *
     * @return Specifies one or more fields for which to get facet information, and
     *         options that control how the facet information is returned. Each
     *         specified field must be facet-enabled in the domain configuration. The
     *         fields and options are specified in JSON using the form
     *         <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     *         <p>You can specify the following faceting options: <ul> <li>
     *         <p><code>buckets</code> specifies an array of the facet values or
     *         ranges to count. Ranges are specified using the same syntax that you
     *         use to search for a range of values. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-ranges.html">
     *         Searching for a Range of Values</a> in the <i>Amazon CloudSearch
     *         Developer Guide</i>. Buckets are returned in the order they are
     *         specified in the request. The <code>sort</code> and <code>size</code>
     *         options are not valid if you specify <code>buckets</code>. </li> <li>
     *         <p><code>size</code> specifies the maximum number of facets to include
     *         in the results. By default, Amazon CloudSearch returns counts for the
     *         top 10. The <code>size</code> parameter is only valid when you specify
     *         the <code>sort</code> option; it cannot be used in conjunction with
     *         <code>buckets</code>. </li> <li> <p><code>sort</code> specifies how
     *         you want to sort the facets in the results: <code>bucket</code> or
     *         <code>count</code>. Specify <code>bucket</code> to sort alphabetically
     *         or numerically by facet value (in ascending order). Specify
     *         <code>count</code> to sort by the facet counts computed for each facet
     *         value (in descending order). To retrieve facet counts for particular
     *         values or ranges of values, use the <code>buckets</code> option
     *         instead of <code>sort</code>. </li> </ul> <p>If no facet options are
     *         specified, facet counts are computed for all field values, the facets
     *         are sorted by facet count, and the top 10 facets are returned in the
     *         results. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/faceting.html">Getting
     *         and Using Facet Information</a> in the <i>Amazon CloudSearch Developer
     *         Guide</i>. <examples> <example> <name>Counting Particular Buckets of
     *         Values</name> <description>This request uses the <code>buckets</code>
     *         option to calculate and return facet counts by decade.</description>
     *         <request>
     *         {"year":{"buckets":["[1970,1979]","[1980,1989]","[1990,1999]","[2000,2009]","[2010,}"]}}
     *         </request> <response/> </example> <example> <name>Sorting Facets By
     *         Facet Count</name> <description>This request sets the
     *         <code>sort</code> option to <code>count</code> to sort the facet
     *         values by facet count, with the facet values that have the most
     *         matching documents listed first. Setting the <code>size</code> option
     *         to 3 returns only the top three facet values.</description> <request>
     *         {"year":{"sort":"count","size":3}} </request> <response/> </example>
     *         <example> <name>Sorting Facets By Value</name> <description>This
     *         request sets the <code>sort</code> option to <code>bucket</code> to
     *         sort the facet values numerically by year, with earliest year listed
     *         first. </description> <request> {"year":{"sort":"bucket"}} </request>
     *         <response/> </example> </examples>
     */
    public String getFacet() {
        return facet;
    }
    
    /**
     * Specifies one or more fields for which to get facet information, and
     * options that control how the facet information is returned. Each
     * specified field must be facet-enabled in the domain configuration. The
     * fields and options are specified in JSON using the form
     * <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     * <p>You can specify the following faceting options: <ul> <li>
     * <p><code>buckets</code> specifies an array of the facet values or
     * ranges to count. Ranges are specified using the same syntax that you
     * use to search for a range of values. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-ranges.html">
     * Searching for a Range of Values</a> in the <i>Amazon CloudSearch
     * Developer Guide</i>. Buckets are returned in the order they are
     * specified in the request. The <code>sort</code> and <code>size</code>
     * options are not valid if you specify <code>buckets</code>. </li> <li>
     * <p><code>size</code> specifies the maximum number of facets to include
     * in the results. By default, Amazon CloudSearch returns counts for the
     * top 10. The <code>size</code> parameter is only valid when you specify
     * the <code>sort</code> option; it cannot be used in conjunction with
     * <code>buckets</code>. </li> <li> <p><code>sort</code> specifies how
     * you want to sort the facets in the results: <code>bucket</code> or
     * <code>count</code>. Specify <code>bucket</code> to sort alphabetically
     * or numerically by facet value (in ascending order). Specify
     * <code>count</code> to sort by the facet counts computed for each facet
     * value (in descending order). To retrieve facet counts for particular
     * values or ranges of values, use the <code>buckets</code> option
     * instead of <code>sort</code>. </li> </ul> <p>If no facet options are
     * specified, facet counts are computed for all field values, the facets
     * are sorted by facet count, and the top 10 facets are returned in the
     * results. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/faceting.html">Getting
     * and Using Facet Information</a> in the <i>Amazon CloudSearch Developer
     * Guide</i>. <examples> <example> <name>Counting Particular Buckets of
     * Values</name> <description>This request uses the <code>buckets</code>
     * option to calculate and return facet counts by decade.</description>
     * <request>
     * {"year":{"buckets":["[1970,1979]","[1980,1989]","[1990,1999]","[2000,2009]","[2010,}"]}}
     * </request> <response/> </example> <example> <name>Sorting Facets By
     * Facet Count</name> <description>This request sets the
     * <code>sort</code> option to <code>count</code> to sort the facet
     * values by facet count, with the facet values that have the most
     * matching documents listed first. Setting the <code>size</code> option
     * to 3 returns only the top three facet values.</description> <request>
     * {"year":{"sort":"count","size":3}} </request> <response/> </example>
     * <example> <name>Sorting Facets By Value</name> <description>This
     * request sets the <code>sort</code> option to <code>bucket</code> to
     * sort the facet values numerically by year, with earliest year listed
     * first. </description> <request> {"year":{"sort":"bucket"}} </request>
     * <response/> </example> </examples>
     *
     * @param facet Specifies one or more fields for which to get facet information, and
     *         options that control how the facet information is returned. Each
     *         specified field must be facet-enabled in the domain configuration. The
     *         fields and options are specified in JSON using the form
     *         <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     *         <p>You can specify the following faceting options: <ul> <li>
     *         <p><code>buckets</code> specifies an array of the facet values or
     *         ranges to count. Ranges are specified using the same syntax that you
     *         use to search for a range of values. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-ranges.html">
     *         Searching for a Range of Values</a> in the <i>Amazon CloudSearch
     *         Developer Guide</i>. Buckets are returned in the order they are
     *         specified in the request. The <code>sort</code> and <code>size</code>
     *         options are not valid if you specify <code>buckets</code>. </li> <li>
     *         <p><code>size</code> specifies the maximum number of facets to include
     *         in the results. By default, Amazon CloudSearch returns counts for the
     *         top 10. The <code>size</code> parameter is only valid when you specify
     *         the <code>sort</code> option; it cannot be used in conjunction with
     *         <code>buckets</code>. </li> <li> <p><code>sort</code> specifies how
     *         you want to sort the facets in the results: <code>bucket</code> or
     *         <code>count</code>. Specify <code>bucket</code> to sort alphabetically
     *         or numerically by facet value (in ascending order). Specify
     *         <code>count</code> to sort by the facet counts computed for each facet
     *         value (in descending order). To retrieve facet counts for particular
     *         values or ranges of values, use the <code>buckets</code> option
     *         instead of <code>sort</code>. </li> </ul> <p>If no facet options are
     *         specified, facet counts are computed for all field values, the facets
     *         are sorted by facet count, and the top 10 facets are returned in the
     *         results. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/faceting.html">Getting
     *         and Using Facet Information</a> in the <i>Amazon CloudSearch Developer
     *         Guide</i>. <examples> <example> <name>Counting Particular Buckets of
     *         Values</name> <description>This request uses the <code>buckets</code>
     *         option to calculate and return facet counts by decade.</description>
     *         <request>
     *         {"year":{"buckets":["[1970,1979]","[1980,1989]","[1990,1999]","[2000,2009]","[2010,}"]}}
     *         </request> <response/> </example> <example> <name>Sorting Facets By
     *         Facet Count</name> <description>This request sets the
     *         <code>sort</code> option to <code>count</code> to sort the facet
     *         values by facet count, with the facet values that have the most
     *         matching documents listed first. Setting the <code>size</code> option
     *         to 3 returns only the top three facet values.</description> <request>
     *         {"year":{"sort":"count","size":3}} </request> <response/> </example>
     *         <example> <name>Sorting Facets By Value</name> <description>This
     *         request sets the <code>sort</code> option to <code>bucket</code> to
     *         sort the facet values numerically by year, with earliest year listed
     *         first. </description> <request> {"year":{"sort":"bucket"}} </request>
     *         <response/> </example> </examples>
     */
    public void setFacet(String facet) {
        this.facet = facet;
    }
    
    /**
     * Specifies one or more fields for which to get facet information, and
     * options that control how the facet information is returned. Each
     * specified field must be facet-enabled in the domain configuration. The
     * fields and options are specified in JSON using the form
     * <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     * <p>You can specify the following faceting options: <ul> <li>
     * <p><code>buckets</code> specifies an array of the facet values or
     * ranges to count. Ranges are specified using the same syntax that you
     * use to search for a range of values. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-ranges.html">
     * Searching for a Range of Values</a> in the <i>Amazon CloudSearch
     * Developer Guide</i>. Buckets are returned in the order they are
     * specified in the request. The <code>sort</code> and <code>size</code>
     * options are not valid if you specify <code>buckets</code>. </li> <li>
     * <p><code>size</code> specifies the maximum number of facets to include
     * in the results. By default, Amazon CloudSearch returns counts for the
     * top 10. The <code>size</code> parameter is only valid when you specify
     * the <code>sort</code> option; it cannot be used in conjunction with
     * <code>buckets</code>. </li> <li> <p><code>sort</code> specifies how
     * you want to sort the facets in the results: <code>bucket</code> or
     * <code>count</code>. Specify <code>bucket</code> to sort alphabetically
     * or numerically by facet value (in ascending order). Specify
     * <code>count</code> to sort by the facet counts computed for each facet
     * value (in descending order). To retrieve facet counts for particular
     * values or ranges of values, use the <code>buckets</code> option
     * instead of <code>sort</code>. </li> </ul> <p>If no facet options are
     * specified, facet counts are computed for all field values, the facets
     * are sorted by facet count, and the top 10 facets are returned in the
     * results. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/faceting.html">Getting
     * and Using Facet Information</a> in the <i>Amazon CloudSearch Developer
     * Guide</i>. <examples> <example> <name>Counting Particular Buckets of
     * Values</name> <description>This request uses the <code>buckets</code>
     * option to calculate and return facet counts by decade.</description>
     * <request>
     * {"year":{"buckets":["[1970,1979]","[1980,1989]","[1990,1999]","[2000,2009]","[2010,}"]}}
     * </request> <response/> </example> <example> <name>Sorting Facets By
     * Facet Count</name> <description>This request sets the
     * <code>sort</code> option to <code>count</code> to sort the facet
     * values by facet count, with the facet values that have the most
     * matching documents listed first. Setting the <code>size</code> option
     * to 3 returns only the top three facet values.</description> <request>
     * {"year":{"sort":"count","size":3}} </request> <response/> </example>
     * <example> <name>Sorting Facets By Value</name> <description>This
     * request sets the <code>sort</code> option to <code>bucket</code> to
     * sort the facet values numerically by year, with earliest year listed
     * first. </description> <request> {"year":{"sort":"bucket"}} </request>
     * <response/> </example> </examples>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param facet Specifies one or more fields for which to get facet information, and
     *         options that control how the facet information is returned. Each
     *         specified field must be facet-enabled in the domain configuration. The
     *         fields and options are specified in JSON using the form
     *         <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     *         <p>You can specify the following faceting options: <ul> <li>
     *         <p><code>buckets</code> specifies an array of the facet values or
     *         ranges to count. Ranges are specified using the same syntax that you
     *         use to search for a range of values. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-ranges.html">
     *         Searching for a Range of Values</a> in the <i>Amazon CloudSearch
     *         Developer Guide</i>. Buckets are returned in the order they are
     *         specified in the request. The <code>sort</code> and <code>size</code>
     *         options are not valid if you specify <code>buckets</code>. </li> <li>
     *         <p><code>size</code> specifies the maximum number of facets to include
     *         in the results. By default, Amazon CloudSearch returns counts for the
     *         top 10. The <code>size</code> parameter is only valid when you specify
     *         the <code>sort</code> option; it cannot be used in conjunction with
     *         <code>buckets</code>. </li> <li> <p><code>sort</code> specifies how
     *         you want to sort the facets in the results: <code>bucket</code> or
     *         <code>count</code>. Specify <code>bucket</code> to sort alphabetically
     *         or numerically by facet value (in ascending order). Specify
     *         <code>count</code> to sort by the facet counts computed for each facet
     *         value (in descending order). To retrieve facet counts for particular
     *         values or ranges of values, use the <code>buckets</code> option
     *         instead of <code>sort</code>. </li> </ul> <p>If no facet options are
     *         specified, facet counts are computed for all field values, the facets
     *         are sorted by facet count, and the top 10 facets are returned in the
     *         results. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/faceting.html">Getting
     *         and Using Facet Information</a> in the <i>Amazon CloudSearch Developer
     *         Guide</i>. <examples> <example> <name>Counting Particular Buckets of
     *         Values</name> <description>This request uses the <code>buckets</code>
     *         option to calculate and return facet counts by decade.</description>
     *         <request>
     *         {"year":{"buckets":["[1970,1979]","[1980,1989]","[1990,1999]","[2000,2009]","[2010,}"]}}
     *         </request> <response/> </example> <example> <name>Sorting Facets By
     *         Facet Count</name> <description>This request sets the
     *         <code>sort</code> option to <code>count</code> to sort the facet
     *         values by facet count, with the facet values that have the most
     *         matching documents listed first. Setting the <code>size</code> option
     *         to 3 returns only the top three facet values.</description> <request>
     *         {"year":{"sort":"count","size":3}} </request> <response/> </example>
     *         <example> <name>Sorting Facets By Value</name> <description>This
     *         request sets the <code>sort</code> option to <code>bucket</code> to
     *         sort the facet values numerically by year, with earliest year listed
     *         first. </description> <request> {"year":{"sort":"bucket"}} </request>
     *         <response/> </example> </examples>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withFacet(String facet) {
        this.facet = facet;
        return this;
    }

    /**
     * Specifies a structured query that filters the results of a search
     * without affecting how the results are scored and sorted. You use
     * <code>filterQuery</code> in conjunction with the <code>query</code>
     * parameter to filter the documents that match the constraints specified
     * in the <code>query</code> parameter. Specifying a filter controls only
     * which matching documents are included in the results, it has no effect
     * on how they are scored and sorted. The <code>filterQuery</code>
     * parameter supports the full structured query syntax. <p>For more
     * information about using filters, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/filtering-results.html">Filtering
     * Matching Documents</a> in the <i>Amazon CloudSearch Developer
     * Guide</i>.
     *
     * @return Specifies a structured query that filters the results of a search
     *         without affecting how the results are scored and sorted. You use
     *         <code>filterQuery</code> in conjunction with the <code>query</code>
     *         parameter to filter the documents that match the constraints specified
     *         in the <code>query</code> parameter. Specifying a filter controls only
     *         which matching documents are included in the results, it has no effect
     *         on how they are scored and sorted. The <code>filterQuery</code>
     *         parameter supports the full structured query syntax. <p>For more
     *         information about using filters, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/filtering-results.html">Filtering
     *         Matching Documents</a> in the <i>Amazon CloudSearch Developer
     *         Guide</i>.
     */
    public String getFilterQuery() {
        return filterQuery;
    }
    
    /**
     * Specifies a structured query that filters the results of a search
     * without affecting how the results are scored and sorted. You use
     * <code>filterQuery</code> in conjunction with the <code>query</code>
     * parameter to filter the documents that match the constraints specified
     * in the <code>query</code> parameter. Specifying a filter controls only
     * which matching documents are included in the results, it has no effect
     * on how they are scored and sorted. The <code>filterQuery</code>
     * parameter supports the full structured query syntax. <p>For more
     * information about using filters, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/filtering-results.html">Filtering
     * Matching Documents</a> in the <i>Amazon CloudSearch Developer
     * Guide</i>.
     *
     * @param filterQuery Specifies a structured query that filters the results of a search
     *         without affecting how the results are scored and sorted. You use
     *         <code>filterQuery</code> in conjunction with the <code>query</code>
     *         parameter to filter the documents that match the constraints specified
     *         in the <code>query</code> parameter. Specifying a filter controls only
     *         which matching documents are included in the results, it has no effect
     *         on how they are scored and sorted. The <code>filterQuery</code>
     *         parameter supports the full structured query syntax. <p>For more
     *         information about using filters, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/filtering-results.html">Filtering
     *         Matching Documents</a> in the <i>Amazon CloudSearch Developer
     *         Guide</i>.
     */
    public void setFilterQuery(String filterQuery) {
        this.filterQuery = filterQuery;
    }
    
    /**
     * Specifies a structured query that filters the results of a search
     * without affecting how the results are scored and sorted. You use
     * <code>filterQuery</code> in conjunction with the <code>query</code>
     * parameter to filter the documents that match the constraints specified
     * in the <code>query</code> parameter. Specifying a filter controls only
     * which matching documents are included in the results, it has no effect
     * on how they are scored and sorted. The <code>filterQuery</code>
     * parameter supports the full structured query syntax. <p>For more
     * information about using filters, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/filtering-results.html">Filtering
     * Matching Documents</a> in the <i>Amazon CloudSearch Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filterQuery Specifies a structured query that filters the results of a search
     *         without affecting how the results are scored and sorted. You use
     *         <code>filterQuery</code> in conjunction with the <code>query</code>
     *         parameter to filter the documents that match the constraints specified
     *         in the <code>query</code> parameter. Specifying a filter controls only
     *         which matching documents are included in the results, it has no effect
     *         on how they are scored and sorted. The <code>filterQuery</code>
     *         parameter supports the full structured query syntax. <p>For more
     *         information about using filters, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/filtering-results.html">Filtering
     *         Matching Documents</a> in the <i>Amazon CloudSearch Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withFilterQuery(String filterQuery) {
        this.filterQuery = filterQuery;
        return this;
    }

    /**
     * Retrieves highlights for matches in the specified <code>text</code> or
     * <code>text-array</code> fields. Each specified field must be highlight
     * enabled in the domain configuration. The fields and options are
     * specified in JSON using the form
     * <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     * <p>You can specify the following highlight options: <ul> <li>
     * <code>format</code>: specifies the format of the data in the text
     * field: <code>text</code> or <code>html</code>. When data is returned
     * as HTML, all non-alphanumeric characters are encoded. The default is
     * <code>html</code>. </li> <li> <code>max_phrases</code>: specifies the
     * maximum number of occurrences of the search term(s) you want to
     * highlight. By default, the first occurrence is highlighted. </li> <li>
     * <code>pre_tag</code>: specifies the string to prepend to an occurrence
     * of a search term. The default for HTML highlights is
     * <code><em></code>. The default for text highlights is <code>*</code>.
     * </li> <li> <code>post_tag</code>: specifies the string to append to an
     * occurrence of a search term. The default for HTML highlights is
     * <code></em></code>. The default for text highlights is <code>*</code>.
     * </li> </ul> <p>If no highlight options are specified for a field, the
     * returned field text is treated as HTML and the first match is
     * highlighted with emphasis tags: <code><em>search-term</em></code>.
     * <examples> <example> <name>Setting Highlight Options</name>
     * <description>This example retrieves highlights for the
     * <code>actors</code> and <code>title</code> fields.</description>
     * <request>{ "actors": {}, "title": {"format": "text","max_phrases":
     * 2,"pre_tag": "<b>","post_tag": "</b>"} }</request> </example>
     * </examples>
     *
     * @return Retrieves highlights for matches in the specified <code>text</code> or
     *         <code>text-array</code> fields. Each specified field must be highlight
     *         enabled in the domain configuration. The fields and options are
     *         specified in JSON using the form
     *         <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     *         <p>You can specify the following highlight options: <ul> <li>
     *         <code>format</code>: specifies the format of the data in the text
     *         field: <code>text</code> or <code>html</code>. When data is returned
     *         as HTML, all non-alphanumeric characters are encoded. The default is
     *         <code>html</code>. </li> <li> <code>max_phrases</code>: specifies the
     *         maximum number of occurrences of the search term(s) you want to
     *         highlight. By default, the first occurrence is highlighted. </li> <li>
     *         <code>pre_tag</code>: specifies the string to prepend to an occurrence
     *         of a search term. The default for HTML highlights is
     *         <code><em></code>. The default for text highlights is <code>*</code>.
     *         </li> <li> <code>post_tag</code>: specifies the string to append to an
     *         occurrence of a search term. The default for HTML highlights is
     *         <code></em></code>. The default for text highlights is <code>*</code>.
     *         </li> </ul> <p>If no highlight options are specified for a field, the
     *         returned field text is treated as HTML and the first match is
     *         highlighted with emphasis tags: <code><em>search-term</em></code>.
     *         <examples> <example> <name>Setting Highlight Options</name>
     *         <description>This example retrieves highlights for the
     *         <code>actors</code> and <code>title</code> fields.</description>
     *         <request>{ "actors": {}, "title": {"format": "text","max_phrases":
     *         2,"pre_tag": "<b>","post_tag": "</b>"} }</request> </example>
     *         </examples>
     */
    public String getHighlight() {
        return highlight;
    }
    
    /**
     * Retrieves highlights for matches in the specified <code>text</code> or
     * <code>text-array</code> fields. Each specified field must be highlight
     * enabled in the domain configuration. The fields and options are
     * specified in JSON using the form
     * <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     * <p>You can specify the following highlight options: <ul> <li>
     * <code>format</code>: specifies the format of the data in the text
     * field: <code>text</code> or <code>html</code>. When data is returned
     * as HTML, all non-alphanumeric characters are encoded. The default is
     * <code>html</code>. </li> <li> <code>max_phrases</code>: specifies the
     * maximum number of occurrences of the search term(s) you want to
     * highlight. By default, the first occurrence is highlighted. </li> <li>
     * <code>pre_tag</code>: specifies the string to prepend to an occurrence
     * of a search term. The default for HTML highlights is
     * <code><em></code>. The default for text highlights is <code>*</code>.
     * </li> <li> <code>post_tag</code>: specifies the string to append to an
     * occurrence of a search term. The default for HTML highlights is
     * <code></em></code>. The default for text highlights is <code>*</code>.
     * </li> </ul> <p>If no highlight options are specified for a field, the
     * returned field text is treated as HTML and the first match is
     * highlighted with emphasis tags: <code><em>search-term</em></code>.
     * <examples> <example> <name>Setting Highlight Options</name>
     * <description>This example retrieves highlights for the
     * <code>actors</code> and <code>title</code> fields.</description>
     * <request>{ "actors": {}, "title": {"format": "text","max_phrases":
     * 2,"pre_tag": "<b>","post_tag": "</b>"} }</request> </example>
     * </examples>
     *
     * @param highlight Retrieves highlights for matches in the specified <code>text</code> or
     *         <code>text-array</code> fields. Each specified field must be highlight
     *         enabled in the domain configuration. The fields and options are
     *         specified in JSON using the form
     *         <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     *         <p>You can specify the following highlight options: <ul> <li>
     *         <code>format</code>: specifies the format of the data in the text
     *         field: <code>text</code> or <code>html</code>. When data is returned
     *         as HTML, all non-alphanumeric characters are encoded. The default is
     *         <code>html</code>. </li> <li> <code>max_phrases</code>: specifies the
     *         maximum number of occurrences of the search term(s) you want to
     *         highlight. By default, the first occurrence is highlighted. </li> <li>
     *         <code>pre_tag</code>: specifies the string to prepend to an occurrence
     *         of a search term. The default for HTML highlights is
     *         <code><em></code>. The default for text highlights is <code>*</code>.
     *         </li> <li> <code>post_tag</code>: specifies the string to append to an
     *         occurrence of a search term. The default for HTML highlights is
     *         <code></em></code>. The default for text highlights is <code>*</code>.
     *         </li> </ul> <p>If no highlight options are specified for a field, the
     *         returned field text is treated as HTML and the first match is
     *         highlighted with emphasis tags: <code><em>search-term</em></code>.
     *         <examples> <example> <name>Setting Highlight Options</name>
     *         <description>This example retrieves highlights for the
     *         <code>actors</code> and <code>title</code> fields.</description>
     *         <request>{ "actors": {}, "title": {"format": "text","max_phrases":
     *         2,"pre_tag": "<b>","post_tag": "</b>"} }</request> </example>
     *         </examples>
     */
    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }
    
    /**
     * Retrieves highlights for matches in the specified <code>text</code> or
     * <code>text-array</code> fields. Each specified field must be highlight
     * enabled in the domain configuration. The fields and options are
     * specified in JSON using the form
     * <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     * <p>You can specify the following highlight options: <ul> <li>
     * <code>format</code>: specifies the format of the data in the text
     * field: <code>text</code> or <code>html</code>. When data is returned
     * as HTML, all non-alphanumeric characters are encoded. The default is
     * <code>html</code>. </li> <li> <code>max_phrases</code>: specifies the
     * maximum number of occurrences of the search term(s) you want to
     * highlight. By default, the first occurrence is highlighted. </li> <li>
     * <code>pre_tag</code>: specifies the string to prepend to an occurrence
     * of a search term. The default for HTML highlights is
     * <code><em></code>. The default for text highlights is <code>*</code>.
     * </li> <li> <code>post_tag</code>: specifies the string to append to an
     * occurrence of a search term. The default for HTML highlights is
     * <code></em></code>. The default for text highlights is <code>*</code>.
     * </li> </ul> <p>If no highlight options are specified for a field, the
     * returned field text is treated as HTML and the first match is
     * highlighted with emphasis tags: <code><em>search-term</em></code>.
     * <examples> <example> <name>Setting Highlight Options</name>
     * <description>This example retrieves highlights for the
     * <code>actors</code> and <code>title</code> fields.</description>
     * <request>{ "actors": {}, "title": {"format": "text","max_phrases":
     * 2,"pre_tag": "<b>","post_tag": "</b>"} }</request> </example>
     * </examples>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param highlight Retrieves highlights for matches in the specified <code>text</code> or
     *         <code>text-array</code> fields. Each specified field must be highlight
     *         enabled in the domain configuration. The fields and options are
     *         specified in JSON using the form
     *         <code>{"FIELD":{"OPTION":VALUE,"OPTION:"STRING"},"FIELD":{"OPTION":VALUE,"OPTION":"STRING"}}</code>.
     *         <p>You can specify the following highlight options: <ul> <li>
     *         <code>format</code>: specifies the format of the data in the text
     *         field: <code>text</code> or <code>html</code>. When data is returned
     *         as HTML, all non-alphanumeric characters are encoded. The default is
     *         <code>html</code>. </li> <li> <code>max_phrases</code>: specifies the
     *         maximum number of occurrences of the search term(s) you want to
     *         highlight. By default, the first occurrence is highlighted. </li> <li>
     *         <code>pre_tag</code>: specifies the string to prepend to an occurrence
     *         of a search term. The default for HTML highlights is
     *         <code><em></code>. The default for text highlights is <code>*</code>.
     *         </li> <li> <code>post_tag</code>: specifies the string to append to an
     *         occurrence of a search term. The default for HTML highlights is
     *         <code></em></code>. The default for text highlights is <code>*</code>.
     *         </li> </ul> <p>If no highlight options are specified for a field, the
     *         returned field text is treated as HTML and the first match is
     *         highlighted with emphasis tags: <code><em>search-term</em></code>.
     *         <examples> <example> <name>Setting Highlight Options</name>
     *         <description>This example retrieves highlights for the
     *         <code>actors</code> and <code>title</code> fields.</description>
     *         <request>{ "actors": {}, "title": {"format": "text","max_phrases":
     *         2,"pre_tag": "<b>","post_tag": "</b>"} }</request> </example>
     *         </examples>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withHighlight(String highlight) {
        this.highlight = highlight;
        return this;
    }

    /**
     * Enables partial results to be returned if one or more index partitions
     * are unavailable. When your search index is partitioned across multiple
     * search instances, by default Amazon CloudSearch only returns results
     * if every partition can be queried. This means that the failure of a
     * single search instance can result in 5xx (internal server) errors.
     * When you enable partial results, Amazon CloudSearch returns whatever
     * results are available and includes the percentage of documents
     * searched in the search results (percent-searched). This enables you to
     * more gracefully degrade your users' search experience. For example,
     * rather than displaying no results, you could display the partial
     * results and a message indicating that the results might be incomplete
     * due to a temporary system outage.
     *
     * @return Enables partial results to be returned if one or more index partitions
     *         are unavailable. When your search index is partitioned across multiple
     *         search instances, by default Amazon CloudSearch only returns results
     *         if every partition can be queried. This means that the failure of a
     *         single search instance can result in 5xx (internal server) errors.
     *         When you enable partial results, Amazon CloudSearch returns whatever
     *         results are available and includes the percentage of documents
     *         searched in the search results (percent-searched). This enables you to
     *         more gracefully degrade your users' search experience. For example,
     *         rather than displaying no results, you could display the partial
     *         results and a message indicating that the results might be incomplete
     *         due to a temporary system outage.
     */
    public Boolean isPartial() {
        return partial;
    }
    
    /**
     * Enables partial results to be returned if one or more index partitions
     * are unavailable. When your search index is partitioned across multiple
     * search instances, by default Amazon CloudSearch only returns results
     * if every partition can be queried. This means that the failure of a
     * single search instance can result in 5xx (internal server) errors.
     * When you enable partial results, Amazon CloudSearch returns whatever
     * results are available and includes the percentage of documents
     * searched in the search results (percent-searched). This enables you to
     * more gracefully degrade your users' search experience. For example,
     * rather than displaying no results, you could display the partial
     * results and a message indicating that the results might be incomplete
     * due to a temporary system outage.
     *
     * @param partial Enables partial results to be returned if one or more index partitions
     *         are unavailable. When your search index is partitioned across multiple
     *         search instances, by default Amazon CloudSearch only returns results
     *         if every partition can be queried. This means that the failure of a
     *         single search instance can result in 5xx (internal server) errors.
     *         When you enable partial results, Amazon CloudSearch returns whatever
     *         results are available and includes the percentage of documents
     *         searched in the search results (percent-searched). This enables you to
     *         more gracefully degrade your users' search experience. For example,
     *         rather than displaying no results, you could display the partial
     *         results and a message indicating that the results might be incomplete
     *         due to a temporary system outage.
     */
    public void setPartial(Boolean partial) {
        this.partial = partial;
    }
    
    /**
     * Enables partial results to be returned if one or more index partitions
     * are unavailable. When your search index is partitioned across multiple
     * search instances, by default Amazon CloudSearch only returns results
     * if every partition can be queried. This means that the failure of a
     * single search instance can result in 5xx (internal server) errors.
     * When you enable partial results, Amazon CloudSearch returns whatever
     * results are available and includes the percentage of documents
     * searched in the search results (percent-searched). This enables you to
     * more gracefully degrade your users' search experience. For example,
     * rather than displaying no results, you could display the partial
     * results and a message indicating that the results might be incomplete
     * due to a temporary system outage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partial Enables partial results to be returned if one or more index partitions
     *         are unavailable. When your search index is partitioned across multiple
     *         search instances, by default Amazon CloudSearch only returns results
     *         if every partition can be queried. This means that the failure of a
     *         single search instance can result in 5xx (internal server) errors.
     *         When you enable partial results, Amazon CloudSearch returns whatever
     *         results are available and includes the percentage of documents
     *         searched in the search results (percent-searched). This enables you to
     *         more gracefully degrade your users' search experience. For example,
     *         rather than displaying no results, you could display the partial
     *         results and a message indicating that the results might be incomplete
     *         due to a temporary system outage.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withPartial(Boolean partial) {
        this.partial = partial;
        return this;
    }

    /**
     * Enables partial results to be returned if one or more index partitions
     * are unavailable. When your search index is partitioned across multiple
     * search instances, by default Amazon CloudSearch only returns results
     * if every partition can be queried. This means that the failure of a
     * single search instance can result in 5xx (internal server) errors.
     * When you enable partial results, Amazon CloudSearch returns whatever
     * results are available and includes the percentage of documents
     * searched in the search results (percent-searched). This enables you to
     * more gracefully degrade your users' search experience. For example,
     * rather than displaying no results, you could display the partial
     * results and a message indicating that the results might be incomplete
     * due to a temporary system outage.
     *
     * @return Enables partial results to be returned if one or more index partitions
     *         are unavailable. When your search index is partitioned across multiple
     *         search instances, by default Amazon CloudSearch only returns results
     *         if every partition can be queried. This means that the failure of a
     *         single search instance can result in 5xx (internal server) errors.
     *         When you enable partial results, Amazon CloudSearch returns whatever
     *         results are available and includes the percentage of documents
     *         searched in the search results (percent-searched). This enables you to
     *         more gracefully degrade your users' search experience. For example,
     *         rather than displaying no results, you could display the partial
     *         results and a message indicating that the results might be incomplete
     *         due to a temporary system outage.
     */
    public Boolean getPartial() {
        return partial;
    }

    /**
     * Specifies the search criteria for the request. How you specify the
     * search criteria depends on the query parser used for the request and
     * the parser options specified in the <code>queryOptions</code>
     * parameter. By default, the <code>simple</code> query parser is used to
     * process requests. To use the <code>structured</code>,
     * <code>lucene</code>, or <code>dismax</code> query parser, you must
     * also specify the <code>queryParser</code> parameter. <p>For more
     * information about specifying search criteria, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching
     * Your Data</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return Specifies the search criteria for the request. How you specify the
     *         search criteria depends on the query parser used for the request and
     *         the parser options specified in the <code>queryOptions</code>
     *         parameter. By default, the <code>simple</code> query parser is used to
     *         process requests. To use the <code>structured</code>,
     *         <code>lucene</code>, or <code>dismax</code> query parser, you must
     *         also specify the <code>queryParser</code> parameter. <p>For more
     *         information about specifying search criteria, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching
     *         Your Data</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public String getQuery() {
        return query;
    }
    
    /**
     * Specifies the search criteria for the request. How you specify the
     * search criteria depends on the query parser used for the request and
     * the parser options specified in the <code>queryOptions</code>
     * parameter. By default, the <code>simple</code> query parser is used to
     * process requests. To use the <code>structured</code>,
     * <code>lucene</code>, or <code>dismax</code> query parser, you must
     * also specify the <code>queryParser</code> parameter. <p>For more
     * information about specifying search criteria, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching
     * Your Data</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @param query Specifies the search criteria for the request. How you specify the
     *         search criteria depends on the query parser used for the request and
     *         the parser options specified in the <code>queryOptions</code>
     *         parameter. By default, the <code>simple</code> query parser is used to
     *         process requests. To use the <code>structured</code>,
     *         <code>lucene</code>, or <code>dismax</code> query parser, you must
     *         also specify the <code>queryParser</code> parameter. <p>For more
     *         information about specifying search criteria, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching
     *         Your Data</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public void setQuery(String query) {
        this.query = query;
    }
    
    /**
     * Specifies the search criteria for the request. How you specify the
     * search criteria depends on the query parser used for the request and
     * the parser options specified in the <code>queryOptions</code>
     * parameter. By default, the <code>simple</code> query parser is used to
     * process requests. To use the <code>structured</code>,
     * <code>lucene</code>, or <code>dismax</code> query parser, you must
     * also specify the <code>queryParser</code> parameter. <p>For more
     * information about specifying search criteria, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching
     * Your Data</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param query Specifies the search criteria for the request. How you specify the
     *         search criteria depends on the query parser used for the request and
     *         the parser options specified in the <code>queryOptions</code>
     *         parameter. By default, the <code>simple</code> query parser is used to
     *         process requests. To use the <code>structured</code>,
     *         <code>lucene</code>, or <code>dismax</code> query parser, you must
     *         also specify the <code>queryParser</code> parameter. <p>For more
     *         information about specifying search criteria, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching
     *         Your Data</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Configures options for the query parser specified in the
     * <code>queryParser</code> parameter. <p>The options you can configure
     * vary according to which parser you use: <ul>
     * <li><code>defaultOperator</code>: The default operator used to combine
     * individual terms in the search string. For example:
     * <code>defaultOperator: 'or'</code>. For the <code>dismax</code>
     * parser, you specify a percentage that represents the percentage of
     * terms in the search string (rounded down) that must match, rather than
     * a default operator. A value of <code>0%</code> is the equivalent to
     * OR, and a value of <code>100%</code> is equivalent to AND. The
     * percentage must be specified as a value in the range 0-100 followed by
     * the percent (%) symbol. For example, <code>defaultOperator:
     * 50%</code>. Valid values: <code>and</code>, <code>or</code>, a
     * percentage in the range 0%-100% (<code>dismax</code>). Default:
     * <code>and</code> (<code>simple</code>, <code>structured</code>,
     * <code>lucene</code>) or <code>100</code> (<code>dismax</code>). Valid
     * for: <code>simple</code>, <code>structured</code>,
     * <code>lucene</code>, and <code>dismax</code>.</li>
     * <li><code>fields</code>: An array of the fields to search when no
     * fields are specified in a search. If no fields are specified in a
     * search and this option is not specified, all text and text-array
     * fields are searched. You can specify a weight for each field to
     * control the relative importance of each field when Amazon CloudSearch
     * calculates relevance scores. To specify a field weight, append a caret
     * (<code>^</code>) symbol and the weight to the field name. For example,
     * to boost the importance of the <code>title</code> field over the
     * <code>description</code> field you could specify:
     * <code>"fields":["title^5","description"]</code>. Valid values: The
     * name of any configured field and an optional numeric value greater
     * than zero. Default: All <code>text</code> and <code>text-array</code>
     * fields. Valid for: <code>simple</code>, <code>structured</code>,
     * <code>lucene</code>, and <code>dismax</code>.</li>
     * <li><code>operators</code>: An array of the operators or special
     * characters you want to disable for the simple query parser. If you
     * disable the <code>and</code>, <code>or</code>, or <code>not</code>
     * operators, the corresponding operators (<code>+</code>,
     * <code>|</code>, <code>-</code>) have no special meaning and are
     * dropped from the search string. Similarly, disabling
     * <code>prefix</code> disables the wildcard operator (<code>*</code>)
     * and disabling <code>phrase</code> disables the ability to search for
     * phrases by enclosing phrases in double quotes. Disabling precedence
     * disables the ability to control order of precedence using parentheses.
     * Disabling <code>near</code> disables the ability to use the ~ operator
     * to perform a sloppy phrase search. Disabling the <code>fuzzy</code>
     * operator disables the ability to use the ~ operator to perform a fuzzy
     * search. <code>escape</code> disables the ability to use a backslash
     * (<code>\</code>) to escape special characters within the search
     * string. Disabling whitespace is an advanced option that prevents the
     * parser from tokenizing on whitespace, which can be useful for
     * Vietnamese. (It prevents Vietnamese words from being split
     * incorrectly.) For example, you could disable all operators other than
     * the phrase operator to support just simple term and phrase queries:
     * <code>"operators":["and","not","or", "prefix"]</code>. Valid values:
     * <code>and</code>, <code>escape</code>, <code>fuzzy</code>,
     * <code>near</code>, <code>not</code>, <code>or</code>,
     * <code>phrase</code>, <code>precedence</code>, <code>prefix</code>,
     * <code>whitespace</code>. Default: All operators and special characters
     * are enabled. Valid for: <code>simple</code>.</li>
     * <li><code>phraseFields</code>: An array of the <code>text</code> or
     * <code>text-array</code> fields you want to use for phrase searches.
     * When the terms in the search string appear in close proximity within a
     * field, the field scores higher. You can specify a weight for each
     * field to boost that score. The <code>phraseSlop</code> option controls
     * how much the matches can deviate from the search string and still be
     * boosted. To specify a field weight, append a caret (<code>^</code>)
     * symbol and the weight to the field name. For example, to boost phrase
     * matches in the <code>title</code> field over the <code>abstract</code>
     * field, you could specify: <code>"phraseFields":["title^3",
     * "plot"]</code> Valid values: The name of any <code>text</code> or
     * <code>text-array</code> field and an optional numeric value greater
     * than zero. Default: No fields. If you don't specify any fields with
     * <code>phraseFields</code>, proximity scoring is disabled even if
     * <code>phraseSlop</code> is specified. Valid for:
     * <code>dismax</code>.</li> <li><code>phraseSlop</code>: An integer
     * value that specifies how much matches can deviate from the search
     * phrase and still be boosted according to the weights specified in the
     * <code>phraseFields</code> option; for example, <code>phraseSlop:
     * 2</code>. You must also specify <code>phraseFields</code> to enable
     * proximity scoring. Valid values: positive integers. Default: 0. Valid
     * for: <code>dismax</code>.</li> <li><code>explicitPhraseSlop</code>: An
     * integer value that specifies how much a match can deviate from the
     * search phrase when the phrase is enclosed in double quotes in the
     * search string. (Phrases that exceed this proximity distance are not
     * considered a match.) For example, to specify a slop of three for
     * dismax phrase queries, you would specify
     * <code>"explicitPhraseSlop":3</code>. Valid values: positive integers.
     * Default: 0. Valid for: <code>dismax</code>.</li>
     * <li><code>tieBreaker</code>: When a term in the search string is found
     * in a document's field, a score is calculated for that field based on
     * how common the word is in that field compared to other documents. If
     * the term occurs in multiple fields within a document, by default only
     * the highest scoring field contributes to the document's overall score.
     * You can specify a <code>tieBreaker</code> value to enable the matches
     * in lower-scoring fields to contribute to the document's score. That
     * way, if two documents have the same max field score for a particular
     * term, the score for the document that has matches in more fields will
     * be higher. The formula for calculating the score with a tieBreaker is
     * <code>(max field score) + (tieBreaker) * (sum of the scores for the
     * rest of the matching fields)</code>. Set <code>tieBreaker</code> to 0
     * to disregard all but the highest scoring field (pure max):
     * <code>"tieBreaker":0</code>. Set to 1 to sum the scores from all
     * fields (pure sum): <code>"tieBreaker":1</code>. Valid values: 0.0 to
     * 1.0. Default: 0.0. Valid for: <code>dismax</code>. </li> </ul>
     * <examples> <example> <name>Setting Default Search Fields</name>
     * <description>This example searches the <code>title</code> and
     * <code>plot</code> fields if no fields are specified in the search
     * criteria.</description> <request>{"fields":["title","plot"]}</request>
     * <response> </response> </example> </examples>
     *
     * @return Configures options for the query parser specified in the
     *         <code>queryParser</code> parameter. <p>The options you can configure
     *         vary according to which parser you use: <ul>
     *         <li><code>defaultOperator</code>: The default operator used to combine
     *         individual terms in the search string. For example:
     *         <code>defaultOperator: 'or'</code>. For the <code>dismax</code>
     *         parser, you specify a percentage that represents the percentage of
     *         terms in the search string (rounded down) that must match, rather than
     *         a default operator. A value of <code>0%</code> is the equivalent to
     *         OR, and a value of <code>100%</code> is equivalent to AND. The
     *         percentage must be specified as a value in the range 0-100 followed by
     *         the percent (%) symbol. For example, <code>defaultOperator:
     *         50%</code>. Valid values: <code>and</code>, <code>or</code>, a
     *         percentage in the range 0%-100% (<code>dismax</code>). Default:
     *         <code>and</code> (<code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>) or <code>100</code> (<code>dismax</code>). Valid
     *         for: <code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>, and <code>dismax</code>.</li>
     *         <li><code>fields</code>: An array of the fields to search when no
     *         fields are specified in a search. If no fields are specified in a
     *         search and this option is not specified, all text and text-array
     *         fields are searched. You can specify a weight for each field to
     *         control the relative importance of each field when Amazon CloudSearch
     *         calculates relevance scores. To specify a field weight, append a caret
     *         (<code>^</code>) symbol and the weight to the field name. For example,
     *         to boost the importance of the <code>title</code> field over the
     *         <code>description</code> field you could specify:
     *         <code>"fields":["title^5","description"]</code>. Valid values: The
     *         name of any configured field and an optional numeric value greater
     *         than zero. Default: All <code>text</code> and <code>text-array</code>
     *         fields. Valid for: <code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>, and <code>dismax</code>.</li>
     *         <li><code>operators</code>: An array of the operators or special
     *         characters you want to disable for the simple query parser. If you
     *         disable the <code>and</code>, <code>or</code>, or <code>not</code>
     *         operators, the corresponding operators (<code>+</code>,
     *         <code>|</code>, <code>-</code>) have no special meaning and are
     *         dropped from the search string. Similarly, disabling
     *         <code>prefix</code> disables the wildcard operator (<code>*</code>)
     *         and disabling <code>phrase</code> disables the ability to search for
     *         phrases by enclosing phrases in double quotes. Disabling precedence
     *         disables the ability to control order of precedence using parentheses.
     *         Disabling <code>near</code> disables the ability to use the ~ operator
     *         to perform a sloppy phrase search. Disabling the <code>fuzzy</code>
     *         operator disables the ability to use the ~ operator to perform a fuzzy
     *         search. <code>escape</code> disables the ability to use a backslash
     *         (<code>\</code>) to escape special characters within the search
     *         string. Disabling whitespace is an advanced option that prevents the
     *         parser from tokenizing on whitespace, which can be useful for
     *         Vietnamese. (It prevents Vietnamese words from being split
     *         incorrectly.) For example, you could disable all operators other than
     *         the phrase operator to support just simple term and phrase queries:
     *         <code>"operators":["and","not","or", "prefix"]</code>. Valid values:
     *         <code>and</code>, <code>escape</code>, <code>fuzzy</code>,
     *         <code>near</code>, <code>not</code>, <code>or</code>,
     *         <code>phrase</code>, <code>precedence</code>, <code>prefix</code>,
     *         <code>whitespace</code>. Default: All operators and special characters
     *         are enabled. Valid for: <code>simple</code>.</li>
     *         <li><code>phraseFields</code>: An array of the <code>text</code> or
     *         <code>text-array</code> fields you want to use for phrase searches.
     *         When the terms in the search string appear in close proximity within a
     *         field, the field scores higher. You can specify a weight for each
     *         field to boost that score. The <code>phraseSlop</code> option controls
     *         how much the matches can deviate from the search string and still be
     *         boosted. To specify a field weight, append a caret (<code>^</code>)
     *         symbol and the weight to the field name. For example, to boost phrase
     *         matches in the <code>title</code> field over the <code>abstract</code>
     *         field, you could specify: <code>"phraseFields":["title^3",
     *         "plot"]</code> Valid values: The name of any <code>text</code> or
     *         <code>text-array</code> field and an optional numeric value greater
     *         than zero. Default: No fields. If you don't specify any fields with
     *         <code>phraseFields</code>, proximity scoring is disabled even if
     *         <code>phraseSlop</code> is specified. Valid for:
     *         <code>dismax</code>.</li> <li><code>phraseSlop</code>: An integer
     *         value that specifies how much matches can deviate from the search
     *         phrase and still be boosted according to the weights specified in the
     *         <code>phraseFields</code> option; for example, <code>phraseSlop:
     *         2</code>. You must also specify <code>phraseFields</code> to enable
     *         proximity scoring. Valid values: positive integers. Default: 0. Valid
     *         for: <code>dismax</code>.</li> <li><code>explicitPhraseSlop</code>: An
     *         integer value that specifies how much a match can deviate from the
     *         search phrase when the phrase is enclosed in double quotes in the
     *         search string. (Phrases that exceed this proximity distance are not
     *         considered a match.) For example, to specify a slop of three for
     *         dismax phrase queries, you would specify
     *         <code>"explicitPhraseSlop":3</code>. Valid values: positive integers.
     *         Default: 0. Valid for: <code>dismax</code>.</li>
     *         <li><code>tieBreaker</code>: When a term in the search string is found
     *         in a document's field, a score is calculated for that field based on
     *         how common the word is in that field compared to other documents. If
     *         the term occurs in multiple fields within a document, by default only
     *         the highest scoring field contributes to the document's overall score.
     *         You can specify a <code>tieBreaker</code> value to enable the matches
     *         in lower-scoring fields to contribute to the document's score. That
     *         way, if two documents have the same max field score for a particular
     *         term, the score for the document that has matches in more fields will
     *         be higher. The formula for calculating the score with a tieBreaker is
     *         <code>(max field score) + (tieBreaker) * (sum of the scores for the
     *         rest of the matching fields)</code>. Set <code>tieBreaker</code> to 0
     *         to disregard all but the highest scoring field (pure max):
     *         <code>"tieBreaker":0</code>. Set to 1 to sum the scores from all
     *         fields (pure sum): <code>"tieBreaker":1</code>. Valid values: 0.0 to
     *         1.0. Default: 0.0. Valid for: <code>dismax</code>. </li> </ul>
     *         <examples> <example> <name>Setting Default Search Fields</name>
     *         <description>This example searches the <code>title</code> and
     *         <code>plot</code> fields if no fields are specified in the search
     *         criteria.</description> <request>{"fields":["title","plot"]}</request>
     *         <response> </response> </example> </examples>
     */
    public String getQueryOptions() {
        return queryOptions;
    }
    
    /**
     * Configures options for the query parser specified in the
     * <code>queryParser</code> parameter. <p>The options you can configure
     * vary according to which parser you use: <ul>
     * <li><code>defaultOperator</code>: The default operator used to combine
     * individual terms in the search string. For example:
     * <code>defaultOperator: 'or'</code>. For the <code>dismax</code>
     * parser, you specify a percentage that represents the percentage of
     * terms in the search string (rounded down) that must match, rather than
     * a default operator. A value of <code>0%</code> is the equivalent to
     * OR, and a value of <code>100%</code> is equivalent to AND. The
     * percentage must be specified as a value in the range 0-100 followed by
     * the percent (%) symbol. For example, <code>defaultOperator:
     * 50%</code>. Valid values: <code>and</code>, <code>or</code>, a
     * percentage in the range 0%-100% (<code>dismax</code>). Default:
     * <code>and</code> (<code>simple</code>, <code>structured</code>,
     * <code>lucene</code>) or <code>100</code> (<code>dismax</code>). Valid
     * for: <code>simple</code>, <code>structured</code>,
     * <code>lucene</code>, and <code>dismax</code>.</li>
     * <li><code>fields</code>: An array of the fields to search when no
     * fields are specified in a search. If no fields are specified in a
     * search and this option is not specified, all text and text-array
     * fields are searched. You can specify a weight for each field to
     * control the relative importance of each field when Amazon CloudSearch
     * calculates relevance scores. To specify a field weight, append a caret
     * (<code>^</code>) symbol and the weight to the field name. For example,
     * to boost the importance of the <code>title</code> field over the
     * <code>description</code> field you could specify:
     * <code>"fields":["title^5","description"]</code>. Valid values: The
     * name of any configured field and an optional numeric value greater
     * than zero. Default: All <code>text</code> and <code>text-array</code>
     * fields. Valid for: <code>simple</code>, <code>structured</code>,
     * <code>lucene</code>, and <code>dismax</code>.</li>
     * <li><code>operators</code>: An array of the operators or special
     * characters you want to disable for the simple query parser. If you
     * disable the <code>and</code>, <code>or</code>, or <code>not</code>
     * operators, the corresponding operators (<code>+</code>,
     * <code>|</code>, <code>-</code>) have no special meaning and are
     * dropped from the search string. Similarly, disabling
     * <code>prefix</code> disables the wildcard operator (<code>*</code>)
     * and disabling <code>phrase</code> disables the ability to search for
     * phrases by enclosing phrases in double quotes. Disabling precedence
     * disables the ability to control order of precedence using parentheses.
     * Disabling <code>near</code> disables the ability to use the ~ operator
     * to perform a sloppy phrase search. Disabling the <code>fuzzy</code>
     * operator disables the ability to use the ~ operator to perform a fuzzy
     * search. <code>escape</code> disables the ability to use a backslash
     * (<code>\</code>) to escape special characters within the search
     * string. Disabling whitespace is an advanced option that prevents the
     * parser from tokenizing on whitespace, which can be useful for
     * Vietnamese. (It prevents Vietnamese words from being split
     * incorrectly.) For example, you could disable all operators other than
     * the phrase operator to support just simple term and phrase queries:
     * <code>"operators":["and","not","or", "prefix"]</code>. Valid values:
     * <code>and</code>, <code>escape</code>, <code>fuzzy</code>,
     * <code>near</code>, <code>not</code>, <code>or</code>,
     * <code>phrase</code>, <code>precedence</code>, <code>prefix</code>,
     * <code>whitespace</code>. Default: All operators and special characters
     * are enabled. Valid for: <code>simple</code>.</li>
     * <li><code>phraseFields</code>: An array of the <code>text</code> or
     * <code>text-array</code> fields you want to use for phrase searches.
     * When the terms in the search string appear in close proximity within a
     * field, the field scores higher. You can specify a weight for each
     * field to boost that score. The <code>phraseSlop</code> option controls
     * how much the matches can deviate from the search string and still be
     * boosted. To specify a field weight, append a caret (<code>^</code>)
     * symbol and the weight to the field name. For example, to boost phrase
     * matches in the <code>title</code> field over the <code>abstract</code>
     * field, you could specify: <code>"phraseFields":["title^3",
     * "plot"]</code> Valid values: The name of any <code>text</code> or
     * <code>text-array</code> field and an optional numeric value greater
     * than zero. Default: No fields. If you don't specify any fields with
     * <code>phraseFields</code>, proximity scoring is disabled even if
     * <code>phraseSlop</code> is specified. Valid for:
     * <code>dismax</code>.</li> <li><code>phraseSlop</code>: An integer
     * value that specifies how much matches can deviate from the search
     * phrase and still be boosted according to the weights specified in the
     * <code>phraseFields</code> option; for example, <code>phraseSlop:
     * 2</code>. You must also specify <code>phraseFields</code> to enable
     * proximity scoring. Valid values: positive integers. Default: 0. Valid
     * for: <code>dismax</code>.</li> <li><code>explicitPhraseSlop</code>: An
     * integer value that specifies how much a match can deviate from the
     * search phrase when the phrase is enclosed in double quotes in the
     * search string. (Phrases that exceed this proximity distance are not
     * considered a match.) For example, to specify a slop of three for
     * dismax phrase queries, you would specify
     * <code>"explicitPhraseSlop":3</code>. Valid values: positive integers.
     * Default: 0. Valid for: <code>dismax</code>.</li>
     * <li><code>tieBreaker</code>: When a term in the search string is found
     * in a document's field, a score is calculated for that field based on
     * how common the word is in that field compared to other documents. If
     * the term occurs in multiple fields within a document, by default only
     * the highest scoring field contributes to the document's overall score.
     * You can specify a <code>tieBreaker</code> value to enable the matches
     * in lower-scoring fields to contribute to the document's score. That
     * way, if two documents have the same max field score for a particular
     * term, the score for the document that has matches in more fields will
     * be higher. The formula for calculating the score with a tieBreaker is
     * <code>(max field score) + (tieBreaker) * (sum of the scores for the
     * rest of the matching fields)</code>. Set <code>tieBreaker</code> to 0
     * to disregard all but the highest scoring field (pure max):
     * <code>"tieBreaker":0</code>. Set to 1 to sum the scores from all
     * fields (pure sum): <code>"tieBreaker":1</code>. Valid values: 0.0 to
     * 1.0. Default: 0.0. Valid for: <code>dismax</code>. </li> </ul>
     * <examples> <example> <name>Setting Default Search Fields</name>
     * <description>This example searches the <code>title</code> and
     * <code>plot</code> fields if no fields are specified in the search
     * criteria.</description> <request>{"fields":["title","plot"]}</request>
     * <response> </response> </example> </examples>
     *
     * @param queryOptions Configures options for the query parser specified in the
     *         <code>queryParser</code> parameter. <p>The options you can configure
     *         vary according to which parser you use: <ul>
     *         <li><code>defaultOperator</code>: The default operator used to combine
     *         individual terms in the search string. For example:
     *         <code>defaultOperator: 'or'</code>. For the <code>dismax</code>
     *         parser, you specify a percentage that represents the percentage of
     *         terms in the search string (rounded down) that must match, rather than
     *         a default operator. A value of <code>0%</code> is the equivalent to
     *         OR, and a value of <code>100%</code> is equivalent to AND. The
     *         percentage must be specified as a value in the range 0-100 followed by
     *         the percent (%) symbol. For example, <code>defaultOperator:
     *         50%</code>. Valid values: <code>and</code>, <code>or</code>, a
     *         percentage in the range 0%-100% (<code>dismax</code>). Default:
     *         <code>and</code> (<code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>) or <code>100</code> (<code>dismax</code>). Valid
     *         for: <code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>, and <code>dismax</code>.</li>
     *         <li><code>fields</code>: An array of the fields to search when no
     *         fields are specified in a search. If no fields are specified in a
     *         search and this option is not specified, all text and text-array
     *         fields are searched. You can specify a weight for each field to
     *         control the relative importance of each field when Amazon CloudSearch
     *         calculates relevance scores. To specify a field weight, append a caret
     *         (<code>^</code>) symbol and the weight to the field name. For example,
     *         to boost the importance of the <code>title</code> field over the
     *         <code>description</code> field you could specify:
     *         <code>"fields":["title^5","description"]</code>. Valid values: The
     *         name of any configured field and an optional numeric value greater
     *         than zero. Default: All <code>text</code> and <code>text-array</code>
     *         fields. Valid for: <code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>, and <code>dismax</code>.</li>
     *         <li><code>operators</code>: An array of the operators or special
     *         characters you want to disable for the simple query parser. If you
     *         disable the <code>and</code>, <code>or</code>, or <code>not</code>
     *         operators, the corresponding operators (<code>+</code>,
     *         <code>|</code>, <code>-</code>) have no special meaning and are
     *         dropped from the search string. Similarly, disabling
     *         <code>prefix</code> disables the wildcard operator (<code>*</code>)
     *         and disabling <code>phrase</code> disables the ability to search for
     *         phrases by enclosing phrases in double quotes. Disabling precedence
     *         disables the ability to control order of precedence using parentheses.
     *         Disabling <code>near</code> disables the ability to use the ~ operator
     *         to perform a sloppy phrase search. Disabling the <code>fuzzy</code>
     *         operator disables the ability to use the ~ operator to perform a fuzzy
     *         search. <code>escape</code> disables the ability to use a backslash
     *         (<code>\</code>) to escape special characters within the search
     *         string. Disabling whitespace is an advanced option that prevents the
     *         parser from tokenizing on whitespace, which can be useful for
     *         Vietnamese. (It prevents Vietnamese words from being split
     *         incorrectly.) For example, you could disable all operators other than
     *         the phrase operator to support just simple term and phrase queries:
     *         <code>"operators":["and","not","or", "prefix"]</code>. Valid values:
     *         <code>and</code>, <code>escape</code>, <code>fuzzy</code>,
     *         <code>near</code>, <code>not</code>, <code>or</code>,
     *         <code>phrase</code>, <code>precedence</code>, <code>prefix</code>,
     *         <code>whitespace</code>. Default: All operators and special characters
     *         are enabled. Valid for: <code>simple</code>.</li>
     *         <li><code>phraseFields</code>: An array of the <code>text</code> or
     *         <code>text-array</code> fields you want to use for phrase searches.
     *         When the terms in the search string appear in close proximity within a
     *         field, the field scores higher. You can specify a weight for each
     *         field to boost that score. The <code>phraseSlop</code> option controls
     *         how much the matches can deviate from the search string and still be
     *         boosted. To specify a field weight, append a caret (<code>^</code>)
     *         symbol and the weight to the field name. For example, to boost phrase
     *         matches in the <code>title</code> field over the <code>abstract</code>
     *         field, you could specify: <code>"phraseFields":["title^3",
     *         "plot"]</code> Valid values: The name of any <code>text</code> or
     *         <code>text-array</code> field and an optional numeric value greater
     *         than zero. Default: No fields. If you don't specify any fields with
     *         <code>phraseFields</code>, proximity scoring is disabled even if
     *         <code>phraseSlop</code> is specified. Valid for:
     *         <code>dismax</code>.</li> <li><code>phraseSlop</code>: An integer
     *         value that specifies how much matches can deviate from the search
     *         phrase and still be boosted according to the weights specified in the
     *         <code>phraseFields</code> option; for example, <code>phraseSlop:
     *         2</code>. You must also specify <code>phraseFields</code> to enable
     *         proximity scoring. Valid values: positive integers. Default: 0. Valid
     *         for: <code>dismax</code>.</li> <li><code>explicitPhraseSlop</code>: An
     *         integer value that specifies how much a match can deviate from the
     *         search phrase when the phrase is enclosed in double quotes in the
     *         search string. (Phrases that exceed this proximity distance are not
     *         considered a match.) For example, to specify a slop of three for
     *         dismax phrase queries, you would specify
     *         <code>"explicitPhraseSlop":3</code>. Valid values: positive integers.
     *         Default: 0. Valid for: <code>dismax</code>.</li>
     *         <li><code>tieBreaker</code>: When a term in the search string is found
     *         in a document's field, a score is calculated for that field based on
     *         how common the word is in that field compared to other documents. If
     *         the term occurs in multiple fields within a document, by default only
     *         the highest scoring field contributes to the document's overall score.
     *         You can specify a <code>tieBreaker</code> value to enable the matches
     *         in lower-scoring fields to contribute to the document's score. That
     *         way, if two documents have the same max field score for a particular
     *         term, the score for the document that has matches in more fields will
     *         be higher. The formula for calculating the score with a tieBreaker is
     *         <code>(max field score) + (tieBreaker) * (sum of the scores for the
     *         rest of the matching fields)</code>. Set <code>tieBreaker</code> to 0
     *         to disregard all but the highest scoring field (pure max):
     *         <code>"tieBreaker":0</code>. Set to 1 to sum the scores from all
     *         fields (pure sum): <code>"tieBreaker":1</code>. Valid values: 0.0 to
     *         1.0. Default: 0.0. Valid for: <code>dismax</code>. </li> </ul>
     *         <examples> <example> <name>Setting Default Search Fields</name>
     *         <description>This example searches the <code>title</code> and
     *         <code>plot</code> fields if no fields are specified in the search
     *         criteria.</description> <request>{"fields":["title","plot"]}</request>
     *         <response> </response> </example> </examples>
     */
    public void setQueryOptions(String queryOptions) {
        this.queryOptions = queryOptions;
    }
    
    /**
     * Configures options for the query parser specified in the
     * <code>queryParser</code> parameter. <p>The options you can configure
     * vary according to which parser you use: <ul>
     * <li><code>defaultOperator</code>: The default operator used to combine
     * individual terms in the search string. For example:
     * <code>defaultOperator: 'or'</code>. For the <code>dismax</code>
     * parser, you specify a percentage that represents the percentage of
     * terms in the search string (rounded down) that must match, rather than
     * a default operator. A value of <code>0%</code> is the equivalent to
     * OR, and a value of <code>100%</code> is equivalent to AND. The
     * percentage must be specified as a value in the range 0-100 followed by
     * the percent (%) symbol. For example, <code>defaultOperator:
     * 50%</code>. Valid values: <code>and</code>, <code>or</code>, a
     * percentage in the range 0%-100% (<code>dismax</code>). Default:
     * <code>and</code> (<code>simple</code>, <code>structured</code>,
     * <code>lucene</code>) or <code>100</code> (<code>dismax</code>). Valid
     * for: <code>simple</code>, <code>structured</code>,
     * <code>lucene</code>, and <code>dismax</code>.</li>
     * <li><code>fields</code>: An array of the fields to search when no
     * fields are specified in a search. If no fields are specified in a
     * search and this option is not specified, all text and text-array
     * fields are searched. You can specify a weight for each field to
     * control the relative importance of each field when Amazon CloudSearch
     * calculates relevance scores. To specify a field weight, append a caret
     * (<code>^</code>) symbol and the weight to the field name. For example,
     * to boost the importance of the <code>title</code> field over the
     * <code>description</code> field you could specify:
     * <code>"fields":["title^5","description"]</code>. Valid values: The
     * name of any configured field and an optional numeric value greater
     * than zero. Default: All <code>text</code> and <code>text-array</code>
     * fields. Valid for: <code>simple</code>, <code>structured</code>,
     * <code>lucene</code>, and <code>dismax</code>.</li>
     * <li><code>operators</code>: An array of the operators or special
     * characters you want to disable for the simple query parser. If you
     * disable the <code>and</code>, <code>or</code>, or <code>not</code>
     * operators, the corresponding operators (<code>+</code>,
     * <code>|</code>, <code>-</code>) have no special meaning and are
     * dropped from the search string. Similarly, disabling
     * <code>prefix</code> disables the wildcard operator (<code>*</code>)
     * and disabling <code>phrase</code> disables the ability to search for
     * phrases by enclosing phrases in double quotes. Disabling precedence
     * disables the ability to control order of precedence using parentheses.
     * Disabling <code>near</code> disables the ability to use the ~ operator
     * to perform a sloppy phrase search. Disabling the <code>fuzzy</code>
     * operator disables the ability to use the ~ operator to perform a fuzzy
     * search. <code>escape</code> disables the ability to use a backslash
     * (<code>\</code>) to escape special characters within the search
     * string. Disabling whitespace is an advanced option that prevents the
     * parser from tokenizing on whitespace, which can be useful for
     * Vietnamese. (It prevents Vietnamese words from being split
     * incorrectly.) For example, you could disable all operators other than
     * the phrase operator to support just simple term and phrase queries:
     * <code>"operators":["and","not","or", "prefix"]</code>. Valid values:
     * <code>and</code>, <code>escape</code>, <code>fuzzy</code>,
     * <code>near</code>, <code>not</code>, <code>or</code>,
     * <code>phrase</code>, <code>precedence</code>, <code>prefix</code>,
     * <code>whitespace</code>. Default: All operators and special characters
     * are enabled. Valid for: <code>simple</code>.</li>
     * <li><code>phraseFields</code>: An array of the <code>text</code> or
     * <code>text-array</code> fields you want to use for phrase searches.
     * When the terms in the search string appear in close proximity within a
     * field, the field scores higher. You can specify a weight for each
     * field to boost that score. The <code>phraseSlop</code> option controls
     * how much the matches can deviate from the search string and still be
     * boosted. To specify a field weight, append a caret (<code>^</code>)
     * symbol and the weight to the field name. For example, to boost phrase
     * matches in the <code>title</code> field over the <code>abstract</code>
     * field, you could specify: <code>"phraseFields":["title^3",
     * "plot"]</code> Valid values: The name of any <code>text</code> or
     * <code>text-array</code> field and an optional numeric value greater
     * than zero. Default: No fields. If you don't specify any fields with
     * <code>phraseFields</code>, proximity scoring is disabled even if
     * <code>phraseSlop</code> is specified. Valid for:
     * <code>dismax</code>.</li> <li><code>phraseSlop</code>: An integer
     * value that specifies how much matches can deviate from the search
     * phrase and still be boosted according to the weights specified in the
     * <code>phraseFields</code> option; for example, <code>phraseSlop:
     * 2</code>. You must also specify <code>phraseFields</code> to enable
     * proximity scoring. Valid values: positive integers. Default: 0. Valid
     * for: <code>dismax</code>.</li> <li><code>explicitPhraseSlop</code>: An
     * integer value that specifies how much a match can deviate from the
     * search phrase when the phrase is enclosed in double quotes in the
     * search string. (Phrases that exceed this proximity distance are not
     * considered a match.) For example, to specify a slop of three for
     * dismax phrase queries, you would specify
     * <code>"explicitPhraseSlop":3</code>. Valid values: positive integers.
     * Default: 0. Valid for: <code>dismax</code>.</li>
     * <li><code>tieBreaker</code>: When a term in the search string is found
     * in a document's field, a score is calculated for that field based on
     * how common the word is in that field compared to other documents. If
     * the term occurs in multiple fields within a document, by default only
     * the highest scoring field contributes to the document's overall score.
     * You can specify a <code>tieBreaker</code> value to enable the matches
     * in lower-scoring fields to contribute to the document's score. That
     * way, if two documents have the same max field score for a particular
     * term, the score for the document that has matches in more fields will
     * be higher. The formula for calculating the score with a tieBreaker is
     * <code>(max field score) + (tieBreaker) * (sum of the scores for the
     * rest of the matching fields)</code>. Set <code>tieBreaker</code> to 0
     * to disregard all but the highest scoring field (pure max):
     * <code>"tieBreaker":0</code>. Set to 1 to sum the scores from all
     * fields (pure sum): <code>"tieBreaker":1</code>. Valid values: 0.0 to
     * 1.0. Default: 0.0. Valid for: <code>dismax</code>. </li> </ul>
     * <examples> <example> <name>Setting Default Search Fields</name>
     * <description>This example searches the <code>title</code> and
     * <code>plot</code> fields if no fields are specified in the search
     * criteria.</description> <request>{"fields":["title","plot"]}</request>
     * <response> </response> </example> </examples>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queryOptions Configures options for the query parser specified in the
     *         <code>queryParser</code> parameter. <p>The options you can configure
     *         vary according to which parser you use: <ul>
     *         <li><code>defaultOperator</code>: The default operator used to combine
     *         individual terms in the search string. For example:
     *         <code>defaultOperator: 'or'</code>. For the <code>dismax</code>
     *         parser, you specify a percentage that represents the percentage of
     *         terms in the search string (rounded down) that must match, rather than
     *         a default operator. A value of <code>0%</code> is the equivalent to
     *         OR, and a value of <code>100%</code> is equivalent to AND. The
     *         percentage must be specified as a value in the range 0-100 followed by
     *         the percent (%) symbol. For example, <code>defaultOperator:
     *         50%</code>. Valid values: <code>and</code>, <code>or</code>, a
     *         percentage in the range 0%-100% (<code>dismax</code>). Default:
     *         <code>and</code> (<code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>) or <code>100</code> (<code>dismax</code>). Valid
     *         for: <code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>, and <code>dismax</code>.</li>
     *         <li><code>fields</code>: An array of the fields to search when no
     *         fields are specified in a search. If no fields are specified in a
     *         search and this option is not specified, all text and text-array
     *         fields are searched. You can specify a weight for each field to
     *         control the relative importance of each field when Amazon CloudSearch
     *         calculates relevance scores. To specify a field weight, append a caret
     *         (<code>^</code>) symbol and the weight to the field name. For example,
     *         to boost the importance of the <code>title</code> field over the
     *         <code>description</code> field you could specify:
     *         <code>"fields":["title^5","description"]</code>. Valid values: The
     *         name of any configured field and an optional numeric value greater
     *         than zero. Default: All <code>text</code> and <code>text-array</code>
     *         fields. Valid for: <code>simple</code>, <code>structured</code>,
     *         <code>lucene</code>, and <code>dismax</code>.</li>
     *         <li><code>operators</code>: An array of the operators or special
     *         characters you want to disable for the simple query parser. If you
     *         disable the <code>and</code>, <code>or</code>, or <code>not</code>
     *         operators, the corresponding operators (<code>+</code>,
     *         <code>|</code>, <code>-</code>) have no special meaning and are
     *         dropped from the search string. Similarly, disabling
     *         <code>prefix</code> disables the wildcard operator (<code>*</code>)
     *         and disabling <code>phrase</code> disables the ability to search for
     *         phrases by enclosing phrases in double quotes. Disabling precedence
     *         disables the ability to control order of precedence using parentheses.
     *         Disabling <code>near</code> disables the ability to use the ~ operator
     *         to perform a sloppy phrase search. Disabling the <code>fuzzy</code>
     *         operator disables the ability to use the ~ operator to perform a fuzzy
     *         search. <code>escape</code> disables the ability to use a backslash
     *         (<code>\</code>) to escape special characters within the search
     *         string. Disabling whitespace is an advanced option that prevents the
     *         parser from tokenizing on whitespace, which can be useful for
     *         Vietnamese. (It prevents Vietnamese words from being split
     *         incorrectly.) For example, you could disable all operators other than
     *         the phrase operator to support just simple term and phrase queries:
     *         <code>"operators":["and","not","or", "prefix"]</code>. Valid values:
     *         <code>and</code>, <code>escape</code>, <code>fuzzy</code>,
     *         <code>near</code>, <code>not</code>, <code>or</code>,
     *         <code>phrase</code>, <code>precedence</code>, <code>prefix</code>,
     *         <code>whitespace</code>. Default: All operators and special characters
     *         are enabled. Valid for: <code>simple</code>.</li>
     *         <li><code>phraseFields</code>: An array of the <code>text</code> or
     *         <code>text-array</code> fields you want to use for phrase searches.
     *         When the terms in the search string appear in close proximity within a
     *         field, the field scores higher. You can specify a weight for each
     *         field to boost that score. The <code>phraseSlop</code> option controls
     *         how much the matches can deviate from the search string and still be
     *         boosted. To specify a field weight, append a caret (<code>^</code>)
     *         symbol and the weight to the field name. For example, to boost phrase
     *         matches in the <code>title</code> field over the <code>abstract</code>
     *         field, you could specify: <code>"phraseFields":["title^3",
     *         "plot"]</code> Valid values: The name of any <code>text</code> or
     *         <code>text-array</code> field and an optional numeric value greater
     *         than zero. Default: No fields. If you don't specify any fields with
     *         <code>phraseFields</code>, proximity scoring is disabled even if
     *         <code>phraseSlop</code> is specified. Valid for:
     *         <code>dismax</code>.</li> <li><code>phraseSlop</code>: An integer
     *         value that specifies how much matches can deviate from the search
     *         phrase and still be boosted according to the weights specified in the
     *         <code>phraseFields</code> option; for example, <code>phraseSlop:
     *         2</code>. You must also specify <code>phraseFields</code> to enable
     *         proximity scoring. Valid values: positive integers. Default: 0. Valid
     *         for: <code>dismax</code>.</li> <li><code>explicitPhraseSlop</code>: An
     *         integer value that specifies how much a match can deviate from the
     *         search phrase when the phrase is enclosed in double quotes in the
     *         search string. (Phrases that exceed this proximity distance are not
     *         considered a match.) For example, to specify a slop of three for
     *         dismax phrase queries, you would specify
     *         <code>"explicitPhraseSlop":3</code>. Valid values: positive integers.
     *         Default: 0. Valid for: <code>dismax</code>.</li>
     *         <li><code>tieBreaker</code>: When a term in the search string is found
     *         in a document's field, a score is calculated for that field based on
     *         how common the word is in that field compared to other documents. If
     *         the term occurs in multiple fields within a document, by default only
     *         the highest scoring field contributes to the document's overall score.
     *         You can specify a <code>tieBreaker</code> value to enable the matches
     *         in lower-scoring fields to contribute to the document's score. That
     *         way, if two documents have the same max field score for a particular
     *         term, the score for the document that has matches in more fields will
     *         be higher. The formula for calculating the score with a tieBreaker is
     *         <code>(max field score) + (tieBreaker) * (sum of the scores for the
     *         rest of the matching fields)</code>. Set <code>tieBreaker</code> to 0
     *         to disregard all but the highest scoring field (pure max):
     *         <code>"tieBreaker":0</code>. Set to 1 to sum the scores from all
     *         fields (pure sum): <code>"tieBreaker":1</code>. Valid values: 0.0 to
     *         1.0. Default: 0.0. Valid for: <code>dismax</code>. </li> </ul>
     *         <examples> <example> <name>Setting Default Search Fields</name>
     *         <description>This example searches the <code>title</code> and
     *         <code>plot</code> fields if no fields are specified in the search
     *         criteria.</description> <request>{"fields":["title","plot"]}</request>
     *         <response> </response> </example> </examples>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withQueryOptions(String queryOptions) {
        this.queryOptions = queryOptions;
        return this;
    }

    /**
     * Specifies which query parser to use to process the request. If
     * <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     * <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     * query parsers: <ul> <li> <code>simple</code>: perform simple searches
     * of <code>text</code> and <code>text-array</code> fields. By default,
     * the <code>simple</code> query parser searches all <code>text</code>
     * and <code>text-array</code> fields. You can specify which fields to
     * search by with the <code>queryOptions</code> parameter. If you prefix
     * a search term with a plus sign (+) documents must contain the term to
     * be considered a match. (This is the default, unless you configure the
     * default operator with the <code>queryOptions</code> parameter.) You
     * can use the <code>-</code> (NOT), <code>|</code> (OR), and
     * <code>*</code> (wildcard) operators to exclude particular terms, find
     * results that match any of the specified terms, or search for a prefix.
     * To search for a phrase rather than individual terms, enclose the
     * phrase in double quotes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     * for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     * <li> <code>structured</code>: perform advanced searches by combining
     * multiple expressions to define the search criteria. You can also
     * search within particular fields, search for values and ranges of
     * values, and use advanced options such as term boosting,
     * <code>matchall</code>, and <code>near</code>. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     * Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </li> <li> <code>lucene</code>: search using the Apache Lucene query
     * parser syntax. For more information, see <a
     * href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     * Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     * using the simplified subset of the Apache Lucene query parser syntax
     * defined by the DisMax query parser. For more information, see <a
     * href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     * Query Parser Syntax</a>. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>simple, structured, lucene, dismax
     *
     * @return Specifies which query parser to use to process the request. If
     *         <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     *         <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     *         query parsers: <ul> <li> <code>simple</code>: perform simple searches
     *         of <code>text</code> and <code>text-array</code> fields. By default,
     *         the <code>simple</code> query parser searches all <code>text</code>
     *         and <code>text-array</code> fields. You can specify which fields to
     *         search by with the <code>queryOptions</code> parameter. If you prefix
     *         a search term with a plus sign (+) documents must contain the term to
     *         be considered a match. (This is the default, unless you configure the
     *         default operator with the <code>queryOptions</code> parameter.) You
     *         can use the <code>-</code> (NOT), <code>|</code> (OR), and
     *         <code>*</code> (wildcard) operators to exclude particular terms, find
     *         results that match any of the specified terms, or search for a prefix.
     *         To search for a phrase rather than individual terms, enclose the
     *         phrase in double quotes. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     *         for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     *         <li> <code>structured</code>: perform advanced searches by combining
     *         multiple expressions to define the search criteria. You can also
     *         search within particular fields, search for values and ranges of
     *         values, and use advanced options such as term boosting,
     *         <code>matchall</code>, and <code>near</code>. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     *         Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *         </li> <li> <code>lucene</code>: search using the Apache Lucene query
     *         parser syntax. For more information, see <a
     *         href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     *         Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     *         using the simplified subset of the Apache Lucene query parser syntax
     *         defined by the DisMax query parser. For more information, see <a
     *         href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     *         Query Parser Syntax</a>. </li> </ul>
     *
     * @see QueryParser
     */
    public String getQueryParser() {
        return queryParser;
    }
    
    /**
     * Specifies which query parser to use to process the request. If
     * <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     * <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     * query parsers: <ul> <li> <code>simple</code>: perform simple searches
     * of <code>text</code> and <code>text-array</code> fields. By default,
     * the <code>simple</code> query parser searches all <code>text</code>
     * and <code>text-array</code> fields. You can specify which fields to
     * search by with the <code>queryOptions</code> parameter. If you prefix
     * a search term with a plus sign (+) documents must contain the term to
     * be considered a match. (This is the default, unless you configure the
     * default operator with the <code>queryOptions</code> parameter.) You
     * can use the <code>-</code> (NOT), <code>|</code> (OR), and
     * <code>*</code> (wildcard) operators to exclude particular terms, find
     * results that match any of the specified terms, or search for a prefix.
     * To search for a phrase rather than individual terms, enclose the
     * phrase in double quotes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     * for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     * <li> <code>structured</code>: perform advanced searches by combining
     * multiple expressions to define the search criteria. You can also
     * search within particular fields, search for values and ranges of
     * values, and use advanced options such as term boosting,
     * <code>matchall</code>, and <code>near</code>. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     * Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </li> <li> <code>lucene</code>: search using the Apache Lucene query
     * parser syntax. For more information, see <a
     * href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     * Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     * using the simplified subset of the Apache Lucene query parser syntax
     * defined by the DisMax query parser. For more information, see <a
     * href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     * Query Parser Syntax</a>. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>simple, structured, lucene, dismax
     *
     * @param queryParser Specifies which query parser to use to process the request. If
     *         <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     *         <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     *         query parsers: <ul> <li> <code>simple</code>: perform simple searches
     *         of <code>text</code> and <code>text-array</code> fields. By default,
     *         the <code>simple</code> query parser searches all <code>text</code>
     *         and <code>text-array</code> fields. You can specify which fields to
     *         search by with the <code>queryOptions</code> parameter. If you prefix
     *         a search term with a plus sign (+) documents must contain the term to
     *         be considered a match. (This is the default, unless you configure the
     *         default operator with the <code>queryOptions</code> parameter.) You
     *         can use the <code>-</code> (NOT), <code>|</code> (OR), and
     *         <code>*</code> (wildcard) operators to exclude particular terms, find
     *         results that match any of the specified terms, or search for a prefix.
     *         To search for a phrase rather than individual terms, enclose the
     *         phrase in double quotes. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     *         for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     *         <li> <code>structured</code>: perform advanced searches by combining
     *         multiple expressions to define the search criteria. You can also
     *         search within particular fields, search for values and ranges of
     *         values, and use advanced options such as term boosting,
     *         <code>matchall</code>, and <code>near</code>. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     *         Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *         </li> <li> <code>lucene</code>: search using the Apache Lucene query
     *         parser syntax. For more information, see <a
     *         href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     *         Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     *         using the simplified subset of the Apache Lucene query parser syntax
     *         defined by the DisMax query parser. For more information, see <a
     *         href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     *         Query Parser Syntax</a>. </li> </ul>
     *
     * @see QueryParser
     */
    public void setQueryParser(String queryParser) {
        this.queryParser = queryParser;
    }
    
    /**
     * Specifies which query parser to use to process the request. If
     * <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     * <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     * query parsers: <ul> <li> <code>simple</code>: perform simple searches
     * of <code>text</code> and <code>text-array</code> fields. By default,
     * the <code>simple</code> query parser searches all <code>text</code>
     * and <code>text-array</code> fields. You can specify which fields to
     * search by with the <code>queryOptions</code> parameter. If you prefix
     * a search term with a plus sign (+) documents must contain the term to
     * be considered a match. (This is the default, unless you configure the
     * default operator with the <code>queryOptions</code> parameter.) You
     * can use the <code>-</code> (NOT), <code>|</code> (OR), and
     * <code>*</code> (wildcard) operators to exclude particular terms, find
     * results that match any of the specified terms, or search for a prefix.
     * To search for a phrase rather than individual terms, enclose the
     * phrase in double quotes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     * for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     * <li> <code>structured</code>: perform advanced searches by combining
     * multiple expressions to define the search criteria. You can also
     * search within particular fields, search for values and ranges of
     * values, and use advanced options such as term boosting,
     * <code>matchall</code>, and <code>near</code>. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     * Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </li> <li> <code>lucene</code>: search using the Apache Lucene query
     * parser syntax. For more information, see <a
     * href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     * Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     * using the simplified subset of the Apache Lucene query parser syntax
     * defined by the DisMax query parser. For more information, see <a
     * href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     * Query Parser Syntax</a>. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>simple, structured, lucene, dismax
     *
     * @param queryParser Specifies which query parser to use to process the request. If
     *         <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     *         <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     *         query parsers: <ul> <li> <code>simple</code>: perform simple searches
     *         of <code>text</code> and <code>text-array</code> fields. By default,
     *         the <code>simple</code> query parser searches all <code>text</code>
     *         and <code>text-array</code> fields. You can specify which fields to
     *         search by with the <code>queryOptions</code> parameter. If you prefix
     *         a search term with a plus sign (+) documents must contain the term to
     *         be considered a match. (This is the default, unless you configure the
     *         default operator with the <code>queryOptions</code> parameter.) You
     *         can use the <code>-</code> (NOT), <code>|</code> (OR), and
     *         <code>*</code> (wildcard) operators to exclude particular terms, find
     *         results that match any of the specified terms, or search for a prefix.
     *         To search for a phrase rather than individual terms, enclose the
     *         phrase in double quotes. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     *         for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     *         <li> <code>structured</code>: perform advanced searches by combining
     *         multiple expressions to define the search criteria. You can also
     *         search within particular fields, search for values and ranges of
     *         values, and use advanced options such as term boosting,
     *         <code>matchall</code>, and <code>near</code>. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     *         Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *         </li> <li> <code>lucene</code>: search using the Apache Lucene query
     *         parser syntax. For more information, see <a
     *         href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     *         Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     *         using the simplified subset of the Apache Lucene query parser syntax
     *         defined by the DisMax query parser. For more information, see <a
     *         href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     *         Query Parser Syntax</a>. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see QueryParser
     */
    public SearchRequest withQueryParser(String queryParser) {
        this.queryParser = queryParser;
        return this;
    }

    /**
     * Specifies which query parser to use to process the request. If
     * <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     * <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     * query parsers: <ul> <li> <code>simple</code>: perform simple searches
     * of <code>text</code> and <code>text-array</code> fields. By default,
     * the <code>simple</code> query parser searches all <code>text</code>
     * and <code>text-array</code> fields. You can specify which fields to
     * search by with the <code>queryOptions</code> parameter. If you prefix
     * a search term with a plus sign (+) documents must contain the term to
     * be considered a match. (This is the default, unless you configure the
     * default operator with the <code>queryOptions</code> parameter.) You
     * can use the <code>-</code> (NOT), <code>|</code> (OR), and
     * <code>*</code> (wildcard) operators to exclude particular terms, find
     * results that match any of the specified terms, or search for a prefix.
     * To search for a phrase rather than individual terms, enclose the
     * phrase in double quotes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     * for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     * <li> <code>structured</code>: perform advanced searches by combining
     * multiple expressions to define the search criteria. You can also
     * search within particular fields, search for values and ranges of
     * values, and use advanced options such as term boosting,
     * <code>matchall</code>, and <code>near</code>. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     * Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </li> <li> <code>lucene</code>: search using the Apache Lucene query
     * parser syntax. For more information, see <a
     * href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     * Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     * using the simplified subset of the Apache Lucene query parser syntax
     * defined by the DisMax query parser. For more information, see <a
     * href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     * Query Parser Syntax</a>. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>simple, structured, lucene, dismax
     *
     * @param queryParser Specifies which query parser to use to process the request. If
     *         <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     *         <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     *         query parsers: <ul> <li> <code>simple</code>: perform simple searches
     *         of <code>text</code> and <code>text-array</code> fields. By default,
     *         the <code>simple</code> query parser searches all <code>text</code>
     *         and <code>text-array</code> fields. You can specify which fields to
     *         search by with the <code>queryOptions</code> parameter. If you prefix
     *         a search term with a plus sign (+) documents must contain the term to
     *         be considered a match. (This is the default, unless you configure the
     *         default operator with the <code>queryOptions</code> parameter.) You
     *         can use the <code>-</code> (NOT), <code>|</code> (OR), and
     *         <code>*</code> (wildcard) operators to exclude particular terms, find
     *         results that match any of the specified terms, or search for a prefix.
     *         To search for a phrase rather than individual terms, enclose the
     *         phrase in double quotes. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     *         for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     *         <li> <code>structured</code>: perform advanced searches by combining
     *         multiple expressions to define the search criteria. You can also
     *         search within particular fields, search for values and ranges of
     *         values, and use advanced options such as term boosting,
     *         <code>matchall</code>, and <code>near</code>. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     *         Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *         </li> <li> <code>lucene</code>: search using the Apache Lucene query
     *         parser syntax. For more information, see <a
     *         href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     *         Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     *         using the simplified subset of the Apache Lucene query parser syntax
     *         defined by the DisMax query parser. For more information, see <a
     *         href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     *         Query Parser Syntax</a>. </li> </ul>
     *
     * @see QueryParser
     */
    public void setQueryParser(QueryParser queryParser) {
        this.queryParser = queryParser.toString();
    }
    
    /**
     * Specifies which query parser to use to process the request. If
     * <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     * <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     * query parsers: <ul> <li> <code>simple</code>: perform simple searches
     * of <code>text</code> and <code>text-array</code> fields. By default,
     * the <code>simple</code> query parser searches all <code>text</code>
     * and <code>text-array</code> fields. You can specify which fields to
     * search by with the <code>queryOptions</code> parameter. If you prefix
     * a search term with a plus sign (+) documents must contain the term to
     * be considered a match. (This is the default, unless you configure the
     * default operator with the <code>queryOptions</code> parameter.) You
     * can use the <code>-</code> (NOT), <code>|</code> (OR), and
     * <code>*</code> (wildcard) operators to exclude particular terms, find
     * results that match any of the specified terms, or search for a prefix.
     * To search for a phrase rather than individual terms, enclose the
     * phrase in double quotes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     * for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     * <li> <code>structured</code>: perform advanced searches by combining
     * multiple expressions to define the search criteria. You can also
     * search within particular fields, search for values and ranges of
     * values, and use advanced options such as term boosting,
     * <code>matchall</code>, and <code>near</code>. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     * Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </li> <li> <code>lucene</code>: search using the Apache Lucene query
     * parser syntax. For more information, see <a
     * href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     * Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     * using the simplified subset of the Apache Lucene query parser syntax
     * defined by the DisMax query parser. For more information, see <a
     * href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     * Query Parser Syntax</a>. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>simple, structured, lucene, dismax
     *
     * @param queryParser Specifies which query parser to use to process the request. If
     *         <code>queryParser</code> is not specified, Amazon CloudSearch uses the
     *         <code>simple</code> query parser. <p>Amazon CloudSearch supports four
     *         query parsers: <ul> <li> <code>simple</code>: perform simple searches
     *         of <code>text</code> and <code>text-array</code> fields. By default,
     *         the <code>simple</code> query parser searches all <code>text</code>
     *         and <code>text-array</code> fields. You can specify which fields to
     *         search by with the <code>queryOptions</code> parameter. If you prefix
     *         a search term with a plus sign (+) documents must contain the term to
     *         be considered a match. (This is the default, unless you configure the
     *         default operator with the <code>queryOptions</code> parameter.) You
     *         can use the <code>-</code> (NOT), <code>|</code> (OR), and
     *         <code>*</code> (wildcard) operators to exclude particular terms, find
     *         results that match any of the specified terms, or search for a prefix.
     *         To search for a phrase rather than individual terms, enclose the
     *         phrase in double quotes. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-text.html">Searching
     *         for Text</a> in the <i>Amazon CloudSearch Developer Guide</i>. </li>
     *         <li> <code>structured</code>: perform advanced searches by combining
     *         multiple expressions to define the search criteria. You can also
     *         search within particular fields, search for values and ranges of
     *         values, and use advanced options such as term boosting,
     *         <code>matchall</code>, and <code>near</code>. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching-compound-queries.html">Constructing
     *         Compound Queries</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *         </li> <li> <code>lucene</code>: search using the Apache Lucene query
     *         parser syntax. For more information, see <a
     *         href="http://lucene.apache.org/core/4_6_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#package_description">Apache
     *         Lucene Query Parser Syntax</a>. </li> <li> <code>dismax</code>: search
     *         using the simplified subset of the Apache Lucene query parser syntax
     *         defined by the DisMax query parser. For more information, see <a
     *         href="http://wiki.apache.org/solr/DisMaxQParserPlugin#Query_Syntax">DisMax
     *         Query Parser Syntax</a>. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see QueryParser
     */
    public SearchRequest withQueryParser(QueryParser queryParser) {
        this.queryParser = queryParser.toString();
        return this;
    }

    /**
     * Specifies the field and expression values to include in the response.
     * Multiple fields or expressions are specified as a comma-separated
     * list. By default, a search response includes all return enabled fields
     * (<code>_all_fields</code>). To return only the document IDs for the
     * matching documents, specify <code>_no_fields</code>. To retrieve the
     * relevance score calculated for each document, specify
     * <code>_score</code>.
     *
     * @return Specifies the field and expression values to include in the response.
     *         Multiple fields or expressions are specified as a comma-separated
     *         list. By default, a search response includes all return enabled fields
     *         (<code>_all_fields</code>). To return only the document IDs for the
     *         matching documents, specify <code>_no_fields</code>. To retrieve the
     *         relevance score calculated for each document, specify
     *         <code>_score</code>.
     */
    public String getReturn() {
        return returnValue;
    }
    
    /**
     * Specifies the field and expression values to include in the response.
     * Multiple fields or expressions are specified as a comma-separated
     * list. By default, a search response includes all return enabled fields
     * (<code>_all_fields</code>). To return only the document IDs for the
     * matching documents, specify <code>_no_fields</code>. To retrieve the
     * relevance score calculated for each document, specify
     * <code>_score</code>.
     *
     * @param returnValue Specifies the field and expression values to include in the response.
     *         Multiple fields or expressions are specified as a comma-separated
     *         list. By default, a search response includes all return enabled fields
     *         (<code>_all_fields</code>). To return only the document IDs for the
     *         matching documents, specify <code>_no_fields</code>. To retrieve the
     *         relevance score calculated for each document, specify
     *         <code>_score</code>.
     */
    public void setReturn(String returnValue) {
        this.returnValue = returnValue;
    }
    
    /**
     * Specifies the field and expression values to include in the response.
     * Multiple fields or expressions are specified as a comma-separated
     * list. By default, a search response includes all return enabled fields
     * (<code>_all_fields</code>). To return only the document IDs for the
     * matching documents, specify <code>_no_fields</code>. To retrieve the
     * relevance score calculated for each document, specify
     * <code>_score</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param returnValue Specifies the field and expression values to include in the response.
     *         Multiple fields or expressions are specified as a comma-separated
     *         list. By default, a search response includes all return enabled fields
     *         (<code>_all_fields</code>). To return only the document IDs for the
     *         matching documents, specify <code>_no_fields</code>. To retrieve the
     *         relevance score calculated for each document, specify
     *         <code>_score</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withReturn(String returnValue) {
        this.returnValue = returnValue;
        return this;
    }

    /**
     * Specifies the maximum number of search hits to include in the
     * response.
     *
     * @return Specifies the maximum number of search hits to include in the
     *         response.
     */
    public Long getSize() {
        return size;
    }
    
    /**
     * Specifies the maximum number of search hits to include in the
     * response.
     *
     * @param size Specifies the maximum number of search hits to include in the
     *         response.
     */
    public void setSize(Long size) {
        this.size = size;
    }
    
    /**
     * Specifies the maximum number of search hits to include in the
     * response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size Specifies the maximum number of search hits to include in the
     *         response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Specifies the fields or custom expressions to use to sort the search
     * results. Multiple fields or expressions are specified as a
     * comma-separated list. You must specify the sort direction
     * (<code>asc</code> or <code>desc</code>) for each field; for example,
     * <code>year desc,title asc</code>. To use a field to sort results, the
     * field must be sort-enabled in the domain configuration. Array type
     * fields cannot be used for sorting. If no <code>sort</code> parameter
     * is specified, results are sorted by their default relevance scores in
     * descending order: <code>_score desc</code>. You can also sort by
     * document ID (<code>_id asc</code>) and version (<code>_version
     * desc</code>). <p>For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/sorting-results.html">Sorting
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return Specifies the fields or custom expressions to use to sort the search
     *         results. Multiple fields or expressions are specified as a
     *         comma-separated list. You must specify the sort direction
     *         (<code>asc</code> or <code>desc</code>) for each field; for example,
     *         <code>year desc,title asc</code>. To use a field to sort results, the
     *         field must be sort-enabled in the domain configuration. Array type
     *         fields cannot be used for sorting. If no <code>sort</code> parameter
     *         is specified, results are sorted by their default relevance scores in
     *         descending order: <code>_score desc</code>. You can also sort by
     *         document ID (<code>_id asc</code>) and version (<code>_version
     *         desc</code>). <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/sorting-results.html">Sorting
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public String getSort() {
        return sort;
    }
    
    /**
     * Specifies the fields or custom expressions to use to sort the search
     * results. Multiple fields or expressions are specified as a
     * comma-separated list. You must specify the sort direction
     * (<code>asc</code> or <code>desc</code>) for each field; for example,
     * <code>year desc,title asc</code>. To use a field to sort results, the
     * field must be sort-enabled in the domain configuration. Array type
     * fields cannot be used for sorting. If no <code>sort</code> parameter
     * is specified, results are sorted by their default relevance scores in
     * descending order: <code>_score desc</code>. You can also sort by
     * document ID (<code>_id asc</code>) and version (<code>_version
     * desc</code>). <p>For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/sorting-results.html">Sorting
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @param sort Specifies the fields or custom expressions to use to sort the search
     *         results. Multiple fields or expressions are specified as a
     *         comma-separated list. You must specify the sort direction
     *         (<code>asc</code> or <code>desc</code>) for each field; for example,
     *         <code>year desc,title asc</code>. To use a field to sort results, the
     *         field must be sort-enabled in the domain configuration. Array type
     *         fields cannot be used for sorting. If no <code>sort</code> parameter
     *         is specified, results are sorted by their default relevance scores in
     *         descending order: <code>_score desc</code>. You can also sort by
     *         document ID (<code>_id asc</code>) and version (<code>_version
     *         desc</code>). <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/sorting-results.html">Sorting
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public void setSort(String sort) {
        this.sort = sort;
    }
    
    /**
     * Specifies the fields or custom expressions to use to sort the search
     * results. Multiple fields or expressions are specified as a
     * comma-separated list. You must specify the sort direction
     * (<code>asc</code> or <code>desc</code>) for each field; for example,
     * <code>year desc,title asc</code>. To use a field to sort results, the
     * field must be sort-enabled in the domain configuration. Array type
     * fields cannot be used for sorting. If no <code>sort</code> parameter
     * is specified, results are sorted by their default relevance scores in
     * descending order: <code>_score desc</code>. You can also sort by
     * document ID (<code>_id asc</code>) and version (<code>_version
     * desc</code>). <p>For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/sorting-results.html">Sorting
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sort Specifies the fields or custom expressions to use to sort the search
     *         results. Multiple fields or expressions are specified as a
     *         comma-separated list. You must specify the sort direction
     *         (<code>asc</code> or <code>desc</code>) for each field; for example,
     *         <code>year desc,title asc</code>. To use a field to sort results, the
     *         field must be sort-enabled in the domain configuration. Array type
     *         fields cannot be used for sorting. If no <code>sort</code> parameter
     *         is specified, results are sorted by their default relevance scores in
     *         descending order: <code>_score desc</code>. You can also sort by
     *         document ID (<code>_id asc</code>) and version (<code>_version
     *         desc</code>). <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/sorting-results.html">Sorting
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Specifies the offset of the first search hit you want to return. Note
     * that the result set is zero-based; the first result is at index 0. You
     * can specify either the <code>start</code> or <code>cursor</code>
     * parameter in a request, they are mutually exclusive. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return Specifies the offset of the first search hit you want to return. Note
     *         that the result set is zero-based; the first result is at index 0. You
     *         can specify either the <code>start</code> or <code>cursor</code>
     *         parameter in a request, they are mutually exclusive. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public Long getStart() {
        return start;
    }
    
    /**
     * Specifies the offset of the first search hit you want to return. Note
     * that the result set is zero-based; the first result is at index 0. You
     * can specify either the <code>start</code> or <code>cursor</code>
     * parameter in a request, they are mutually exclusive. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @param start Specifies the offset of the first search hit you want to return. Note
     *         that the result set is zero-based; the first result is at index 0. You
     *         can specify either the <code>start</code> or <code>cursor</code>
     *         parameter in a request, they are mutually exclusive. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     */
    public void setStart(Long start) {
        this.start = start;
    }
    
    /**
     * Specifies the offset of the first search hit you want to return. Note
     * that the result set is zero-based; the first result is at index 0. You
     * can specify either the <code>start</code> or <code>cursor</code>
     * parameter in a request, they are mutually exclusive. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     * Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param start Specifies the offset of the first search hit you want to return. Note
     *         that the result set is zero-based; the first result is at index 0. You
     *         can specify either the <code>start</code> or <code>cursor</code>
     *         parameter in a request, they are mutually exclusive. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/paginating-results.html">Paginating
     *         Results</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchRequest withStart(Long start) {
        this.start = start;
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
        if (getCursor() != null) sb.append("Cursor: " + getCursor() + ",");
        if (getExpr() != null) sb.append("Expr: " + getExpr() + ",");
        if (getFacet() != null) sb.append("Facet: " + getFacet() + ",");
        if (getFilterQuery() != null) sb.append("FilterQuery: " + getFilterQuery() + ",");
        if (getHighlight() != null) sb.append("Highlight: " + getHighlight() + ",");
        if (isPartial() != null) sb.append("Partial: " + isPartial() + ",");
        if (getQuery() != null) sb.append("Query: " + getQuery() + ",");
        if (getQueryOptions() != null) sb.append("QueryOptions: " + getQueryOptions() + ",");
        if (getQueryParser() != null) sb.append("QueryParser: " + getQueryParser() + ",");
        if (getReturn() != null) sb.append("Return: " + getReturn() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getSort() != null) sb.append("Sort: " + getSort() + ",");
        if (getStart() != null) sb.append("Start: " + getStart() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCursor() == null) ? 0 : getCursor().hashCode()); 
        hashCode = prime * hashCode + ((getExpr() == null) ? 0 : getExpr().hashCode()); 
        hashCode = prime * hashCode + ((getFacet() == null) ? 0 : getFacet().hashCode()); 
        hashCode = prime * hashCode + ((getFilterQuery() == null) ? 0 : getFilterQuery().hashCode()); 
        hashCode = prime * hashCode + ((getHighlight() == null) ? 0 : getHighlight().hashCode()); 
        hashCode = prime * hashCode + ((isPartial() == null) ? 0 : isPartial().hashCode()); 
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode()); 
        hashCode = prime * hashCode + ((getQueryOptions() == null) ? 0 : getQueryOptions().hashCode()); 
        hashCode = prime * hashCode + ((getQueryParser() == null) ? 0 : getQueryParser().hashCode()); 
        hashCode = prime * hashCode + ((getReturn() == null) ? 0 : getReturn().hashCode()); 
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode()); 
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SearchRequest == false) return false;
        SearchRequest other = (SearchRequest)obj;
        
        if (other.getCursor() == null ^ this.getCursor() == null) return false;
        if (other.getCursor() != null && other.getCursor().equals(this.getCursor()) == false) return false; 
        if (other.getExpr() == null ^ this.getExpr() == null) return false;
        if (other.getExpr() != null && other.getExpr().equals(this.getExpr()) == false) return false; 
        if (other.getFacet() == null ^ this.getFacet() == null) return false;
        if (other.getFacet() != null && other.getFacet().equals(this.getFacet()) == false) return false; 
        if (other.getFilterQuery() == null ^ this.getFilterQuery() == null) return false;
        if (other.getFilterQuery() != null && other.getFilterQuery().equals(this.getFilterQuery()) == false) return false; 
        if (other.getHighlight() == null ^ this.getHighlight() == null) return false;
        if (other.getHighlight() != null && other.getHighlight().equals(this.getHighlight()) == false) return false; 
        if (other.isPartial() == null ^ this.isPartial() == null) return false;
        if (other.isPartial() != null && other.isPartial().equals(this.isPartial()) == false) return false; 
        if (other.getQuery() == null ^ this.getQuery() == null) return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false) return false; 
        if (other.getQueryOptions() == null ^ this.getQueryOptions() == null) return false;
        if (other.getQueryOptions() != null && other.getQueryOptions().equals(this.getQueryOptions()) == false) return false; 
        if (other.getQueryParser() == null ^ this.getQueryParser() == null) return false;
        if (other.getQueryParser() != null && other.getQueryParser().equals(this.getQueryParser()) == false) return false; 
        if (other.getReturn() == null ^ this.getReturn() == null) return false;
        if (other.getReturn() != null && other.getReturn().equals(this.getReturn()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getSort() == null ^ this.getSort() == null) return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false) return false; 
        if (other.getStart() == null ^ this.getStart() == null) return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false) return false; 
        return true;
    }
    
}
    
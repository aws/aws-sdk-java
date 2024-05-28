/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartLoaderJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartLoaderJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>source</code> parameter accepts an S3 URI that identifies a single file, multiple files, a folder, or
     * multiple folders. Neptune loads every data file in any folder that is specified.
     * </p>
     * <p>
     * The URI can be in any of the following formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https://s3.amazonaws.com/(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>object-key-name</code> element of the URI is equivalent to the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html#API_ListObjects_RequestParameters"
     * >prefix</a> parameter in an S3 <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a> API call. It
     * identifies all the objects in the specified S3 bucket whose names begin with that prefix. That can be a single
     * file or folder, or multiple files and/or folders.
     * </p>
     * <p>
     * The specified folder or folders can contain multiple vertex files and multiple edge files.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The format of the data. For more information about data formats for the Neptune <code>Loader</code> command, see
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     * Formats</a>.
     * </p>
     * <p class="title">
     * <b>Allowed values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>csv</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html">Gremlin CSV
     * data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>opencypher</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html">openCypher
     * CSV data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     * format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String format;
    /**
     * <p>
     * The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * </p>
     */
    private String s3BucketRegion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for an IAM role to be assumed by the Neptune DB instance for access to the S3
     * bucket. The IAM role ARN provided here should be attached to the DB cluster (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-IAM-add-role-cluster.html">Adding
     * the IAM Role to an Amazon Neptune Cluster</a>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The load job mode.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>AUTO</code>.
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if it finds
     * one, resumes that load job. If no previous load job is found, the loader stops.
     * </p>
     * <p>
     * The loader avoids reloading files that were successfully loaded in a previous job. It only tries to process
     * failed files. If you dropped previously loaded data from your Neptune cluster, that data is not reloaded in this
     * mode. If a previous load job loaded all files from the same source successfully, nothing is reloaded, and the
     * loader returns success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You can use
     * this mode to reload all the data from a source after dropping previously loaded data from your Neptune cluster,
     * or to load new data available at the same source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and if it
     * finds one, resumes that job, just as in <code>RESUME</code> mode.
     * </p>
     * <p>
     * If the loader doesn't find a previous load job from the same source, it loads all data from the source, just as
     * in <code>NEW</code> mode.
     * </p>
     * </li>
     * </ul>
     */
    private String mode;
    /**
     * <p>
     * <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"TRUE"</code>.
     * </p>
     * <p>
     * When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     * specified, skipping any entries with errors.
     * </p>
     * <p>
     * When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error. Data
     * loaded up to that point persists.
     * </p>
     */
    private Boolean failOnError;
    /**
     * <p>
     * The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the bulk load
     * process.
     * </p>
     * <p>
     * <i>Allowed values</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by 2. If
     * this value is used, the bulk loader takes up all available resources.
     * </p>
     * <p>
     * This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization. Because
     * the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70% range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Default value</i>: <code>HIGH</code>
     * </p>
     * <p>
     * The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading openCypher
     * data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can generally fix the
     * issue by setting <code>parallelism</code> to a lower setting and retrying the load command.
     * </p>
     */
    private String parallelism;
    /**
     * <p>
     * <b> <code>parserConfiguration</code> </b>   –   An optional object with additional parser configuration values.
     * Each of the child parameters is also optional:
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>namedGraphUri</code> </b>   –   The default graph for all RDF formats when no graph is specified (for
     * non-quads formats and NQUAD entries with no graph).
     * </p>
     * <p>
     * The default is <code>https://aws.amazon.com/neptune/vocab/v01/DefaultNamedGraph</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>baseUri</code> </b>   –   The base URI for RDF/XML and Turtle formats.
     * </p>
     * <p>
     * The default is <code>https://aws.amazon.com/neptune/default</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allowEmptyStrings</code> </b>   –   Gremlin users need to be able to pass empty string values("") as
     * node and edge properties when loading CSV data. If <code>allowEmptyStrings</code> is set to <code>false</code>
     * (the default), such empty strings are treated as nulls and are not loaded.
     * </p>
     * <p>
     * If <code>allowEmptyStrings</code> is set to <code>true</code>, the loader treats empty strings as valid property
     * values and loads them accordingly.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> parserConfiguration;
    /**
     * <p>
     * <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader treats
     * a new value for single-cardinality vertex or edge properties. This is not supported for loading openCypher data.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * <p>
     * By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to <code>"FALSE"</code>, the
     * loader treats a new value as an error, because it violates single cardinality.
     * </p>
     * <p>
     * When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the bulk
     * loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex property
     * values are provided in the source file(s) being loaded, the final value at the end of the bulk load could be any
     * one of those new values. The loader only guarantees that the existing value has been replaced by one of the new
     * ones.
     * </p>
     */
    private Boolean updateSingleCardinalityProperties;
    /**
     * <p>
     * This is an optional flag parameter that indicates whether the load request can be queued up or not.
     * </p>
     * <p>
     * You don't have to wait for one load job to complete before issuing the next one, because Neptune can queue up as
     * many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all set to
     * <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     * </p>
     * <p>
     * If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request will fail
     * if another load job is already running.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     */
    private Boolean queueRequest;
    /**
     * <p>
     * This is an optional parameter that can make a queued load request contingent on the successful completion of one
     * or more previous jobs in the queue.
     * </p>
     * <p>
     * Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters are set
     * to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a queued request
     * dependent on the successful completion of one or more specified previous requests in the queue.
     * </p>
     * <p>
     * For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     * <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins, proceed as
     * follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     * load-ids.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     * </p>
     * </li>
     * </ol>
     * <p>
     * Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code> until
     * <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails, Job-C will
     * not be executed, and its status will be set to <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     * </p>
     * <p>
     * You can set up multiple levels of dependency in this way, so that the failure of one job will cause all requests
     * that are directly or indirectly dependent on it to be cancelled.
     * </p>
     */
    private java.util.List<String> dependencies;
    /**
     * <p>
     * This parameter is required only when loading openCypher data that contains relationship IDs. It must be included
     * and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the load data
     * (recommended).
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column must be
     * present in every relationship file in the load.
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the load
     * <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically generates an ID for
     * each relationship.
     * </p>
     * <p>
     * It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in the CSV
     * data have been fixed, without having to reload any relationships that have already been loaded. If relationship
     * IDs have not been explicitly assigned, the loader cannot resume a failed load if any relationship file has had to
     * be corrected, and must instead reload all the relationships.
     * </p>
     */
    private Boolean userProvidedEdgeIds;

    /**
     * <p>
     * The <code>source</code> parameter accepts an S3 URI that identifies a single file, multiple files, a folder, or
     * multiple folders. Neptune loads every data file in any folder that is specified.
     * </p>
     * <p>
     * The URI can be in any of the following formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https://s3.amazonaws.com/(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>object-key-name</code> element of the URI is equivalent to the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html#API_ListObjects_RequestParameters"
     * >prefix</a> parameter in an S3 <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a> API call. It
     * identifies all the objects in the specified S3 bucket whose names begin with that prefix. That can be a single
     * file or folder, or multiple files and/or folders.
     * </p>
     * <p>
     * The specified folder or folders can contain multiple vertex files and multiple edge files.
     * </p>
     * 
     * @param source
     *        The <code>source</code> parameter accepts an S3 URI that identifies a single file, multiple files, a
     *        folder, or multiple folders. Neptune loads every data file in any folder that is specified.</p>
     *        <p>
     *        The URI can be in any of the following formats.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3://(bucket_name)/(object-key-name)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https://s3.amazonaws.com/(bucket_name)/(object-key-name)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https://s3.us-east-1.amazonaws.com/(bucket_name)/(object-key-name)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>object-key-name</code> element of the URI is equivalent to the <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html#API_ListObjects_RequestParameters"
     *        >prefix</a> parameter in an S3 <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a> API call. It
     *        identifies all the objects in the specified S3 bucket whose names begin with that prefix. That can be a
     *        single file or folder, or multiple files and/or folders.
     *        </p>
     *        <p>
     *        The specified folder or folders can contain multiple vertex files and multiple edge files.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The <code>source</code> parameter accepts an S3 URI that identifies a single file, multiple files, a folder, or
     * multiple folders. Neptune loads every data file in any folder that is specified.
     * </p>
     * <p>
     * The URI can be in any of the following formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https://s3.amazonaws.com/(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>object-key-name</code> element of the URI is equivalent to the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html#API_ListObjects_RequestParameters"
     * >prefix</a> parameter in an S3 <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a> API call. It
     * identifies all the objects in the specified S3 bucket whose names begin with that prefix. That can be a single
     * file or folder, or multiple files and/or folders.
     * </p>
     * <p>
     * The specified folder or folders can contain multiple vertex files and multiple edge files.
     * </p>
     * 
     * @return The <code>source</code> parameter accepts an S3 URI that identifies a single file, multiple files, a
     *         folder, or multiple folders. Neptune loads every data file in any folder that is specified.</p>
     *         <p>
     *         The URI can be in any of the following formats.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3://(bucket_name)/(object-key-name)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https://s3.amazonaws.com/(bucket_name)/(object-key-name)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https://s3.us-east-1.amazonaws.com/(bucket_name)/(object-key-name)</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The <code>object-key-name</code> element of the URI is equivalent to the <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html#API_ListObjects_RequestParameters"
     *         >prefix</a> parameter in an S3 <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a> API call. It
     *         identifies all the objects in the specified S3 bucket whose names begin with that prefix. That can be a
     *         single file or folder, or multiple files and/or folders.
     *         </p>
     *         <p>
     *         The specified folder or folders can contain multiple vertex files and multiple edge files.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The <code>source</code> parameter accepts an S3 URI that identifies a single file, multiple files, a folder, or
     * multiple folders. Neptune loads every data file in any folder that is specified.
     * </p>
     * <p>
     * The URI can be in any of the following formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https://s3.amazonaws.com/(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/(bucket_name)/(object-key-name)</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>object-key-name</code> element of the URI is equivalent to the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html#API_ListObjects_RequestParameters"
     * >prefix</a> parameter in an S3 <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a> API call. It
     * identifies all the objects in the specified S3 bucket whose names begin with that prefix. That can be a single
     * file or folder, or multiple files and/or folders.
     * </p>
     * <p>
     * The specified folder or folders can contain multiple vertex files and multiple edge files.
     * </p>
     * 
     * @param source
     *        The <code>source</code> parameter accepts an S3 URI that identifies a single file, multiple files, a
     *        folder, or multiple folders. Neptune loads every data file in any folder that is specified.</p>
     *        <p>
     *        The URI can be in any of the following formats.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3://(bucket_name)/(object-key-name)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https://s3.amazonaws.com/(bucket_name)/(object-key-name)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https://s3.us-east-1.amazonaws.com/(bucket_name)/(object-key-name)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>object-key-name</code> element of the URI is equivalent to the <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html#API_ListObjects_RequestParameters"
     *        >prefix</a> parameter in an S3 <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a> API call. It
     *        identifies all the objects in the specified S3 bucket whose names begin with that prefix. That can be a
     *        single file or folder, or multiple files and/or folders.
     *        </p>
     *        <p>
     *        The specified folder or folders can contain multiple vertex files and multiple edge files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The format of the data. For more information about data formats for the Neptune <code>Loader</code> command, see
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     * Formats</a>.
     * </p>
     * <p class="title">
     * <b>Allowed values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>csv</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html">Gremlin CSV
     * data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>opencypher</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html">openCypher
     * CSV data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     * format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the data. For more information about data formats for the Neptune <code>Loader</code>
     *        command, see <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     *        Formats</a>.</p>
     *        <p class="title">
     *        <b>Allowed values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>csv</code> </b> for the <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html">Gremlin
     *        CSV data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>opencypher</code> </b> for the <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html"
     *        >openCypher CSV data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data
     *        format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     *        format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     *        </p>
     *        </li>
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the data. For more information about data formats for the Neptune <code>Loader</code> command, see
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     * Formats</a>.
     * </p>
     * <p class="title">
     * <b>Allowed values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>csv</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html">Gremlin CSV
     * data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>opencypher</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html">openCypher
     * CSV data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     * format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format of the data. For more information about data formats for the Neptune <code>Loader</code>
     *         command, see <a
     *         href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     *         Formats</a>.</p>
     *         <p class="title">
     *         <b>Allowed values</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>csv</code> </b> for the <a
     *         href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html"
     *         >Gremlin CSV data format</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>opencypher</code> </b> for the <a
     *         href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html"
     *         >openCypher CSV data format</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data
     *         format</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data
     *         format</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     *         format</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     *         </p>
     *         </li>
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the data. For more information about data formats for the Neptune <code>Loader</code> command, see
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     * Formats</a>.
     * </p>
     * <p class="title">
     * <b>Allowed values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>csv</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html">Gremlin CSV
     * data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>opencypher</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html">openCypher
     * CSV data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     * format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the data. For more information about data formats for the Neptune <code>Loader</code>
     *        command, see <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     *        Formats</a>.</p>
     *        <p class="title">
     *        <b>Allowed values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>csv</code> </b> for the <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html">Gremlin
     *        CSV data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>opencypher</code> </b> for the <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html"
     *        >openCypher CSV data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data
     *        format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     *        format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public StartLoaderJobRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the data. For more information about data formats for the Neptune <code>Loader</code> command, see
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     * Formats</a>.
     * </p>
     * <p class="title">
     * <b>Allowed values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>csv</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html">Gremlin CSV
     * data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>opencypher</code> </b> for the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html">openCypher
     * CSV data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     * format</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the data. For more information about data formats for the Neptune <code>Loader</code>
     *        command, see <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format.html">Load Data
     *        Formats</a>.</p>
     *        <p class="title">
     *        <b>Allowed values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>csv</code> </b> for the <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-gremlin.html">Gremlin
     *        CSV data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>opencypher</code> </b> for the <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-format-opencypher.html"
     *        >openCypher CSV data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ntriples</code> </b> for the <a href="https://www.w3.org/TR/n-triples/">N-Triples RDF data
     *        format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>nquads</code> </b> for the <a href="https://www.w3.org/TR/n-quads/">N-Quads RDF data format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>rdfxml</code> </b> for the <a href="https://www.w3.org/TR/rdf-syntax-grammar/">RDF\XML RDF data
     *        format</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>turtle</code> </b> for the <a href="https://www.w3.org/TR/turtle/">Turtle RDF data format</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public StartLoaderJobRequest withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * </p>
     * 
     * @param s3BucketRegion
     *        The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * @see S3BucketRegion
     */

    public void setS3BucketRegion(String s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
    }

    /**
     * <p>
     * The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * </p>
     * 
     * @return The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * @see S3BucketRegion
     */

    public String getS3BucketRegion() {
        return this.s3BucketRegion;
    }

    /**
     * <p>
     * The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * </p>
     * 
     * @param s3BucketRegion
     *        The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3BucketRegion
     */

    public StartLoaderJobRequest withS3BucketRegion(String s3BucketRegion) {
        setS3BucketRegion(s3BucketRegion);
        return this;
    }

    /**
     * <p>
     * The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * </p>
     * 
     * @param s3BucketRegion
     *        The Amazon region of the S3 bucket. This must match the Amazon Region of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3BucketRegion
     */

    public StartLoaderJobRequest withS3BucketRegion(S3BucketRegion s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for an IAM role to be assumed by the Neptune DB instance for access to the S3
     * bucket. The IAM role ARN provided here should be attached to the DB cluster (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-IAM-add-role-cluster.html">Adding
     * the IAM Role to an Amazon Neptune Cluster</a>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) for an IAM role to be assumed by the Neptune DB instance for access to the
     *        S3 bucket. The IAM role ARN provided here should be attached to the DB cluster (see <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-IAM-add-role-cluster.html"
     *        >Adding the IAM Role to an Amazon Neptune Cluster</a>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for an IAM role to be assumed by the Neptune DB instance for access to the S3
     * bucket. The IAM role ARN provided here should be attached to the DB cluster (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-IAM-add-role-cluster.html">Adding
     * the IAM Role to an Amazon Neptune Cluster</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for an IAM role to be assumed by the Neptune DB instance for access to the
     *         S3 bucket. The IAM role ARN provided here should be attached to the DB cluster (see <a href=
     *         "https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-IAM-add-role-cluster.html"
     *         >Adding the IAM Role to an Amazon Neptune Cluster</a>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for an IAM role to be assumed by the Neptune DB instance for access to the S3
     * bucket. The IAM role ARN provided here should be attached to the DB cluster (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-IAM-add-role-cluster.html">Adding
     * the IAM Role to an Amazon Neptune Cluster</a>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) for an IAM role to be assumed by the Neptune DB instance for access to the
     *        S3 bucket. The IAM role ARN provided here should be attached to the DB cluster (see <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load-tutorial-IAM-add-role-cluster.html"
     *        >Adding the IAM Role to an Amazon Neptune Cluster</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The load job mode.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>AUTO</code>.
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if it finds
     * one, resumes that load job. If no previous load job is found, the loader stops.
     * </p>
     * <p>
     * The loader avoids reloading files that were successfully loaded in a previous job. It only tries to process
     * failed files. If you dropped previously loaded data from your Neptune cluster, that data is not reloaded in this
     * mode. If a previous load job loaded all files from the same source successfully, nothing is reloaded, and the
     * loader returns success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You can use
     * this mode to reload all the data from a source after dropping previously loaded data from your Neptune cluster,
     * or to load new data available at the same source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and if it
     * finds one, resumes that job, just as in <code>RESUME</code> mode.
     * </p>
     * <p>
     * If the loader doesn't find a previous load job from the same source, it loads all data from the source, just as
     * in <code>NEW</code> mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The load job mode.</p>
     *        <p>
     *        <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>AUTO</code>.
     *        </p>
     *        <p class="title">
     *        <b/>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if it
     *        finds one, resumes that load job. If no previous load job is found, the loader stops.
     *        </p>
     *        <p>
     *        The loader avoids reloading files that were successfully loaded in a previous job. It only tries to
     *        process failed files. If you dropped previously loaded data from your Neptune cluster, that data is not
     *        reloaded in this mode. If a previous load job loaded all files from the same source successfully, nothing
     *        is reloaded, and the loader returns success.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You
     *        can use this mode to reload all the data from a source after dropping previously loaded data from your
     *        Neptune cluster, or to load new data available at the same source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and
     *        if it finds one, resumes that job, just as in <code>RESUME</code> mode.
     *        </p>
     *        <p>
     *        If the loader doesn't find a previous load job from the same source, it loads all data from the source,
     *        just as in <code>NEW</code> mode.
     *        </p>
     *        </li>
     * @see Mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The load job mode.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>AUTO</code>.
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if it finds
     * one, resumes that load job. If no previous load job is found, the loader stops.
     * </p>
     * <p>
     * The loader avoids reloading files that were successfully loaded in a previous job. It only tries to process
     * failed files. If you dropped previously loaded data from your Neptune cluster, that data is not reloaded in this
     * mode. If a previous load job loaded all files from the same source successfully, nothing is reloaded, and the
     * loader returns success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You can use
     * this mode to reload all the data from a source after dropping previously loaded data from your Neptune cluster,
     * or to load new data available at the same source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and if it
     * finds one, resumes that job, just as in <code>RESUME</code> mode.
     * </p>
     * <p>
     * If the loader doesn't find a previous load job from the same source, it loads all data from the source, just as
     * in <code>NEW</code> mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The load job mode.</p>
     *         <p>
     *         <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     *         </p>
     *         <p>
     *         <i>Default value</i>: <code>AUTO</code>.
     *         </p>
     *         <p class="title">
     *         <b/>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if
     *         it finds one, resumes that load job. If no previous load job is found, the loader stops.
     *         </p>
     *         <p>
     *         The loader avoids reloading files that were successfully loaded in a previous job. It only tries to
     *         process failed files. If you dropped previously loaded data from your Neptune cluster, that data is not
     *         reloaded in this mode. If a previous load job loaded all files from the same source successfully, nothing
     *         is reloaded, and the loader returns success.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You
     *         can use this mode to reload all the data from a source after dropping previously loaded data from your
     *         Neptune cluster, or to load new data available at the same source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and
     *         if it finds one, resumes that job, just as in <code>RESUME</code> mode.
     *         </p>
     *         <p>
     *         If the loader doesn't find a previous load job from the same source, it loads all data from the source,
     *         just as in <code>NEW</code> mode.
     *         </p>
     *         </li>
     * @see Mode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The load job mode.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>AUTO</code>.
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if it finds
     * one, resumes that load job. If no previous load job is found, the loader stops.
     * </p>
     * <p>
     * The loader avoids reloading files that were successfully loaded in a previous job. It only tries to process
     * failed files. If you dropped previously loaded data from your Neptune cluster, that data is not reloaded in this
     * mode. If a previous load job loaded all files from the same source successfully, nothing is reloaded, and the
     * loader returns success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You can use
     * this mode to reload all the data from a source after dropping previously loaded data from your Neptune cluster,
     * or to load new data available at the same source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and if it
     * finds one, resumes that job, just as in <code>RESUME</code> mode.
     * </p>
     * <p>
     * If the loader doesn't find a previous load job from the same source, it loads all data from the source, just as
     * in <code>NEW</code> mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The load job mode.</p>
     *        <p>
     *        <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>AUTO</code>.
     *        </p>
     *        <p class="title">
     *        <b/>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if it
     *        finds one, resumes that load job. If no previous load job is found, the loader stops.
     *        </p>
     *        <p>
     *        The loader avoids reloading files that were successfully loaded in a previous job. It only tries to
     *        process failed files. If you dropped previously loaded data from your Neptune cluster, that data is not
     *        reloaded in this mode. If a previous load job loaded all files from the same source successfully, nothing
     *        is reloaded, and the loader returns success.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You
     *        can use this mode to reload all the data from a source after dropping previously loaded data from your
     *        Neptune cluster, or to load new data available at the same source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and
     *        if it finds one, resumes that job, just as in <code>RESUME</code> mode.
     *        </p>
     *        <p>
     *        If the loader doesn't find a previous load job from the same source, it loads all data from the source,
     *        just as in <code>NEW</code> mode.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public StartLoaderJobRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The load job mode.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>AUTO</code>.
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if it finds
     * one, resumes that load job. If no previous load job is found, the loader stops.
     * </p>
     * <p>
     * The loader avoids reloading files that were successfully loaded in a previous job. It only tries to process
     * failed files. If you dropped previously loaded data from your Neptune cluster, that data is not reloaded in this
     * mode. If a previous load job loaded all files from the same source successfully, nothing is reloaded, and the
     * loader returns success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You can use
     * this mode to reload all the data from a source after dropping previously loaded data from your Neptune cluster,
     * or to load new data available at the same source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and if it
     * finds one, resumes that job, just as in <code>RESUME</code> mode.
     * </p>
     * <p>
     * If the loader doesn't find a previous load job from the same source, it loads all data from the source, just as
     * in <code>NEW</code> mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The load job mode.</p>
     *        <p>
     *        <i>Allowed values</i>: <code>RESUME</code>, <code>NEW</code>, <code>AUTO</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>AUTO</code>.
     *        </p>
     *        <p class="title">
     *        <b/>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RESUME</code>   –   In RESUME mode, the loader looks for a previous load from this source, and if it
     *        finds one, resumes that load job. If no previous load job is found, the loader stops.
     *        </p>
     *        <p>
     *        The loader avoids reloading files that were successfully loaded in a previous job. It only tries to
     *        process failed files. If you dropped previously loaded data from your Neptune cluster, that data is not
     *        reloaded in this mode. If a previous load job loaded all files from the same source successfully, nothing
     *        is reloaded, and the loader returns success.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code>   –   In NEW mode, the creates a new load request regardless of any previous loads. You
     *        can use this mode to reload all the data from a source after dropping previously loaded data from your
     *        Neptune cluster, or to load new data available at the same source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code>   –   In AUTO mode, the loader looks for a previous load job from the same source, and
     *        if it finds one, resumes that job, just as in <code>RESUME</code> mode.
     *        </p>
     *        <p>
     *        If the loader doesn't find a previous load job from the same source, it loads all data from the source,
     *        just as in <code>NEW</code> mode.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public StartLoaderJobRequest withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"TRUE"</code>.
     * </p>
     * <p>
     * When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     * specified, skipping any entries with errors.
     * </p>
     * <p>
     * When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error. Data
     * loaded up to that point persists.
     * </p>
     * 
     * @param failOnError
     *        <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.</p>
     *        <p>
     *        <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>"TRUE"</code>.
     *        </p>
     *        <p>
     *        When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     *        specified, skipping any entries with errors.
     *        </p>
     *        <p>
     *        When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error.
     *        Data loaded up to that point persists.
     */

    public void setFailOnError(Boolean failOnError) {
        this.failOnError = failOnError;
    }

    /**
     * <p>
     * <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"TRUE"</code>.
     * </p>
     * <p>
     * When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     * specified, skipping any entries with errors.
     * </p>
     * <p>
     * When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error. Data
     * loaded up to that point persists.
     * </p>
     * 
     * @return <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.</p>
     *         <p>
     *         <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *         </p>
     *         <p>
     *         <i>Default value</i>: <code>"TRUE"</code>.
     *         </p>
     *         <p>
     *         When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     *         specified, skipping any entries with errors.
     *         </p>
     *         <p>
     *         When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error.
     *         Data loaded up to that point persists.
     */

    public Boolean getFailOnError() {
        return this.failOnError;
    }

    /**
     * <p>
     * <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"TRUE"</code>.
     * </p>
     * <p>
     * When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     * specified, skipping any entries with errors.
     * </p>
     * <p>
     * When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error. Data
     * loaded up to that point persists.
     * </p>
     * 
     * @param failOnError
     *        <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.</p>
     *        <p>
     *        <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>"TRUE"</code>.
     *        </p>
     *        <p>
     *        When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     *        specified, skipping any entries with errors.
     *        </p>
     *        <p>
     *        When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error.
     *        Data loaded up to that point persists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withFailOnError(Boolean failOnError) {
        setFailOnError(failOnError);
        return this;
    }

    /**
     * <p>
     * <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"TRUE"</code>.
     * </p>
     * <p>
     * When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     * specified, skipping any entries with errors.
     * </p>
     * <p>
     * When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error. Data
     * loaded up to that point persists.
     * </p>
     * 
     * @return <b> <code>failOnError</code> </b>   –   A flag to toggle a complete stop on an error.</p>
     *         <p>
     *         <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *         </p>
     *         <p>
     *         <i>Default value</i>: <code>"TRUE"</code>.
     *         </p>
     *         <p>
     *         When this parameter is set to <code>"FALSE"</code>, the loader tries to load all the data in the location
     *         specified, skipping any entries with errors.
     *         </p>
     *         <p>
     *         When this parameter is set to <code>"TRUE"</code>, the loader stops as soon as it encounters an error.
     *         Data loaded up to that point persists.
     */

    public Boolean isFailOnError() {
        return this.failOnError;
    }

    /**
     * <p>
     * The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the bulk load
     * process.
     * </p>
     * <p>
     * <i>Allowed values</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by 2. If
     * this value is used, the bulk loader takes up all available resources.
     * </p>
     * <p>
     * This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization. Because
     * the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70% range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Default value</i>: <code>HIGH</code>
     * </p>
     * <p>
     * The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading openCypher
     * data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can generally fix the
     * issue by setting <code>parallelism</code> to a lower setting and retrying the load command.
     * </p>
     * 
     * @param parallelism
     *        The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the
     *        bulk load process.</p>
     *        <p>
     *        <i>Allowed values</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by
     *        2. If this value is used, the bulk loader takes up all available resources.
     *        </p>
     *        <p>
     *        This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization.
     *        Because the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70% range.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i>Default value</i>: <code>HIGH</code>
     *        </p>
     *        <p>
     *        The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading
     *        openCypher data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can
     *        generally fix the issue by setting <code>parallelism</code> to a lower setting and retrying the load
     *        command.
     * @see Parallelism
     */

    public void setParallelism(String parallelism) {
        this.parallelism = parallelism;
    }

    /**
     * <p>
     * The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the bulk load
     * process.
     * </p>
     * <p>
     * <i>Allowed values</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by 2. If
     * this value is used, the bulk loader takes up all available resources.
     * </p>
     * <p>
     * This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization. Because
     * the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70% range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Default value</i>: <code>HIGH</code>
     * </p>
     * <p>
     * The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading openCypher
     * data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can generally fix the
     * issue by setting <code>parallelism</code> to a lower setting and retrying the load command.
     * </p>
     * 
     * @return The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the
     *         bulk load process.</p>
     *         <p>
     *         <i>Allowed values</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by
     *         2. If this value is used, the bulk loader takes up all available resources.
     *         </p>
     *         <p>
     *         This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization.
     *         Because the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70%
     *         range.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <i>Default value</i>: <code>HIGH</code>
     *         </p>
     *         <p>
     *         The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading
     *         openCypher data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can
     *         generally fix the issue by setting <code>parallelism</code> to a lower setting and retrying the load
     *         command.
     * @see Parallelism
     */

    public String getParallelism() {
        return this.parallelism;
    }

    /**
     * <p>
     * The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the bulk load
     * process.
     * </p>
     * <p>
     * <i>Allowed values</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by 2. If
     * this value is used, the bulk loader takes up all available resources.
     * </p>
     * <p>
     * This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization. Because
     * the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70% range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Default value</i>: <code>HIGH</code>
     * </p>
     * <p>
     * The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading openCypher
     * data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can generally fix the
     * issue by setting <code>parallelism</code> to a lower setting and retrying the load command.
     * </p>
     * 
     * @param parallelism
     *        The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the
     *        bulk load process.</p>
     *        <p>
     *        <i>Allowed values</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by
     *        2. If this value is used, the bulk loader takes up all available resources.
     *        </p>
     *        <p>
     *        This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization.
     *        Because the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70% range.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i>Default value</i>: <code>HIGH</code>
     *        </p>
     *        <p>
     *        The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading
     *        openCypher data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can
     *        generally fix the issue by setting <code>parallelism</code> to a lower setting and retrying the load
     *        command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Parallelism
     */

    public StartLoaderJobRequest withParallelism(String parallelism) {
        setParallelism(parallelism);
        return this;
    }

    /**
     * <p>
     * The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the bulk load
     * process.
     * </p>
     * <p>
     * <i>Allowed values</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by 2. If
     * this value is used, the bulk loader takes up all available resources.
     * </p>
     * <p>
     * This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization. Because
     * the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70% range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Default value</i>: <code>HIGH</code>
     * </p>
     * <p>
     * The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading openCypher
     * data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can generally fix the
     * issue by setting <code>parallelism</code> to a lower setting and retrying the load command.
     * </p>
     * 
     * @param parallelism
     *        The optional <code>parallelism</code> parameter can be set to reduce the number of threads used by the
     *        bulk load process.</p>
     *        <p>
     *        <i>Allowed values</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LOW</code> –   The number of threads used is the number of available vCPUs divided by 8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIUM</code> –   The number of threads used is the number of available vCPUs divided by 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIGH</code> –   The number of threads used is the same as the number of available vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERSUBSCRIBE</code> –   The number of threads used is the number of available vCPUs multiplied by
     *        2. If this value is used, the bulk loader takes up all available resources.
     *        </p>
     *        <p>
     *        This does not mean, however, that the <code>OVERSUBSCRIBE</code> setting results in 100% CPU utilization.
     *        Because the load operation is I/O bound, the highest CPU utilization to expect is in the 60% to 70% range.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i>Default value</i>: <code>HIGH</code>
     *        </p>
     *        <p>
     *        The <code>parallelism</code> setting can sometimes result in a deadlock between threads when loading
     *        openCypher data. When this happens, Neptune returns the <code>LOAD_DATA_DEADLOCK</code> error. You can
     *        generally fix the issue by setting <code>parallelism</code> to a lower setting and retrying the load
     *        command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Parallelism
     */

    public StartLoaderJobRequest withParallelism(Parallelism parallelism) {
        this.parallelism = parallelism.toString();
        return this;
    }

    /**
     * <p>
     * <b> <code>parserConfiguration</code> </b>   –   An optional object with additional parser configuration values.
     * Each of the child parameters is also optional:
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>namedGraphUri</code> </b>   –   The default graph for all RDF formats when no graph is specified (for
     * non-quads formats and NQUAD entries with no graph).
     * </p>
     * <p>
     * The default is <code>https://aws.amazon.com/neptune/vocab/v01/DefaultNamedGraph</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>baseUri</code> </b>   –   The base URI for RDF/XML and Turtle formats.
     * </p>
     * <p>
     * The default is <code>https://aws.amazon.com/neptune/default</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allowEmptyStrings</code> </b>   –   Gremlin users need to be able to pass empty string values("") as
     * node and edge properties when loading CSV data. If <code>allowEmptyStrings</code> is set to <code>false</code>
     * (the default), such empty strings are treated as nulls and are not loaded.
     * </p>
     * <p>
     * If <code>allowEmptyStrings</code> is set to <code>true</code>, the loader treats empty strings as valid property
     * values and loads them accordingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <b> <code>parserConfiguration</code> </b>   –   An optional object with additional parser configuration
     *         values. Each of the child parameters is also optional:</p>
     *         <p class="title">
     *         <b/>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>namedGraphUri</code> </b>   –   The default graph for all RDF formats when no graph is
     *         specified (for non-quads formats and NQUAD entries with no graph).
     *         </p>
     *         <p>
     *         The default is <code>https://aws.amazon.com/neptune/vocab/v01/DefaultNamedGraph</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>baseUri</code> </b>   –   The base URI for RDF/XML and Turtle formats.
     *         </p>
     *         <p>
     *         The default is <code>https://aws.amazon.com/neptune/default</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>allowEmptyStrings</code> </b>   –   Gremlin users need to be able to pass empty string
     *         values("") as node and edge properties when loading CSV data. If <code>allowEmptyStrings</code> is set to
     *         <code>false</code> (the default), such empty strings are treated as nulls and are not loaded.
     *         </p>
     *         <p>
     *         If <code>allowEmptyStrings</code> is set to <code>true</code>, the loader treats empty strings as valid
     *         property values and loads them accordingly.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getParserConfiguration() {
        return parserConfiguration;
    }

    /**
     * <p>
     * <b> <code>parserConfiguration</code> </b>   –   An optional object with additional parser configuration values.
     * Each of the child parameters is also optional:
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>namedGraphUri</code> </b>   –   The default graph for all RDF formats when no graph is specified (for
     * non-quads formats and NQUAD entries with no graph).
     * </p>
     * <p>
     * The default is <code>https://aws.amazon.com/neptune/vocab/v01/DefaultNamedGraph</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>baseUri</code> </b>   –   The base URI for RDF/XML and Turtle formats.
     * </p>
     * <p>
     * The default is <code>https://aws.amazon.com/neptune/default</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allowEmptyStrings</code> </b>   –   Gremlin users need to be able to pass empty string values("") as
     * node and edge properties when loading CSV data. If <code>allowEmptyStrings</code> is set to <code>false</code>
     * (the default), such empty strings are treated as nulls and are not loaded.
     * </p>
     * <p>
     * If <code>allowEmptyStrings</code> is set to <code>true</code>, the loader treats empty strings as valid property
     * values and loads them accordingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parserConfiguration
     *        <b> <code>parserConfiguration</code> </b>   –   An optional object with additional parser configuration
     *        values. Each of the child parameters is also optional:</p>
     *        <p class="title">
     *        <b/>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>namedGraphUri</code> </b>   –   The default graph for all RDF formats when no graph is specified
     *        (for non-quads formats and NQUAD entries with no graph).
     *        </p>
     *        <p>
     *        The default is <code>https://aws.amazon.com/neptune/vocab/v01/DefaultNamedGraph</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>baseUri</code> </b>   –   The base URI for RDF/XML and Turtle formats.
     *        </p>
     *        <p>
     *        The default is <code>https://aws.amazon.com/neptune/default</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>allowEmptyStrings</code> </b>   –   Gremlin users need to be able to pass empty string
     *        values("") as node and edge properties when loading CSV data. If <code>allowEmptyStrings</code> is set to
     *        <code>false</code> (the default), such empty strings are treated as nulls and are not loaded.
     *        </p>
     *        <p>
     *        If <code>allowEmptyStrings</code> is set to <code>true</code>, the loader treats empty strings as valid
     *        property values and loads them accordingly.
     *        </p>
     *        </li>
     */

    public void setParserConfiguration(java.util.Map<String, String> parserConfiguration) {
        this.parserConfiguration = parserConfiguration;
    }

    /**
     * <p>
     * <b> <code>parserConfiguration</code> </b>   –   An optional object with additional parser configuration values.
     * Each of the child parameters is also optional:
     * </p>
     * <p class="title">
     * <b/>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>namedGraphUri</code> </b>   –   The default graph for all RDF formats when no graph is specified (for
     * non-quads formats and NQUAD entries with no graph).
     * </p>
     * <p>
     * The default is <code>https://aws.amazon.com/neptune/vocab/v01/DefaultNamedGraph</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>baseUri</code> </b>   –   The base URI for RDF/XML and Turtle formats.
     * </p>
     * <p>
     * The default is <code>https://aws.amazon.com/neptune/default</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>allowEmptyStrings</code> </b>   –   Gremlin users need to be able to pass empty string values("") as
     * node and edge properties when loading CSV data. If <code>allowEmptyStrings</code> is set to <code>false</code>
     * (the default), such empty strings are treated as nulls and are not loaded.
     * </p>
     * <p>
     * If <code>allowEmptyStrings</code> is set to <code>true</code>, the loader treats empty strings as valid property
     * values and loads them accordingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parserConfiguration
     *        <b> <code>parserConfiguration</code> </b>   –   An optional object with additional parser configuration
     *        values. Each of the child parameters is also optional:</p>
     *        <p class="title">
     *        <b/>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>namedGraphUri</code> </b>   –   The default graph for all RDF formats when no graph is specified
     *        (for non-quads formats and NQUAD entries with no graph).
     *        </p>
     *        <p>
     *        The default is <code>https://aws.amazon.com/neptune/vocab/v01/DefaultNamedGraph</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>baseUri</code> </b>   –   The base URI for RDF/XML and Turtle formats.
     *        </p>
     *        <p>
     *        The default is <code>https://aws.amazon.com/neptune/default</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>allowEmptyStrings</code> </b>   –   Gremlin users need to be able to pass empty string
     *        values("") as node and edge properties when loading CSV data. If <code>allowEmptyStrings</code> is set to
     *        <code>false</code> (the default), such empty strings are treated as nulls and are not loaded.
     *        </p>
     *        <p>
     *        If <code>allowEmptyStrings</code> is set to <code>true</code>, the loader treats empty strings as valid
     *        property values and loads them accordingly.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withParserConfiguration(java.util.Map<String, String> parserConfiguration) {
        setParserConfiguration(parserConfiguration);
        return this;
    }

    /**
     * Add a single ParserConfiguration entry
     *
     * @see StartLoaderJobRequest#withParserConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest addParserConfigurationEntry(String key, String value) {
        if (null == this.parserConfiguration) {
            this.parserConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.parserConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parserConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ParserConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest clearParserConfigurationEntries() {
        this.parserConfiguration = null;
        return this;
    }

    /**
     * <p>
     * <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader treats
     * a new value for single-cardinality vertex or edge properties. This is not supported for loading openCypher data.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * <p>
     * By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to <code>"FALSE"</code>, the
     * loader treats a new value as an error, because it violates single cardinality.
     * </p>
     * <p>
     * When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the bulk
     * loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex property
     * values are provided in the source file(s) being loaded, the final value at the end of the bulk load could be any
     * one of those new values. The loader only guarantees that the existing value has been replaced by one of the new
     * ones.
     * </p>
     * 
     * @param updateSingleCardinalityProperties
     *        <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader
     *        treats a new value for single-cardinality vertex or edge properties. This is not supported for loading
     *        openCypher data.</p>
     *        <p>
     *        <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>"FALSE"</code>.
     *        </p>
     *        <p>
     *        By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to
     *        <code>"FALSE"</code>, the loader treats a new value as an error, because it violates single cardinality.
     *        </p>
     *        <p>
     *        When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the
     *        bulk loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex
     *        property values are provided in the source file(s) being loaded, the final value at the end of the bulk
     *        load could be any one of those new values. The loader only guarantees that the existing value has been
     *        replaced by one of the new ones.
     */

    public void setUpdateSingleCardinalityProperties(Boolean updateSingleCardinalityProperties) {
        this.updateSingleCardinalityProperties = updateSingleCardinalityProperties;
    }

    /**
     * <p>
     * <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader treats
     * a new value for single-cardinality vertex or edge properties. This is not supported for loading openCypher data.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * <p>
     * By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to <code>"FALSE"</code>, the
     * loader treats a new value as an error, because it violates single cardinality.
     * </p>
     * <p>
     * When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the bulk
     * loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex property
     * values are provided in the source file(s) being loaded, the final value at the end of the bulk load could be any
     * one of those new values. The loader only guarantees that the existing value has been replaced by one of the new
     * ones.
     * </p>
     * 
     * @return <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader
     *         treats a new value for single-cardinality vertex or edge properties. This is not supported for loading
     *         openCypher data.</p>
     *         <p>
     *         <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *         </p>
     *         <p>
     *         <i>Default value</i>: <code>"FALSE"</code>.
     *         </p>
     *         <p>
     *         By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to
     *         <code>"FALSE"</code>, the loader treats a new value as an error, because it violates single cardinality.
     *         </p>
     *         <p>
     *         When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the
     *         bulk loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex
     *         property values are provided in the source file(s) being loaded, the final value at the end of the bulk
     *         load could be any one of those new values. The loader only guarantees that the existing value has been
     *         replaced by one of the new ones.
     */

    public Boolean getUpdateSingleCardinalityProperties() {
        return this.updateSingleCardinalityProperties;
    }

    /**
     * <p>
     * <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader treats
     * a new value for single-cardinality vertex or edge properties. This is not supported for loading openCypher data.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * <p>
     * By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to <code>"FALSE"</code>, the
     * loader treats a new value as an error, because it violates single cardinality.
     * </p>
     * <p>
     * When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the bulk
     * loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex property
     * values are provided in the source file(s) being loaded, the final value at the end of the bulk load could be any
     * one of those new values. The loader only guarantees that the existing value has been replaced by one of the new
     * ones.
     * </p>
     * 
     * @param updateSingleCardinalityProperties
     *        <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader
     *        treats a new value for single-cardinality vertex or edge properties. This is not supported for loading
     *        openCypher data.</p>
     *        <p>
     *        <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>"FALSE"</code>.
     *        </p>
     *        <p>
     *        By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to
     *        <code>"FALSE"</code>, the loader treats a new value as an error, because it violates single cardinality.
     *        </p>
     *        <p>
     *        When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the
     *        bulk loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex
     *        property values are provided in the source file(s) being loaded, the final value at the end of the bulk
     *        load could be any one of those new values. The loader only guarantees that the existing value has been
     *        replaced by one of the new ones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withUpdateSingleCardinalityProperties(Boolean updateSingleCardinalityProperties) {
        setUpdateSingleCardinalityProperties(updateSingleCardinalityProperties);
        return this;
    }

    /**
     * <p>
     * <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader treats
     * a new value for single-cardinality vertex or edge properties. This is not supported for loading openCypher data.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * <p>
     * By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to <code>"FALSE"</code>, the
     * loader treats a new value as an error, because it violates single cardinality.
     * </p>
     * <p>
     * When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the bulk
     * loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex property
     * values are provided in the source file(s) being loaded, the final value at the end of the bulk load could be any
     * one of those new values. The loader only guarantees that the existing value has been replaced by one of the new
     * ones.
     * </p>
     * 
     * @return <code>updateSingleCardinalityProperties</code> is an optional parameter that controls how the bulk loader
     *         treats a new value for single-cardinality vertex or edge properties. This is not supported for loading
     *         openCypher data.</p>
     *         <p>
     *         <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *         </p>
     *         <p>
     *         <i>Default value</i>: <code>"FALSE"</code>.
     *         </p>
     *         <p>
     *         By default, or when <code>updateSingleCardinalityProperties</code> is explicitly set to
     *         <code>"FALSE"</code>, the loader treats a new value as an error, because it violates single cardinality.
     *         </p>
     *         <p>
     *         When <code>updateSingleCardinalityProperties</code> is set to <code>"TRUE"</code>, on the other hand, the
     *         bulk loader replaces the existing value with the new one. If multiple edge or single-cardinality vertex
     *         property values are provided in the source file(s) being loaded, the final value at the end of the bulk
     *         load could be any one of those new values. The loader only guarantees that the existing value has been
     *         replaced by one of the new ones.
     */

    public Boolean isUpdateSingleCardinalityProperties() {
        return this.updateSingleCardinalityProperties;
    }

    /**
     * <p>
     * This is an optional flag parameter that indicates whether the load request can be queued up or not.
     * </p>
     * <p>
     * You don't have to wait for one load job to complete before issuing the next one, because Neptune can queue up as
     * many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all set to
     * <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     * </p>
     * <p>
     * If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request will fail
     * if another load job is already running.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * 
     * @param queueRequest
     *        This is an optional flag parameter that indicates whether the load request can be queued up or not. </p>
     *        <p>
     *        You don't have to wait for one load job to complete before issuing the next one, because Neptune can queue
     *        up as many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all set to
     *        <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     *        </p>
     *        <p>
     *        If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request
     *        will fail if another load job is already running.
     *        </p>
     *        <p>
     *        <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>"FALSE"</code>.
     */

    public void setQueueRequest(Boolean queueRequest) {
        this.queueRequest = queueRequest;
    }

    /**
     * <p>
     * This is an optional flag parameter that indicates whether the load request can be queued up or not.
     * </p>
     * <p>
     * You don't have to wait for one load job to complete before issuing the next one, because Neptune can queue up as
     * many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all set to
     * <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     * </p>
     * <p>
     * If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request will fail
     * if another load job is already running.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * 
     * @return This is an optional flag parameter that indicates whether the load request can be queued up or not. </p>
     *         <p>
     *         You don't have to wait for one load job to complete before issuing the next one, because Neptune can
     *         queue up as many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all
     *         set to <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     *         </p>
     *         <p>
     *         If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request
     *         will fail if another load job is already running.
     *         </p>
     *         <p>
     *         <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *         </p>
     *         <p>
     *         <i>Default value</i>: <code>"FALSE"</code>.
     */

    public Boolean getQueueRequest() {
        return this.queueRequest;
    }

    /**
     * <p>
     * This is an optional flag parameter that indicates whether the load request can be queued up or not.
     * </p>
     * <p>
     * You don't have to wait for one load job to complete before issuing the next one, because Neptune can queue up as
     * many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all set to
     * <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     * </p>
     * <p>
     * If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request will fail
     * if another load job is already running.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * 
     * @param queueRequest
     *        This is an optional flag parameter that indicates whether the load request can be queued up or not. </p>
     *        <p>
     *        You don't have to wait for one load job to complete before issuing the next one, because Neptune can queue
     *        up as many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all set to
     *        <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     *        </p>
     *        <p>
     *        If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request
     *        will fail if another load job is already running.
     *        </p>
     *        <p>
     *        <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *        </p>
     *        <p>
     *        <i>Default value</i>: <code>"FALSE"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withQueueRequest(Boolean queueRequest) {
        setQueueRequest(queueRequest);
        return this;
    }

    /**
     * <p>
     * This is an optional flag parameter that indicates whether the load request can be queued up or not.
     * </p>
     * <p>
     * You don't have to wait for one load job to complete before issuing the next one, because Neptune can queue up as
     * many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all set to
     * <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     * </p>
     * <p>
     * If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request will fail
     * if another load job is already running.
     * </p>
     * <p>
     * <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     * </p>
     * <p>
     * <i>Default value</i>: <code>"FALSE"</code>.
     * </p>
     * 
     * @return This is an optional flag parameter that indicates whether the load request can be queued up or not. </p>
     *         <p>
     *         You don't have to wait for one load job to complete before issuing the next one, because Neptune can
     *         queue up as many as 64 jobs at a time, provided that their <code>queueRequest</code> parameters are all
     *         set to <code>"TRUE"</code>. The queue order of the jobs will be first-in-first-out (FIFO).
     *         </p>
     *         <p>
     *         If the <code>queueRequest</code> parameter is omitted or set to <code>"FALSE"</code>, the load request
     *         will fail if another load job is already running.
     *         </p>
     *         <p>
     *         <i>Allowed values</i>: <code>"TRUE"</code>, <code>"FALSE"</code>.
     *         </p>
     *         <p>
     *         <i>Default value</i>: <code>"FALSE"</code>.
     */

    public Boolean isQueueRequest() {
        return this.queueRequest;
    }

    /**
     * <p>
     * This is an optional parameter that can make a queued load request contingent on the successful completion of one
     * or more previous jobs in the queue.
     * </p>
     * <p>
     * Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters are set
     * to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a queued request
     * dependent on the successful completion of one or more specified previous requests in the queue.
     * </p>
     * <p>
     * For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     * <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins, proceed as
     * follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     * load-ids.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     * </p>
     * </li>
     * </ol>
     * <p>
     * Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code> until
     * <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails, Job-C will
     * not be executed, and its status will be set to <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     * </p>
     * <p>
     * You can set up multiple levels of dependency in this way, so that the failure of one job will cause all requests
     * that are directly or indirectly dependent on it to be cancelled.
     * </p>
     * 
     * @return This is an optional parameter that can make a queued load request contingent on the successful completion
     *         of one or more previous jobs in the queue.</p>
     *         <p>
     *         Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters
     *         are set to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a
     *         queued request dependent on the successful completion of one or more specified previous requests in the
     *         queue.
     *         </p>
     *         <p>
     *         For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     *         <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins,
     *         proceed as follows:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     *         load-ids.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code>
     *         until <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails,
     *         Job-C will not be executed, and its status will be set to
     *         <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     *         </p>
     *         <p>
     *         You can set up multiple levels of dependency in this way, so that the failure of one job will cause all
     *         requests that are directly or indirectly dependent on it to be cancelled.
     */

    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    /**
     * <p>
     * This is an optional parameter that can make a queued load request contingent on the successful completion of one
     * or more previous jobs in the queue.
     * </p>
     * <p>
     * Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters are set
     * to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a queued request
     * dependent on the successful completion of one or more specified previous requests in the queue.
     * </p>
     * <p>
     * For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     * <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins, proceed as
     * follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     * load-ids.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     * </p>
     * </li>
     * </ol>
     * <p>
     * Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code> until
     * <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails, Job-C will
     * not be executed, and its status will be set to <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     * </p>
     * <p>
     * You can set up multiple levels of dependency in this way, so that the failure of one job will cause all requests
     * that are directly or indirectly dependent on it to be cancelled.
     * </p>
     * 
     * @param dependencies
     *        This is an optional parameter that can make a queued load request contingent on the successful completion
     *        of one or more previous jobs in the queue.</p>
     *        <p>
     *        Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters
     *        are set to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a
     *        queued request dependent on the successful completion of one or more specified previous requests in the
     *        queue.
     *        </p>
     *        <p>
     *        For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     *        <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins,
     *        proceed as follows:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     *        load-ids.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code>
     *        until <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails,
     *        Job-C will not be executed, and its status will be set to
     *        <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     *        </p>
     *        <p>
     *        You can set up multiple levels of dependency in this way, so that the failure of one job will cause all
     *        requests that are directly or indirectly dependent on it to be cancelled.
     */

    public void setDependencies(java.util.Collection<String> dependencies) {
        if (dependencies == null) {
            this.dependencies = null;
            return;
        }

        this.dependencies = new java.util.ArrayList<String>(dependencies);
    }

    /**
     * <p>
     * This is an optional parameter that can make a queued load request contingent on the successful completion of one
     * or more previous jobs in the queue.
     * </p>
     * <p>
     * Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters are set
     * to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a queued request
     * dependent on the successful completion of one or more specified previous requests in the queue.
     * </p>
     * <p>
     * For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     * <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins, proceed as
     * follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     * load-ids.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     * </p>
     * </li>
     * </ol>
     * <p>
     * Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code> until
     * <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails, Job-C will
     * not be executed, and its status will be set to <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     * </p>
     * <p>
     * You can set up multiple levels of dependency in this way, so that the failure of one job will cause all requests
     * that are directly or indirectly dependent on it to be cancelled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependencies(java.util.Collection)} or {@link #withDependencies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependencies
     *        This is an optional parameter that can make a queued load request contingent on the successful completion
     *        of one or more previous jobs in the queue.</p>
     *        <p>
     *        Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters
     *        are set to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a
     *        queued request dependent on the successful completion of one or more specified previous requests in the
     *        queue.
     *        </p>
     *        <p>
     *        For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     *        <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins,
     *        proceed as follows:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     *        load-ids.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code>
     *        until <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails,
     *        Job-C will not be executed, and its status will be set to
     *        <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     *        </p>
     *        <p>
     *        You can set up multiple levels of dependency in this way, so that the failure of one job will cause all
     *        requests that are directly or indirectly dependent on it to be cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withDependencies(String... dependencies) {
        if (this.dependencies == null) {
            setDependencies(new java.util.ArrayList<String>(dependencies.length));
        }
        for (String ele : dependencies) {
            this.dependencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is an optional parameter that can make a queued load request contingent on the successful completion of one
     * or more previous jobs in the queue.
     * </p>
     * <p>
     * Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters are set
     * to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a queued request
     * dependent on the successful completion of one or more specified previous requests in the queue.
     * </p>
     * <p>
     * For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     * <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins, proceed as
     * follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     * load-ids.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     * </p>
     * </li>
     * </ol>
     * <p>
     * Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code> until
     * <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails, Job-C will
     * not be executed, and its status will be set to <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     * </p>
     * <p>
     * You can set up multiple levels of dependency in this way, so that the failure of one job will cause all requests
     * that are directly or indirectly dependent on it to be cancelled.
     * </p>
     * 
     * @param dependencies
     *        This is an optional parameter that can make a queued load request contingent on the successful completion
     *        of one or more previous jobs in the queue.</p>
     *        <p>
     *        Neptune can queue up as many as 64 load requests at a time, if their <code>queueRequest</code> parameters
     *        are set to <code>"TRUE"</code>. The <code>dependencies</code> parameter lets you make execution of such a
     *        queued request dependent on the successful completion of one or more specified previous requests in the
     *        queue.
     *        </p>
     *        <p>
     *        For example, if load <code>Job-A</code> and <code>Job-B</code> are independent of each other, but load
     *        <code>Job-C</code> needs <code>Job-A</code> and <code>Job-B</code> to be finished before it begins,
     *        proceed as follows:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Submit <code>load-job-A</code> and <code>load-job-B</code> one after another in any order, and save their
     *        load-ids.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit <code>load-job-C</code> with the load-ids of the two jobs in its <code>dependencies</code> field:
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        Because of the <code>dependencies</code> parameter, the bulk loader will not start <code>Job-C</code>
     *        until <code>Job-A</code> and <code>Job-B</code> have completed successfully. If either one of them fails,
     *        Job-C will not be executed, and its status will be set to
     *        <code>LOAD_FAILED_BECAUSE_DEPENDENCY_NOT_SATISFIED</code>.
     *        </p>
     *        <p>
     *        You can set up multiple levels of dependency in this way, so that the failure of one job will cause all
     *        requests that are directly or indirectly dependent on it to be cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withDependencies(java.util.Collection<String> dependencies) {
        setDependencies(dependencies);
        return this;
    }

    /**
     * <p>
     * This parameter is required only when loading openCypher data that contains relationship IDs. It must be included
     * and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the load data
     * (recommended).
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column must be
     * present in every relationship file in the load.
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the load
     * <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically generates an ID for
     * each relationship.
     * </p>
     * <p>
     * It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in the CSV
     * data have been fixed, without having to reload any relationships that have already been loaded. If relationship
     * IDs have not been explicitly assigned, the loader cannot resume a failed load if any relationship file has had to
     * be corrected, and must instead reload all the relationships.
     * </p>
     * 
     * @param userProvidedEdgeIds
     *        This parameter is required only when loading openCypher data that contains relationship IDs. It must be
     *        included and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the load
     *        data (recommended).</p>
     *        <p>
     *        When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column
     *        must be present in every relationship file in the load.
     *        </p>
     *        <p>
     *        When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the
     *        load <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically
     *        generates an ID for each relationship.
     *        </p>
     *        <p>
     *        It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in
     *        the CSV data have been fixed, without having to reload any relationships that have already been loaded. If
     *        relationship IDs have not been explicitly assigned, the loader cannot resume a failed load if any
     *        relationship file has had to be corrected, and must instead reload all the relationships.
     */

    public void setUserProvidedEdgeIds(Boolean userProvidedEdgeIds) {
        this.userProvidedEdgeIds = userProvidedEdgeIds;
    }

    /**
     * <p>
     * This parameter is required only when loading openCypher data that contains relationship IDs. It must be included
     * and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the load data
     * (recommended).
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column must be
     * present in every relationship file in the load.
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the load
     * <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically generates an ID for
     * each relationship.
     * </p>
     * <p>
     * It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in the CSV
     * data have been fixed, without having to reload any relationships that have already been loaded. If relationship
     * IDs have not been explicitly assigned, the loader cannot resume a failed load if any relationship file has had to
     * be corrected, and must instead reload all the relationships.
     * </p>
     * 
     * @return This parameter is required only when loading openCypher data that contains relationship IDs. It must be
     *         included and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the
     *         load data (recommended).</p>
     *         <p>
     *         When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column
     *         must be present in every relationship file in the load.
     *         </p>
     *         <p>
     *         When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the
     *         load <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically
     *         generates an ID for each relationship.
     *         </p>
     *         <p>
     *         It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in
     *         the CSV data have been fixed, without having to reload any relationships that have already been loaded.
     *         If relationship IDs have not been explicitly assigned, the loader cannot resume a failed load if any
     *         relationship file has had to be corrected, and must instead reload all the relationships.
     */

    public Boolean getUserProvidedEdgeIds() {
        return this.userProvidedEdgeIds;
    }

    /**
     * <p>
     * This parameter is required only when loading openCypher data that contains relationship IDs. It must be included
     * and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the load data
     * (recommended).
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column must be
     * present in every relationship file in the load.
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the load
     * <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically generates an ID for
     * each relationship.
     * </p>
     * <p>
     * It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in the CSV
     * data have been fixed, without having to reload any relationships that have already been loaded. If relationship
     * IDs have not been explicitly assigned, the loader cannot resume a failed load if any relationship file has had to
     * be corrected, and must instead reload all the relationships.
     * </p>
     * 
     * @param userProvidedEdgeIds
     *        This parameter is required only when loading openCypher data that contains relationship IDs. It must be
     *        included and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the load
     *        data (recommended).</p>
     *        <p>
     *        When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column
     *        must be present in every relationship file in the load.
     *        </p>
     *        <p>
     *        When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the
     *        load <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically
     *        generates an ID for each relationship.
     *        </p>
     *        <p>
     *        It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in
     *        the CSV data have been fixed, without having to reload any relationships that have already been loaded. If
     *        relationship IDs have not been explicitly assigned, the loader cannot resume a failed load if any
     *        relationship file has had to be corrected, and must instead reload all the relationships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLoaderJobRequest withUserProvidedEdgeIds(Boolean userProvidedEdgeIds) {
        setUserProvidedEdgeIds(userProvidedEdgeIds);
        return this;
    }

    /**
     * <p>
     * This parameter is required only when loading openCypher data that contains relationship IDs. It must be included
     * and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the load data
     * (recommended).
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column must be
     * present in every relationship file in the load.
     * </p>
     * <p>
     * When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the load
     * <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically generates an ID for
     * each relationship.
     * </p>
     * <p>
     * It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in the CSV
     * data have been fixed, without having to reload any relationships that have already been loaded. If relationship
     * IDs have not been explicitly assigned, the loader cannot resume a failed load if any relationship file has had to
     * be corrected, and must instead reload all the relationships.
     * </p>
     * 
     * @return This parameter is required only when loading openCypher data that contains relationship IDs. It must be
     *         included and set to <code>True</code> when openCypher relationship IDs are explicitly provided in the
     *         load data (recommended).</p>
     *         <p>
     *         When <code>userProvidedEdgeIds</code> is absent or set to <code>True</code>, an <code>:ID</code> column
     *         must be present in every relationship file in the load.
     *         </p>
     *         <p>
     *         When <code>userProvidedEdgeIds</code> is present and set to <code>False</code>, relationship files in the
     *         load <b>must not</b> contain an <code>:ID</code> column. Instead, the Neptune loader automatically
     *         generates an ID for each relationship.
     *         </p>
     *         <p>
     *         It's useful to provide relationship IDs explicitly so that the loader can resume loading after error in
     *         the CSV data have been fixed, without having to reload any relationships that have already been loaded.
     *         If relationship IDs have not been explicitly assigned, the loader cannot resume a failed load if any
     *         relationship file has had to be corrected, and must instead reload all the relationships.
     */

    public Boolean isUserProvidedEdgeIds() {
        return this.userProvidedEdgeIds;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getS3BucketRegion() != null)
            sb.append("S3BucketRegion: ").append(getS3BucketRegion()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getFailOnError() != null)
            sb.append("FailOnError: ").append(getFailOnError()).append(",");
        if (getParallelism() != null)
            sb.append("Parallelism: ").append(getParallelism()).append(",");
        if (getParserConfiguration() != null)
            sb.append("ParserConfiguration: ").append(getParserConfiguration()).append(",");
        if (getUpdateSingleCardinalityProperties() != null)
            sb.append("UpdateSingleCardinalityProperties: ").append(getUpdateSingleCardinalityProperties()).append(",");
        if (getQueueRequest() != null)
            sb.append("QueueRequest: ").append(getQueueRequest()).append(",");
        if (getDependencies() != null)
            sb.append("Dependencies: ").append(getDependencies()).append(",");
        if (getUserProvidedEdgeIds() != null)
            sb.append("UserProvidedEdgeIds: ").append(getUserProvidedEdgeIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartLoaderJobRequest == false)
            return false;
        StartLoaderJobRequest other = (StartLoaderJobRequest) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getS3BucketRegion() == null ^ this.getS3BucketRegion() == null)
            return false;
        if (other.getS3BucketRegion() != null && other.getS3BucketRegion().equals(this.getS3BucketRegion()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getFailOnError() == null ^ this.getFailOnError() == null)
            return false;
        if (other.getFailOnError() != null && other.getFailOnError().equals(this.getFailOnError()) == false)
            return false;
        if (other.getParallelism() == null ^ this.getParallelism() == null)
            return false;
        if (other.getParallelism() != null && other.getParallelism().equals(this.getParallelism()) == false)
            return false;
        if (other.getParserConfiguration() == null ^ this.getParserConfiguration() == null)
            return false;
        if (other.getParserConfiguration() != null && other.getParserConfiguration().equals(this.getParserConfiguration()) == false)
            return false;
        if (other.getUpdateSingleCardinalityProperties() == null ^ this.getUpdateSingleCardinalityProperties() == null)
            return false;
        if (other.getUpdateSingleCardinalityProperties() != null
                && other.getUpdateSingleCardinalityProperties().equals(this.getUpdateSingleCardinalityProperties()) == false)
            return false;
        if (other.getQueueRequest() == null ^ this.getQueueRequest() == null)
            return false;
        if (other.getQueueRequest() != null && other.getQueueRequest().equals(this.getQueueRequest()) == false)
            return false;
        if (other.getDependencies() == null ^ this.getDependencies() == null)
            return false;
        if (other.getDependencies() != null && other.getDependencies().equals(this.getDependencies()) == false)
            return false;
        if (other.getUserProvidedEdgeIds() == null ^ this.getUserProvidedEdgeIds() == null)
            return false;
        if (other.getUserProvidedEdgeIds() != null && other.getUserProvidedEdgeIds().equals(this.getUserProvidedEdgeIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getS3BucketRegion() == null) ? 0 : getS3BucketRegion().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getFailOnError() == null) ? 0 : getFailOnError().hashCode());
        hashCode = prime * hashCode + ((getParallelism() == null) ? 0 : getParallelism().hashCode());
        hashCode = prime * hashCode + ((getParserConfiguration() == null) ? 0 : getParserConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdateSingleCardinalityProperties() == null) ? 0 : getUpdateSingleCardinalityProperties().hashCode());
        hashCode = prime * hashCode + ((getQueueRequest() == null) ? 0 : getQueueRequest().hashCode());
        hashCode = prime * hashCode + ((getDependencies() == null) ? 0 : getDependencies().hashCode());
        hashCode = prime * hashCode + ((getUserProvidedEdgeIds() == null) ? 0 : getUserProvidedEdgeIds().hashCode());
        return hashCode;
    }

    @Override
    public StartLoaderJobRequest clone() {
        return (StartLoaderJobRequest) super.clone();
    }

}

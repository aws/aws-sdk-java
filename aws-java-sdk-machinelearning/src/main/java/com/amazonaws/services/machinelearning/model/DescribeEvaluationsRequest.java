/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#describeEvaluations(DescribeEvaluationsRequest) DescribeEvaluations operation}.
 * <p>
 * Returns a list of <code>DescribeEvaluations</code> that match the
 * search criteria in the request.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#describeEvaluations(DescribeEvaluationsRequest)
 */
public class DescribeEvaluationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Use one of the following variable to filter a list of
     * <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     * Sets the search criteria to the <code>Evaluation</code> creation
     * date.</li> <li><code>Status</code> - Sets the search criteria to the
     * <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     * search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     * criteria to the user account that invoked an
     * <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     * search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li><code>DataSourceId</code> - Sets the search criteria to the
     * <code>DataSource</code> used in <code>Evaluation</code>.</li>
     * <li><code>DataUri</code> - Sets the search criteria to the data
     * file(s) used in <code>Evaluation</code>. The URL can identify either a
     * file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     * directory.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI
     */
    private String filterVariable;

    /**
     * The equal to operator. The <code>Evaluation</code> results will have
     * <code>FilterVariable</code> values that exactly match the value
     * specified with <code>EQ</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String eQ;

    /**
     * The greater than operator. The <code>Evaluation</code> results will
     * have <code>FilterVariable</code> values that are greater than the
     * value specified with <code>GT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String gT;

    /**
     * The less than operator. The <code>Evaluation</code> results will have
     * <code>FilterVariable</code> values that are less than the value
     * specified with <code>LT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String lT;

    /**
     * The greater than or equal to operator. The <code>Evaluation</code>
     * results will have <code>FilterVariable</code> values that are greater
     * than or equal to the value specified with <code>GE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String gE;

    /**
     * The less than or equal to operator. The <code>Evaluation</code>
     * results will have <code>FilterVariable</code> values that are less
     * than or equal to the value specified with <code>LE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String lE;

    /**
     * The not equal to operator. The <code>Evaluation</code> results will
     * have <code>FilterVariable</code> values not equal to the value
     * specified with <code>NE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String nE;

    /**
     * A string that is found at the beginning of a variable, such as
     * <code>Name</code> or <code>Id</code>. <p>For example, an
     * <code>Evaluation</code> could have the <code>Name</code>
     * <code>2014-09-09-HolidayGiftMailer</code>. To search for this
     * <code>Evaluation</code>, select <code>Name</code> for the
     * <code>FilterVariable</code> and any of the following strings for the
     * <code>Prefix</code>: <ul> <li><p>2014-09</li> <li><p>2014-09-09</li>
     * <li><p>2014-09-09-Holiday</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String prefix;

    /**
     * A two-value parameter that determines the sequence of the resulting
     * list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     * the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     * Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     * <p>Results are sorted by <code>FilterVariable</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, dsc
     */
    private String sortOrder;

    /**
     * The ID of the page in the paginated results.
     */
    private String nextToken;

    /**
     * The maximum number of <code>Evaluation</code> to include in the
     * result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer limit;

    /**
     * Use one of the following variable to filter a list of
     * <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     * Sets the search criteria to the <code>Evaluation</code> creation
     * date.</li> <li><code>Status</code> - Sets the search criteria to the
     * <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     * search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     * criteria to the user account that invoked an
     * <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     * search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li><code>DataSourceId</code> - Sets the search criteria to the
     * <code>DataSource</code> used in <code>Evaluation</code>.</li>
     * <li><code>DataUri</code> - Sets the search criteria to the data
     * file(s) used in <code>Evaluation</code>. The URL can identify either a
     * file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     * directory.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI
     *
     * @return Use one of the following variable to filter a list of
     *         <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     *         Sets the search criteria to the <code>Evaluation</code> creation
     *         date.</li> <li><code>Status</code> - Sets the search criteria to the
     *         <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     *         search criteria to the contents of <code>Evaluation</code> <b> </b>
     *         <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     *         criteria to the user account that invoked an
     *         <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     *         search criteria to the <code>MLModel</code> that was evaluated.</li>
     *         <li><code>DataSourceId</code> - Sets the search criteria to the
     *         <code>DataSource</code> used in <code>Evaluation</code>.</li>
     *         <li><code>DataUri</code> - Sets the search criteria to the data
     *         file(s) used in <code>Evaluation</code>. The URL can identify either a
     *         file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     *         directory.</li> </ul>
     *
     * @see EvaluationFilterVariable
     */
    public String getFilterVariable() {
        return filterVariable;
    }
    
    /**
     * Use one of the following variable to filter a list of
     * <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     * Sets the search criteria to the <code>Evaluation</code> creation
     * date.</li> <li><code>Status</code> - Sets the search criteria to the
     * <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     * search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     * criteria to the user account that invoked an
     * <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     * search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li><code>DataSourceId</code> - Sets the search criteria to the
     * <code>DataSource</code> used in <code>Evaluation</code>.</li>
     * <li><code>DataUri</code> - Sets the search criteria to the data
     * file(s) used in <code>Evaluation</code>. The URL can identify either a
     * file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     * directory.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI
     *
     * @param filterVariable Use one of the following variable to filter a list of
     *         <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     *         Sets the search criteria to the <code>Evaluation</code> creation
     *         date.</li> <li><code>Status</code> - Sets the search criteria to the
     *         <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     *         search criteria to the contents of <code>Evaluation</code> <b> </b>
     *         <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     *         criteria to the user account that invoked an
     *         <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     *         search criteria to the <code>MLModel</code> that was evaluated.</li>
     *         <li><code>DataSourceId</code> - Sets the search criteria to the
     *         <code>DataSource</code> used in <code>Evaluation</code>.</li>
     *         <li><code>DataUri</code> - Sets the search criteria to the data
     *         file(s) used in <code>Evaluation</code>. The URL can identify either a
     *         file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     *         directory.</li> </ul>
     *
     * @see EvaluationFilterVariable
     */
    public void setFilterVariable(String filterVariable) {
        this.filterVariable = filterVariable;
    }
    
    /**
     * Use one of the following variable to filter a list of
     * <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     * Sets the search criteria to the <code>Evaluation</code> creation
     * date.</li> <li><code>Status</code> - Sets the search criteria to the
     * <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     * search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     * criteria to the user account that invoked an
     * <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     * search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li><code>DataSourceId</code> - Sets the search criteria to the
     * <code>DataSource</code> used in <code>Evaluation</code>.</li>
     * <li><code>DataUri</code> - Sets the search criteria to the data
     * file(s) used in <code>Evaluation</code>. The URL can identify either a
     * file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     * directory.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI
     *
     * @param filterVariable Use one of the following variable to filter a list of
     *         <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     *         Sets the search criteria to the <code>Evaluation</code> creation
     *         date.</li> <li><code>Status</code> - Sets the search criteria to the
     *         <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     *         search criteria to the contents of <code>Evaluation</code> <b> </b>
     *         <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     *         criteria to the user account that invoked an
     *         <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     *         search criteria to the <code>MLModel</code> that was evaluated.</li>
     *         <li><code>DataSourceId</code> - Sets the search criteria to the
     *         <code>DataSource</code> used in <code>Evaluation</code>.</li>
     *         <li><code>DataUri</code> - Sets the search criteria to the data
     *         file(s) used in <code>Evaluation</code>. The URL can identify either a
     *         file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     *         directory.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EvaluationFilterVariable
     */
    public DescribeEvaluationsRequest withFilterVariable(String filterVariable) {
        this.filterVariable = filterVariable;
        return this;
    }

    /**
     * Use one of the following variable to filter a list of
     * <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     * Sets the search criteria to the <code>Evaluation</code> creation
     * date.</li> <li><code>Status</code> - Sets the search criteria to the
     * <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     * search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     * criteria to the user account that invoked an
     * <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     * search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li><code>DataSourceId</code> - Sets the search criteria to the
     * <code>DataSource</code> used in <code>Evaluation</code>.</li>
     * <li><code>DataUri</code> - Sets the search criteria to the data
     * file(s) used in <code>Evaluation</code>. The URL can identify either a
     * file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     * directory.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI
     *
     * @param filterVariable Use one of the following variable to filter a list of
     *         <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     *         Sets the search criteria to the <code>Evaluation</code> creation
     *         date.</li> <li><code>Status</code> - Sets the search criteria to the
     *         <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     *         search criteria to the contents of <code>Evaluation</code> <b> </b>
     *         <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     *         criteria to the user account that invoked an
     *         <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     *         search criteria to the <code>MLModel</code> that was evaluated.</li>
     *         <li><code>DataSourceId</code> - Sets the search criteria to the
     *         <code>DataSource</code> used in <code>Evaluation</code>.</li>
     *         <li><code>DataUri</code> - Sets the search criteria to the data
     *         file(s) used in <code>Evaluation</code>. The URL can identify either a
     *         file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     *         directory.</li> </ul>
     *
     * @see EvaluationFilterVariable
     */
    public void setFilterVariable(EvaluationFilterVariable filterVariable) {
        this.filterVariable = filterVariable.toString();
    }
    
    /**
     * Use one of the following variable to filter a list of
     * <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     * Sets the search criteria to the <code>Evaluation</code> creation
     * date.</li> <li><code>Status</code> - Sets the search criteria to the
     * <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     * search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     * criteria to the user account that invoked an
     * <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     * search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li><code>DataSourceId</code> - Sets the search criteria to the
     * <code>DataSource</code> used in <code>Evaluation</code>.</li>
     * <li><code>DataUri</code> - Sets the search criteria to the data
     * file(s) used in <code>Evaluation</code>. The URL can identify either a
     * file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     * directory.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI
     *
     * @param filterVariable Use one of the following variable to filter a list of
     *         <code>Evaluation</code> objects: <ul> <li><code>CreatedAt</code> -
     *         Sets the search criteria to the <code>Evaluation</code> creation
     *         date.</li> <li><code>Status</code> - Sets the search criteria to the
     *         <code>Evaluation</code> status.</li> <li><code>Name</code> - Sets the
     *         search criteria to the contents of <code>Evaluation</code> <b> </b>
     *         <code>Name</code>.</li> <li><code>IAMUser</code> - Sets the search
     *         criteria to the user account that invoked an
     *         <code>Evaluation</code>.</li> <li><code>MLModelId</code> - Sets the
     *         search criteria to the <code>MLModel</code> that was evaluated.</li>
     *         <li><code>DataSourceId</code> - Sets the search criteria to the
     *         <code>DataSource</code> used in <code>Evaluation</code>.</li>
     *         <li><code>DataUri</code> - Sets the search criteria to the data
     *         file(s) used in <code>Evaluation</code>. The URL can identify either a
     *         file or an Amazon Simple Storage Solution (Amazon S3) bucket or
     *         directory.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EvaluationFilterVariable
     */
    public DescribeEvaluationsRequest withFilterVariable(EvaluationFilterVariable filterVariable) {
        this.filterVariable = filterVariable.toString();
        return this;
    }

    /**
     * The equal to operator. The <code>Evaluation</code> results will have
     * <code>FilterVariable</code> values that exactly match the value
     * specified with <code>EQ</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return The equal to operator. The <code>Evaluation</code> results will have
     *         <code>FilterVariable</code> values that exactly match the value
     *         specified with <code>EQ</code>.
     */
    public String getEQ() {
        return eQ;
    }
    
    /**
     * The equal to operator. The <code>Evaluation</code> results will have
     * <code>FilterVariable</code> values that exactly match the value
     * specified with <code>EQ</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param eQ The equal to operator. The <code>Evaluation</code> results will have
     *         <code>FilterVariable</code> values that exactly match the value
     *         specified with <code>EQ</code>.
     */
    public void setEQ(String eQ) {
        this.eQ = eQ;
    }
    
    /**
     * The equal to operator. The <code>Evaluation</code> results will have
     * <code>FilterVariable</code> values that exactly match the value
     * specified with <code>EQ</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param eQ The equal to operator. The <code>Evaluation</code> results will have
     *         <code>FilterVariable</code> values that exactly match the value
     *         specified with <code>EQ</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withEQ(String eQ) {
        this.eQ = eQ;
        return this;
    }

    /**
     * The greater than operator. The <code>Evaluation</code> results will
     * have <code>FilterVariable</code> values that are greater than the
     * value specified with <code>GT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return The greater than operator. The <code>Evaluation</code> results will
     *         have <code>FilterVariable</code> values that are greater than the
     *         value specified with <code>GT</code>.
     */
    public String getGT() {
        return gT;
    }
    
    /**
     * The greater than operator. The <code>Evaluation</code> results will
     * have <code>FilterVariable</code> values that are greater than the
     * value specified with <code>GT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param gT The greater than operator. The <code>Evaluation</code> results will
     *         have <code>FilterVariable</code> values that are greater than the
     *         value specified with <code>GT</code>.
     */
    public void setGT(String gT) {
        this.gT = gT;
    }
    
    /**
     * The greater than operator. The <code>Evaluation</code> results will
     * have <code>FilterVariable</code> values that are greater than the
     * value specified with <code>GT</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param gT The greater than operator. The <code>Evaluation</code> results will
     *         have <code>FilterVariable</code> values that are greater than the
     *         value specified with <code>GT</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withGT(String gT) {
        this.gT = gT;
        return this;
    }

    /**
     * The less than operator. The <code>Evaluation</code> results will have
     * <code>FilterVariable</code> values that are less than the value
     * specified with <code>LT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return The less than operator. The <code>Evaluation</code> results will have
     *         <code>FilterVariable</code> values that are less than the value
     *         specified with <code>LT</code>.
     */
    public String getLT() {
        return lT;
    }
    
    /**
     * The less than operator. The <code>Evaluation</code> results will have
     * <code>FilterVariable</code> values that are less than the value
     * specified with <code>LT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param lT The less than operator. The <code>Evaluation</code> results will have
     *         <code>FilterVariable</code> values that are less than the value
     *         specified with <code>LT</code>.
     */
    public void setLT(String lT) {
        this.lT = lT;
    }
    
    /**
     * The less than operator. The <code>Evaluation</code> results will have
     * <code>FilterVariable</code> values that are less than the value
     * specified with <code>LT</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param lT The less than operator. The <code>Evaluation</code> results will have
     *         <code>FilterVariable</code> values that are less than the value
     *         specified with <code>LT</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withLT(String lT) {
        this.lT = lT;
        return this;
    }

    /**
     * The greater than or equal to operator. The <code>Evaluation</code>
     * results will have <code>FilterVariable</code> values that are greater
     * than or equal to the value specified with <code>GE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return The greater than or equal to operator. The <code>Evaluation</code>
     *         results will have <code>FilterVariable</code> values that are greater
     *         than or equal to the value specified with <code>GE</code>.
     */
    public String getGE() {
        return gE;
    }
    
    /**
     * The greater than or equal to operator. The <code>Evaluation</code>
     * results will have <code>FilterVariable</code> values that are greater
     * than or equal to the value specified with <code>GE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param gE The greater than or equal to operator. The <code>Evaluation</code>
     *         results will have <code>FilterVariable</code> values that are greater
     *         than or equal to the value specified with <code>GE</code>.
     */
    public void setGE(String gE) {
        this.gE = gE;
    }
    
    /**
     * The greater than or equal to operator. The <code>Evaluation</code>
     * results will have <code>FilterVariable</code> values that are greater
     * than or equal to the value specified with <code>GE</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param gE The greater than or equal to operator. The <code>Evaluation</code>
     *         results will have <code>FilterVariable</code> values that are greater
     *         than or equal to the value specified with <code>GE</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withGE(String gE) {
        this.gE = gE;
        return this;
    }

    /**
     * The less than or equal to operator. The <code>Evaluation</code>
     * results will have <code>FilterVariable</code> values that are less
     * than or equal to the value specified with <code>LE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return The less than or equal to operator. The <code>Evaluation</code>
     *         results will have <code>FilterVariable</code> values that are less
     *         than or equal to the value specified with <code>LE</code>.
     */
    public String getLE() {
        return lE;
    }
    
    /**
     * The less than or equal to operator. The <code>Evaluation</code>
     * results will have <code>FilterVariable</code> values that are less
     * than or equal to the value specified with <code>LE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param lE The less than or equal to operator. The <code>Evaluation</code>
     *         results will have <code>FilterVariable</code> values that are less
     *         than or equal to the value specified with <code>LE</code>.
     */
    public void setLE(String lE) {
        this.lE = lE;
    }
    
    /**
     * The less than or equal to operator. The <code>Evaluation</code>
     * results will have <code>FilterVariable</code> values that are less
     * than or equal to the value specified with <code>LE</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param lE The less than or equal to operator. The <code>Evaluation</code>
     *         results will have <code>FilterVariable</code> values that are less
     *         than or equal to the value specified with <code>LE</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withLE(String lE) {
        this.lE = lE;
        return this;
    }

    /**
     * The not equal to operator. The <code>Evaluation</code> results will
     * have <code>FilterVariable</code> values not equal to the value
     * specified with <code>NE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return The not equal to operator. The <code>Evaluation</code> results will
     *         have <code>FilterVariable</code> values not equal to the value
     *         specified with <code>NE</code>.
     */
    public String getNE() {
        return nE;
    }
    
    /**
     * The not equal to operator. The <code>Evaluation</code> results will
     * have <code>FilterVariable</code> values not equal to the value
     * specified with <code>NE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param nE The not equal to operator. The <code>Evaluation</code> results will
     *         have <code>FilterVariable</code> values not equal to the value
     *         specified with <code>NE</code>.
     */
    public void setNE(String nE) {
        this.nE = nE;
    }
    
    /**
     * The not equal to operator. The <code>Evaluation</code> results will
     * have <code>FilterVariable</code> values not equal to the value
     * specified with <code>NE</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param nE The not equal to operator. The <code>Evaluation</code> results will
     *         have <code>FilterVariable</code> values not equal to the value
     *         specified with <code>NE</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withNE(String nE) {
        this.nE = nE;
        return this;
    }

    /**
     * A string that is found at the beginning of a variable, such as
     * <code>Name</code> or <code>Id</code>. <p>For example, an
     * <code>Evaluation</code> could have the <code>Name</code>
     * <code>2014-09-09-HolidayGiftMailer</code>. To search for this
     * <code>Evaluation</code>, select <code>Name</code> for the
     * <code>FilterVariable</code> and any of the following strings for the
     * <code>Prefix</code>: <ul> <li><p>2014-09</li> <li><p>2014-09-09</li>
     * <li><p>2014-09-09-Holiday</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A string that is found at the beginning of a variable, such as
     *         <code>Name</code> or <code>Id</code>. <p>For example, an
     *         <code>Evaluation</code> could have the <code>Name</code>
     *         <code>2014-09-09-HolidayGiftMailer</code>. To search for this
     *         <code>Evaluation</code>, select <code>Name</code> for the
     *         <code>FilterVariable</code> and any of the following strings for the
     *         <code>Prefix</code>: <ul> <li><p>2014-09</li> <li><p>2014-09-09</li>
     *         <li><p>2014-09-09-Holiday</li> </ul>
     */
    public String getPrefix() {
        return prefix;
    }
    
    /**
     * A string that is found at the beginning of a variable, such as
     * <code>Name</code> or <code>Id</code>. <p>For example, an
     * <code>Evaluation</code> could have the <code>Name</code>
     * <code>2014-09-09-HolidayGiftMailer</code>. To search for this
     * <code>Evaluation</code>, select <code>Name</code> for the
     * <code>FilterVariable</code> and any of the following strings for the
     * <code>Prefix</code>: <ul> <li><p>2014-09</li> <li><p>2014-09-09</li>
     * <li><p>2014-09-09-Holiday</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param prefix A string that is found at the beginning of a variable, such as
     *         <code>Name</code> or <code>Id</code>. <p>For example, an
     *         <code>Evaluation</code> could have the <code>Name</code>
     *         <code>2014-09-09-HolidayGiftMailer</code>. To search for this
     *         <code>Evaluation</code>, select <code>Name</code> for the
     *         <code>FilterVariable</code> and any of the following strings for the
     *         <code>Prefix</code>: <ul> <li><p>2014-09</li> <li><p>2014-09-09</li>
     *         <li><p>2014-09-09-Holiday</li> </ul>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    /**
     * A string that is found at the beginning of a variable, such as
     * <code>Name</code> or <code>Id</code>. <p>For example, an
     * <code>Evaluation</code> could have the <code>Name</code>
     * <code>2014-09-09-HolidayGiftMailer</code>. To search for this
     * <code>Evaluation</code>, select <code>Name</code> for the
     * <code>FilterVariable</code> and any of the following strings for the
     * <code>Prefix</code>: <ul> <li><p>2014-09</li> <li><p>2014-09-09</li>
     * <li><p>2014-09-09-Holiday</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param prefix A string that is found at the beginning of a variable, such as
     *         <code>Name</code> or <code>Id</code>. <p>For example, an
     *         <code>Evaluation</code> could have the <code>Name</code>
     *         <code>2014-09-09-HolidayGiftMailer</code>. To search for this
     *         <code>Evaluation</code>, select <code>Name</code> for the
     *         <code>FilterVariable</code> and any of the following strings for the
     *         <code>Prefix</code>: <ul> <li><p>2014-09</li> <li><p>2014-09-09</li>
     *         <li><p>2014-09-09-Holiday</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * A two-value parameter that determines the sequence of the resulting
     * list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     * the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     * Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     * <p>Results are sorted by <code>FilterVariable</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, dsc
     *
     * @return A two-value parameter that determines the sequence of the resulting
     *         list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     *         the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     *         Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     *         <p>Results are sorted by <code>FilterVariable</code>.
     *
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }
    
    /**
     * A two-value parameter that determines the sequence of the resulting
     * list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     * the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     * Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     * <p>Results are sorted by <code>FilterVariable</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, dsc
     *
     * @param sortOrder A two-value parameter that determines the sequence of the resulting
     *         list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     *         the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     *         Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     *         <p>Results are sorted by <code>FilterVariable</code>.
     *
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
    
    /**
     * A two-value parameter that determines the sequence of the resulting
     * list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     * the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     * Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     * <p>Results are sorted by <code>FilterVariable</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, dsc
     *
     * @param sortOrder A two-value parameter that determines the sequence of the resulting
     *         list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     *         the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     *         Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     *         <p>Results are sorted by <code>FilterVariable</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SortOrder
     */
    public DescribeEvaluationsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * A two-value parameter that determines the sequence of the resulting
     * list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     * the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     * Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     * <p>Results are sorted by <code>FilterVariable</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, dsc
     *
     * @param sortOrder A two-value parameter that determines the sequence of the resulting
     *         list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     *         the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     *         Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     *         <p>Results are sorted by <code>FilterVariable</code>.
     *
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }
    
    /**
     * A two-value parameter that determines the sequence of the resulting
     * list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     * the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     * Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     * <p>Results are sorted by <code>FilterVariable</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, dsc
     *
     * @param sortOrder A two-value parameter that determines the sequence of the resulting
     *         list of <code>Evaluation</code>. <ul> <li><code>asc</code> - Arranges
     *         the list in ascending order (A-Z, 0-9).</li> <li><code>dsc</code> -
     *         Arranges the list in descending order (Z-A, 9-0).</li> </ul>
     *         <p>Results are sorted by <code>FilterVariable</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SortOrder
     */
    public DescribeEvaluationsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * The ID of the page in the paginated results.
     *
     * @return The ID of the page in the paginated results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The ID of the page in the paginated results.
     *
     * @param nextToken The ID of the page in the paginated results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The ID of the page in the paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The ID of the page in the paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of <code>Evaluation</code> to include in the
     * result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return The maximum number of <code>Evaluation</code> to include in the
     *         result.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of <code>Evaluation</code> to include in the
     * result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit The maximum number of <code>Evaluation</code> to include in the
     *         result.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of <code>Evaluation</code> to include in the
     * result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit The maximum number of <code>Evaluation</code> to include in the
     *         result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEvaluationsRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getFilterVariable() != null) sb.append("FilterVariable: " + getFilterVariable() + ",");
        if (getEQ() != null) sb.append("EQ: " + getEQ() + ",");
        if (getGT() != null) sb.append("GT: " + getGT() + ",");
        if (getLT() != null) sb.append("LT: " + getLT() + ",");
        if (getGE() != null) sb.append("GE: " + getGE() + ",");
        if (getLE() != null) sb.append("LE: " + getLE() + ",");
        if (getNE() != null) sb.append("NE: " + getNE() + ",");
        if (getPrefix() != null) sb.append("Prefix: " + getPrefix() + ",");
        if (getSortOrder() != null) sb.append("SortOrder: " + getSortOrder() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilterVariable() == null) ? 0 : getFilterVariable().hashCode()); 
        hashCode = prime * hashCode + ((getEQ() == null) ? 0 : getEQ().hashCode()); 
        hashCode = prime * hashCode + ((getGT() == null) ? 0 : getGT().hashCode()); 
        hashCode = prime * hashCode + ((getLT() == null) ? 0 : getLT().hashCode()); 
        hashCode = prime * hashCode + ((getGE() == null) ? 0 : getGE().hashCode()); 
        hashCode = prime * hashCode + ((getLE() == null) ? 0 : getLE().hashCode()); 
        hashCode = prime * hashCode + ((getNE() == null) ? 0 : getNE().hashCode()); 
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEvaluationsRequest == false) return false;
        DescribeEvaluationsRequest other = (DescribeEvaluationsRequest)obj;
        
        if (other.getFilterVariable() == null ^ this.getFilterVariable() == null) return false;
        if (other.getFilterVariable() != null && other.getFilterVariable().equals(this.getFilterVariable()) == false) return false; 
        if (other.getEQ() == null ^ this.getEQ() == null) return false;
        if (other.getEQ() != null && other.getEQ().equals(this.getEQ()) == false) return false; 
        if (other.getGT() == null ^ this.getGT() == null) return false;
        if (other.getGT() != null && other.getGT().equals(this.getGT()) == false) return false; 
        if (other.getLT() == null ^ this.getLT() == null) return false;
        if (other.getLT() != null && other.getLT().equals(this.getLT()) == false) return false; 
        if (other.getGE() == null ^ this.getGE() == null) return false;
        if (other.getGE() != null && other.getGE().equals(this.getGE()) == false) return false; 
        if (other.getLE() == null ^ this.getLE() == null) return false;
        if (other.getLE() != null && other.getLE().equals(this.getLE()) == false) return false; 
        if (other.getNE() == null ^ this.getNE() == null) return false;
        if (other.getNE() != null && other.getNE().equals(this.getNE()) == false) return false; 
        if (other.getPrefix() == null ^ this.getPrefix() == null) return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false) return false; 
        if (other.getSortOrder() == null ^ this.getSortOrder() == null) return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeEvaluationsRequest clone() {
        
            return (DescribeEvaluationsRequest) super.clone();
    }

}
    
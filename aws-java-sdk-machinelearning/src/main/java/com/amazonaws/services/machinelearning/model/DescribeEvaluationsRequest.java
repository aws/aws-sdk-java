/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEvaluationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use one of the following variable to filter a list of <code>Evaluation</code> objects:
     * </p>
     * <ul>
     * <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     * <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     * <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li>
     * <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an <code>Evaluation</code>.</li>
     * <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     * <code>Evaluation</code>.</li>
     * <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>. The URL
     * can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * </ul>
     */
    private String filterVariable;
    /**
     * <p>
     * The equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that
     * exactly match the value specified with <code>EQ</code>.
     * </p>
     */
    private String eQ;
    /**
     * <p>
     * The greater than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that
     * are greater than the value specified with <code>GT</code>.
     * </p>
     */
    private String gT;
    /**
     * <p>
     * The less than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that are
     * less than the value specified with <code>LT</code>.
     * </p>
     */
    private String lT;
    /**
     * <p>
     * The greater than or equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     * values that are greater than or equal to the value specified with <code>GE</code>.
     * </p>
     */
    private String gE;
    /**
     * <p>
     * The less than or equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     * values that are less than or equal to the value specified with <code>LE</code>.
     * </p>
     */
    private String lE;
    /**
     * <p>
     * The not equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values not
     * equal to the value specified with <code>NE</code>.
     * </p>
     */
    private String nE;
    /**
     * <p>
     * A string that is found at the beginning of a variable, such as <code>Name</code> or <code>Id</code>.
     * </p>
     * <p>
     * For example, an <code>Evaluation</code> could have the <code>Name</code>
     * <code>2014-09-09-HolidayGiftMailer</code>. To search for this <code>Evaluation</code>, select <code>Name</code>
     * for the <code>FilterVariable</code> and any of the following strings for the <code>Prefix</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2014-09
     * </p>
     * </li>
     * <li>
     * <p>
     * 2014-09-09
     * </p>
     * </li>
     * <li>
     * <p>
     * 2014-09-09-Holiday
     * </p>
     * </li>
     * </ul>
     */
    private String prefix;
    /**
     * <p>
     * A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.
     * </p>
     * <ul>
     * <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     * <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     * </ul>
     * <p>
     * Results are sorted by <code>FilterVariable</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The ID of the page in the paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of <code>Evaluation</code> to include in the result.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * Use one of the following variable to filter a list of <code>Evaluation</code> objects:
     * </p>
     * <ul>
     * <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     * <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     * <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li>
     * <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an <code>Evaluation</code>.</li>
     * <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     * <code>Evaluation</code>.</li>
     * <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>. The URL
     * can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * </ul>
     * 
     * @param filterVariable
     *        Use one of the following variable to filter a list of <code>Evaluation</code> objects:</p>
     *        <ul>
     *        <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     *        <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     *        <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     *        <code>Name</code>.</li>
     *        <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an
     *        <code>Evaluation</code>.</li>
     *        <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     *        <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     *        <code>Evaluation</code>.</li>
     *        <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>.
     *        The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * @see EvaluationFilterVariable
     */

    public void setFilterVariable(String filterVariable) {
        this.filterVariable = filterVariable;
    }

    /**
     * <p>
     * Use one of the following variable to filter a list of <code>Evaluation</code> objects:
     * </p>
     * <ul>
     * <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     * <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     * <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li>
     * <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an <code>Evaluation</code>.</li>
     * <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     * <code>Evaluation</code>.</li>
     * <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>. The URL
     * can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * </ul>
     * 
     * @return Use one of the following variable to filter a list of <code>Evaluation</code> objects:</p>
     *         <ul>
     *         <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     *         <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     *         <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     *         <code>Name</code>.</li>
     *         <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an
     *         <code>Evaluation</code>.</li>
     *         <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     *         <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     *         <code>Evaluation</code>.</li>
     *         <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>.
     *         The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * @see EvaluationFilterVariable
     */

    public String getFilterVariable() {
        return this.filterVariable;
    }

    /**
     * <p>
     * Use one of the following variable to filter a list of <code>Evaluation</code> objects:
     * </p>
     * <ul>
     * <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     * <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     * <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li>
     * <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an <code>Evaluation</code>.</li>
     * <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     * <code>Evaluation</code>.</li>
     * <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>. The URL
     * can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * </ul>
     * 
     * @param filterVariable
     *        Use one of the following variable to filter a list of <code>Evaluation</code> objects:</p>
     *        <ul>
     *        <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     *        <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     *        <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     *        <code>Name</code>.</li>
     *        <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an
     *        <code>Evaluation</code>.</li>
     *        <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     *        <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     *        <code>Evaluation</code>.</li>
     *        <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>.
     *        The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFilterVariable
     */

    public DescribeEvaluationsRequest withFilterVariable(String filterVariable) {
        setFilterVariable(filterVariable);
        return this;
    }

    /**
     * <p>
     * Use one of the following variable to filter a list of <code>Evaluation</code> objects:
     * </p>
     * <ul>
     * <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     * <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     * <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li>
     * <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an <code>Evaluation</code>.</li>
     * <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     * <code>Evaluation</code>.</li>
     * <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>. The URL
     * can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * </ul>
     * 
     * @param filterVariable
     *        Use one of the following variable to filter a list of <code>Evaluation</code> objects:</p>
     *        <ul>
     *        <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     *        <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     *        <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     *        <code>Name</code>.</li>
     *        <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an
     *        <code>Evaluation</code>.</li>
     *        <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     *        <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     *        <code>Evaluation</code>.</li>
     *        <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>.
     *        The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * @see EvaluationFilterVariable
     */

    public void setFilterVariable(EvaluationFilterVariable filterVariable) {
        withFilterVariable(filterVariable);
    }

    /**
     * <p>
     * Use one of the following variable to filter a list of <code>Evaluation</code> objects:
     * </p>
     * <ul>
     * <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     * <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     * <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     * <code>Name</code>.</li>
     * <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an <code>Evaluation</code>.</li>
     * <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     * <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     * <code>Evaluation</code>.</li>
     * <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>. The URL
     * can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * </ul>
     * 
     * @param filterVariable
     *        Use one of the following variable to filter a list of <code>Evaluation</code> objects:</p>
     *        <ul>
     *        <li> <code>CreatedAt</code> - Sets the search criteria to the <code>Evaluation</code> creation date.</li>
     *        <li> <code>Status</code> - Sets the search criteria to the <code>Evaluation</code> status.</li>
     *        <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b>
     *        <code>Name</code>.</li>
     *        <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an
     *        <code>Evaluation</code>.</li>
     *        <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> that was evaluated.</li>
     *        <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in
     *        <code>Evaluation</code>.</li>
     *        <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in <code>Evaluation</code>.
     *        The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFilterVariable
     */

    public DescribeEvaluationsRequest withFilterVariable(EvaluationFilterVariable filterVariable) {
        this.filterVariable = filterVariable.toString();
        return this;
    }

    /**
     * <p>
     * The equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that
     * exactly match the value specified with <code>EQ</code>.
     * </p>
     * 
     * @param eQ
     *        The equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values
     *        that exactly match the value specified with <code>EQ</code>.
     */

    public void setEQ(String eQ) {
        this.eQ = eQ;
    }

    /**
     * <p>
     * The equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that
     * exactly match the value specified with <code>EQ</code>.
     * </p>
     * 
     * @return The equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values
     *         that exactly match the value specified with <code>EQ</code>.
     */

    public String getEQ() {
        return this.eQ;
    }

    /**
     * <p>
     * The equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that
     * exactly match the value specified with <code>EQ</code>.
     * </p>
     * 
     * @param eQ
     *        The equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values
     *        that exactly match the value specified with <code>EQ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withEQ(String eQ) {
        setEQ(eQ);
        return this;
    }

    /**
     * <p>
     * The greater than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that
     * are greater than the value specified with <code>GT</code>.
     * </p>
     * 
     * @param gT
     *        The greater than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     *        values that are greater than the value specified with <code>GT</code>.
     */

    public void setGT(String gT) {
        this.gT = gT;
    }

    /**
     * <p>
     * The greater than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that
     * are greater than the value specified with <code>GT</code>.
     * </p>
     * 
     * @return The greater than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     *         values that are greater than the value specified with <code>GT</code>.
     */

    public String getGT() {
        return this.gT;
    }

    /**
     * <p>
     * The greater than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that
     * are greater than the value specified with <code>GT</code>.
     * </p>
     * 
     * @param gT
     *        The greater than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     *        values that are greater than the value specified with <code>GT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withGT(String gT) {
        setGT(gT);
        return this;
    }

    /**
     * <p>
     * The less than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that are
     * less than the value specified with <code>LT</code>.
     * </p>
     * 
     * @param lT
     *        The less than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values
     *        that are less than the value specified with <code>LT</code>.
     */

    public void setLT(String lT) {
        this.lT = lT;
    }

    /**
     * <p>
     * The less than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that are
     * less than the value specified with <code>LT</code>.
     * </p>
     * 
     * @return The less than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values
     *         that are less than the value specified with <code>LT</code>.
     */

    public String getLT() {
        return this.lT;
    }

    /**
     * <p>
     * The less than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values that are
     * less than the value specified with <code>LT</code>.
     * </p>
     * 
     * @param lT
     *        The less than operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values
     *        that are less than the value specified with <code>LT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withLT(String lT) {
        setLT(lT);
        return this;
    }

    /**
     * <p>
     * The greater than or equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     * values that are greater than or equal to the value specified with <code>GE</code>.
     * </p>
     * 
     * @param gE
     *        The greater than or equal to operator. The <code>Evaluation</code> results will have
     *        <code>FilterVariable</code> values that are greater than or equal to the value specified with
     *        <code>GE</code>.
     */

    public void setGE(String gE) {
        this.gE = gE;
    }

    /**
     * <p>
     * The greater than or equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     * values that are greater than or equal to the value specified with <code>GE</code>.
     * </p>
     * 
     * @return The greater than or equal to operator. The <code>Evaluation</code> results will have
     *         <code>FilterVariable</code> values that are greater than or equal to the value specified with
     *         <code>GE</code>.
     */

    public String getGE() {
        return this.gE;
    }

    /**
     * <p>
     * The greater than or equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     * values that are greater than or equal to the value specified with <code>GE</code>.
     * </p>
     * 
     * @param gE
     *        The greater than or equal to operator. The <code>Evaluation</code> results will have
     *        <code>FilterVariable</code> values that are greater than or equal to the value specified with
     *        <code>GE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withGE(String gE) {
        setGE(gE);
        return this;
    }

    /**
     * <p>
     * The less than or equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     * values that are less than or equal to the value specified with <code>LE</code>.
     * </p>
     * 
     * @param lE
     *        The less than or equal to operator. The <code>Evaluation</code> results will have
     *        <code>FilterVariable</code> values that are less than or equal to the value specified with <code>LE</code>
     *        .
     */

    public void setLE(String lE) {
        this.lE = lE;
    }

    /**
     * <p>
     * The less than or equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     * values that are less than or equal to the value specified with <code>LE</code>.
     * </p>
     * 
     * @return The less than or equal to operator. The <code>Evaluation</code> results will have
     *         <code>FilterVariable</code> values that are less than or equal to the value specified with
     *         <code>LE</code>.
     */

    public String getLE() {
        return this.lE;
    }

    /**
     * <p>
     * The less than or equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     * values that are less than or equal to the value specified with <code>LE</code>.
     * </p>
     * 
     * @param lE
     *        The less than or equal to operator. The <code>Evaluation</code> results will have
     *        <code>FilterVariable</code> values that are less than or equal to the value specified with <code>LE</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withLE(String lE) {
        setLE(lE);
        return this;
    }

    /**
     * <p>
     * The not equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values not
     * equal to the value specified with <code>NE</code>.
     * </p>
     * 
     * @param nE
     *        The not equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     *        values not equal to the value specified with <code>NE</code>.
     */

    public void setNE(String nE) {
        this.nE = nE;
    }

    /**
     * <p>
     * The not equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values not
     * equal to the value specified with <code>NE</code>.
     * </p>
     * 
     * @return The not equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     *         values not equal to the value specified with <code>NE</code>.
     */

    public String getNE() {
        return this.nE;
    }

    /**
     * <p>
     * The not equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code> values not
     * equal to the value specified with <code>NE</code>.
     * </p>
     * 
     * @param nE
     *        The not equal to operator. The <code>Evaluation</code> results will have <code>FilterVariable</code>
     *        values not equal to the value specified with <code>NE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withNE(String nE) {
        setNE(nE);
        return this;
    }

    /**
     * <p>
     * A string that is found at the beginning of a variable, such as <code>Name</code> or <code>Id</code>.
     * </p>
     * <p>
     * For example, an <code>Evaluation</code> could have the <code>Name</code>
     * <code>2014-09-09-HolidayGiftMailer</code>. To search for this <code>Evaluation</code>, select <code>Name</code>
     * for the <code>FilterVariable</code> and any of the following strings for the <code>Prefix</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2014-09
     * </p>
     * </li>
     * <li>
     * <p>
     * 2014-09-09
     * </p>
     * </li>
     * <li>
     * <p>
     * 2014-09-09-Holiday
     * </p>
     * </li>
     * </ul>
     * 
     * @param prefix
     *        A string that is found at the beginning of a variable, such as <code>Name</code> or <code>Id</code>.</p>
     *        <p>
     *        For example, an <code>Evaluation</code> could have the <code>Name</code>
     *        <code>2014-09-09-HolidayGiftMailer</code>. To search for this <code>Evaluation</code>, select
     *        <code>Name</code> for the <code>FilterVariable</code> and any of the following strings for the
     *        <code>Prefix</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        2014-09
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2014-09-09
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2014-09-09-Holiday
     *        </p>
     *        </li>
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * A string that is found at the beginning of a variable, such as <code>Name</code> or <code>Id</code>.
     * </p>
     * <p>
     * For example, an <code>Evaluation</code> could have the <code>Name</code>
     * <code>2014-09-09-HolidayGiftMailer</code>. To search for this <code>Evaluation</code>, select <code>Name</code>
     * for the <code>FilterVariable</code> and any of the following strings for the <code>Prefix</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2014-09
     * </p>
     * </li>
     * <li>
     * <p>
     * 2014-09-09
     * </p>
     * </li>
     * <li>
     * <p>
     * 2014-09-09-Holiday
     * </p>
     * </li>
     * </ul>
     * 
     * @return A string that is found at the beginning of a variable, such as <code>Name</code> or <code>Id</code>.</p>
     *         <p>
     *         For example, an <code>Evaluation</code> could have the <code>Name</code>
     *         <code>2014-09-09-HolidayGiftMailer</code>. To search for this <code>Evaluation</code>, select
     *         <code>Name</code> for the <code>FilterVariable</code> and any of the following strings for the
     *         <code>Prefix</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         2014-09
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2014-09-09
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2014-09-09-Holiday
     *         </p>
     *         </li>
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * A string that is found at the beginning of a variable, such as <code>Name</code> or <code>Id</code>.
     * </p>
     * <p>
     * For example, an <code>Evaluation</code> could have the <code>Name</code>
     * <code>2014-09-09-HolidayGiftMailer</code>. To search for this <code>Evaluation</code>, select <code>Name</code>
     * for the <code>FilterVariable</code> and any of the following strings for the <code>Prefix</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2014-09
     * </p>
     * </li>
     * <li>
     * <p>
     * 2014-09-09
     * </p>
     * </li>
     * <li>
     * <p>
     * 2014-09-09-Holiday
     * </p>
     * </li>
     * </ul>
     * 
     * @param prefix
     *        A string that is found at the beginning of a variable, such as <code>Name</code> or <code>Id</code>.</p>
     *        <p>
     *        For example, an <code>Evaluation</code> could have the <code>Name</code>
     *        <code>2014-09-09-HolidayGiftMailer</code>. To search for this <code>Evaluation</code>, select
     *        <code>Name</code> for the <code>FilterVariable</code> and any of the following strings for the
     *        <code>Prefix</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        2014-09
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2014-09-09
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2014-09-09-Holiday
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.
     * </p>
     * <ul>
     * <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     * <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     * </ul>
     * <p>
     * Results are sorted by <code>FilterVariable</code>.
     * </p>
     * 
     * @param sortOrder
     *        A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.</p>
     *        <ul>
     *        <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     *        <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     *        </ul>
     *        <p>
     *        Results are sorted by <code>FilterVariable</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.
     * </p>
     * <ul>
     * <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     * <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     * </ul>
     * <p>
     * Results are sorted by <code>FilterVariable</code>.
     * </p>
     * 
     * @return A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.</p>
     *         <ul>
     *         <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     *         <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     *         </ul>
     *         <p>
     *         Results are sorted by <code>FilterVariable</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.
     * </p>
     * <ul>
     * <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     * <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     * </ul>
     * <p>
     * Results are sorted by <code>FilterVariable</code>.
     * </p>
     * 
     * @param sortOrder
     *        A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.</p>
     *        <ul>
     *        <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     *        <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     *        </ul>
     *        <p>
     *        Results are sorted by <code>FilterVariable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public DescribeEvaluationsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.
     * </p>
     * <ul>
     * <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     * <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     * </ul>
     * <p>
     * Results are sorted by <code>FilterVariable</code>.
     * </p>
     * 
     * @param sortOrder
     *        A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.</p>
     *        <ul>
     *        <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     *        <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     *        </ul>
     *        <p>
     *        Results are sorted by <code>FilterVariable</code>.
     * @see SortOrder
     */

    public void setSortOrder(SortOrder sortOrder) {
        withSortOrder(sortOrder);
    }

    /**
     * <p>
     * A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.
     * </p>
     * <ul>
     * <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     * <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     * </ul>
     * <p>
     * Results are sorted by <code>FilterVariable</code>.
     * </p>
     * 
     * @param sortOrder
     *        A two-value parameter that determines the sequence of the resulting list of <code>Evaluation</code>.</p>
     *        <ul>
     *        <li> <code>asc</code> - Arranges the list in ascending order (A-Z, 0-9).</li>
     *        <li> <code>dsc</code> - Arranges the list in descending order (Z-A, 9-0).</li>
     *        </ul>
     *        <p>
     *        Results are sorted by <code>FilterVariable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public DescribeEvaluationsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the page in the paginated results.
     * </p>
     * 
     * @param nextToken
     *        The ID of the page in the paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The ID of the page in the paginated results.
     * </p>
     * 
     * @return The ID of the page in the paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The ID of the page in the paginated results.
     * </p>
     * 
     * @param nextToken
     *        The ID of the page in the paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of <code>Evaluation</code> to include in the result.
     * </p>
     * 
     * @param limit
     *        The maximum number of <code>Evaluation</code> to include in the result.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of <code>Evaluation</code> to include in the result.
     * </p>
     * 
     * @return The maximum number of <code>Evaluation</code> to include in the result.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of <code>Evaluation</code> to include in the result.
     * </p>
     * 
     * @param limit
     *        The maximum number of <code>Evaluation</code> to include in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEvaluationsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
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
        if (getFilterVariable() != null)
            sb.append("FilterVariable: ").append(getFilterVariable()).append(",");
        if (getEQ() != null)
            sb.append("EQ: ").append(getEQ()).append(",");
        if (getGT() != null)
            sb.append("GT: ").append(getGT()).append(",");
        if (getLT() != null)
            sb.append("LT: ").append(getLT()).append(",");
        if (getGE() != null)
            sb.append("GE: ").append(getGE()).append(",");
        if (getLE() != null)
            sb.append("LE: ").append(getLE()).append(",");
        if (getNE() != null)
            sb.append("NE: ").append(getNE()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEvaluationsRequest == false)
            return false;
        DescribeEvaluationsRequest other = (DescribeEvaluationsRequest) obj;
        if (other.getFilterVariable() == null ^ this.getFilterVariable() == null)
            return false;
        if (other.getFilterVariable() != null && other.getFilterVariable().equals(this.getFilterVariable()) == false)
            return false;
        if (other.getEQ() == null ^ this.getEQ() == null)
            return false;
        if (other.getEQ() != null && other.getEQ().equals(this.getEQ()) == false)
            return false;
        if (other.getGT() == null ^ this.getGT() == null)
            return false;
        if (other.getGT() != null && other.getGT().equals(this.getGT()) == false)
            return false;
        if (other.getLT() == null ^ this.getLT() == null)
            return false;
        if (other.getLT() != null && other.getLT().equals(this.getLT()) == false)
            return false;
        if (other.getGE() == null ^ this.getGE() == null)
            return false;
        if (other.getGE() != null && other.getGE().equals(this.getGE()) == false)
            return false;
        if (other.getLE() == null ^ this.getLE() == null)
            return false;
        if (other.getLE() != null && other.getLE().equals(this.getLE()) == false)
            return false;
        if (other.getNE() == null ^ this.getNE() == null)
            return false;
        if (other.getNE() != null && other.getNE().equals(this.getNE()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
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
    public DescribeEvaluationsRequest clone() {
        return (DescribeEvaluationsRequest) super.clone();
    }

}

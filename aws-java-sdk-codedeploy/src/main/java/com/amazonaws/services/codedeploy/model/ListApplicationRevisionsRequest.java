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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#listApplicationRevisions(ListApplicationRevisionsRequest) ListApplicationRevisions operation}.
 * <p>
 * Lists information about revisions for an application.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#listApplicationRevisions(ListApplicationRevisionsRequest)
 */
public class ListApplicationRevisionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The column name to sort the list results by: <ul> <li>registerTime:
     * Sort the list results by when the revisions were registered with AWS
     * CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     * revisions were first used by in a deployment.</li> <li>lastUsedTime:
     * Sort the list results by when the revisions were last used in a
     * deployment.</li> </ul> <p>If not specified or set to null, the results
     * will be returned in an arbitrary order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     */
    private String sortBy;

    /**
     * The order to sort the list results by: <ul> <li>ascending: Sort the
     * list results in ascending order.</li> <li>descending: Sort the list
     * results in descending order.</li> </ul> <p>If not specified, the
     * results will be sorted in ascending order. <p>If set to null, the
     * results will be sorted in an arbitrary order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     */
    private String sortOrder;

    /**
     * A specific Amazon S3 bucket name to limit the search for revisions.
     * <p>If set to null, then all of the user's buckets will be searched.
     */
    private String s3Bucket;

    /**
     * A specific key prefix for the set of Amazon S3 objects to limit the
     * search for revisions.
     */
    private String s3KeyPrefix;

    /**
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group: <ul> <li>include: List revisions that
     * are target revisions of a deployment group.</li> <li>exclude: Do not
     * list revisions that are target revisions of a deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     */
    private String deployed;

    /**
     * An identifier that was returned from the previous list application
     * revisions call, which can be used to return the next set of
     * applications in the list.
     */
    private String nextToken;

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationRevisionsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The column name to sort the list results by: <ul> <li>registerTime:
     * Sort the list results by when the revisions were registered with AWS
     * CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     * revisions were first used by in a deployment.</li> <li>lastUsedTime:
     * Sort the list results by when the revisions were last used in a
     * deployment.</li> </ul> <p>If not specified or set to null, the results
     * will be returned in an arbitrary order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @return The column name to sort the list results by: <ul> <li>registerTime:
     *         Sort the list results by when the revisions were registered with AWS
     *         CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     *         revisions were first used by in a deployment.</li> <li>lastUsedTime:
     *         Sort the list results by when the revisions were last used in a
     *         deployment.</li> </ul> <p>If not specified or set to null, the results
     *         will be returned in an arbitrary order.
     *
     * @see ApplicationRevisionSortBy
     */
    public String getSortBy() {
        return sortBy;
    }
    
    /**
     * The column name to sort the list results by: <ul> <li>registerTime:
     * Sort the list results by when the revisions were registered with AWS
     * CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     * revisions were first used by in a deployment.</li> <li>lastUsedTime:
     * Sort the list results by when the revisions were last used in a
     * deployment.</li> </ul> <p>If not specified or set to null, the results
     * will be returned in an arbitrary order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @param sortBy The column name to sort the list results by: <ul> <li>registerTime:
     *         Sort the list results by when the revisions were registered with AWS
     *         CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     *         revisions were first used by in a deployment.</li> <li>lastUsedTime:
     *         Sort the list results by when the revisions were last used in a
     *         deployment.</li> </ul> <p>If not specified or set to null, the results
     *         will be returned in an arbitrary order.
     *
     * @see ApplicationRevisionSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
    
    /**
     * The column name to sort the list results by: <ul> <li>registerTime:
     * Sort the list results by when the revisions were registered with AWS
     * CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     * revisions were first used by in a deployment.</li> <li>lastUsedTime:
     * Sort the list results by when the revisions were last used in a
     * deployment.</li> </ul> <p>If not specified or set to null, the results
     * will be returned in an arbitrary order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @param sortBy The column name to sort the list results by: <ul> <li>registerTime:
     *         Sort the list results by when the revisions were registered with AWS
     *         CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     *         revisions were first used by in a deployment.</li> <li>lastUsedTime:
     *         Sort the list results by when the revisions were last used in a
     *         deployment.</li> </ul> <p>If not specified or set to null, the results
     *         will be returned in an arbitrary order.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ApplicationRevisionSortBy
     */
    public ListApplicationRevisionsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * The column name to sort the list results by: <ul> <li>registerTime:
     * Sort the list results by when the revisions were registered with AWS
     * CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     * revisions were first used by in a deployment.</li> <li>lastUsedTime:
     * Sort the list results by when the revisions were last used in a
     * deployment.</li> </ul> <p>If not specified or set to null, the results
     * will be returned in an arbitrary order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @param sortBy The column name to sort the list results by: <ul> <li>registerTime:
     *         Sort the list results by when the revisions were registered with AWS
     *         CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     *         revisions were first used by in a deployment.</li> <li>lastUsedTime:
     *         Sort the list results by when the revisions were last used in a
     *         deployment.</li> </ul> <p>If not specified or set to null, the results
     *         will be returned in an arbitrary order.
     *
     * @see ApplicationRevisionSortBy
     */
    public void setSortBy(ApplicationRevisionSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }
    
    /**
     * The column name to sort the list results by: <ul> <li>registerTime:
     * Sort the list results by when the revisions were registered with AWS
     * CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     * revisions were first used by in a deployment.</li> <li>lastUsedTime:
     * Sort the list results by when the revisions were last used in a
     * deployment.</li> </ul> <p>If not specified or set to null, the results
     * will be returned in an arbitrary order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @param sortBy The column name to sort the list results by: <ul> <li>registerTime:
     *         Sort the list results by when the revisions were registered with AWS
     *         CodeDeploy.</li> <li>firstUsedTime: Sort the list results by when the
     *         revisions were first used by in a deployment.</li> <li>lastUsedTime:
     *         Sort the list results by when the revisions were last used in a
     *         deployment.</li> </ul> <p>If not specified or set to null, the results
     *         will be returned in an arbitrary order.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ApplicationRevisionSortBy
     */
    public ListApplicationRevisionsRequest withSortBy(ApplicationRevisionSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * The order to sort the list results by: <ul> <li>ascending: Sort the
     * list results in ascending order.</li> <li>descending: Sort the list
     * results in descending order.</li> </ul> <p>If not specified, the
     * results will be sorted in ascending order. <p>If set to null, the
     * results will be sorted in an arbitrary order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @return The order to sort the list results by: <ul> <li>ascending: Sort the
     *         list results in ascending order.</li> <li>descending: Sort the list
     *         results in descending order.</li> </ul> <p>If not specified, the
     *         results will be sorted in ascending order. <p>If set to null, the
     *         results will be sorted in an arbitrary order.
     *
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }
    
    /**
     * The order to sort the list results by: <ul> <li>ascending: Sort the
     * list results in ascending order.</li> <li>descending: Sort the list
     * results in descending order.</li> </ul> <p>If not specified, the
     * results will be sorted in ascending order. <p>If set to null, the
     * results will be sorted in an arbitrary order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @param sortOrder The order to sort the list results by: <ul> <li>ascending: Sort the
     *         list results in ascending order.</li> <li>descending: Sort the list
     *         results in descending order.</li> </ul> <p>If not specified, the
     *         results will be sorted in ascending order. <p>If set to null, the
     *         results will be sorted in an arbitrary order.
     *
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
    
    /**
     * The order to sort the list results by: <ul> <li>ascending: Sort the
     * list results in ascending order.</li> <li>descending: Sort the list
     * results in descending order.</li> </ul> <p>If not specified, the
     * results will be sorted in ascending order. <p>If set to null, the
     * results will be sorted in an arbitrary order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @param sortOrder The order to sort the list results by: <ul> <li>ascending: Sort the
     *         list results in ascending order.</li> <li>descending: Sort the list
     *         results in descending order.</li> </ul> <p>If not specified, the
     *         results will be sorted in ascending order. <p>If set to null, the
     *         results will be sorted in an arbitrary order.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SortOrder
     */
    public ListApplicationRevisionsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * The order to sort the list results by: <ul> <li>ascending: Sort the
     * list results in ascending order.</li> <li>descending: Sort the list
     * results in descending order.</li> </ul> <p>If not specified, the
     * results will be sorted in ascending order. <p>If set to null, the
     * results will be sorted in an arbitrary order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @param sortOrder The order to sort the list results by: <ul> <li>ascending: Sort the
     *         list results in ascending order.</li> <li>descending: Sort the list
     *         results in descending order.</li> </ul> <p>If not specified, the
     *         results will be sorted in ascending order. <p>If set to null, the
     *         results will be sorted in an arbitrary order.
     *
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }
    
    /**
     * The order to sort the list results by: <ul> <li>ascending: Sort the
     * list results in ascending order.</li> <li>descending: Sort the list
     * results in descending order.</li> </ul> <p>If not specified, the
     * results will be sorted in ascending order. <p>If set to null, the
     * results will be sorted in an arbitrary order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @param sortOrder The order to sort the list results by: <ul> <li>ascending: Sort the
     *         list results in ascending order.</li> <li>descending: Sort the list
     *         results in descending order.</li> </ul> <p>If not specified, the
     *         results will be sorted in ascending order. <p>If set to null, the
     *         results will be sorted in an arbitrary order.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SortOrder
     */
    public ListApplicationRevisionsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * A specific Amazon S3 bucket name to limit the search for revisions.
     * <p>If set to null, then all of the user's buckets will be searched.
     *
     * @return A specific Amazon S3 bucket name to limit the search for revisions.
     *         <p>If set to null, then all of the user's buckets will be searched.
     */
    public String getS3Bucket() {
        return s3Bucket;
    }
    
    /**
     * A specific Amazon S3 bucket name to limit the search for revisions.
     * <p>If set to null, then all of the user's buckets will be searched.
     *
     * @param s3Bucket A specific Amazon S3 bucket name to limit the search for revisions.
     *         <p>If set to null, then all of the user's buckets will be searched.
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }
    
    /**
     * A specific Amazon S3 bucket name to limit the search for revisions.
     * <p>If set to null, then all of the user's buckets will be searched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Bucket A specific Amazon S3 bucket name to limit the search for revisions.
     *         <p>If set to null, then all of the user's buckets will be searched.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationRevisionsRequest withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * A specific key prefix for the set of Amazon S3 objects to limit the
     * search for revisions.
     *
     * @return A specific key prefix for the set of Amazon S3 objects to limit the
     *         search for revisions.
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }
    
    /**
     * A specific key prefix for the set of Amazon S3 objects to limit the
     * search for revisions.
     *
     * @param s3KeyPrefix A specific key prefix for the set of Amazon S3 objects to limit the
     *         search for revisions.
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }
    
    /**
     * A specific key prefix for the set of Amazon S3 objects to limit the
     * search for revisions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3KeyPrefix A specific key prefix for the set of Amazon S3 objects to limit the
     *         search for revisions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationRevisionsRequest withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group: <ul> <li>include: List revisions that
     * are target revisions of a deployment group.</li> <li>exclude: Do not
     * list revisions that are target revisions of a deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @return Whether to list revisions based on whether the revision is the target
     *         revision of an deployment group: <ul> <li>include: List revisions that
     *         are target revisions of a deployment group.</li> <li>exclude: Do not
     *         list revisions that are target revisions of a deployment group.</li>
     *         <li>ignore: List all revisions, regardless of whether they are target
     *         revisions of a deployment group.</li> </ul>
     *
     * @see ListStateFilterAction
     */
    public String getDeployed() {
        return deployed;
    }
    
    /**
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group: <ul> <li>include: List revisions that
     * are target revisions of a deployment group.</li> <li>exclude: Do not
     * list revisions that are target revisions of a deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @param deployed Whether to list revisions based on whether the revision is the target
     *         revision of an deployment group: <ul> <li>include: List revisions that
     *         are target revisions of a deployment group.</li> <li>exclude: Do not
     *         list revisions that are target revisions of a deployment group.</li>
     *         <li>ignore: List all revisions, regardless of whether they are target
     *         revisions of a deployment group.</li> </ul>
     *
     * @see ListStateFilterAction
     */
    public void setDeployed(String deployed) {
        this.deployed = deployed;
    }
    
    /**
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group: <ul> <li>include: List revisions that
     * are target revisions of a deployment group.</li> <li>exclude: Do not
     * list revisions that are target revisions of a deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @param deployed Whether to list revisions based on whether the revision is the target
     *         revision of an deployment group: <ul> <li>include: List revisions that
     *         are target revisions of a deployment group.</li> <li>exclude: Do not
     *         list revisions that are target revisions of a deployment group.</li>
     *         <li>ignore: List all revisions, regardless of whether they are target
     *         revisions of a deployment group.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ListStateFilterAction
     */
    public ListApplicationRevisionsRequest withDeployed(String deployed) {
        this.deployed = deployed;
        return this;
    }

    /**
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group: <ul> <li>include: List revisions that
     * are target revisions of a deployment group.</li> <li>exclude: Do not
     * list revisions that are target revisions of a deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @param deployed Whether to list revisions based on whether the revision is the target
     *         revision of an deployment group: <ul> <li>include: List revisions that
     *         are target revisions of a deployment group.</li> <li>exclude: Do not
     *         list revisions that are target revisions of a deployment group.</li>
     *         <li>ignore: List all revisions, regardless of whether they are target
     *         revisions of a deployment group.</li> </ul>
     *
     * @see ListStateFilterAction
     */
    public void setDeployed(ListStateFilterAction deployed) {
        this.deployed = deployed.toString();
    }
    
    /**
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group: <ul> <li>include: List revisions that
     * are target revisions of a deployment group.</li> <li>exclude: Do not
     * list revisions that are target revisions of a deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @param deployed Whether to list revisions based on whether the revision is the target
     *         revision of an deployment group: <ul> <li>include: List revisions that
     *         are target revisions of a deployment group.</li> <li>exclude: Do not
     *         list revisions that are target revisions of a deployment group.</li>
     *         <li>ignore: List all revisions, regardless of whether they are target
     *         revisions of a deployment group.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ListStateFilterAction
     */
    public ListApplicationRevisionsRequest withDeployed(ListStateFilterAction deployed) {
        this.deployed = deployed.toString();
        return this;
    }

    /**
     * An identifier that was returned from the previous list application
     * revisions call, which can be used to return the next set of
     * applications in the list.
     *
     * @return An identifier that was returned from the previous list application
     *         revisions call, which can be used to return the next set of
     *         applications in the list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list application
     * revisions call, which can be used to return the next set of
     * applications in the list.
     *
     * @param nextToken An identifier that was returned from the previous list application
     *         revisions call, which can be used to return the next set of
     *         applications in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list application
     * revisions call, which can be used to return the next set of
     * applications in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An identifier that was returned from the previous list application
     *         revisions call, which can be used to return the next set of
     *         applications in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationRevisionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getSortBy() != null) sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null) sb.append("SortOrder: " + getSortOrder() + ",");
        if (getS3Bucket() != null) sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3KeyPrefix() != null) sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getDeployed() != null) sb.append("Deployed: " + getDeployed() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode()); 
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode()); 
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode()); 
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getDeployed() == null) ? 0 : getDeployed().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListApplicationRevisionsRequest == false) return false;
        ListApplicationRevisionsRequest other = (ListApplicationRevisionsRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getSortBy() == null ^ this.getSortBy() == null) return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false) return false; 
        if (other.getSortOrder() == null ^ this.getSortOrder() == null) return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false) return false; 
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null) return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false) return false; 
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null) return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false) return false; 
        if (other.getDeployed() == null ^ this.getDeployed() == null) return false;
        if (other.getDeployed() != null && other.getDeployed().equals(this.getDeployed()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    
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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectParents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListObjectParentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * The reference that identifies the object for which parent objects are being listed.
     * </p>
     */
    private ObjectReference objectReference;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to be retrieved in a single call. This is an approximate number.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     */
    private String consistencyLevel;
    /**
     * <p>
     * When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links between
     * a parent-child pair.
     * </p>
     */
    private Boolean includeAllLinksToEachParent;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *        more information, see <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *         more information, see <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *        more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectParentsRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * The reference that identifies the object for which parent objects are being listed.
     * </p>
     * 
     * @param objectReference
     *        The reference that identifies the object for which parent objects are being listed.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * The reference that identifies the object for which parent objects are being listed.
     * </p>
     * 
     * @return The reference that identifies the object for which parent objects are being listed.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * The reference that identifies the object for which parent objects are being listed.
     * </p>
     * 
     * @param objectReference
     *        The reference that identifies the object for which parent objects are being listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectParentsRequest withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectParentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be retrieved in a single call. This is an approximate number.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be retrieved in a single call. This is an approximate number.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be retrieved in a single call. This is an approximate number.
     * </p>
     * 
     * @return The maximum number of items to be retrieved in a single call. This is an approximate number.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be retrieved in a single call. This is an approximate number.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be retrieved in a single call. This is an approximate number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectParentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @param consistencyLevel
     *        Represents the manner and timing in which the successful write or update of an object is reflected in a
     *        subsequent read operation of that same object.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(String consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @return Represents the manner and timing in which the successful write or update of an object is reflected in a
     *         subsequent read operation of that same object.
     * @see ConsistencyLevel
     */

    public String getConsistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @param consistencyLevel
     *        Represents the manner and timing in which the successful write or update of an object is reflected in a
     *        subsequent read operation of that same object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public ListObjectParentsRequest withConsistencyLevel(String consistencyLevel) {
        setConsistencyLevel(consistencyLevel);
        return this;
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @param consistencyLevel
     *        Represents the manner and timing in which the successful write or update of an object is reflected in a
     *        subsequent read operation of that same object.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(ConsistencyLevel consistencyLevel) {
        withConsistencyLevel(consistencyLevel);
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @param consistencyLevel
     *        Represents the manner and timing in which the successful write or update of an object is reflected in a
     *        subsequent read operation of that same object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public ListObjectParentsRequest withConsistencyLevel(ConsistencyLevel consistencyLevel) {
        this.consistencyLevel = consistencyLevel.toString();
        return this;
    }

    /**
     * <p>
     * When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links between
     * a parent-child pair.
     * </p>
     * 
     * @param includeAllLinksToEachParent
     *        When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links
     *        between a parent-child pair.
     */

    public void setIncludeAllLinksToEachParent(Boolean includeAllLinksToEachParent) {
        this.includeAllLinksToEachParent = includeAllLinksToEachParent;
    }

    /**
     * <p>
     * When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links between
     * a parent-child pair.
     * </p>
     * 
     * @return When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links
     *         between a parent-child pair.
     */

    public Boolean getIncludeAllLinksToEachParent() {
        return this.includeAllLinksToEachParent;
    }

    /**
     * <p>
     * When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links between
     * a parent-child pair.
     * </p>
     * 
     * @param includeAllLinksToEachParent
     *        When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links
     *        between a parent-child pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectParentsRequest withIncludeAllLinksToEachParent(Boolean includeAllLinksToEachParent) {
        setIncludeAllLinksToEachParent(includeAllLinksToEachParent);
        return this;
    }

    /**
     * <p>
     * When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links between
     * a parent-child pair.
     * </p>
     * 
     * @return When set to True, returns all <a>ListObjectParentsResponse$ParentLinks</a>. There could be multiple links
     *         between a parent-child pair.
     */

    public Boolean isIncludeAllLinksToEachParent() {
        return this.includeAllLinksToEachParent;
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getConsistencyLevel() != null)
            sb.append("ConsistencyLevel: ").append(getConsistencyLevel()).append(",");
        if (getIncludeAllLinksToEachParent() != null)
            sb.append("IncludeAllLinksToEachParent: ").append(getIncludeAllLinksToEachParent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListObjectParentsRequest == false)
            return false;
        ListObjectParentsRequest other = (ListObjectParentsRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getConsistencyLevel() == null ^ this.getConsistencyLevel() == null)
            return false;
        if (other.getConsistencyLevel() != null && other.getConsistencyLevel().equals(this.getConsistencyLevel()) == false)
            return false;
        if (other.getIncludeAllLinksToEachParent() == null ^ this.getIncludeAllLinksToEachParent() == null)
            return false;
        if (other.getIncludeAllLinksToEachParent() != null && other.getIncludeAllLinksToEachParent().equals(this.getIncludeAllLinksToEachParent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getConsistencyLevel() == null) ? 0 : getConsistencyLevel().hashCode());
        hashCode = prime * hashCode + ((getIncludeAllLinksToEachParent() == null) ? 0 : getIncludeAllLinksToEachParent().hashCode());
        return hashCode;
    }

    @Override
    public ListObjectParentsRequest clone() {
        return (ListObjectParentsRequest) super.clone();
    }

}

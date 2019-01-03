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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for DescribeObjects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribeObjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeObjectsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pipeline that contains the object definitions.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     * identifiers in a single call to <code>DescribeObjects</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> objectIds;
    /**
     * <p>
     * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
     * </p>
     */
    private Boolean evaluateExpressions;
    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>DescribeObjects</code> with the marker value from the previous
     * call to retrieve the next set of results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The ID of the pipeline that contains the object definitions.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline that contains the object definitions.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline that contains the object definitions.
     * </p>
     * 
     * @return The ID of the pipeline that contains the object definitions.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline that contains the object definitions.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline that contains the object definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     * identifiers in a single call to <code>DescribeObjects</code>.
     * </p>
     * 
     * @return The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     *         identifiers in a single call to <code>DescribeObjects</code>.
     */

    public java.util.List<String> getObjectIds() {
        if (objectIds == null) {
            objectIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return objectIds;
    }

    /**
     * <p>
     * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     * identifiers in a single call to <code>DescribeObjects</code>.
     * </p>
     * 
     * @param objectIds
     *        The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     *        identifiers in a single call to <code>DescribeObjects</code>.
     */

    public void setObjectIds(java.util.Collection<String> objectIds) {
        if (objectIds == null) {
            this.objectIds = null;
            return;
        }

        this.objectIds = new com.amazonaws.internal.SdkInternalList<String>(objectIds);
    }

    /**
     * <p>
     * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     * identifiers in a single call to <code>DescribeObjects</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectIds(java.util.Collection)} or {@link #withObjectIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param objectIds
     *        The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     *        identifiers in a single call to <code>DescribeObjects</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsRequest withObjectIds(String... objectIds) {
        if (this.objectIds == null) {
            setObjectIds(new com.amazonaws.internal.SdkInternalList<String>(objectIds.length));
        }
        for (String ele : objectIds) {
            this.objectIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     * identifiers in a single call to <code>DescribeObjects</code>.
     * </p>
     * 
     * @param objectIds
     *        The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25
     *        identifiers in a single call to <code>DescribeObjects</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsRequest withObjectIds(java.util.Collection<String> objectIds) {
        setObjectIds(objectIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
     * </p>
     * 
     * @param evaluateExpressions
     *        Indicates whether any expressions in the object should be evaluated when the object descriptions are
     *        returned.
     */

    public void setEvaluateExpressions(Boolean evaluateExpressions) {
        this.evaluateExpressions = evaluateExpressions;
    }

    /**
     * <p>
     * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
     * </p>
     * 
     * @return Indicates whether any expressions in the object should be evaluated when the object descriptions are
     *         returned.
     */

    public Boolean getEvaluateExpressions() {
        return this.evaluateExpressions;
    }

    /**
     * <p>
     * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
     * </p>
     * 
     * @param evaluateExpressions
     *        Indicates whether any expressions in the object should be evaluated when the object descriptions are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsRequest withEvaluateExpressions(Boolean evaluateExpressions) {
        setEvaluateExpressions(evaluateExpressions);
        return this;
    }

    /**
     * <p>
     * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
     * </p>
     * 
     * @return Indicates whether any expressions in the object should be evaluated when the object descriptions are
     *         returned.
     */

    public Boolean isEvaluateExpressions() {
        return this.evaluateExpressions;
    }

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>DescribeObjects</code> with the marker value from the previous
     * call to retrieve the next set of results.
     * </p>
     * 
     * @param marker
     *        The starting point for the results to be returned. For the first call, this value should be empty. As long
     *        as there are more results, continue to call <code>DescribeObjects</code> with the marker value from the
     *        previous call to retrieve the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>DescribeObjects</code> with the marker value from the previous
     * call to retrieve the next set of results.
     * </p>
     * 
     * @return The starting point for the results to be returned. For the first call, this value should be empty. As
     *         long as there are more results, continue to call <code>DescribeObjects</code> with the marker value from
     *         the previous call to retrieve the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>DescribeObjects</code> with the marker value from the previous
     * call to retrieve the next set of results.
     * </p>
     * 
     * @param marker
     *        The starting point for the results to be returned. For the first call, this value should be empty. As long
     *        as there are more results, continue to call <code>DescribeObjects</code> with the marker value from the
     *        previous call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeObjectsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId()).append(",");
        if (getObjectIds() != null)
            sb.append("ObjectIds: ").append(getObjectIds()).append(",");
        if (getEvaluateExpressions() != null)
            sb.append("EvaluateExpressions: ").append(getEvaluateExpressions()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeObjectsRequest == false)
            return false;
        DescribeObjectsRequest other = (DescribeObjectsRequest) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getObjectIds() == null ^ this.getObjectIds() == null)
            return false;
        if (other.getObjectIds() != null && other.getObjectIds().equals(this.getObjectIds()) == false)
            return false;
        if (other.getEvaluateExpressions() == null ^ this.getEvaluateExpressions() == null)
            return false;
        if (other.getEvaluateExpressions() != null && other.getEvaluateExpressions().equals(this.getEvaluateExpressions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getObjectIds() == null) ? 0 : getObjectIds().hashCode());
        hashCode = prime * hashCode + ((getEvaluateExpressions() == null) ? 0 : getEvaluateExpressions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeObjectsRequest clone() {
        return (DescribeObjectsRequest) super.clone();
    }

}

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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRealtimeContactAnalysisSegmentsV2"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRealtimeContactAnalysisSegmentsV2Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     */
    private String outputType;
    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type returned in the segments list of the API. Each
     * segment type has its own structure. Different channels may have different sets of supported segment types.
     * </p>
     */
    private java.util.List<String> segmentTypes;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @return The identifier of the contact in this instance of Amazon Connect.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * 
     * @param outputType
     *        The Contact Lens output type to be returned.
     * @see RealTimeContactAnalysisOutputType
     */

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * 
     * @return The Contact Lens output type to be returned.
     * @see RealTimeContactAnalysisOutputType
     */

    public String getOutputType() {
        return this.outputType;
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * 
     * @param outputType
     *        The Contact Lens output type to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisOutputType
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withOutputType(String outputType) {
        setOutputType(outputType);
        return this;
    }

    /**
     * <p>
     * The Contact Lens output type to be returned.
     * </p>
     * 
     * @param outputType
     *        The Contact Lens output type to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisOutputType
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withOutputType(RealTimeContactAnalysisOutputType outputType) {
        this.outputType = outputType.toString();
        return this;
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type returned in the segments list of the API. Each
     * segment type has its own structure. Different channels may have different sets of supported segment types.
     * </p>
     * 
     * @return Enum with segment types . Each value corresponds to a segment type returned in the segments list of the
     *         API. Each segment type has its own structure. Different channels may have different sets of supported
     *         segment types.
     * @see RealTimeContactAnalysisSegmentType
     */

    public java.util.List<String> getSegmentTypes() {
        return segmentTypes;
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type returned in the segments list of the API. Each
     * segment type has its own structure. Different channels may have different sets of supported segment types.
     * </p>
     * 
     * @param segmentTypes
     *        Enum with segment types . Each value corresponds to a segment type returned in the segments list of the
     *        API. Each segment type has its own structure. Different channels may have different sets of supported
     *        segment types.
     * @see RealTimeContactAnalysisSegmentType
     */

    public void setSegmentTypes(java.util.Collection<String> segmentTypes) {
        if (segmentTypes == null) {
            this.segmentTypes = null;
            return;
        }

        this.segmentTypes = new java.util.ArrayList<String>(segmentTypes);
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type returned in the segments list of the API. Each
     * segment type has its own structure. Different channels may have different sets of supported segment types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegmentTypes(java.util.Collection)} or {@link #withSegmentTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param segmentTypes
     *        Enum with segment types . Each value corresponds to a segment type returned in the segments list of the
     *        API. Each segment type has its own structure. Different channels may have different sets of supported
     *        segment types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisSegmentType
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withSegmentTypes(String... segmentTypes) {
        if (this.segmentTypes == null) {
            setSegmentTypes(new java.util.ArrayList<String>(segmentTypes.length));
        }
        for (String ele : segmentTypes) {
            this.segmentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type returned in the segments list of the API. Each
     * segment type has its own structure. Different channels may have different sets of supported segment types.
     * </p>
     * 
     * @param segmentTypes
     *        Enum with segment types . Each value corresponds to a segment type returned in the segments list of the
     *        API. Each segment type has its own structure. Different channels may have different sets of supported
     *        segment types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisSegmentType
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withSegmentTypes(java.util.Collection<String> segmentTypes) {
        setSegmentTypes(segmentTypes);
        return this;
    }

    /**
     * <p>
     * Enum with segment types . Each value corresponds to a segment type returned in the segments list of the API. Each
     * segment type has its own structure. Different channels may have different sets of supported segment types.
     * </p>
     * 
     * @param segmentTypes
     *        Enum with segment types . Each value corresponds to a segment type returned in the segments list of the
     *        API. Each segment type has its own structure. Different channels may have different sets of supported
     *        segment types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisSegmentType
     */

    public ListRealtimeContactAnalysisSegmentsV2Request withSegmentTypes(RealTimeContactAnalysisSegmentType... segmentTypes) {
        java.util.ArrayList<String> segmentTypesCopy = new java.util.ArrayList<String>(segmentTypes.length);
        for (RealTimeContactAnalysisSegmentType value : segmentTypes) {
            segmentTypesCopy.add(value.toString());
        }
        if (getSegmentTypes() == null) {
            setSegmentTypes(segmentTypesCopy);
        } else {
            getSegmentTypes().addAll(segmentTypesCopy);
        }
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOutputType() != null)
            sb.append("OutputType: ").append(getOutputType()).append(",");
        if (getSegmentTypes() != null)
            sb.append("SegmentTypes: ").append(getSegmentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRealtimeContactAnalysisSegmentsV2Request == false)
            return false;
        ListRealtimeContactAnalysisSegmentsV2Request other = (ListRealtimeContactAnalysisSegmentsV2Request) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOutputType() == null ^ this.getOutputType() == null)
            return false;
        if (other.getOutputType() != null && other.getOutputType().equals(this.getOutputType()) == false)
            return false;
        if (other.getSegmentTypes() == null ^ this.getSegmentTypes() == null)
            return false;
        if (other.getSegmentTypes() != null && other.getSegmentTypes().equals(this.getSegmentTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOutputType() == null) ? 0 : getOutputType().hashCode());
        hashCode = prime * hashCode + ((getSegmentTypes() == null) ? 0 : getSegmentTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListRealtimeContactAnalysisSegmentsV2Request clone() {
        return (ListRealtimeContactAnalysisSegmentsV2Request) super.clone();
    }

}

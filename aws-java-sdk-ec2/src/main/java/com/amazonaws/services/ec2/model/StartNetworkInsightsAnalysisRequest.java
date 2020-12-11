/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.StartNetworkInsightsAnalysisRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartNetworkInsightsAnalysisRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<StartNetworkInsightsAnalysisRequest> {

    /**
     * <p>
     * The ID of the path.
     * </p>
     */
    private String networkInsightsPathId;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> filterInArns;
    /**
     * <p>
     * The tags to apply.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the path.
     * </p>
     * 
     * @param networkInsightsPathId
     *        The ID of the path.
     */

    public void setNetworkInsightsPathId(String networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
    }

    /**
     * <p>
     * The ID of the path.
     * </p>
     * 
     * @return The ID of the path.
     */

    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    /**
     * <p>
     * The ID of the path.
     * </p>
     * 
     * @param networkInsightsPathId
     *        The ID of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkInsightsAnalysisRequest withNetworkInsightsPathId(String networkInsightsPathId) {
        setNetworkInsightsPathId(networkInsightsPathId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the resources that the path must traverse.
     */

    public java.util.List<String> getFilterInArns() {
        if (filterInArns == null) {
            filterInArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return filterInArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     * </p>
     * 
     * @param filterInArns
     *        The Amazon Resource Names (ARN) of the resources that the path must traverse.
     */

    public void setFilterInArns(java.util.Collection<String> filterInArns) {
        if (filterInArns == null) {
            this.filterInArns = null;
            return;
        }

        this.filterInArns = new com.amazonaws.internal.SdkInternalList<String>(filterInArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterInArns(java.util.Collection)} or {@link #withFilterInArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterInArns
     *        The Amazon Resource Names (ARN) of the resources that the path must traverse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkInsightsAnalysisRequest withFilterInArns(String... filterInArns) {
        if (this.filterInArns == null) {
            setFilterInArns(new com.amazonaws.internal.SdkInternalList<String>(filterInArns.length));
        }
        for (String ele : filterInArns) {
            this.filterInArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     * </p>
     * 
     * @param filterInArns
     *        The Amazon Resource Names (ARN) of the resources that the path must traverse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkInsightsAnalysisRequest withFilterInArns(java.util.Collection<String> filterInArns) {
        setFilterInArns(filterInArns);
        return this;
    }

    /**
     * <p>
     * The tags to apply.
     * </p>
     * 
     * @return The tags to apply.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkInsightsAnalysisRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkInsightsAnalysisRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkInsightsAnalysisRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<StartNetworkInsightsAnalysisRequest> getDryRunRequest() {
        Request<StartNetworkInsightsAnalysisRequest> request = new StartNetworkInsightsAnalysisRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNetworkInsightsPathId() != null)
            sb.append("NetworkInsightsPathId: ").append(getNetworkInsightsPathId()).append(",");
        if (getFilterInArns() != null)
            sb.append("FilterInArns: ").append(getFilterInArns()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartNetworkInsightsAnalysisRequest == false)
            return false;
        StartNetworkInsightsAnalysisRequest other = (StartNetworkInsightsAnalysisRequest) obj;
        if (other.getNetworkInsightsPathId() == null ^ this.getNetworkInsightsPathId() == null)
            return false;
        if (other.getNetworkInsightsPathId() != null && other.getNetworkInsightsPathId().equals(this.getNetworkInsightsPathId()) == false)
            return false;
        if (other.getFilterInArns() == null ^ this.getFilterInArns() == null)
            return false;
        if (other.getFilterInArns() != null && other.getFilterInArns().equals(this.getFilterInArns()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsPathId() == null) ? 0 : getNetworkInsightsPathId().hashCode());
        hashCode = prime * hashCode + ((getFilterInArns() == null) ? 0 : getFilterInArns().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartNetworkInsightsAnalysisRequest clone() {
        return (StartNetworkInsightsAnalysisRequest) super.clone();
    }
}

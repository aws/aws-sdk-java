/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateNetworkInsightsAccessScopeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInsightsAccessScopeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateNetworkInsightsAccessScopeRequest> {

    /**
     * <p>
     * The paths to match.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccessScopePathRequest> matchPaths;
    /**
     * <p>
     * The paths to exclude.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccessScopePathRequest> excludePaths;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
     * idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags to apply.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The paths to match.
     * </p>
     * 
     * @return The paths to match.
     */

    public java.util.List<AccessScopePathRequest> getMatchPaths() {
        if (matchPaths == null) {
            matchPaths = new com.amazonaws.internal.SdkInternalList<AccessScopePathRequest>();
        }
        return matchPaths;
    }

    /**
     * <p>
     * The paths to match.
     * </p>
     * 
     * @param matchPaths
     *        The paths to match.
     */

    public void setMatchPaths(java.util.Collection<AccessScopePathRequest> matchPaths) {
        if (matchPaths == null) {
            this.matchPaths = null;
            return;
        }

        this.matchPaths = new com.amazonaws.internal.SdkInternalList<AccessScopePathRequest>(matchPaths);
    }

    /**
     * <p>
     * The paths to match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchPaths(java.util.Collection)} or {@link #withMatchPaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param matchPaths
     *        The paths to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsAccessScopeRequest withMatchPaths(AccessScopePathRequest... matchPaths) {
        if (this.matchPaths == null) {
            setMatchPaths(new com.amazonaws.internal.SdkInternalList<AccessScopePathRequest>(matchPaths.length));
        }
        for (AccessScopePathRequest ele : matchPaths) {
            this.matchPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The paths to match.
     * </p>
     * 
     * @param matchPaths
     *        The paths to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsAccessScopeRequest withMatchPaths(java.util.Collection<AccessScopePathRequest> matchPaths) {
        setMatchPaths(matchPaths);
        return this;
    }

    /**
     * <p>
     * The paths to exclude.
     * </p>
     * 
     * @return The paths to exclude.
     */

    public java.util.List<AccessScopePathRequest> getExcludePaths() {
        if (excludePaths == null) {
            excludePaths = new com.amazonaws.internal.SdkInternalList<AccessScopePathRequest>();
        }
        return excludePaths;
    }

    /**
     * <p>
     * The paths to exclude.
     * </p>
     * 
     * @param excludePaths
     *        The paths to exclude.
     */

    public void setExcludePaths(java.util.Collection<AccessScopePathRequest> excludePaths) {
        if (excludePaths == null) {
            this.excludePaths = null;
            return;
        }

        this.excludePaths = new com.amazonaws.internal.SdkInternalList<AccessScopePathRequest>(excludePaths);
    }

    /**
     * <p>
     * The paths to exclude.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludePaths(java.util.Collection)} or {@link #withExcludePaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param excludePaths
     *        The paths to exclude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsAccessScopeRequest withExcludePaths(AccessScopePathRequest... excludePaths) {
        if (this.excludePaths == null) {
            setExcludePaths(new com.amazonaws.internal.SdkInternalList<AccessScopePathRequest>(excludePaths.length));
        }
        for (AccessScopePathRequest ele : excludePaths) {
            this.excludePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The paths to exclude.
     * </p>
     * 
     * @param excludePaths
     *        The paths to exclude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsAccessScopeRequest withExcludePaths(java.util.Collection<AccessScopePathRequest> excludePaths) {
        setExcludePaths(excludePaths);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
     * idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsAccessScopeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateNetworkInsightsAccessScopeRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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

    public CreateNetworkInsightsAccessScopeRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateNetworkInsightsAccessScopeRequest> getDryRunRequest() {
        Request<CreateNetworkInsightsAccessScopeRequest> request = new CreateNetworkInsightsAccessScopeRequestMarshaller().marshall(this);
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
        if (getMatchPaths() != null)
            sb.append("MatchPaths: ").append(getMatchPaths()).append(",");
        if (getExcludePaths() != null)
            sb.append("ExcludePaths: ").append(getExcludePaths()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkInsightsAccessScopeRequest == false)
            return false;
        CreateNetworkInsightsAccessScopeRequest other = (CreateNetworkInsightsAccessScopeRequest) obj;
        if (other.getMatchPaths() == null ^ this.getMatchPaths() == null)
            return false;
        if (other.getMatchPaths() != null && other.getMatchPaths().equals(this.getMatchPaths()) == false)
            return false;
        if (other.getExcludePaths() == null ^ this.getExcludePaths() == null)
            return false;
        if (other.getExcludePaths() != null && other.getExcludePaths().equals(this.getExcludePaths()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchPaths() == null) ? 0 : getMatchPaths().hashCode());
        hashCode = prime * hashCode + ((getExcludePaths() == null) ? 0 : getExcludePaths().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkInsightsAccessScopeRequest clone() {
        return (CreateNetworkInsightsAccessScopeRequest) super.clone();
    }
}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a network insights analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkInsightsAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsAnalysis implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the network insights analysis.
     * </p>
     */
    private String networkInsightsAnalysisId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network insights analysis.
     * </p>
     */
    private String networkInsightsAnalysisArn;
    /**
     * <p>
     * The ID of the path.
     * </p>
     */
    private String networkInsightsPathId;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> filterInArns;
    /**
     * <p>
     * The time the analysis started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The status of the network insights analysis.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message, if the status is <code>failed</code>.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Indicates whether the destination is reachable from the source.
     * </p>
     */
    private Boolean networkPathFound;
    /**
     * <p>
     * The components in the path from source to destination.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PathComponent> forwardPathComponents;
    /**
     * <p>
     * The components in the path from destination to source.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PathComponent> returnPathComponents;
    /**
     * <p>
     * The explanations. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     * explanation codes</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Explanation> explanations;
    /**
     * <p>
     * Potential intermediate components.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AlternatePathHint> alternatePathHints;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the network insights analysis.
     * </p>
     * 
     * @param networkInsightsAnalysisId
     *        The ID of the network insights analysis.
     */

    public void setNetworkInsightsAnalysisId(String networkInsightsAnalysisId) {
        this.networkInsightsAnalysisId = networkInsightsAnalysisId;
    }

    /**
     * <p>
     * The ID of the network insights analysis.
     * </p>
     * 
     * @return The ID of the network insights analysis.
     */

    public String getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    /**
     * <p>
     * The ID of the network insights analysis.
     * </p>
     * 
     * @param networkInsightsAnalysisId
     *        The ID of the network insights analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withNetworkInsightsAnalysisId(String networkInsightsAnalysisId) {
        setNetworkInsightsAnalysisId(networkInsightsAnalysisId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network insights analysis.
     * </p>
     * 
     * @param networkInsightsAnalysisArn
     *        The Amazon Resource Name (ARN) of the network insights analysis.
     */

    public void setNetworkInsightsAnalysisArn(String networkInsightsAnalysisArn) {
        this.networkInsightsAnalysisArn = networkInsightsAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network insights analysis.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network insights analysis.
     */

    public String getNetworkInsightsAnalysisArn() {
        return this.networkInsightsAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network insights analysis.
     * </p>
     * 
     * @param networkInsightsAnalysisArn
     *        The Amazon Resource Name (ARN) of the network insights analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withNetworkInsightsAnalysisArn(String networkInsightsAnalysisArn) {
        setNetworkInsightsAnalysisArn(networkInsightsAnalysisArn);
        return this;
    }

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

    public NetworkInsightsAnalysis withNetworkInsightsPathId(String networkInsightsPathId) {
        setNetworkInsightsPathId(networkInsightsPathId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     */

    public java.util.List<String> getFilterInArns() {
        if (filterInArns == null) {
            filterInArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return filterInArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     * </p>
     * 
     * @param filterInArns
     *        The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
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
     * The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterInArns(java.util.Collection)} or {@link #withFilterInArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterInArns
     *        The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withFilterInArns(String... filterInArns) {
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
     * The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     * </p>
     * 
     * @param filterInArns
     *        The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withFilterInArns(java.util.Collection<String> filterInArns) {
        setFilterInArns(filterInArns);
        return this;
    }

    /**
     * <p>
     * The time the analysis started.
     * </p>
     * 
     * @param startDate
     *        The time the analysis started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The time the analysis started.
     * </p>
     * 
     * @return The time the analysis started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The time the analysis started.
     * </p>
     * 
     * @param startDate
     *        The time the analysis started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The status of the network insights analysis.
     * </p>
     * 
     * @param status
     *        The status of the network insights analysis.
     * @see AnalysisStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the network insights analysis.
     * </p>
     * 
     * @return The status of the network insights analysis.
     * @see AnalysisStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the network insights analysis.
     * </p>
     * 
     * @param status
     *        The status of the network insights analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public NetworkInsightsAnalysis withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the network insights analysis.
     * </p>
     * 
     * @param status
     *        The status of the network insights analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public NetworkInsightsAnalysis withStatus(AnalysisStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message, if the status is <code>failed</code>.
     * </p>
     * 
     * @param statusMessage
     *        The status message, if the status is <code>failed</code>.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message, if the status is <code>failed</code>.
     * </p>
     * 
     * @return The status message, if the status is <code>failed</code>.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message, if the status is <code>failed</code>.
     * </p>
     * 
     * @param statusMessage
     *        The status message, if the status is <code>failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Indicates whether the destination is reachable from the source.
     * </p>
     * 
     * @param networkPathFound
     *        Indicates whether the destination is reachable from the source.
     */

    public void setNetworkPathFound(Boolean networkPathFound) {
        this.networkPathFound = networkPathFound;
    }

    /**
     * <p>
     * Indicates whether the destination is reachable from the source.
     * </p>
     * 
     * @return Indicates whether the destination is reachable from the source.
     */

    public Boolean getNetworkPathFound() {
        return this.networkPathFound;
    }

    /**
     * <p>
     * Indicates whether the destination is reachable from the source.
     * </p>
     * 
     * @param networkPathFound
     *        Indicates whether the destination is reachable from the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withNetworkPathFound(Boolean networkPathFound) {
        setNetworkPathFound(networkPathFound);
        return this;
    }

    /**
     * <p>
     * Indicates whether the destination is reachable from the source.
     * </p>
     * 
     * @return Indicates whether the destination is reachable from the source.
     */

    public Boolean isNetworkPathFound() {
        return this.networkPathFound;
    }

    /**
     * <p>
     * The components in the path from source to destination.
     * </p>
     * 
     * @return The components in the path from source to destination.
     */

    public java.util.List<PathComponent> getForwardPathComponents() {
        if (forwardPathComponents == null) {
            forwardPathComponents = new com.amazonaws.internal.SdkInternalList<PathComponent>();
        }
        return forwardPathComponents;
    }

    /**
     * <p>
     * The components in the path from source to destination.
     * </p>
     * 
     * @param forwardPathComponents
     *        The components in the path from source to destination.
     */

    public void setForwardPathComponents(java.util.Collection<PathComponent> forwardPathComponents) {
        if (forwardPathComponents == null) {
            this.forwardPathComponents = null;
            return;
        }

        this.forwardPathComponents = new com.amazonaws.internal.SdkInternalList<PathComponent>(forwardPathComponents);
    }

    /**
     * <p>
     * The components in the path from source to destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForwardPathComponents(java.util.Collection)} or
     * {@link #withForwardPathComponents(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param forwardPathComponents
     *        The components in the path from source to destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withForwardPathComponents(PathComponent... forwardPathComponents) {
        if (this.forwardPathComponents == null) {
            setForwardPathComponents(new com.amazonaws.internal.SdkInternalList<PathComponent>(forwardPathComponents.length));
        }
        for (PathComponent ele : forwardPathComponents) {
            this.forwardPathComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The components in the path from source to destination.
     * </p>
     * 
     * @param forwardPathComponents
     *        The components in the path from source to destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withForwardPathComponents(java.util.Collection<PathComponent> forwardPathComponents) {
        setForwardPathComponents(forwardPathComponents);
        return this;
    }

    /**
     * <p>
     * The components in the path from destination to source.
     * </p>
     * 
     * @return The components in the path from destination to source.
     */

    public java.util.List<PathComponent> getReturnPathComponents() {
        if (returnPathComponents == null) {
            returnPathComponents = new com.amazonaws.internal.SdkInternalList<PathComponent>();
        }
        return returnPathComponents;
    }

    /**
     * <p>
     * The components in the path from destination to source.
     * </p>
     * 
     * @param returnPathComponents
     *        The components in the path from destination to source.
     */

    public void setReturnPathComponents(java.util.Collection<PathComponent> returnPathComponents) {
        if (returnPathComponents == null) {
            this.returnPathComponents = null;
            return;
        }

        this.returnPathComponents = new com.amazonaws.internal.SdkInternalList<PathComponent>(returnPathComponents);
    }

    /**
     * <p>
     * The components in the path from destination to source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReturnPathComponents(java.util.Collection)} or {@link #withReturnPathComponents(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param returnPathComponents
     *        The components in the path from destination to source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withReturnPathComponents(PathComponent... returnPathComponents) {
        if (this.returnPathComponents == null) {
            setReturnPathComponents(new com.amazonaws.internal.SdkInternalList<PathComponent>(returnPathComponents.length));
        }
        for (PathComponent ele : returnPathComponents) {
            this.returnPathComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The components in the path from destination to source.
     * </p>
     * 
     * @param returnPathComponents
     *        The components in the path from destination to source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withReturnPathComponents(java.util.Collection<PathComponent> returnPathComponents) {
        setReturnPathComponents(returnPathComponents);
        return this;
    }

    /**
     * <p>
     * The explanations. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     * explanation codes</a>.
     * </p>
     * 
     * @return The explanations. For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     *         explanation codes</a>.
     */

    public java.util.List<Explanation> getExplanations() {
        if (explanations == null) {
            explanations = new com.amazonaws.internal.SdkInternalList<Explanation>();
        }
        return explanations;
    }

    /**
     * <p>
     * The explanations. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     * explanation codes</a>.
     * </p>
     * 
     * @param explanations
     *        The explanations. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     *        explanation codes</a>.
     */

    public void setExplanations(java.util.Collection<Explanation> explanations) {
        if (explanations == null) {
            this.explanations = null;
            return;
        }

        this.explanations = new com.amazonaws.internal.SdkInternalList<Explanation>(explanations);
    }

    /**
     * <p>
     * The explanations. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     * explanation codes</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExplanations(java.util.Collection)} or {@link #withExplanations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param explanations
     *        The explanations. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     *        explanation codes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withExplanations(Explanation... explanations) {
        if (this.explanations == null) {
            setExplanations(new com.amazonaws.internal.SdkInternalList<Explanation>(explanations.length));
        }
        for (Explanation ele : explanations) {
            this.explanations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The explanations. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     * explanation codes</a>.
     * </p>
     * 
     * @param explanations
     *        The explanations. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer
     *        explanation codes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withExplanations(java.util.Collection<Explanation> explanations) {
        setExplanations(explanations);
        return this;
    }

    /**
     * <p>
     * Potential intermediate components.
     * </p>
     * 
     * @return Potential intermediate components.
     */

    public java.util.List<AlternatePathHint> getAlternatePathHints() {
        if (alternatePathHints == null) {
            alternatePathHints = new com.amazonaws.internal.SdkInternalList<AlternatePathHint>();
        }
        return alternatePathHints;
    }

    /**
     * <p>
     * Potential intermediate components.
     * </p>
     * 
     * @param alternatePathHints
     *        Potential intermediate components.
     */

    public void setAlternatePathHints(java.util.Collection<AlternatePathHint> alternatePathHints) {
        if (alternatePathHints == null) {
            this.alternatePathHints = null;
            return;
        }

        this.alternatePathHints = new com.amazonaws.internal.SdkInternalList<AlternatePathHint>(alternatePathHints);
    }

    /**
     * <p>
     * Potential intermediate components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlternatePathHints(java.util.Collection)} or {@link #withAlternatePathHints(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param alternatePathHints
     *        Potential intermediate components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withAlternatePathHints(AlternatePathHint... alternatePathHints) {
        if (this.alternatePathHints == null) {
            setAlternatePathHints(new com.amazonaws.internal.SdkInternalList<AlternatePathHint>(alternatePathHints.length));
        }
        for (AlternatePathHint ele : alternatePathHints) {
            this.alternatePathHints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Potential intermediate components.
     * </p>
     * 
     * @param alternatePathHints
     *        Potential intermediate components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withAlternatePathHints(java.util.Collection<AlternatePathHint> alternatePathHints) {
        setAlternatePathHints(alternatePathHints);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAnalysis withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getNetworkInsightsAnalysisId() != null)
            sb.append("NetworkInsightsAnalysisId: ").append(getNetworkInsightsAnalysisId()).append(",");
        if (getNetworkInsightsAnalysisArn() != null)
            sb.append("NetworkInsightsAnalysisArn: ").append(getNetworkInsightsAnalysisArn()).append(",");
        if (getNetworkInsightsPathId() != null)
            sb.append("NetworkInsightsPathId: ").append(getNetworkInsightsPathId()).append(",");
        if (getFilterInArns() != null)
            sb.append("FilterInArns: ").append(getFilterInArns()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getNetworkPathFound() != null)
            sb.append("NetworkPathFound: ").append(getNetworkPathFound()).append(",");
        if (getForwardPathComponents() != null)
            sb.append("ForwardPathComponents: ").append(getForwardPathComponents()).append(",");
        if (getReturnPathComponents() != null)
            sb.append("ReturnPathComponents: ").append(getReturnPathComponents()).append(",");
        if (getExplanations() != null)
            sb.append("Explanations: ").append(getExplanations()).append(",");
        if (getAlternatePathHints() != null)
            sb.append("AlternatePathHints: ").append(getAlternatePathHints()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInsightsAnalysis == false)
            return false;
        NetworkInsightsAnalysis other = (NetworkInsightsAnalysis) obj;
        if (other.getNetworkInsightsAnalysisId() == null ^ this.getNetworkInsightsAnalysisId() == null)
            return false;
        if (other.getNetworkInsightsAnalysisId() != null && other.getNetworkInsightsAnalysisId().equals(this.getNetworkInsightsAnalysisId()) == false)
            return false;
        if (other.getNetworkInsightsAnalysisArn() == null ^ this.getNetworkInsightsAnalysisArn() == null)
            return false;
        if (other.getNetworkInsightsAnalysisArn() != null && other.getNetworkInsightsAnalysisArn().equals(this.getNetworkInsightsAnalysisArn()) == false)
            return false;
        if (other.getNetworkInsightsPathId() == null ^ this.getNetworkInsightsPathId() == null)
            return false;
        if (other.getNetworkInsightsPathId() != null && other.getNetworkInsightsPathId().equals(this.getNetworkInsightsPathId()) == false)
            return false;
        if (other.getFilterInArns() == null ^ this.getFilterInArns() == null)
            return false;
        if (other.getFilterInArns() != null && other.getFilterInArns().equals(this.getFilterInArns()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getNetworkPathFound() == null ^ this.getNetworkPathFound() == null)
            return false;
        if (other.getNetworkPathFound() != null && other.getNetworkPathFound().equals(this.getNetworkPathFound()) == false)
            return false;
        if (other.getForwardPathComponents() == null ^ this.getForwardPathComponents() == null)
            return false;
        if (other.getForwardPathComponents() != null && other.getForwardPathComponents().equals(this.getForwardPathComponents()) == false)
            return false;
        if (other.getReturnPathComponents() == null ^ this.getReturnPathComponents() == null)
            return false;
        if (other.getReturnPathComponents() != null && other.getReturnPathComponents().equals(this.getReturnPathComponents()) == false)
            return false;
        if (other.getExplanations() == null ^ this.getExplanations() == null)
            return false;
        if (other.getExplanations() != null && other.getExplanations().equals(this.getExplanations()) == false)
            return false;
        if (other.getAlternatePathHints() == null ^ this.getAlternatePathHints() == null)
            return false;
        if (other.getAlternatePathHints() != null && other.getAlternatePathHints().equals(this.getAlternatePathHints()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsAnalysisId() == null) ? 0 : getNetworkInsightsAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsAnalysisArn() == null) ? 0 : getNetworkInsightsAnalysisArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsPathId() == null) ? 0 : getNetworkInsightsPathId().hashCode());
        hashCode = prime * hashCode + ((getFilterInArns() == null) ? 0 : getFilterInArns().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getNetworkPathFound() == null) ? 0 : getNetworkPathFound().hashCode());
        hashCode = prime * hashCode + ((getForwardPathComponents() == null) ? 0 : getForwardPathComponents().hashCode());
        hashCode = prime * hashCode + ((getReturnPathComponents() == null) ? 0 : getReturnPathComponents().hashCode());
        hashCode = prime * hashCode + ((getExplanations() == null) ? 0 : getExplanations().hashCode());
        hashCode = prime * hashCode + ((getAlternatePathHints() == null) ? 0 : getAlternatePathHints().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInsightsAnalysis clone() {
        try {
            return (NetworkInsightsAnalysis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

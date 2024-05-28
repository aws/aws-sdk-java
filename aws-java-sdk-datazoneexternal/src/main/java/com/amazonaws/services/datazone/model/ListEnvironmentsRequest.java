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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Web Services account where you want to list environments.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Web Services region where you want to list environments.
     * </p>
     */
    private String awsAccountRegion;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the Amazon DataZone blueprint.
     * </p>
     */
    private String environmentBlueprintIdentifier;
    /**
     * <p>
     * The identifier of the environment profile.
     * </p>
     */
    private String environmentProfileIdentifier;
    /**
     * <p>
     * The maximum number of environments to return in a single call to <code>ListEnvironments</code>. When the number
     * of environments to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListEnvironments</code> to list the
     * next set of environments.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When the number of environments is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of environments, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListEnvironments</code> to list the next set of environments.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the Amazon DataZone project.
     * </p>
     */
    private String projectIdentifier;
    /**
     * <p>
     * The provider of the environment.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The status of the environments that you want to list.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The identifier of the Amazon Web Services account where you want to list environments.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier of the Amazon Web Services account where you want to list environments.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account where you want to list environments.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services account where you want to list environments.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account where you want to list environments.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier of the Amazon Web Services account where you want to list environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services region where you want to list environments.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services region where you want to list environments.
     */

    public void setAwsAccountRegion(String awsAccountRegion) {
        this.awsAccountRegion = awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region where you want to list environments.
     * </p>
     * 
     * @return The Amazon Web Services region where you want to list environments.
     */

    public String getAwsAccountRegion() {
        return this.awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region where you want to list environments.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services region where you want to list environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withAwsAccountRegion(String awsAccountRegion) {
        setAwsAccountRegion(awsAccountRegion);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone blueprint.
     * </p>
     * 
     * @param environmentBlueprintIdentifier
     *        The identifier of the Amazon DataZone blueprint.
     */

    public void setEnvironmentBlueprintIdentifier(String environmentBlueprintIdentifier) {
        this.environmentBlueprintIdentifier = environmentBlueprintIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone blueprint.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone blueprint.
     */

    public String getEnvironmentBlueprintIdentifier() {
        return this.environmentBlueprintIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone blueprint.
     * </p>
     * 
     * @param environmentBlueprintIdentifier
     *        The identifier of the Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withEnvironmentBlueprintIdentifier(String environmentBlueprintIdentifier) {
        setEnvironmentBlueprintIdentifier(environmentBlueprintIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment profile.
     * </p>
     * 
     * @param environmentProfileIdentifier
     *        The identifier of the environment profile.
     */

    public void setEnvironmentProfileIdentifier(String environmentProfileIdentifier) {
        this.environmentProfileIdentifier = environmentProfileIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment profile.
     * </p>
     * 
     * @return The identifier of the environment profile.
     */

    public String getEnvironmentProfileIdentifier() {
        return this.environmentProfileIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment profile.
     * </p>
     * 
     * @param environmentProfileIdentifier
     *        The identifier of the environment profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withEnvironmentProfileIdentifier(String environmentProfileIdentifier) {
        setEnvironmentProfileIdentifier(environmentProfileIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of environments to return in a single call to <code>ListEnvironments</code>. When the number
     * of environments to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListEnvironments</code> to list the
     * next set of environments.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environments to return in a single call to <code>ListEnvironments</code>. When the
     *        number of environments to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListEnvironments</code> to list the next set of environments.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of environments to return in a single call to <code>ListEnvironments</code>. When the number
     * of environments to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListEnvironments</code> to list the
     * next set of environments.
     * </p>
     * 
     * @return The maximum number of environments to return in a single call to <code>ListEnvironments</code>. When the
     *         number of environments to be listed is greater than the value of <code>MaxResults</code>, the response
     *         contains a <code>NextToken</code> value that you can use in a subsequent call to
     *         <code>ListEnvironments</code> to list the next set of environments.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of environments to return in a single call to <code>ListEnvironments</code>. When the number
     * of environments to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListEnvironments</code> to list the
     * next set of environments.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environments to return in a single call to <code>ListEnvironments</code>. When the
     *        number of environments to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListEnvironments</code> to list the next set of environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When the number of environments is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of environments, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListEnvironments</code> to list the next set of environments.
     * </p>
     * 
     * @param nextToken
     *        When the number of environments is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of environments, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListEnvironments</code> to list the next
     *        set of environments.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of environments is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of environments, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListEnvironments</code> to list the next set of environments.
     * </p>
     * 
     * @return When the number of environments is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of environments, the response includes a pagination token named <code>NextToken</code>. You can specify
     *         this <code>NextToken</code> value in a subsequent call to <code>ListEnvironments</code> to list the next
     *         set of environments.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of environments is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of environments, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListEnvironments</code> to list the next set of environments.
     * </p>
     * 
     * @param nextToken
     *        When the number of environments is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of environments, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListEnvironments</code> to list the next
     *        set of environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the Amazon DataZone project.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone project.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the Amazon DataZone project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withProjectIdentifier(String projectIdentifier) {
        setProjectIdentifier(projectIdentifier);
        return this;
    }

    /**
     * <p>
     * The provider of the environment.
     * </p>
     * 
     * @param provider
     *        The provider of the environment.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the environment.
     * </p>
     * 
     * @return The provider of the environment.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the environment.
     * </p>
     * 
     * @param provider
     *        The provider of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentsRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The status of the environments that you want to list.
     * </p>
     * 
     * @param status
     *        The status of the environments that you want to list.
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the environments that you want to list.
     * </p>
     * 
     * @return The status of the environments that you want to list.
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the environments that you want to list.
     * </p>
     * 
     * @param status
     *        The status of the environments that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public ListEnvironmentsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the environments that you want to list.
     * </p>
     * 
     * @param status
     *        The status of the environments that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public ListEnvironmentsRequest withStatus(EnvironmentStatus status) {
        this.status = status.toString();
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsAccountRegion() != null)
            sb.append("AwsAccountRegion: ").append(getAwsAccountRegion()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentBlueprintIdentifier() != null)
            sb.append("EnvironmentBlueprintIdentifier: ").append(getEnvironmentBlueprintIdentifier()).append(",");
        if (getEnvironmentProfileIdentifier() != null)
            sb.append("EnvironmentProfileIdentifier: ").append(getEnvironmentProfileIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProjectIdentifier() != null)
            sb.append("ProjectIdentifier: ").append(getProjectIdentifier()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentsRequest == false)
            return false;
        ListEnvironmentsRequest other = (ListEnvironmentsRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsAccountRegion() == null ^ this.getAwsAccountRegion() == null)
            return false;
        if (other.getAwsAccountRegion() != null && other.getAwsAccountRegion().equals(this.getAwsAccountRegion()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentBlueprintIdentifier() == null ^ this.getEnvironmentBlueprintIdentifier() == null)
            return false;
        if (other.getEnvironmentBlueprintIdentifier() != null
                && other.getEnvironmentBlueprintIdentifier().equals(this.getEnvironmentBlueprintIdentifier()) == false)
            return false;
        if (other.getEnvironmentProfileIdentifier() == null ^ this.getEnvironmentProfileIdentifier() == null)
            return false;
        if (other.getEnvironmentProfileIdentifier() != null && other.getEnvironmentProfileIdentifier().equals(this.getEnvironmentProfileIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProjectIdentifier() == null ^ this.getProjectIdentifier() == null)
            return false;
        if (other.getProjectIdentifier() != null && other.getProjectIdentifier().equals(this.getProjectIdentifier()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountRegion() == null) ? 0 : getAwsAccountRegion().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentBlueprintIdentifier() == null) ? 0 : getEnvironmentBlueprintIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentProfileIdentifier() == null) ? 0 : getEnvironmentProfileIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentsRequest clone() {
        return (ListEnvironmentsRequest) super.clone();
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentBlueprintsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * Specifies whether the environment blueprint is managed by Amazon DataZone.
     * </p>
     */
    private Boolean managed;
    /**
     * <p>
     * The maximum number of blueprints to return in a single call to <code>ListEnvironmentBlueprints</code>. When the
     * number of blueprints to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListEnvironmentBlueprints</code> to
     * list the next set of blueprints.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the Amazon DataZone environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When the number of blueprints in the environment is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of blueprints in the environment, the response includes a pagination token named
     * <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     * <code>ListEnvironmentBlueprints</code>to list the next set of blueprints.
     * </p>
     */
    private String nextToken;

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

    public ListEnvironmentBlueprintsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies whether the environment blueprint is managed by Amazon DataZone.
     * </p>
     * 
     * @param managed
     *        Specifies whether the environment blueprint is managed by Amazon DataZone.
     */

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    /**
     * <p>
     * Specifies whether the environment blueprint is managed by Amazon DataZone.
     * </p>
     * 
     * @return Specifies whether the environment blueprint is managed by Amazon DataZone.
     */

    public Boolean getManaged() {
        return this.managed;
    }

    /**
     * <p>
     * Specifies whether the environment blueprint is managed by Amazon DataZone.
     * </p>
     * 
     * @param managed
     *        Specifies whether the environment blueprint is managed by Amazon DataZone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentBlueprintsRequest withManaged(Boolean managed) {
        setManaged(managed);
        return this;
    }

    /**
     * <p>
     * Specifies whether the environment blueprint is managed by Amazon DataZone.
     * </p>
     * 
     * @return Specifies whether the environment blueprint is managed by Amazon DataZone.
     */

    public Boolean isManaged() {
        return this.managed;
    }

    /**
     * <p>
     * The maximum number of blueprints to return in a single call to <code>ListEnvironmentBlueprints</code>. When the
     * number of blueprints to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListEnvironmentBlueprints</code> to
     * list the next set of blueprints.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of blueprints to return in a single call to <code>ListEnvironmentBlueprints</code>.
     *        When the number of blueprints to be listed is greater than the value of <code>MaxResults</code>, the
     *        response contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListEnvironmentBlueprints</code> to list the next set of blueprints.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of blueprints to return in a single call to <code>ListEnvironmentBlueprints</code>. When the
     * number of blueprints to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListEnvironmentBlueprints</code> to
     * list the next set of blueprints.
     * </p>
     * 
     * @return The maximum number of blueprints to return in a single call to <code>ListEnvironmentBlueprints</code>.
     *         When the number of blueprints to be listed is greater than the value of <code>MaxResults</code>, the
     *         response contains a <code>NextToken</code> value that you can use in a subsequent call to
     *         <code>ListEnvironmentBlueprints</code> to list the next set of blueprints.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of blueprints to return in a single call to <code>ListEnvironmentBlueprints</code>. When the
     * number of blueprints to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListEnvironmentBlueprints</code> to
     * list the next set of blueprints.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of blueprints to return in a single call to <code>ListEnvironmentBlueprints</code>.
     *        When the number of blueprints to be listed is greater than the value of <code>MaxResults</code>, the
     *        response contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListEnvironmentBlueprints</code> to list the next set of blueprints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentBlueprintsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon DataZone environment.
     * </p>
     * 
     * @param name
     *        The name of the Amazon DataZone environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon DataZone environment.
     * </p>
     * 
     * @return The name of the Amazon DataZone environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon DataZone environment.
     * </p>
     * 
     * @param name
     *        The name of the Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentBlueprintsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When the number of blueprints in the environment is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of blueprints in the environment, the response includes a pagination token named
     * <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     * <code>ListEnvironmentBlueprints</code>to list the next set of blueprints.
     * </p>
     * 
     * @param nextToken
     *        When the number of blueprints in the environment is greater than the default value for the
     *        <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *        is less than the number of blueprints in the environment, the response includes a pagination token named
     *        <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *        <code>ListEnvironmentBlueprints</code>to list the next set of blueprints.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of blueprints in the environment is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of blueprints in the environment, the response includes a pagination token named
     * <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     * <code>ListEnvironmentBlueprints</code>to list the next set of blueprints.
     * </p>
     * 
     * @return When the number of blueprints in the environment is greater than the default value for the
     *         <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *         is less than the number of blueprints in the environment, the response includes a pagination token named
     *         <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *         <code>ListEnvironmentBlueprints</code>to list the next set of blueprints.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of blueprints in the environment is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of blueprints in the environment, the response includes a pagination token named
     * <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     * <code>ListEnvironmentBlueprints</code>to list the next set of blueprints.
     * </p>
     * 
     * @param nextToken
     *        When the number of blueprints in the environment is greater than the default value for the
     *        <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *        is less than the number of blueprints in the environment, the response includes a pagination token named
     *        <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *        <code>ListEnvironmentBlueprints</code>to list the next set of blueprints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentBlueprintsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getManaged() != null)
            sb.append("Managed: ").append(getManaged()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentBlueprintsRequest == false)
            return false;
        ListEnvironmentBlueprintsRequest other = (ListEnvironmentBlueprintsRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getManaged() == null ^ this.getManaged() == null)
            return false;
        if (other.getManaged() != null && other.getManaged().equals(this.getManaged()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getManaged() == null) ? 0 : getManaged().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentBlueprintsRequest clone() {
        return (ListEnvironmentBlueprintsRequest) super.clone();
    }

}

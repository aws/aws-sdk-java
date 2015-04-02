/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#listOnPremisesInstances(ListOnPremisesInstancesRequest) ListOnPremisesInstances operation}.
 * <p>
 * Gets a list of one or more on-premises instance names.
 * </p>
 * <p>
 * Unless otherwise specified, both registered and deregistered
 * on-premises instance names will be listed. To list only registered or
 * deregistered on-premises instance names, use the registration status
 * parameter.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#listOnPremisesInstances(ListOnPremisesInstancesRequest)
 */
public class ListOnPremisesInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The on-premises instances registration status: <ul> <li>Deregistered:
     * Include in the resulting list deregistered on-premises instances.</li>
     * <li>Registered: Include in the resulting list registered on-premises
     * instances.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     */
    private String registrationStatus;

    /**
     * The on-premises instance tags that will be used to restrict the
     * corresponding on-premises instance names that are returned.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TagFilter> tagFilters;

    /**
     * An identifier that was returned from the previous list on-premises
     * instances call, which can be used to return the next set of
     * on-premises instances in the list.
     */
    private String nextToken;

    /**
     * The on-premises instances registration status: <ul> <li>Deregistered:
     * Include in the resulting list deregistered on-premises instances.</li>
     * <li>Registered: Include in the resulting list registered on-premises
     * instances.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @return The on-premises instances registration status: <ul> <li>Deregistered:
     *         Include in the resulting list deregistered on-premises instances.</li>
     *         <li>Registered: Include in the resulting list registered on-premises
     *         instances.</li> </ul>
     *
     * @see RegistrationStatus
     */
    public String getRegistrationStatus() {
        return registrationStatus;
    }
    
    /**
     * The on-premises instances registration status: <ul> <li>Deregistered:
     * Include in the resulting list deregistered on-premises instances.</li>
     * <li>Registered: Include in the resulting list registered on-premises
     * instances.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @param registrationStatus The on-premises instances registration status: <ul> <li>Deregistered:
     *         Include in the resulting list deregistered on-premises instances.</li>
     *         <li>Registered: Include in the resulting list registered on-premises
     *         instances.</li> </ul>
     *
     * @see RegistrationStatus
     */
    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
    
    /**
     * The on-premises instances registration status: <ul> <li>Deregistered:
     * Include in the resulting list deregistered on-premises instances.</li>
     * <li>Registered: Include in the resulting list registered on-premises
     * instances.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @param registrationStatus The on-premises instances registration status: <ul> <li>Deregistered:
     *         Include in the resulting list deregistered on-premises instances.</li>
     *         <li>Registered: Include in the resulting list registered on-premises
     *         instances.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RegistrationStatus
     */
    public ListOnPremisesInstancesRequest withRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * The on-premises instances registration status: <ul> <li>Deregistered:
     * Include in the resulting list deregistered on-premises instances.</li>
     * <li>Registered: Include in the resulting list registered on-premises
     * instances.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @param registrationStatus The on-premises instances registration status: <ul> <li>Deregistered:
     *         Include in the resulting list deregistered on-premises instances.</li>
     *         <li>Registered: Include in the resulting list registered on-premises
     *         instances.</li> </ul>
     *
     * @see RegistrationStatus
     */
    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
    }
    
    /**
     * The on-premises instances registration status: <ul> <li>Deregistered:
     * Include in the resulting list deregistered on-premises instances.</li>
     * <li>Registered: Include in the resulting list registered on-premises
     * instances.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @param registrationStatus The on-premises instances registration status: <ul> <li>Deregistered:
     *         Include in the resulting list deregistered on-premises instances.</li>
     *         <li>Registered: Include in the resulting list registered on-premises
     *         instances.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RegistrationStatus
     */
    public ListOnPremisesInstancesRequest withRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
        return this;
    }

    /**
     * The on-premises instance tags that will be used to restrict the
     * corresponding on-premises instance names that are returned.
     *
     * @return The on-premises instance tags that will be used to restrict the
     *         corresponding on-premises instance names that are returned.
     */
    public java.util.List<TagFilter> getTagFilters() {
        if (tagFilters == null) {
              tagFilters = new com.amazonaws.internal.ListWithAutoConstructFlag<TagFilter>();
              tagFilters.setAutoConstruct(true);
        }
        return tagFilters;
    }
    
    /**
     * The on-premises instance tags that will be used to restrict the
     * corresponding on-premises instance names that are returned.
     *
     * @param tagFilters The on-premises instance tags that will be used to restrict the
     *         corresponding on-premises instance names that are returned.
     */
    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TagFilter> tagFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TagFilter>(tagFilters.size());
        tagFiltersCopy.addAll(tagFilters);
        this.tagFilters = tagFiltersCopy;
    }
    
    /**
     * The on-premises instance tags that will be used to restrict the
     * corresponding on-premises instance names that are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagFilters The on-premises instance tags that will be used to restrict the
     *         corresponding on-premises instance names that are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOnPremisesInstancesRequest withTagFilters(TagFilter... tagFilters) {
        if (getTagFilters() == null) setTagFilters(new java.util.ArrayList<TagFilter>(tagFilters.length));
        for (TagFilter value : tagFilters) {
            getTagFilters().add(value);
        }
        return this;
    }
    
    /**
     * The on-premises instance tags that will be used to restrict the
     * corresponding on-premises instance names that are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagFilters The on-premises instance tags that will be used to restrict the
     *         corresponding on-premises instance names that are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOnPremisesInstancesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TagFilter> tagFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TagFilter>(tagFilters.size());
            tagFiltersCopy.addAll(tagFilters);
            this.tagFilters = tagFiltersCopy;
        }

        return this;
    }

    /**
     * An identifier that was returned from the previous list on-premises
     * instances call, which can be used to return the next set of
     * on-premises instances in the list.
     *
     * @return An identifier that was returned from the previous list on-premises
     *         instances call, which can be used to return the next set of
     *         on-premises instances in the list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list on-premises
     * instances call, which can be used to return the next set of
     * on-premises instances in the list.
     *
     * @param nextToken An identifier that was returned from the previous list on-premises
     *         instances call, which can be used to return the next set of
     *         on-premises instances in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list on-premises
     * instances call, which can be used to return the next set of
     * on-premises instances in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An identifier that was returned from the previous list on-premises
     *         instances call, which can be used to return the next set of
     *         on-premises instances in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOnPremisesInstancesRequest withNextToken(String nextToken) {
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
        if (getRegistrationStatus() != null) sb.append("RegistrationStatus: " + getRegistrationStatus() + ",");
        if (getTagFilters() != null) sb.append("TagFilters: " + getTagFilters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode()); 
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListOnPremisesInstancesRequest == false) return false;
        ListOnPremisesInstancesRequest other = (ListOnPremisesInstancesRequest)obj;
        
        if (other.getRegistrationStatus() == null ^ this.getRegistrationStatus() == null) return false;
        if (other.getRegistrationStatus() != null && other.getRegistrationStatus().equals(this.getRegistrationStatus()) == false) return false; 
        if (other.getTagFilters() == null ^ this.getTagFilters() == null) return false;
        if (other.getTagFilters() != null && other.getTagFilters().equals(this.getTagFilters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListOnPremisesInstancesRequest clone() {
        
            return (ListOnPremisesInstancesRequest) super.clone();
    }

}
    
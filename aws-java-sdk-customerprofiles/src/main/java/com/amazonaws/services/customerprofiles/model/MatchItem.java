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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Match group object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/MatchItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifiers for this group of profiles that match.
     * </p>
     */
    private String matchId;
    /**
     * <p>
     * A list of identifiers for profiles that match.
     * </p>
     */
    private java.util.List<String> profileIds;

    /**
     * <p>
     * The unique identifiers for this group of profiles that match.
     * </p>
     * 
     * @param matchId
     *        The unique identifiers for this group of profiles that match.
     */

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    /**
     * <p>
     * The unique identifiers for this group of profiles that match.
     * </p>
     * 
     * @return The unique identifiers for this group of profiles that match.
     */

    public String getMatchId() {
        return this.matchId;
    }

    /**
     * <p>
     * The unique identifiers for this group of profiles that match.
     * </p>
     * 
     * @param matchId
     *        The unique identifiers for this group of profiles that match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchItem withMatchId(String matchId) {
        setMatchId(matchId);
        return this;
    }

    /**
     * <p>
     * A list of identifiers for profiles that match.
     * </p>
     * 
     * @return A list of identifiers for profiles that match.
     */

    public java.util.List<String> getProfileIds() {
        return profileIds;
    }

    /**
     * <p>
     * A list of identifiers for profiles that match.
     * </p>
     * 
     * @param profileIds
     *        A list of identifiers for profiles that match.
     */

    public void setProfileIds(java.util.Collection<String> profileIds) {
        if (profileIds == null) {
            this.profileIds = null;
            return;
        }

        this.profileIds = new java.util.ArrayList<String>(profileIds);
    }

    /**
     * <p>
     * A list of identifiers for profiles that match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileIds(java.util.Collection)} or {@link #withProfileIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param profileIds
     *        A list of identifiers for profiles that match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchItem withProfileIds(String... profileIds) {
        if (this.profileIds == null) {
            setProfileIds(new java.util.ArrayList<String>(profileIds.length));
        }
        for (String ele : profileIds) {
            this.profileIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers for profiles that match.
     * </p>
     * 
     * @param profileIds
     *        A list of identifiers for profiles that match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchItem withProfileIds(java.util.Collection<String> profileIds) {
        setProfileIds(profileIds);
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
        if (getMatchId() != null)
            sb.append("MatchId: ").append(getMatchId()).append(",");
        if (getProfileIds() != null)
            sb.append("ProfileIds: ").append(getProfileIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchItem == false)
            return false;
        MatchItem other = (MatchItem) obj;
        if (other.getMatchId() == null ^ this.getMatchId() == null)
            return false;
        if (other.getMatchId() != null && other.getMatchId().equals(this.getMatchId()) == false)
            return false;
        if (other.getProfileIds() == null ^ this.getProfileIds() == null)
            return false;
        if (other.getProfileIds() != null && other.getProfileIds().equals(this.getProfileIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchId() == null) ? 0 : getMatchId().hashCode());
        hashCode = prime * hashCode + ((getProfileIds() == null) ? 0 : getProfileIds().hashCode());
        return hashCode;
    }

    @Override
    public MatchItem clone() {
        try {
            return (MatchItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.MatchItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

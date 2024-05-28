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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines criteria for AMIs that are excluded from lifecycle actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicyDetailExclusionRulesAmis"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyDetailExclusionRulesAmis implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures whether public AMIs are excluded from the lifecycle action.
     * </p>
     */
    private Boolean isPublic;
    /**
     * <p>
     * Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     * </p>
     */
    private java.util.List<String> regions;
    /**
     * <p>
     * Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     * </p>
     */
    private java.util.List<String> sharedAccounts;
    /**
     * <p>
     * Specifies configuration details for Image Builder to exclude the most recent resources from lifecycle actions.
     * </p>
     */
    private LifecyclePolicyDetailExclusionRulesAmisLastLaunched lastLaunched;
    /**
     * <p>
     * Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
     * </p>
     */
    private java.util.Map<String, String> tagMap;

    /**
     * <p>
     * Configures whether public AMIs are excluded from the lifecycle action.
     * </p>
     * 
     * @param isPublic
     *        Configures whether public AMIs are excluded from the lifecycle action.
     */

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * <p>
     * Configures whether public AMIs are excluded from the lifecycle action.
     * </p>
     * 
     * @return Configures whether public AMIs are excluded from the lifecycle action.
     */

    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * <p>
     * Configures whether public AMIs are excluded from the lifecycle action.
     * </p>
     * 
     * @param isPublic
     *        Configures whether public AMIs are excluded from the lifecycle action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis withIsPublic(Boolean isPublic) {
        setIsPublic(isPublic);
        return this;
    }

    /**
     * <p>
     * Configures whether public AMIs are excluded from the lifecycle action.
     * </p>
     * 
     * @return Configures whether public AMIs are excluded from the lifecycle action.
     */

    public Boolean isPublic() {
        return this.isPublic;
    }

    /**
     * <p>
     * Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     * </p>
     * 
     * @return Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     * </p>
     * 
     * @param regions
     *        Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     * </p>
     * 
     * @param regions
     *        Configures Amazon Web Services Regions that are excluded from the lifecycle action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     * </p>
     * 
     * @return Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     */

    public java.util.List<String> getSharedAccounts() {
        return sharedAccounts;
    }

    /**
     * <p>
     * Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     * </p>
     * 
     * @param sharedAccounts
     *        Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     */

    public void setSharedAccounts(java.util.Collection<String> sharedAccounts) {
        if (sharedAccounts == null) {
            this.sharedAccounts = null;
            return;
        }

        this.sharedAccounts = new java.util.ArrayList<String>(sharedAccounts);
    }

    /**
     * <p>
     * Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedAccounts(java.util.Collection)} or {@link #withSharedAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sharedAccounts
     *        Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis withSharedAccounts(String... sharedAccounts) {
        if (this.sharedAccounts == null) {
            setSharedAccounts(new java.util.ArrayList<String>(sharedAccounts.length));
        }
        for (String ele : sharedAccounts) {
            this.sharedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     * </p>
     * 
     * @param sharedAccounts
     *        Specifies Amazon Web Services accounts whose resources are excluded from the lifecycle action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis withSharedAccounts(java.util.Collection<String> sharedAccounts) {
        setSharedAccounts(sharedAccounts);
        return this;
    }

    /**
     * <p>
     * Specifies configuration details for Image Builder to exclude the most recent resources from lifecycle actions.
     * </p>
     * 
     * @param lastLaunched
     *        Specifies configuration details for Image Builder to exclude the most recent resources from lifecycle
     *        actions.
     */

    public void setLastLaunched(LifecyclePolicyDetailExclusionRulesAmisLastLaunched lastLaunched) {
        this.lastLaunched = lastLaunched;
    }

    /**
     * <p>
     * Specifies configuration details for Image Builder to exclude the most recent resources from lifecycle actions.
     * </p>
     * 
     * @return Specifies configuration details for Image Builder to exclude the most recent resources from lifecycle
     *         actions.
     */

    public LifecyclePolicyDetailExclusionRulesAmisLastLaunched getLastLaunched() {
        return this.lastLaunched;
    }

    /**
     * <p>
     * Specifies configuration details for Image Builder to exclude the most recent resources from lifecycle actions.
     * </p>
     * 
     * @param lastLaunched
     *        Specifies configuration details for Image Builder to exclude the most recent resources from lifecycle
     *        actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis withLastLaunched(LifecyclePolicyDetailExclusionRulesAmisLastLaunched lastLaunched) {
        setLastLaunched(lastLaunched);
        return this;
    }

    /**
     * <p>
     * Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
     * </p>
     * 
     * @return Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
     */

    public java.util.Map<String, String> getTagMap() {
        return tagMap;
    }

    /**
     * <p>
     * Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
     * </p>
     * 
     * @param tagMap
     *        Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
     */

    public void setTagMap(java.util.Map<String, String> tagMap) {
        this.tagMap = tagMap;
    }

    /**
     * <p>
     * Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
     * </p>
     * 
     * @param tagMap
     *        Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis withTagMap(java.util.Map<String, String> tagMap) {
        setTagMap(tagMap);
        return this;
    }

    /**
     * Add a single TagMap entry
     *
     * @see LifecyclePolicyDetailExclusionRulesAmis#withTagMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis addTagMapEntry(String key, String value) {
        if (null == this.tagMap) {
            this.tagMap = new java.util.HashMap<String, String>();
        }
        if (this.tagMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tagMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TagMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmis clearTagMapEntries() {
        this.tagMap = null;
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
        if (getIsPublic() != null)
            sb.append("IsPublic: ").append(getIsPublic()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getSharedAccounts() != null)
            sb.append("SharedAccounts: ").append(getSharedAccounts()).append(",");
        if (getLastLaunched() != null)
            sb.append("LastLaunched: ").append(getLastLaunched()).append(",");
        if (getTagMap() != null)
            sb.append("TagMap: ").append(getTagMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyDetailExclusionRulesAmis == false)
            return false;
        LifecyclePolicyDetailExclusionRulesAmis other = (LifecyclePolicyDetailExclusionRulesAmis) obj;
        if (other.getIsPublic() == null ^ this.getIsPublic() == null)
            return false;
        if (other.getIsPublic() != null && other.getIsPublic().equals(this.getIsPublic()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getSharedAccounts() == null ^ this.getSharedAccounts() == null)
            return false;
        if (other.getSharedAccounts() != null && other.getSharedAccounts().equals(this.getSharedAccounts()) == false)
            return false;
        if (other.getLastLaunched() == null ^ this.getLastLaunched() == null)
            return false;
        if (other.getLastLaunched() != null && other.getLastLaunched().equals(this.getLastLaunched()) == false)
            return false;
        if (other.getTagMap() == null ^ this.getTagMap() == null)
            return false;
        if (other.getTagMap() != null && other.getTagMap().equals(this.getTagMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsPublic() == null) ? 0 : getIsPublic().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getSharedAccounts() == null) ? 0 : getSharedAccounts().hashCode());
        hashCode = prime * hashCode + ((getLastLaunched() == null) ? 0 : getLastLaunched().hashCode());
        hashCode = prime * hashCode + ((getTagMap() == null) ? 0 : getTagMap().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyDetailExclusionRulesAmis clone() {
        try {
            return (LifecyclePolicyDetailExclusionRulesAmis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicyDetailExclusionRulesAmisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

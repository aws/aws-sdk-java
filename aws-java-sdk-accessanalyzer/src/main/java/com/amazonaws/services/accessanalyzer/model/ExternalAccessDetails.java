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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an external access finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ExternalAccessDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalAccessDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     */
    private java.util.List<String> action;
    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in an external access finding.
     * </p>
     */
    private java.util.Map<String, String> condition;
    /**
     * <p>
     * Specifies whether the external access finding is public.
     * </p>
     */
    private Boolean isPublic;
    /**
     * <p>
     * The external principal that has access to a resource within the zone of trust.
     * </p>
     */
    private java.util.Map<String, String> principal;
    /**
     * <p>
     * The sources of the external access finding. This indicates how the access that generated the finding is granted.
     * It is populated for Amazon S3 bucket findings.
     * </p>
     */
    private java.util.List<FindingSource> sources;

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     * 
     * @return The action in the analyzed policy statement that an external principal has permission to use.
     */

    public java.util.List<String> getAction() {
        return action;
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     * 
     * @param action
     *        The action in the analyzed policy statement that an external principal has permission to use.
     */

    public void setAction(java.util.Collection<String> action) {
        if (action == null) {
            this.action = null;
            return;
        }

        this.action = new java.util.ArrayList<String>(action);
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAction(java.util.Collection)} or {@link #withAction(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param action
     *        The action in the analyzed policy statement that an external principal has permission to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails withAction(String... action) {
        if (this.action == null) {
            setAction(new java.util.ArrayList<String>(action.length));
        }
        for (String ele : action) {
            this.action.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal has permission to use.
     * </p>
     * 
     * @param action
     *        The action in the analyzed policy statement that an external principal has permission to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails withAction(java.util.Collection<String> action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in an external access finding.
     * </p>
     * 
     * @return The condition in the analyzed policy statement that resulted in an external access finding.
     */

    public java.util.Map<String, String> getCondition() {
        return condition;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in an external access finding.
     * </p>
     * 
     * @param condition
     *        The condition in the analyzed policy statement that resulted in an external access finding.
     */

    public void setCondition(java.util.Map<String, String> condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in an external access finding.
     * </p>
     * 
     * @param condition
     *        The condition in the analyzed policy statement that resulted in an external access finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails withCondition(java.util.Map<String, String> condition) {
        setCondition(condition);
        return this;
    }

    /**
     * Add a single Condition entry
     *
     * @see ExternalAccessDetails#withCondition
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails addConditionEntry(String key, String value) {
        if (null == this.condition) {
            this.condition = new java.util.HashMap<String, String>();
        }
        if (this.condition.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.condition.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Condition.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails clearConditionEntries() {
        this.condition = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the external access finding is public.
     * </p>
     * 
     * @param isPublic
     *        Specifies whether the external access finding is public.
     */

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * <p>
     * Specifies whether the external access finding is public.
     * </p>
     * 
     * @return Specifies whether the external access finding is public.
     */

    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * <p>
     * Specifies whether the external access finding is public.
     * </p>
     * 
     * @param isPublic
     *        Specifies whether the external access finding is public.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails withIsPublic(Boolean isPublic) {
        setIsPublic(isPublic);
        return this;
    }

    /**
     * <p>
     * Specifies whether the external access finding is public.
     * </p>
     * 
     * @return Specifies whether the external access finding is public.
     */

    public Boolean isPublic() {
        return this.isPublic;
    }

    /**
     * <p>
     * The external principal that has access to a resource within the zone of trust.
     * </p>
     * 
     * @return The external principal that has access to a resource within the zone of trust.
     */

    public java.util.Map<String, String> getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The external principal that has access to a resource within the zone of trust.
     * </p>
     * 
     * @param principal
     *        The external principal that has access to a resource within the zone of trust.
     */

    public void setPrincipal(java.util.Map<String, String> principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The external principal that has access to a resource within the zone of trust.
     * </p>
     * 
     * @param principal
     *        The external principal that has access to a resource within the zone of trust.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails withPrincipal(java.util.Map<String, String> principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * Add a single Principal entry
     *
     * @see ExternalAccessDetails#withPrincipal
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails addPrincipalEntry(String key, String value) {
        if (null == this.principal) {
            this.principal = new java.util.HashMap<String, String>();
        }
        if (this.principal.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.principal.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Principal.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails clearPrincipalEntries() {
        this.principal = null;
        return this;
    }

    /**
     * <p>
     * The sources of the external access finding. This indicates how the access that generated the finding is granted.
     * It is populated for Amazon S3 bucket findings.
     * </p>
     * 
     * @return The sources of the external access finding. This indicates how the access that generated the finding is
     *         granted. It is populated for Amazon S3 bucket findings.
     */

    public java.util.List<FindingSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The sources of the external access finding. This indicates how the access that generated the finding is granted.
     * It is populated for Amazon S3 bucket findings.
     * </p>
     * 
     * @param sources
     *        The sources of the external access finding. This indicates how the access that generated the finding is
     *        granted. It is populated for Amazon S3 bucket findings.
     */

    public void setSources(java.util.Collection<FindingSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<FindingSource>(sources);
    }

    /**
     * <p>
     * The sources of the external access finding. This indicates how the access that generated the finding is granted.
     * It is populated for Amazon S3 bucket findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The sources of the external access finding. This indicates how the access that generated the finding is
     *        granted. It is populated for Amazon S3 bucket findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails withSources(FindingSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<FindingSource>(sources.length));
        }
        for (FindingSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sources of the external access finding. This indicates how the access that generated the finding is granted.
     * It is populated for Amazon S3 bucket findings.
     * </p>
     * 
     * @param sources
     *        The sources of the external access finding. This indicates how the access that generated the finding is
     *        granted. It is populated for Amazon S3 bucket findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalAccessDetails withSources(java.util.Collection<FindingSource> sources) {
        setSources(sources);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getIsPublic() != null)
            sb.append("IsPublic: ").append(getIsPublic()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalAccessDetails == false)
            return false;
        ExternalAccessDetails other = (ExternalAccessDetails) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getIsPublic() == null ^ this.getIsPublic() == null)
            return false;
        if (other.getIsPublic() != null && other.getIsPublic().equals(this.getIsPublic()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getIsPublic() == null) ? 0 : getIsPublic().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public ExternalAccessDetails clone() {
        try {
            return (ExternalAccessDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.ExternalAccessDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

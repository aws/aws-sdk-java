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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Web Services Threat Intel Group (ATIG) details for a specific vulnerability.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AtigData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AtigData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time this vulnerability was first observed.
     * </p>
     */
    private java.util.Date firstSeen;
    /**
     * <p>
     * The date and time this vulnerability was last observed.
     * </p>
     */
    private java.util.Date lastSeen;
    /**
     * <p>
     * The commercial sectors this vulnerability targets.
     * </p>
     */
    private java.util.List<String> targets;
    /**
     * <p>
     * The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     * associated with vulnerability.
     * </p>
     */
    private java.util.List<String> ttps;

    /**
     * <p>
     * The date and time this vulnerability was first observed.
     * </p>
     * 
     * @param firstSeen
     *        The date and time this vulnerability was first observed.
     */

    public void setFirstSeen(java.util.Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * <p>
     * The date and time this vulnerability was first observed.
     * </p>
     * 
     * @return The date and time this vulnerability was first observed.
     */

    public java.util.Date getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * <p>
     * The date and time this vulnerability was first observed.
     * </p>
     * 
     * @param firstSeen
     *        The date and time this vulnerability was first observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AtigData withFirstSeen(java.util.Date firstSeen) {
        setFirstSeen(firstSeen);
        return this;
    }

    /**
     * <p>
     * The date and time this vulnerability was last observed.
     * </p>
     * 
     * @param lastSeen
     *        The date and time this vulnerability was last observed.
     */

    public void setLastSeen(java.util.Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * <p>
     * The date and time this vulnerability was last observed.
     * </p>
     * 
     * @return The date and time this vulnerability was last observed.
     */

    public java.util.Date getLastSeen() {
        return this.lastSeen;
    }

    /**
     * <p>
     * The date and time this vulnerability was last observed.
     * </p>
     * 
     * @param lastSeen
     *        The date and time this vulnerability was last observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AtigData withLastSeen(java.util.Date lastSeen) {
        setLastSeen(lastSeen);
        return this;
    }

    /**
     * <p>
     * The commercial sectors this vulnerability targets.
     * </p>
     * 
     * @return The commercial sectors this vulnerability targets.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The commercial sectors this vulnerability targets.
     * </p>
     * 
     * @param targets
     *        The commercial sectors this vulnerability targets.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The commercial sectors this vulnerability targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The commercial sectors this vulnerability targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AtigData withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The commercial sectors this vulnerability targets.
     * </p>
     * 
     * @param targets
     *        The commercial sectors this vulnerability targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AtigData withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     * associated with vulnerability.
     * </p>
     * 
     * @return The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     *         associated with vulnerability.
     */

    public java.util.List<String> getTtps() {
        return ttps;
    }

    /**
     * <p>
     * The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     * associated with vulnerability.
     * </p>
     * 
     * @param ttps
     *        The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     *        associated with vulnerability.
     */

    public void setTtps(java.util.Collection<String> ttps) {
        if (ttps == null) {
            this.ttps = null;
            return;
        }

        this.ttps = new java.util.ArrayList<String>(ttps);
    }

    /**
     * <p>
     * The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     * associated with vulnerability.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTtps(java.util.Collection)} or {@link #withTtps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ttps
     *        The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     *        associated with vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AtigData withTtps(String... ttps) {
        if (this.ttps == null) {
            setTtps(new java.util.ArrayList<String>(ttps.length));
        }
        for (String ele : ttps) {
            this.ttps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     * associated with vulnerability.
     * </p>
     * 
     * @param ttps
     *        The <a href="https://attack.mitre.org/">MITRE ATT&amp;CK</a> tactics, techniques, and procedures (TTPs)
     *        associated with vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AtigData withTtps(java.util.Collection<String> ttps) {
        setTtps(ttps);
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
        if (getFirstSeen() != null)
            sb.append("FirstSeen: ").append(getFirstSeen()).append(",");
        if (getLastSeen() != null)
            sb.append("LastSeen: ").append(getLastSeen()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTtps() != null)
            sb.append("Ttps: ").append(getTtps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AtigData == false)
            return false;
        AtigData other = (AtigData) obj;
        if (other.getFirstSeen() == null ^ this.getFirstSeen() == null)
            return false;
        if (other.getFirstSeen() != null && other.getFirstSeen().equals(this.getFirstSeen()) == false)
            return false;
        if (other.getLastSeen() == null ^ this.getLastSeen() == null)
            return false;
        if (other.getLastSeen() != null && other.getLastSeen().equals(this.getLastSeen()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTtps() == null ^ this.getTtps() == null)
            return false;
        if (other.getTtps() != null && other.getTtps().equals(this.getTtps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        hashCode = prime * hashCode + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTtps() == null) ? 0 : getTtps().hashCode());
        return hashCode;
    }

    @Override
    public AtigData clone() {
        try {
            return (AtigData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AtigDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for one or more replication rules. A replication configuration must have at least one rule and you can
 * add up to 100 rules. The maximum size of a replication configuration is 128 KB.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ReplicationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that S3 on Outposts assumes when
     * replicating objects. For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-how-setup.html">Setting up
     * replication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A container for one or more replication rules. A replication configuration must have at least one rule and can
     * contain an array of 100 rules at the most.
     * </p>
     */
    private java.util.List<ReplicationRule> rules;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that S3 on Outposts assumes when
     * replicating objects. For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-how-setup.html">Setting up
     * replication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that S3 on Outposts
     *        assumes when replicating objects. For information about S3 replication on Outposts configuration, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-how-setup.html">Setting
     *        up replication</a> in the <i>Amazon S3 User Guide</i>.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that S3 on Outposts assumes when
     * replicating objects. For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-how-setup.html">Setting up
     * replication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that S3 on Outposts
     *         assumes when replicating objects. For information about S3 replication on Outposts configuration, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-how-setup.html">Setting
     *         up replication</a> in the <i>Amazon S3 User Guide</i>.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that S3 on Outposts assumes when
     * replicating objects. For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-how-setup.html">Setting up
     * replication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that S3 on Outposts
     *        assumes when replicating objects. For information about S3 replication on Outposts configuration, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-how-setup.html">Setting
     *        up replication</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfiguration withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * A container for one or more replication rules. A replication configuration must have at least one rule and can
     * contain an array of 100 rules at the most.
     * </p>
     * 
     * @return A container for one or more replication rules. A replication configuration must have at least one rule
     *         and can contain an array of 100 rules at the most.
     */

    public java.util.List<ReplicationRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * A container for one or more replication rules. A replication configuration must have at least one rule and can
     * contain an array of 100 rules at the most.
     * </p>
     * 
     * @param rules
     *        A container for one or more replication rules. A replication configuration must have at least one rule and
     *        can contain an array of 100 rules at the most.
     */

    public void setRules(java.util.Collection<ReplicationRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ReplicationRule>(rules);
    }

    /**
     * <p>
     * A container for one or more replication rules. A replication configuration must have at least one rule and can
     * contain an array of 100 rules at the most.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        A container for one or more replication rules. A replication configuration must have at least one rule and
     *        can contain an array of 100 rules at the most.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfiguration withRules(ReplicationRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<ReplicationRule>(rules.length));
        }
        for (ReplicationRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container for one or more replication rules. A replication configuration must have at least one rule and can
     * contain an array of 100 rules at the most.
     * </p>
     * 
     * @param rules
     *        A container for one or more replication rules. A replication configuration must have at least one rule and
     *        can contain an array of 100 rules at the most.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfiguration withRules(java.util.Collection<ReplicationRule> rules) {
        setRules(rules);
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
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationConfiguration == false)
            return false;
        ReplicationConfiguration other = (ReplicationConfiguration) obj;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationConfiguration clone() {
        try {
            return (ReplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

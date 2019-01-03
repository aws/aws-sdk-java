/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Container for server-side encryption configuration rules. Currently S3 supports one rule only.
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/ServerSideEncryptionConfiguration" target="_top">AWS API
 * Documentation</a>
 */
public class ServerSideEncryptionConfiguration implements Serializable, Cloneable {

    private List<ServerSideEncryptionRule> rules;

    /**
     * @return Currently configured SSE rules.
     */
    public List<ServerSideEncryptionRule> getRules() {
        return rules;
    }

    /**
     * Sets the list of SSE configuration rules.
     *
     * @param rules New rules.
     */
    public void setRules(Collection<ServerSideEncryptionRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new ArrayList<ServerSideEncryptionRule>(rules);
    }

    /**
     * Sets the list of SSE configuration rules.
     *
     * @param rules New rules.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionConfiguration withRules(ServerSideEncryptionRule... rules) {
        if (this.rules == null) {
            setRules(new ArrayList<ServerSideEncryptionRule>(rules.length));
        }
        for (ServerSideEncryptionRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * Sets the list of SSE configuration rules.
     *
     * @param rules New rules.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionConfiguration withRules(Collection<ServerSideEncryptionRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRules() != null) {
            sb.append("Rules: ").append(getRules()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof ServerSideEncryptionConfiguration == false) {
            return false;
        }
        ServerSideEncryptionConfiguration other = (ServerSideEncryptionConfiguration) obj;
        if (other.getRules() == null ^ this.getRules() == null) {
            return false;
        }
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public ServerSideEncryptionConfiguration clone() {
        try {
            return (ServerSideEncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

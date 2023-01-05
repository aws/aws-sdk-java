/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of objects representing the replication destinations and repository filters for a replication configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ReplicationRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects representing the destination for a replication rule.
     * </p>
     */
    private java.util.List<ReplicationDestination> destinations;
    /**
     * <p>
     * An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     * replication rule provides a method for controlling which repositories in a private registry are replicated.
     * </p>
     */
    private java.util.List<RepositoryFilter> repositoryFilters;

    /**
     * <p>
     * An array of objects representing the destination for a replication rule.
     * </p>
     * 
     * @return An array of objects representing the destination for a replication rule.
     */

    public java.util.List<ReplicationDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * An array of objects representing the destination for a replication rule.
     * </p>
     * 
     * @param destinations
     *        An array of objects representing the destination for a replication rule.
     */

    public void setDestinations(java.util.Collection<ReplicationDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<ReplicationDestination>(destinations);
    }

    /**
     * <p>
     * An array of objects representing the destination for a replication rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        An array of objects representing the destination for a replication rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withDestinations(ReplicationDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<ReplicationDestination>(destinations.length));
        }
        for (ReplicationDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects representing the destination for a replication rule.
     * </p>
     * 
     * @param destinations
     *        An array of objects representing the destination for a replication rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withDestinations(java.util.Collection<ReplicationDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     * replication rule provides a method for controlling which repositories in a private registry are replicated.
     * </p>
     * 
     * @return An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     *         replication rule provides a method for controlling which repositories in a private registry are
     *         replicated.
     */

    public java.util.List<RepositoryFilter> getRepositoryFilters() {
        return repositoryFilters;
    }

    /**
     * <p>
     * An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     * replication rule provides a method for controlling which repositories in a private registry are replicated.
     * </p>
     * 
     * @param repositoryFilters
     *        An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     *        replication rule provides a method for controlling which repositories in a private registry are
     *        replicated.
     */

    public void setRepositoryFilters(java.util.Collection<RepositoryFilter> repositoryFilters) {
        if (repositoryFilters == null) {
            this.repositoryFilters = null;
            return;
        }

        this.repositoryFilters = new java.util.ArrayList<RepositoryFilter>(repositoryFilters);
    }

    /**
     * <p>
     * An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     * replication rule provides a method for controlling which repositories in a private registry are replicated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryFilters(java.util.Collection)} or {@link #withRepositoryFilters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param repositoryFilters
     *        An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     *        replication rule provides a method for controlling which repositories in a private registry are
     *        replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withRepositoryFilters(RepositoryFilter... repositoryFilters) {
        if (this.repositoryFilters == null) {
            setRepositoryFilters(new java.util.ArrayList<RepositoryFilter>(repositoryFilters.length));
        }
        for (RepositoryFilter ele : repositoryFilters) {
            this.repositoryFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     * replication rule provides a method for controlling which repositories in a private registry are replicated.
     * </p>
     * 
     * @param repositoryFilters
     *        An array of objects representing the filters for a replication rule. Specifying a repository filter for a
     *        replication rule provides a method for controlling which repositories in a private registry are
     *        replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withRepositoryFilters(java.util.Collection<RepositoryFilter> repositoryFilters) {
        setRepositoryFilters(repositoryFilters);
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getRepositoryFilters() != null)
            sb.append("RepositoryFilters: ").append(getRepositoryFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationRule == false)
            return false;
        ReplicationRule other = (ReplicationRule) obj;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getRepositoryFilters() == null ^ this.getRepositoryFilters() == null)
            return false;
        if (other.getRepositoryFilters() != null && other.getRepositoryFilters().equals(this.getRepositoryFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getRepositoryFilters() == null) ? 0 : getRepositoryFilters().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationRule clone() {
        try {
            return (ReplicationRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ReplicationRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

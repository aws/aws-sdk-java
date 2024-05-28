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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An AWS resource used in media workflows.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MediaResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaResource implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<MediaResourceNeighbor> destinations;
    /** The logical name of an AWS media resource. */
    private String name;

    private java.util.List<MediaResourceNeighbor> sources;

    /**
     * @return
     */

    public java.util.List<MediaResourceNeighbor> getDestinations() {
        return destinations;
    }

    /**
     * @param destinations
     */

    public void setDestinations(java.util.Collection<MediaResourceNeighbor> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<MediaResourceNeighbor>(destinations);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaResource withDestinations(MediaResourceNeighbor... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<MediaResourceNeighbor>(destinations.length));
        }
        for (MediaResourceNeighbor ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * @param destinations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaResource withDestinations(java.util.Collection<MediaResourceNeighbor> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The logical name of an AWS media resource.
     * 
     * @param name
     *        The logical name of an AWS media resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The logical name of an AWS media resource.
     * 
     * @return The logical name of an AWS media resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The logical name of an AWS media resource.
     * 
     * @param name
     *        The logical name of an AWS media resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<MediaResourceNeighbor> getSources() {
        return sources;
    }

    /**
     * @param sources
     */

    public void setSources(java.util.Collection<MediaResourceNeighbor> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<MediaResourceNeighbor>(sources);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaResource withSources(MediaResourceNeighbor... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<MediaResourceNeighbor>(sources.length));
        }
        for (MediaResourceNeighbor ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * @param sources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaResource withSources(java.util.Collection<MediaResourceNeighbor> sources) {
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof MediaResource == false)
            return false;
        MediaResource other = (MediaResource) obj;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public MediaResource clone() {
        try {
            return (MediaResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MediaResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

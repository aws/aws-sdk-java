/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * The name of the input
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations can be
     * specified. Note: there are currently no settings required for PUSH-type inputs
     */
    private java.util.List<InputDestinationRequest> destinations;
    /** A list of security groups referenced by IDs to attach to the input. */
    private java.util.List<String> inputSecurityGroups;
    /** Name of the input. */
    private String name;
    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries
     */
    private String requestId;
    /**
     * settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can be
     * specified
     */
    private java.util.List<InputSourceRequest> sources;

    private String type;

    /**
     * settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations can be
     * specified. Note: there are currently no settings required for PUSH-type inputs
     * 
     * @return settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations
     *         can be specified. Note: there are currently no settings required for PUSH-type inputs
     */

    public java.util.List<InputDestinationRequest> getDestinations() {
        return destinations;
    }

    /**
     * settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations can be
     * specified. Note: there are currently no settings required for PUSH-type inputs
     * 
     * @param destinations
     *        settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations can
     *        be specified. Note: there are currently no settings required for PUSH-type inputs
     */

    public void setDestinations(java.util.Collection<InputDestinationRequest> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<InputDestinationRequest>(destinations);
    }

    /**
     * settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations can be
     * specified. Note: there are currently no settings required for PUSH-type inputs
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations can
     *        be specified. Note: there are currently no settings required for PUSH-type inputs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withDestinations(InputDestinationRequest... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<InputDestinationRequest>(destinations.length));
        }
        for (InputDestinationRequest ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations can be
     * specified. Note: there are currently no settings required for PUSH-type inputs
     * 
     * @param destinations
     *        settings required for PUSH-type inputs; one per redundancy group. Only one of sources and destinations can
     *        be specified. Note: there are currently no settings required for PUSH-type inputs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withDestinations(java.util.Collection<InputDestinationRequest> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * A list of security groups referenced by IDs to attach to the input.
     * 
     * @return A list of security groups referenced by IDs to attach to the input.
     */

    public java.util.List<String> getInputSecurityGroups() {
        return inputSecurityGroups;
    }

    /**
     * A list of security groups referenced by IDs to attach to the input.
     * 
     * @param inputSecurityGroups
     *        A list of security groups referenced by IDs to attach to the input.
     */

    public void setInputSecurityGroups(java.util.Collection<String> inputSecurityGroups) {
        if (inputSecurityGroups == null) {
            this.inputSecurityGroups = null;
            return;
        }

        this.inputSecurityGroups = new java.util.ArrayList<String>(inputSecurityGroups);
    }

    /**
     * A list of security groups referenced by IDs to attach to the input.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputSecurityGroups(java.util.Collection)} or {@link #withInputSecurityGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inputSecurityGroups
     *        A list of security groups referenced by IDs to attach to the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withInputSecurityGroups(String... inputSecurityGroups) {
        if (this.inputSecurityGroups == null) {
            setInputSecurityGroups(new java.util.ArrayList<String>(inputSecurityGroups.length));
        }
        for (String ele : inputSecurityGroups) {
            this.inputSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * A list of security groups referenced by IDs to attach to the input.
     * 
     * @param inputSecurityGroups
     *        A list of security groups referenced by IDs to attach to the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withInputSecurityGroups(java.util.Collection<String> inputSecurityGroups) {
        setInputSecurityGroups(inputSecurityGroups);
        return this;
    }

    /**
     * Name of the input.
     * 
     * @param name
     *        Name of the input.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the input.
     * 
     * @return Name of the input.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name of the input.
     * 
     * @param name
     *        Name of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries
     * 
     * @param requestId
     *        Unique identifier of the request to ensure the request is handled exactly once in case of retries
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries
     * 
     * @return Unique identifier of the request to ensure the request is handled exactly once in case of retries
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries
     * 
     * @param requestId
     *        Unique identifier of the request to ensure the request is handled exactly once in case of retries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can be
     * specified
     * 
     * @return settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can
     *         be specified
     */

    public java.util.List<InputSourceRequest> getSources() {
        return sources;
    }

    /**
     * settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can be
     * specified
     * 
     * @param sources
     *        settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can
     *        be specified
     */

    public void setSources(java.util.Collection<InputSourceRequest> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<InputSourceRequest>(sources);
    }

    /**
     * settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can be
     * specified
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can
     *        be specified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withSources(InputSourceRequest... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<InputSourceRequest>(sources.length));
        }
        for (InputSourceRequest ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can be
     * specified
     * 
     * @param sources
     *        settings required for PULL-type inputs; one per redundancy group Only one of sources and destinations can
     *        be specified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withSources(java.util.Collection<InputSourceRequest> sources) {
        setSources(sources);
        return this;
    }

    /**
     * @param type
     * @see InputType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see InputType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public CreateInputRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public CreateInputRequest withType(InputType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getInputSecurityGroups() != null)
            sb.append("InputSecurityGroups: ").append(getInputSecurityGroups()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInputRequest == false)
            return false;
        CreateInputRequest other = (CreateInputRequest) obj;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getInputSecurityGroups() == null ^ this.getInputSecurityGroups() == null)
            return false;
        if (other.getInputSecurityGroups() != null && other.getInputSecurityGroups().equals(this.getInputSecurityGroups()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getInputSecurityGroups() == null) ? 0 : getInputSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateInputRequest clone() {
        return (CreateInputRequest) super.clone();
    }

}

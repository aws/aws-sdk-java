/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /** Destination settings for PUSH type inputs. */
    private java.util.List<InputDestinationRequest> destinations;
    /** A list of security groups referenced by IDs to attach to the input. */
    private java.util.List<String> inputSecurityGroups;
    /**
     * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow and
     * presently, as many as two. The only requirement is when you have more than one is that each Flow is in a separate
     * Availability Zone as this ensures your EML input is redundant to AZ issues.
     */
    private java.util.List<MediaConnectFlowRequest> mediaConnectFlows;
    /** Name of the input. */
    private String name;
    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     */
    private String requestId;
    /** The Amazon Resource Name (ARN) of the role this input assumes during and after creation. */
    private String roleArn;
    /**
     * The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for redundancy. Only
     * specify sources for PULL type Inputs. Leave Destinations empty.
     */
    private java.util.List<InputSourceRequest> sources;
    /** A collection of key-value pairs. */
    private java.util.Map<String, String> tags;

    private String type;

    private InputVpcRequest vpc;

    /**
     * Destination settings for PUSH type inputs.
     * 
     * @return Destination settings for PUSH type inputs.
     */

    public java.util.List<InputDestinationRequest> getDestinations() {
        return destinations;
    }

    /**
     * Destination settings for PUSH type inputs.
     * 
     * @param destinations
     *        Destination settings for PUSH type inputs.
     */

    public void setDestinations(java.util.Collection<InputDestinationRequest> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<InputDestinationRequest>(destinations);
    }

    /**
     * Destination settings for PUSH type inputs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        Destination settings for PUSH type inputs.
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
     * Destination settings for PUSH type inputs.
     * 
     * @param destinations
     *        Destination settings for PUSH type inputs.
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
     * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow and
     * presently, as many as two. The only requirement is when you have more than one is that each Flow is in a separate
     * Availability Zone as this ensures your EML input is redundant to AZ issues.
     * 
     * @return A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow
     *         and presently, as many as two. The only requirement is when you have more than one is that each Flow is
     *         in a separate Availability Zone as this ensures your EML input is redundant to AZ issues.
     */

    public java.util.List<MediaConnectFlowRequest> getMediaConnectFlows() {
        return mediaConnectFlows;
    }

    /**
     * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow and
     * presently, as many as two. The only requirement is when you have more than one is that each Flow is in a separate
     * Availability Zone as this ensures your EML input is redundant to AZ issues.
     * 
     * @param mediaConnectFlows
     *        A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow
     *        and presently, as many as two. The only requirement is when you have more than one is that each Flow is in
     *        a separate Availability Zone as this ensures your EML input is redundant to AZ issues.
     */

    public void setMediaConnectFlows(java.util.Collection<MediaConnectFlowRequest> mediaConnectFlows) {
        if (mediaConnectFlows == null) {
            this.mediaConnectFlows = null;
            return;
        }

        this.mediaConnectFlows = new java.util.ArrayList<MediaConnectFlowRequest>(mediaConnectFlows);
    }

    /**
     * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow and
     * presently, as many as two. The only requirement is when you have more than one is that each Flow is in a separate
     * Availability Zone as this ensures your EML input is redundant to AZ issues.
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaConnectFlows(java.util.Collection)} or {@link #withMediaConnectFlows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param mediaConnectFlows
     *        A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow
     *        and presently, as many as two. The only requirement is when you have more than one is that each Flow is in
     *        a separate Availability Zone as this ensures your EML input is redundant to AZ issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withMediaConnectFlows(MediaConnectFlowRequest... mediaConnectFlows) {
        if (this.mediaConnectFlows == null) {
            setMediaConnectFlows(new java.util.ArrayList<MediaConnectFlowRequest>(mediaConnectFlows.length));
        }
        for (MediaConnectFlowRequest ele : mediaConnectFlows) {
            this.mediaConnectFlows.add(ele);
        }
        return this;
    }

    /**
     * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow and
     * presently, as many as two. The only requirement is when you have more than one is that each Flow is in a separate
     * Availability Zone as this ensures your EML input is redundant to AZ issues.
     * 
     * @param mediaConnectFlows
     *        A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one Flow
     *        and presently, as many as two. The only requirement is when you have more than one is that each Flow is in
     *        a separate Availability Zone as this ensures your EML input is redundant to AZ issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withMediaConnectFlows(java.util.Collection<MediaConnectFlowRequest> mediaConnectFlows) {
        setMediaConnectFlows(mediaConnectFlows);
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
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     * 
     * @param requestId
     *        Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     * 
     * @return Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     * 
     * @param requestId
     *        Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     * 
     * @return The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for redundancy. Only
     * specify sources for PULL type Inputs. Leave Destinations empty.
     * 
     * @return The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for
     *         redundancy. Only specify sources for PULL type Inputs. Leave Destinations empty.
     */

    public java.util.List<InputSourceRequest> getSources() {
        return sources;
    }

    /**
     * The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for redundancy. Only
     * specify sources for PULL type Inputs. Leave Destinations empty.
     * 
     * @param sources
     *        The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for redundancy.
     *        Only specify sources for PULL type Inputs. Leave Destinations empty.
     */

    public void setSources(java.util.Collection<InputSourceRequest> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<InputSourceRequest>(sources);
    }

    /**
     * The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for redundancy. Only
     * specify sources for PULL type Inputs. Leave Destinations empty.
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for redundancy.
     *        Only specify sources for PULL type Inputs. Leave Destinations empty.
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
     * The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for redundancy. Only
     * specify sources for PULL type Inputs. Leave Destinations empty.
     * 
     * @param sources
     *        The source URLs for a PULL-type input. Every PULL type input needs exactly two source URLs for redundancy.
     *        Only specify sources for PULL type Inputs. Leave Destinations empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withSources(java.util.Collection<InputSourceRequest> sources) {
        setSources(sources);
        return this;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @return A collection of key-value pairs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateInputRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest clearTagsEntries() {
        this.tags = null;
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
     * @param vpc
     */

    public void setVpc(InputVpcRequest vpc) {
        this.vpc = vpc;
    }

    /**
     * @return
     */

    public InputVpcRequest getVpc() {
        return this.vpc;
    }

    /**
     * @param vpc
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withVpc(InputVpcRequest vpc) {
        setVpc(vpc);
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
        if (getInputSecurityGroups() != null)
            sb.append("InputSecurityGroups: ").append(getInputSecurityGroups()).append(",");
        if (getMediaConnectFlows() != null)
            sb.append("MediaConnectFlows: ").append(getMediaConnectFlows()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc());
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
        if (other.getMediaConnectFlows() == null ^ this.getMediaConnectFlows() == null)
            return false;
        if (other.getMediaConnectFlows() != null && other.getMediaConnectFlows().equals(this.getMediaConnectFlows()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getInputSecurityGroups() == null) ? 0 : getInputSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getMediaConnectFlows() == null) ? 0 : getMediaConnectFlows().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        return hashCode;
    }

    @Override
    public CreateInputRequest clone() {
        return (CreateInputRequest) super.clone();
    }

}

/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#createTopic(CreateTopicRequest) CreateTopic operation}.
 * <p>
 * The <code>CreateTopic</code> action creates a topic to which notifications can be published. Users can create at most 100 topics. For more
 * information, see <a href="http://aws.amazon.com/sns/"> http://aws.amazon.com/sns </a> . This action is idempotent, so if the requester already owns a
 * topic with the specified name, that topic's ARN is returned without creating a new topic.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#createTopic(CreateTopicRequest)
 */
public class CreateTopicRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the topic you want to create. <p>Constraints: Topic names
     * must be made up of only uppercase and lowercase ASCII letters,
     * numbers, underscores, and hyphens, and must be between 1 and 256
     * characters long.
     */
    private String name;

    /**
     * Default constructor for a new CreateTopicRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateTopicRequest() {}
    
    /**
     * Constructs a new CreateTopicRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the topic you want to create. <p>Constraints:
     * Topic names must be made up of only uppercase and lowercase ASCII
     * letters, numbers, underscores, and hyphens, and must be between 1 and
     * 256 characters long.
     */
    public CreateTopicRequest(String name) {
        setName(name);
    }

    /**
     * The name of the topic you want to create. <p>Constraints: Topic names
     * must be made up of only uppercase and lowercase ASCII letters,
     * numbers, underscores, and hyphens, and must be between 1 and 256
     * characters long.
     *
     * @return The name of the topic you want to create. <p>Constraints: Topic names
     *         must be made up of only uppercase and lowercase ASCII letters,
     *         numbers, underscores, and hyphens, and must be between 1 and 256
     *         characters long.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the topic you want to create. <p>Constraints: Topic names
     * must be made up of only uppercase and lowercase ASCII letters,
     * numbers, underscores, and hyphens, and must be between 1 and 256
     * characters long.
     *
     * @param name The name of the topic you want to create. <p>Constraints: Topic names
     *         must be made up of only uppercase and lowercase ASCII letters,
     *         numbers, underscores, and hyphens, and must be between 1 and 256
     *         characters long.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the topic you want to create. <p>Constraints: Topic names
     * must be made up of only uppercase and lowercase ASCII letters,
     * numbers, underscores, and hyphens, and must be between 1 and 256
     * characters long.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the topic you want to create. <p>Constraints: Topic names
     *         must be made up of only uppercase and lowercase ASCII letters,
     *         numbers, underscores, and hyphens, and must be between 1 and 256
     *         characters long.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTopicRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTopicRequest == false) return false;
        CreateTopicRequest other = (CreateTopicRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    
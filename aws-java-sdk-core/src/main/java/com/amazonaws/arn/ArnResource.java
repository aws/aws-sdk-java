/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.arn;

import com.amazonaws.util.StringUtils;
import com.amazonaws.util.ValidationUtils;

/**
 * An additional model within {@link Arn} that provides the Resource Type, Resource, and
 * Resource Qualifier of an AWS ARN when those values are present and correctly formatted
 * within an ARN.
 * <p>
 * If {@link #resourceType} is not present, {@link #resource} will return the entire resource
 * as a string the same as {@link Arn#getResource()}.
 */
public class ArnResource {

    private final String resourceType;
    private final String resource;
    private final String qualifier;

    private ArnResource(Builder b) {
        this.resourceType = b.resourceType;
        this.resource = ValidationUtils.assertStringNotEmpty(b.resource, "resource");
        this.qualifier = b.qualifier;
    }

    public String getResourceType() {
        return resourceType;
    }

    public String getResource() {
        return resource;
    }

    public String getQualifier() {
        return qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Parses a string containing either a resource, resource type and resource or
     * resource type, resource and qualifier into an {@link ArnResource}.
     * <p>
     * Supports fields separated by either ":" or "/".
     * <p>
     * For legacy AWS ARNs not following the resourceType:resource:qualifier pattern,
     * the qualifier field will contain everything after the first two sections separated
     * by either ":" or "/".
     *
     * @param resource - The resource string to parse.
     * @return {@link ArnResource}
     */
    public static ArnResource fromString(String resource) {
        Character splitter = StringUtils.findFirstOccurrence(resource, ':', '/');

        if (splitter == null) {
            return ArnResource.builder().withResource(resource).build();
        }

        int resourceTypeColonIndex = resource.indexOf(splitter);

        ArnResource.Builder builder = ArnResource.builder().withResourceType(resource.substring(0, resourceTypeColonIndex));
        int resourceColonIndex = resource.indexOf(splitter, resourceTypeColonIndex);
        int qualifierColonIndex = resource.indexOf(splitter, resourceColonIndex + 1);
        if (qualifierColonIndex < 0) {
            builder.withResource(resource.substring(resourceTypeColonIndex + 1));
        } else {
            builder.withResource(resource.substring(resourceTypeColonIndex + 1, qualifierColonIndex));
            builder.withQualifier(resource.substring(qualifierColonIndex + 1));
        }

        return builder.build();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.resourceType);
        sb.append(":");
        sb.append(this.resource);
        sb.append(":");
        sb.append(this.qualifier);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ArnResource that = (ArnResource) o;

        if (resourceType != null ? !resourceType.equals(that.resourceType) : that.resourceType != null) {
            return false;
        }
        if (!resource.equals(that.resource)) {
            return false;
        }
        return qualifier != null ? qualifier.equals(that.qualifier) : that.qualifier == null;
    }

    @Override
    public int hashCode() {
        int result = resourceType != null ? resourceType.hashCode() : 0;
        result = 31 * result + resource.hashCode();
        result = 31 * result + (qualifier != null ? qualifier.hashCode() : 0);
        return result;
    }

    public static final class Builder {
        private String resourceType;
        private String resource;
        private String qualifier;

        private Builder() {
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public Builder withResourceType(String resourceType) {
            setResourceType(resourceType);
            return this;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }

        public Builder withResource(String resource) {
            setResource(resource);
            return this;
        }

        public void setQualifier(String qualifier) {
            this.qualifier = qualifier;
        }

        public Builder withQualifier(String qualifier) {
            setQualifier(qualifier);
            return this;
        }

        public ArnResource build() {
            return new ArnResource(this);
        }
    }
}

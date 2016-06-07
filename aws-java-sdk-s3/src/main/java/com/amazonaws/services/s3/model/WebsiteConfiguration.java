/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;
import java.io.Serializable;

import java.util.LinkedList;
import java.util.List;

public class WebsiteConfiguration implements Serializable {
        private String indexDocumentSuffix;
        private String errorDocument;
        private String redirectAllRequestsTo;
        private List<RoutingRule> routingRules = new LinkedList<RoutingRule>();

        public void setIndexDocumentSuffix(String indexDocumentSuffix) {
        	this.indexDocumentSuffix = indexDocumentSuffix;
        }

        public String getIndexDocumentSuffix() {
        	return indexDocumentSuffix;
        }

        public WebsiteConfiguration withIndexDocumentSuffix(String indexDocumentSuffix) {
        	this.indexDocumentSuffix = indexDocumentSuffix;
        	return this;
        }

        public void setErrorDocument(String errorDocument) {
    	   this.errorDocument = errorDocument;
        }

        public String getErrorDocument() {
        	return errorDocument;
        }

        public WebsiteConfiguration witherrorDocument(String errorDocument) {
        	this.errorDocument = errorDocument;
        	return this;
        }

        public void setRedirectAllRequestsTo(String redirectAllRequestsTo) {
        	this.redirectAllRequestsTo = redirectAllRequestsTo;
        }

        public String getRedirectAllRequestsTo() {
        	return redirectAllRequestsTo;
        }

        public WebsiteConfiguration withRedirectAllRequestsTo(String redirectAllRequestsTo) {
        	this.redirectAllRequestsTo = redirectAllRequestsTo;
        	return this;
        }

        public void setRoutingRules(List<RoutingRule> routingRules) {
        	this.routingRules = routingRules;
        }

        public List<RoutingRule> getRoutingRule() {
        	return routingRules;
        }

        public WebsiteConfiguration withRoutingRule(List<RoutingRule> routingRules) {
        	this.routingRules = routingRules;
        	return this;
        }
}

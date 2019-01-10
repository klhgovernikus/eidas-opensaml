/*
 * Copyright 2016-2019 Litsec AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.litsec.eidas.opensaml.metadata.impl;

import org.opensaml.saml.common.AbstractSAMLObjectBuilder;

import se.litsec.eidas.opensaml.metadata.MetadataList;

/**
 * Builder for {@link MetadataList} objects.
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public class MetadataListBuilder extends AbstractSAMLObjectBuilder<MetadataList> {

  /** {@inheritDoc} */
  @Override
  public MetadataList buildObject() {
    return new MetadataListImpl(MetadataList.DEFAULT_ELEMENT_NAME.getNamespaceURI(), MetadataList.DEFAULT_ELEMENT_LOCAL_NAME,
      MetadataList.DEFAULT_ELEMENT_NAME.getPrefix());
  }

  /** {@inheritDoc} */
  @Override
  public MetadataList buildObject(String namespaceURI, String localName, String namespacePrefix) {
    return new MetadataListImpl(namespaceURI, localName, namespacePrefix);
  }

}

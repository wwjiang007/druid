/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.druid.iceberg.input;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.druid.jackson.DefaultObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Test cases for GlueCatalog Iceberg extension.
 * */
public class GlueIcebergCatalogTest
{
  private final ObjectMapper mapper = new DefaultObjectMapper();

  @Test
  public void testCatalogCreate()
  {
    GlueIcebergCatalog glueCatalog = new GlueIcebergCatalog(
        new HashMap<>(),
        true,
        mapper
    );
    Assert.assertEquals("glue", glueCatalog.retrieveCatalog().name());
  }

  @Test
  public void testIsCaseSensitive()
  {
    GlueIcebergCatalog glueCatalog = new GlueIcebergCatalog(
        new HashMap<>(),
        true,
        mapper
    );
    Assert.assertEquals(true, glueCatalog.isCaseSensitive());
  }
}

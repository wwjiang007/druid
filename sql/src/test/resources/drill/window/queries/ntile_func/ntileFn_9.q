SELECT col7 , col8 , NTILE(2) OVER (PARTITION by col7 ORDER by col8) tile FROM "allTypsUniq.parquet"
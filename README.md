# ServiceBestPractice
启动Service进行网络耗时操作

file.length()-----------获取当前文件的字节数

response.body().contentLength()-----------服务器返回的数据总的字节数

new Request.Builder().addHeader("RANGE","bytes = "+currentLength+"-")-----------断点下载，从指定的字节开始下载，用于继续下载

InputStram is = response.body().byteStream()---------把服务器返回的数据转换为字节输入流

RandomAccessFile-------保存，记录数据的文件
savedFile = new RandomAccessFile(file,"rw");//保存记录数据的文件
savedFile.seek(downloadedLength);//跳过已下载的字节

response.body().close()----------关闭服务器响应的数据

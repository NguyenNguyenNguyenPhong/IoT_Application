# Sử dụng openjdk:20 làm base image
FROM openjdk:20

# Sao chép tệp JAR đã build từ target vào /app trong container
COPY E:/IoT_Application/demo/target/demo-0.0.1-SNAPSHOT.jar /app/app.jar

# Thiết lập thư mục làm việc mặc định trong container
WORKDIR /app

# Expose cổng 8080 (hoặc cổng mà ứng dụng của bạn đang lắng nghe)
EXPOSE 8080

# Command để chạy ứng dụng khi container khởi động
CMD ["java", "-jar", "app.jar"]

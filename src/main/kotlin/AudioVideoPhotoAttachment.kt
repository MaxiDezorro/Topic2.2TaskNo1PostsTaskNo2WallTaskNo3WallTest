package ru.netology

class Audio(
    val id: Int, // Идентификатор аудиозаписи
    val ownerId: Int, // Идентификатор владельца аудиозаписи
    val artist: String, // артист
    val title: String, // название композиции
    val duration: Int // Длительность аудиозаписи в секундах.
)

class AudioAttachment(
    override val type: String,
    val audio: Audio
) : Attachment

class Video(
    val id: Int, // идентификатор видеозаписи
    val userId: Int, // идентификатор пользователя, загрузившего видео
    val ownerId: Int, // Идентификатор владельца аудиозаписи
    val title: String, // название видео
    val duration: Int // Длительность аудиозаписи в секундах.

)

class VideoAttachment(
    override val type: String,
    val video: Video
) : Attachment

class Photo(
    val id: Int, // идентификатор фото
    val ownerId: Int, // Идентификатор владельца фото
    val album: String, // альбом в котором фото
    val text: String, // Текст описания фото
    val data: Int // Дата добавления
)

class PhotoAttachment(
    override val type: String,
    val photo: Photo
) : Attachment